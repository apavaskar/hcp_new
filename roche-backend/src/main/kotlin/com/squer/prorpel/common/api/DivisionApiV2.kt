package com.squer.prorpel.common.api

import com.squer.prorpel.common.controller.DivisionController
import com.squer.prorpel.common.service.DivisionService
import io.swagger.v3.oas.annotations.security.SecurityRequirement
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v2/division")
@Tag(name = "V2 Division APIs")
@SecurityRequirement(name = "bearer-key")
@CrossOrigin

class DivisionApiV2(divisionService: DivisionService): DivisionController(
        divisionService = divisionService
) {
}