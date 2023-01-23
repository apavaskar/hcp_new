package com.squer.prorpel.common.api

import com.squer.prorpel.common.controller.LOVController
import com.squer.prorpel.common.service.LovService
import io.swagger.v3.oas.annotations.security.SecurityRequirement
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v2/list-of-values")
@Tag(name = "V2 List of values APIs")
@SecurityRequirement(name = "bearer-key")
@CrossOrigin
class LOVApiV2(
    lovService: LovService
) :
    LOVController(
        lovService = lovService
    )
