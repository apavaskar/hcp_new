package com.squer.prorpel.security.filter

import com.squer.prorpel.persistence.SquerReference
import com.squer.prorpel.security.config.SecurityConstants.HEADER_STRING
import com.squer.prorpel.security.config.SecurityConstants.TOKEN_PREFIX
import com.squer.prorpel.security.domain.AuthCertificate
import com.squer.prorpel.security.domain.AuthenticationHandler
import com.squer.prorpel.security.domain.SquerPrincipal
import com.squer.prorpel.security.domain.User
import com.squer.prorpel.security.jwt.JwtTokenProvider
import com.squer.prorpel.security.repository.UserRepository
import com.squer.prorpel.security.service.impl.UserServiceImpl
import com.squer.prorpel.services.exception.SquerException
import lombok.extern.slf4j.Slf4j
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken
import org.springframework.security.core.context.SecurityContextHolder
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource
import org.springframework.stereotype.Service
import org.springframework.util.StringUtils
import org.springframework.web.filter.OncePerRequestFilter
import java.io.IOException
import javax.servlet.FilterChain
import javax.servlet.ServletException
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

@Service
@Slf4j
class JwtAuthenticationFilter @Autowired constructor(
    private val tokenProvider: JwtTokenProvider,
    private val userService: UserServiceImpl
) : OncePerRequestFilter() {

    private val log = LoggerFactory.getLogger(javaClass)
    override fun doFilterInternal(request: HttpServletRequest, response: HttpServletResponse, filterChain: FilterChain) {
        if(!request.requestURL.contains("/v1")){
            val token = getJWTFromRequest(request)
            val certificate = userService.authenticate(token)
            val userDetails = certificate!!.getId()?.let { userService.loadUserById(it) }
            val authentication = UsernamePasswordAuthenticationToken(
                userDetails, null, mutableListOf()
            )
            authentication.details = WebAuthenticationDetailsSource().buildDetails(request)
            SecurityContextHolder.getContext().authentication = authentication
        }
        filterChain.doFilter(request, response)
    }

//    @Throws(ServletException::class, IOException::class)
//    override fun doFilterInternal(
//        httpServletRequest: HttpServletRequest,
//        httpServletResponse: HttpServletResponse,
//        filterChain: FilterChain
//    ) {
//        try {
//            val jwt = getJWTFromRequest(httpServletRequest)
//            if (SecurityContextHolder.getContext().authentication == null) {
//                validateAndAddUserForAuthentication(httpServletRequest, jwt)
//            }
//        } catch (ex: Exception) {
//            log.error("Could not set user authentication in security context", ex)
//        }
//        filterChain.doFilter(httpServletRequest, httpServletResponse)
//    }
//
//    private fun validateAndAddUserForAuthentication(httpServletRequest: HttpServletRequest, jwt: String?) {
//        if (StringUtils.hasText(jwt) && tokenProvider.validateToken(jwt)) {
//            val userId = tokenProvider.getUserIdFromJWT(jwt)
//            val userDetails = userService.loadUserById(userId)
//            setAuthentication(httpServletRequest, userDetails)
//        }
//    }
//
//    private fun setAuthentication(httpServletRequest: HttpServletRequest, userDetails: UserDetails?) {
//        if (userDetails != null) {
//            val authentication = UsernamePasswordAuthenticationToken(
//                userDetails, null, userDetails.authorities
//            )
//            authentication.details = WebAuthenticationDetailsSource().buildDetails(httpServletRequest)
//            SecurityContextHolder.getContext().authentication = authentication
//        }
//    }
//
    private fun getJWTFromRequest(request: HttpServletRequest): String? {
        val bearerToken = request.getHeader(HEADER_STRING)
        return bearerToken
    }

}
