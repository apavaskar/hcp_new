package com.squer.prorpel.security.config

import com.squer.prorpel.security.service.SecurityService
import io.swagger.v3.oas.models.Components
import io.swagger.v3.oas.models.OpenAPI
import io.swagger.v3.oas.models.security.SecurityScheme
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.authentication.AuthenticationManager
import org.springframework.security.config.BeanIds
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(securedEnabled = true, jsr250Enabled = true, prePostEnabled = true)
class SecurityConfig @Autowired constructor(
    private val securityService: SecurityService
) : WebSecurityConfigurerAdapter() {

    @Bean(BeanIds.AUTHENTICATION_MANAGER)
    @Throws(Exception::class)
    override fun authenticationManager(): AuthenticationManager {
        return super.authenticationManager()
    }

    @Bean
    fun customOpenAPI(): OpenAPI {
        return OpenAPI()
            .components(
                Components()
                    .addSecuritySchemes(
                        "bearer-key",
                        SecurityScheme().type(SecurityScheme.Type.HTTP).scheme("bearer").bearerFormat("JWT")
                    )
            )
    }

    @Throws(Exception::class)
    override fun configure(authenticationManagerBuilder: AuthenticationManagerBuilder) {
        securityService.configure(authenticationManagerBuilder)
    }

    @Throws(Exception::class)
    override fun configure(http: HttpSecurity) {
        securityService.httpDisableCorsAndCSRF(http)
        securityService.httpAuthenticationEntryPointForException(http)
        securityService.httpStatelessSessionCreationPolicy(http)
        securityService.httpSameOriginFrameOptionForHeaders(http)

        securityService.httpAuthorizeSwaggerUrlForAll(http) // swagger
//        securityService.httpAuthorizeLoginUrlForAll(http) // TODO: login
        securityService.httpAuthorizeV1ApisForMobileUsers(http) // V1 apis

        securityService.httpAuthenticateAnyRequestForAuthorization(http)
        securityService.httpAddJwtAuthFilterBeforeUsernamePasswordAuthenticationFilter(http)
    }
}
