package com.squer.prorpel.common.api

import com.squer.prorpel.common.controller.LocationController
import com.squer.prorpel.common.service.EmployeeHistoryService
import com.squer.prorpel.common.service.EmployeeService
import com.squer.prorpel.common.service.LocationService
import com.squer.prorpel.security.service.impl.UserServiceImpl
import com.squer.prorpel.ui.controller.FormUtils
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
        userService: UserServiceImpl,
        employeeService: EmployeeService,
        employeeHistoryService: EmployeeHistoryService,
        formUtils: FormUtils
) :
    LocationController(
        locationService = locationService,
        userService = userService,
        employeeService = employeeService,
        employeeHistoryService = employeeHistoryService,
        formUtils = formUtils
    )
