package com.squer.prorpel.common.api

import com.squer.prorpel.common.controller.DoctorController
import com.squer.prorpel.common.service.DoctorMasterService
import com.squer.prorpel.common.service.DoctorService
import io.swagger.v3.oas.annotations.security.SecurityRequirement
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v2/hcp")
@Tag(name = "V2 HCP APIs")
@SecurityRequirement(name = "bearer-key")
@CrossOrigin
class DoctorApiV2 (entityService: DoctorMasterService): DoctorController(entityService = entityService){
}