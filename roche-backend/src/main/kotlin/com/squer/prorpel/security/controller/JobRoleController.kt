
package com.squer.prorpel.security.controller

import com.squer.prorpel.security.service.JobRoleService
import lombok.extern.slf4j.Slf4j
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping

@Slf4j
open class JobRoleController @Autowired constructor(
    private val jobRoleService: JobRoleService
){
    private val log = LoggerFactory.getLogger(javaClass)

    @GetMapping("/all")
    fun findAll() : ResponseEntity<*> {
        return ResponseEntity.ok<Any>(jobRoleService.getAll())
    }
}
