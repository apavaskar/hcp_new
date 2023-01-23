package com.squer.prorpel.security.service.impl

import com.squer.prorpel.security.domain.SecurityRole
import com.squer.prorpel.security.repository.SecurityRoleRepository
import com.squer.prorpel.security.service.SecurityRoleService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class SecurityRoleServiceImpl: SecurityRoleService {
    @Autowired
    lateinit var roleRepository: SecurityRoleRepository
    override fun getRoleById(id: String): SecurityRole? {
        return roleRepository.findById(id)
        //return roleRepository.restore(id)
    }
}
