package com.squer.prorpel.security.service.impl

import com.squer.prorpel.security.service.SecurityService
import com.squer.prorpel.security.config.SecurityConstants.SWAGGER_ENDPOINT
import com.squer.prorpel.security.config.SecurityConstants.V1_APIS
import com.squer.prorpel.security.filter.JwtAuthenticationFilter
import com.squer.prorpel.security.jwt.JwtAuthenticationEntryPoint
import lombok.extern.slf4j.Slf4j
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.http.SessionCreationPolicy
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter
import org.springframework.stereotype.Service

@Service
@Slf4j
class SecurityServiceImpl @Autowired constructor(
    private val unauthorizedHandler: JwtAuthenticationEntryPoint,
    private val userService: UserServiceImpl,
    private val bCryptPasswordEncoder: BCryptPasswordEncoder,
    private val jwtAuthenticationFilter: JwtAuthenticationFilter
) : SecurityService {

    @Throws(Exception::class)
    override fun configure(authenticationManagerBuilder: AuthenticationManagerBuilder) {
        authenticationManagerBuilder.userDetailsService<UserDetailsService>(userService)
            .passwordEncoder(bCryptPasswordEncoder)
    }

    @Throws(Exception::class)
    override fun httpDisableCorsAndCSRF(http: HttpSecurity) {
        http.cors().and().csrf().disable()
    }

    @Throws(Exception::class)
    override fun httpAuthenticationEntryPointForException(http: HttpSecurity) {
        http.exceptionHandling().authenticationEntryPoint(unauthorizedHandler)
    }

    @Throws(Exception::class)
    override fun httpAuthenticateAnyRequestForAuthorization(http: HttpSecurity) {
        http.authorizeRequests().anyRequest().authenticated()
    }

    override fun httpAddJwtAuthFilterBeforeUsernamePasswordAuthenticationFilter(http: HttpSecurity) {
        http.addFilterBefore(jwtAuthenticationFilter, UsernamePasswordAuthenticationFilter::class.java)
    }

    @Throws(Exception::class)
    override fun httpStatelessSessionCreationPolicy(http: HttpSecurity) {
        http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
    }

    @Throws(Exception::class)
    override fun httpSameOriginFrameOptionForHeaders(http: HttpSecurity) {
        http.headers().frameOptions().sameOrigin()
    }

    override fun httpAuthorizeSwaggerUrlForAll(http: HttpSecurity) {
        http.authorizeRequests().antMatchers(*SWAGGER_ENDPOINT).permitAll()
    }

    override fun httpAuthorizeV1ApisForMobileUsers(http: HttpSecurity) {
        http.authorizeRequests().antMatchers(*V1_APIS).permitAll()
    }
}
