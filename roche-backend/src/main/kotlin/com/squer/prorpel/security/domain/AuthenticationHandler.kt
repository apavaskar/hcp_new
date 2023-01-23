package com.squer.prorpel.security.domain

import com.squer.prorpel.jooq.tables.references.FMK_SECURITY_USER
import com.squer.prorpel.persistence.SearchCriteria
import com.squer.prorpel.persistence.SquerReference
import com.squer.prorpel.security.domain.enums.CoreSystemLovs
import com.squer.prorpel.security.repository.AppConfigRepository
import com.squer.prorpel.security.repository.UserRepository
import com.squer.prorpel.services.exception.CoreExceptionEnum
import com.squer.prorpel.services.exception.SquerException
import com.squer.prorpel.utils.StringUtils
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.security.authentication.AuthenticationCredentialsNotFoundException
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken
import org.springframework.security.core.GrantedAuthority
import org.springframework.security.core.authority.SimpleGrantedAuthority
import org.springframework.security.core.context.SecurityContextHolder

class AuthenticationHandler {

    companion object{
        const val GUEST_USER_ID = "USERS00000000000000000000000000000000"
        const val ADMIN_USER_ID = "USERS00000000000000000000000000000001"
        const val SCHEDULER_ADMIN_USER_ID = "USERS00000000000000000000000000000002"
        const val CERT_VALIDITY = (24 * 60 * 60 * 1000 * 100000).toLong()
        const val GUEST_VALIDITY = Long.MAX_VALUE

        @Throws(SquerException::class)
        fun authenticateAsAdmin(): AuthCertificate? {
            return try {
                val principal = SquerPrincipal(ADMIN_USER_ID, User(), "Guest")
                getAuthCertificate(principal)
            } catch (e: SquerException) {
                throw e
            } catch (e: Exception) {
                throw SquerException(e)
            }
        }

        @Throws(SquerException::class)
        fun authenticateAsSchedulerAdmin(): AuthCertificate? {
            return try {
                val principal = SquerPrincipal(SCHEDULER_ADMIN_USER_ID, User(), "SchedulerAdmin")
                getAuthCertificate(principal)
            } catch (e: SquerException) {
                throw e
            } catch (e: Exception) {
                throw SquerException(e)
            }
        }

        @Throws(Exception::class)
        private fun getAuthCertificate(principal: SquerPrincipal): AuthCertificate? {
            val certificate = AuthCertificate(principal, GUEST_VALIDITY)
            setContext(principal, certificate)
            return certificate
        }


        @Throws(SquerException::class)
        fun authenticateAsGuest(): AuthCertificate? {
            return try {
                val principal = SquerPrincipal(GUEST_USER_ID, User(), "Guest")
                getAuthCertificate(principal)
            } catch (e: SquerException) {
                throw e
            } catch (e: Exception) {
                throw SquerException(e)
            }
        }

        @Throws(SquerException::class)
        fun authenticate(userName: String?, password: String?): AuthCertificate? {
            val appConfigRepository = AppConfigRepository()
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
                    if (!config.adminPassword.equals(StringUtils.getHash(password!!))) throw SquerException(CoreExceptionEnum.INVALID_CREDENTIALS)
                    val user = User()
                    user.id  = ADMIN_USER_ID
                    val principal = SquerPrincipal(ADMIN_USER_ID, user, "Admin")
                    val cert = AuthCertificate(principal, System.currentTimeMillis() + CERT_VALIDITY)
                    val grantedAuths: MutableList<GrantedAuthority> = ArrayList()
                    grantedAuths.add(SimpleGrantedAuthority("USER"))
                    val token = UsernamePasswordAuthenticationToken(principal, cert, grantedAuths)
                    SecurityContextHolder.getContext().authentication = token
                    return cert
                } else {
                    val userRepository = UserRepository()
                    val searchCriteria = SearchCriteria()
                    searchCriteria.addCondition(UserSearchField.USER_NAME, userName!!)
                    val users: List<User> = userRepository.find(searchCriteria)
                    if (users == null || users.isEmpty()) throw AuthenticationCredentialsNotFoundException("Invalid user")
                    var user: User = users[0]
                    user = userRepository.findById(user.id.toString())!!
                    if (!user.status?.id?.equals(CoreSystemLovs.ACTIVE_STATUS.id)!!
                            || !user.password.equals(StringUtils.getHash(password!!))) throw AuthenticationCredentialsNotFoundException("Invalid user")
                    val principal = SquerPrincipal(user.id!!, user, user.userName!!)
                    val cert = AuthCertificate(principal, System.currentTimeMillis() + CERT_VALIDITY)
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

        @Throws(SquerException::class)
        fun authenticate(principal: SquerPrincipal?): AuthCertificate? {
            return try {
                val certificate = AuthCertificate(principal!!, System.currentTimeMillis() + CERT_VALIDITY)
                val grantedAuths: MutableList<GrantedAuthority> = ArrayList()
                grantedAuths.add(SimpleGrantedAuthority("USER"))
                val token = UsernamePasswordAuthenticationToken(principal, certificate, grantedAuths)
                SecurityContextHolder.getContext().authentication = token
                return certificate
            } catch (e: Exception) {
                throw SquerException(e)
            }
        }

        @Throws(SquerException::class)
        fun authenticate(certString: String?): AuthCertificate? {
            return try {
                val userRepository = UserRepository()
                val certificate = AuthCertificate(certString)
                var user = User()
                user.id = certificate.getId()
                if (!StringUtils.isNullOrEmpty(certificate.getOwnerId())) {
                    user.owner = SquerReference(certificate.getOwnerId()!!)
                } else {
                    if (!certificate.getId().equals(ADMIN_USER_ID)) {
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
            val userRepository = UserRepository()
            SecurityContextHolder.getContext().authentication = token
            //SecurityContextHolder.setStrategyName(SecurityContextHolder.MODE_INHERITABLETHREADLOCAL);
            if (!principal.getId().equals(ADMIN_USER_ID, ignoreCase = true) && !principal.getId().equals(SCHEDULER_ADMIN_USER_ID, ignoreCase = true)
                    && !principal.getId().equals(GUEST_USER_ID, ignoreCase = true)) {
                val USERS: User? = userRepository.findById(principal.getId().toString())
                if (USERS == null ) throw SquerException(CoreExceptionEnum.INVALID_CREDENTIALS)
                val user: User = USERS
                if (!user.status!!.id.equals(CoreSystemLovs.ACTIVE_STATUS.id)) throw SquerException(CoreExceptionEnum.INVALID_CREDENTIALS)
            }
        }

    }
}