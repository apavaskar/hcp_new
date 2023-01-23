package com.squer.prorpel.common.controller

import com.squer.prorpel.common.service.DoctorMasterService
import lombok.extern.slf4j.Slf4j
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

@Slf4j
open class DoctorController @Autowired constructor(
        private val entityService: DoctorMasterService
){

    @GetMapping("/search/{name}/{specialization}/{location}/{status}")
    fun doctorMasterList(@PathVariable("name") name: String, @PathVariable("specialization") specialization: String, @PathVariable("location") location: String, @PathVariable("status") status: String): ResponseEntity<*>{
        return ResponseEntity.ok(entityService.doctorMasterList(name, specialization, location, status))
    }
}