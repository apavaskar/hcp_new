package com.squer.prorpel.security.service.impl

import com.squer.prorpel.common.domain.Location
import com.squer.prorpel.persistence.SearchCriteria
import com.squer.prorpel.persistence.SquerReference
import com.squer.prorpel.security.domain.*
import com.squer.prorpel.security.domain.enums.CoreSystemLovs
import com.squer.prorpel.security.dto.UserProfileDTO
import com.squer.prorpel.security.repository.AppConfigRepository
import com.squer.prorpel.security.repository.UserRepository
import com.squer.prorpel.services.exception.CoreExceptionEnum
import com.squer.prorpel.services.exception.SquerException
import com.squer.prorpel.utils.EmailUtils
import org.apache.commons.lang3.RandomStringUtils
import org.apache.commons.lang3.StringUtils
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.security.authentication.AuthenticationCredentialsNotFoundException
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken
import org.springframework.security.core.GrantedAuthority
import org.springframework.security.core.authority.SimpleGrantedAuthority
import org.springframework.security.core.context.SecurityContextHolder
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.stereotype.Service


@Service
class UserServiceImpl @Autowired constructor(
    private val
    userRepository: UserRepository,
    private val appConfigRepository: AppConfigRepository,
    private val bCryptPasswordEncoder: BCryptPasswordEncoder,
    private val emailUtils: EmailUtils,
): UserDetailsService {
    private val log = LoggerFactory.getLogger(javaClass)

    @Value("\${app.security.user.INITIAL_PASSWORD}")
    lateinit var INITIAL_PASSWORD: String

    fun loadUserById(userId: String): User?{
        return userRepository.findById(userId)
    }

    fun getUserProfile(userId: String): UserProfileDTO?{
        return userRepository.getUserProfile(userId)
    }

    override fun loadUserByUsername(username: String): UserDetails? {
        val user = userRepository.findByUserName(username) ?: return null
        return user as UserDetails
    }

    fun search(searchCriteria: SearchCriteria): List<User> {
        return userRepository.find(searchCriteria)
    }

    fun saveUser(user: User): User {
        return try {
            if (StringUtils.isBlank(user.password)) {
                user.password = bCryptPasswordEncoder.encode(INITIAL_PASSWORD)
            } else {
                user.password = bCryptPasswordEncoder.encode(user.password) // encrypt password
            }
            userRepository.update(user)
            user
        } catch (e: Exception) {
            log.error("Check if username '{}' already exist or trace log", user.userName)
            log.error(e.message)
            throw Exception("Invalid user details")
        }
    }


    fun findLocationsForUser(userId: Long): List<Location> {
        return userRepository.findLocationsForUser(userId)
    }


    fun forgotPassword(username: String): Boolean {
        val user = userRepository.findByUserName(username) ?: return false
        val password =  generateCommonLangPassword()
        user.password =bCryptPasswordEncoder.encode(password)
       // user.passwordChanged = true
        userRepository.update(user)
       //emailUtils.sendMail(mutableListOf(user.email), "Your new password is set to ${password}. Please use this to login", "KAM DASHBOARD Forgot Password "  )
        return true
    }

    fun generateCommonLangPassword(): String? {
        val upperCaseLetters: String = RandomStringUtils.random(2, 65, 90, true, true)
        val lowerCaseLetters: String = RandomStringUtils.random(2, 97, 122, true, true)
        val numbers: String = RandomStringUtils.randomNumeric(2)
        val totalChars: String = RandomStringUtils.randomAlphanumeric(2)
        return upperCaseLetters + lowerCaseLetters + numbers  + totalChars
    }

    fun authenticate(userName: String?, password: String?): AuthCertificate? {
        return try {
            if ("admin".equals(userName, ignoreCase = true)) {
                /*CriteriaMap criteria = new CriteriaMap(CoreQuery.APPCG_SELECT);
            List<AppConfig> configs = repository.find(criteria);
            if(configs==null || configs.isEmpty() || configs.size()!=1)
                throw new IllegalStateException("Invalid configuration");
            AppConfig config = configs.get(0);*/
                val configs: List<AppConfig> = appConfigRepository.findAll()
                if(configs == null || configs.isEmpty() || configs.size != 1) {
                    throw java.lang.IllegalStateException("Invalid configuration")
                }
                val config: AppConfig = configs[0]
                if (!config.adminPassword.equals(com.squer.prorpel.utils.StringUtils.getHash(password!!))) throw SquerException(CoreExceptionEnum.INVALID_CREDENTIALS)
                val user = User()
                user.id  = AuthenticationHandler.ADMIN_USER_ID
                val principal = SquerPrincipal(AuthenticationHandler.ADMIN_USER_ID, user, "Admin")
                val cert = AuthCertificate(principal, System.currentTimeMillis() + AuthenticationHandler.CERT_VALIDITY)
                val grantedAuths: MutableList<GrantedAuthority> = ArrayList()
                grantedAuths.add(SimpleGrantedAuthority("USER"))
                val token = UsernamePasswordAuthenticationToken(principal, cert, grantedAuths)
                SecurityContextHolder.getContext().authentication = token
                return cert
            } else {
                val searchCriteria = SearchCriteria()
                searchCriteria.addCondition(UserSearchField.USER_NAME, userName!!)
                val users: List<User> = userRepository.find(searchCriteria)
                if (users == null || users.isEmpty()) throw AuthenticationCredentialsNotFoundException("Invalid user")
                var user: User = users[0]
                user = userRepository.findById(user.id.toString())!!
                if (!user.status?.id?.equals(CoreSystemLovs.ACTIVE_STATUS.id)!!
                        || !user.password.equals(com.squer.prorpel.utils.StringUtils.getHash(password!!))) throw AuthenticationCredentialsNotFoundException("Invalid user")
                val principal = SquerPrincipal(user.id!!, user, user.userName!!)
                val cert = AuthCertificate(principal, System.currentTimeMillis() + AuthenticationHandler.CERT_VALIDITY)
                val grantedAuths: MutableList<GrantedAuthority> = ArrayList()
                grantedAuths.add(SimpleGrantedAuthority("USER"))
                val token = UsernamePasswordAuthenticationToken(principal, cert, grantedAuths)
                SecurityContextHolder.getContext().authentication = token
                return cert
            }
        } catch (e: SquerException) {
            e.printStackTrace()
            throw e
        } catch (e: AuthenticationCredentialsNotFoundException) {
            throw SquerException(CoreExceptionEnum.INVALID_CREDENTIALS)
        } catch (e: Exception) {
            throw SquerException(e)
        }
    }

    fun authenticate(certString: String?): AuthCertificate? {
        return try {
            val certificate = AuthCertificate(certString)
            var user = User()
            user.id = certificate.getId()
            if (!com.squer.prorpel.utils.StringUtils.isNullOrEmpty(certificate.getOwnerId())) {
                user.owner = SquerReference(certificate.getOwnerId()!!)
            } else {
                if (!certificate.getId().equals(AuthenticationHandler.ADMIN_USER_ID)) {
                    user = userRepository.findById(certificate.getId().toString())!!
                    certificate.setOwnerId(user.owner!!.id)
                }
            }
            val principal = SquerPrincipal(certificate.getId()!!,
                    user,
                    certificate.getName()!!)
            setContext(principal, certificate)
            return certificate
        } catch (e: Exception) {
            throw SquerException(e)
        }
    }

    @Throws(Exception::class)
    private fun setContext(principal: SquerPrincipal, certificate: AuthCertificate) {
        val token = UsernamePasswordAuthenticationToken(principal, certificate)
        SecurityContextHolder.getContext().authentication = token
        SecurityContextHolder.setStrategyName(SecurityContextHolder.MODE_INHERITABLETHREADLOCAL);
        if (!principal.getId().equals(AuthenticationHandler.ADMIN_USER_ID, ignoreCase = true) && !principal.getId().equals(AuthenticationHandler.SCHEDULER_ADMIN_USER_ID, ignoreCase = true)
                && !principal.getId().equals(AuthenticationHandler.GUEST_USER_ID, ignoreCase = true)) {
            val USERS: User? = userRepository.findById(principal.getId().toString())
            if (USERS == null ) throw SquerException(CoreExceptionEnum.INVALID_CREDENTIALS)
            val user: User = USERS
            if (!user.status!!.id.equals(CoreSystemLovs.ACTIVE_STATUS.id)) throw SquerException(CoreExceptionEnum.INVALID_CREDENTIALS)
        }
    }
}
