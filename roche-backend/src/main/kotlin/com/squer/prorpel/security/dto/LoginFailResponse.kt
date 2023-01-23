package com.squer.prorpel.security.dto

data class LoginFailResponse (
    private val username: String = "Invalid username",
    private val password: String = "Invalid password"
)
