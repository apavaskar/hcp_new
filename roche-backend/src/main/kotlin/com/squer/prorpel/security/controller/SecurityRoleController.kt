
package com.squer.prorpel.security.controller

import com.squer.prorpel.security.service.SecurityRoleService
import lombok.extern.slf4j.Slf4j
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

@Slf4j
open class SecurityRoleController @Autowired constructor(
    private val securityRoleService: SecurityRoleService,
){
    private val log = LoggerFactory.getLogger(javaClass)

    @GetMapping("/{roleId}")
    fun findById(@PathVariable roleId: String) : ResponseEntity<*> {
        return ResponseEntity.ok<Any>(securityRoleService.getRoleById(roleId))
    }
}
