package com.squer.prorpel.security.service

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder
import org.springframework.security.config.annotation.web.builders.HttpSecurity

interface SecurityService {
    @Throws(Exception::class)
    fun configure(authenticationManagerBuilder: AuthenticationManagerBuilder)

    @Throws(Exception::class)
    fun httpDisableCorsAndCSRF(http: HttpSecurity)

    @Throws(Exception::class)
    fun httpAuthenticationEntryPointForException(http: HttpSecurity)

    @Throws(Exception::class)
    fun httpAuthenticateAnyRequestForAuthorization(http: HttpSecurity)

    fun httpAddJwtAuthFilterBeforeUsernamePasswordAuthenticationFilter(http: HttpSecurity)

    @Throws(Exception::class)
    fun httpStatelessSessionCreationPolicy(http: HttpSecurity)

    @Throws(Exception::class)
    fun httpSameOriginFrameOptionForHeaders(http: HttpSecurity)

    @Throws(java.lang.Exception::class)
    fun httpAuthorizeSwaggerUrlForAll(http: HttpSecurity)

    @Throws(java.lang.Exception::class)
    fun httpAuthorizeV1ApisForMobileUsers(http: HttpSecurity)
}
