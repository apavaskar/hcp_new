package com.squer.prorpel.security.config

object SecurityConstants {

    const val TOKEN_PREFIX = "Bearer "
    const val HEADER_STRING = "Authorization"

    val PUBLIC_MATCHERS = arrayOf(
        "/favicon.ico",
        "/**/*.png",
        "/**/*.gif",
        "/**/*.svg",
        "/**/*.jpg",
        "/**/*.html",
        "/**/*.css",
        "/**/*.js"
    )

    val SWAGGER_ENDPOINT = arrayOf(
        "/api-docs/**",
        "/api-docs**",
        "/swagger-ui/**",
        "/swagger-ui.html/**"
    )

    val V1_APIS = arrayOf("/v1/**")

    val V2_HEALTHCHECK = arrayOf("/v2/healthcheck/**")

}

