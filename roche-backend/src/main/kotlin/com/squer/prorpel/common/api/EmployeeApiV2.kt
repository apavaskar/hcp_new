package com.squer.prorpel.common.api

import com.squer.prorpel.common.controller.EmployeeController
import com.squer.prorpel.common.service.EmployeeService
import com.squer.prorpel.ui.controller.FormUtils
import io.swagger.v3.oas.annotations.security.SecurityRequirement
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v2/employee")
@Tag(name = "V2 Employee APIs")
@SecurityRequirement(name = "bearer-key")
@CrossOrigin
class EmployeeApiV2(
        employeeService: EmployeeService,
        formUtils: FormUtils
): EmployeeController(
        employeeService = employeeService,
        formUtils = formUtils
) {
}