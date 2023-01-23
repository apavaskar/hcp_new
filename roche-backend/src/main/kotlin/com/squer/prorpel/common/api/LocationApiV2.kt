package com.squer.prorpel.common.api

import com.squer.prorpel.common.controller.LocationController
import com.squer.prorpel.common.service.LocationService
import com.squer.prorpel.security.service.impl.UserServiceImpl
import io.swagger.v3.oas.annotations.security.SecurityRequirement
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v2/location")
@Tag(name = "V2 Location APIs")
@SecurityRequirement(name = "bearer-key")
@CrossOrigin
class LocationApiV2(
        locationService: LocationService,
        userService: UserServiceImpl
) :
    LocationController(
        locationService = locationService,
        userService = userService
    )
