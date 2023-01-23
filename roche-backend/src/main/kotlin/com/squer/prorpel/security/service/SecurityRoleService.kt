package com.squer.prorpel.security.service

import com.squer.prorpel.security.domain.SecurityRole

interface SecurityRoleService {
    fun getRoleById(id: String): SecurityRole?
}
