package com.squer.prorpel.common.api

import com.squer.prorpel.common.controller.LocationTypeController
import com.squer.prorpel.common.service.LocationTypeService
import io.swagger.v3.oas.annotations.security.SecurityRequirement
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v2/location-type")
@Tag(name = "V2 Location Type APIs")
@SecurityRequirement(name = "bearer-key")
@CrossOrigin
class LocationTypeApiV2(
    locationTypeService: LocationTypeService,
) :
    LocationTypeController(
        locationTypeService = locationTypeService
    )
