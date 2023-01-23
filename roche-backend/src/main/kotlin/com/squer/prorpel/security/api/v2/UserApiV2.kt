package com.squer.prorpel.security.api.v2

import com.squer.prorpel.common.service.EmployeeService
import com.squer.prorpel.security.controller.UserController
import com.squer.prorpel.security.jwt.JwtTokenProvider
import com.squer.prorpel.security.service.impl.UserServiceImpl
import io.swagger.v3.oas.annotations.security.SecurityRequirement
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.security.authentication.AuthenticationManager
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v2/user")
@Tag(name = "V2 User APIs")
@SecurityRequirement(name = "bearer-key")
@CrossOrigin
class UserApiV2(
    userService: UserServiceImpl,
    employeeService: EmployeeService,
    authenticationManager: AuthenticationManager,
    jwtTokenProvider: JwtTokenProvider,
) :
    UserController(
        userService = userService,
            employeeService = employeeService,
        authenticationManager = authenticationManager,
        jwtTokenProvider = jwtTokenProvider,
    )
