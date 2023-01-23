package com.squer.prorpel.security.dto

data class LoginSuccessResponse(
    val success: Boolean? = false,
    val token: String?,
    val userId: Long
)
