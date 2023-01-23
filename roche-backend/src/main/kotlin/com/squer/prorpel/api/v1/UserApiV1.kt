package com.squer.prorpel.api.v1

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
@RequestMapping("/v1/user")
@Tag(name = "V1 User APIs")
@SecurityRequirement(name = "bearer-key")
@CrossOrigin
class UserApiV1(
        userService: UserServiceImpl,
        private val employeeService: EmployeeService,
        authenticationManager: AuthenticationManager,
        jwtTokenProvider: JwtTokenProvider,
) :
    UserController(
        userService = userService,
        employeeService = employeeService,
        authenticationManager = authenticationManager,
        jwtTokenProvider = jwtTokenProvider,
    )
