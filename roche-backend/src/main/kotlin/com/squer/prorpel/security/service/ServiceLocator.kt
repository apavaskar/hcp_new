package com.squer.prorpel.security.service

import com.squer.prorpel.security.domain.User
import org.springframework.security.core.context.SecurityContextHolder
import org.springframework.stereotype.Service

@Service
class ServiceLocator {

    fun getLoggedInUser() : User {
        val authentication = SecurityContextHolder.getContext().authentication
        return authentication.principal as User
    }
}
