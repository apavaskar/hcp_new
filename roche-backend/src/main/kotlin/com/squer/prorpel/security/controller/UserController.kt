package com.squer.prorpel.security.controller

import com.squer.prorpel.common.domain.Employee
import com.squer.prorpel.common.service.EmployeeService
import com.squer.prorpel.persistence.SearchCriteria
import com.squer.prorpel.security.config.SecurityConstants
import com.squer.prorpel.security.domain.AuthCertificate
import com.squer.prorpel.security.domain.AuthenticationHandler
import com.squer.prorpel.security.domain.User
import com.squer.prorpel.security.dto.*
import com.squer.prorpel.security.jwt.JwtTokenProvider
import com.squer.prorpel.security.service.impl.UserServiceImpl
import com.squer.prorpel.ui.domain.SelectPOJO
import lombok.extern.slf4j.Slf4j
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.security.authentication.AuthenticationManager
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken
import org.springframework.security.core.Authentication
import org.springframework.security.core.context.SecurityContextHolder
import org.springframework.web.bind.annotation.*

@Slf4j
open class UserController @Autowired constructor(
    private val userService: UserServiceImpl,
    private val employeeService: EmployeeService,
    private val authenticationManager: AuthenticationManager,
    private val jwtTokenProvider: JwtTokenProvider
) {

    private val log = LoggerFactory.getLogger(javaClass)

    @GetMapping("/generateOTP/{username}")
    fun generateOTP(@PathVariable username: String): ResponseEntity<*> {
        val user = userService.loadUserByUsername(username)
            ?: return  ResponseEntity
                .status(HttpStatus.FORBIDDEN)
                .body("${username} not registered")
        return ResponseEntity.ok<Any>(username.substring(6))
    }

    @PostMapping("/login")
    fun login(@RequestBody loginRequest: LoginDTO): ResponseEntity<*> {
        val certificate: AuthCertificate = userService.authenticate(loginRequest.username, loginRequest.password)!!
        val dto = AuthenticationDTO()
        dto.certificate = certificate.encrypt()!!
        dto.userId = certificate.getId()!!
        dto.userName = certificate.getName()!!
        dto.ownerId = certificate.getOwnerId()!!
        val employee: Employee = employeeService.findById(dto.ownerId)!!
        dto.employeeName = employee.name
        dto.locationId = employee.location?.id!!
        dto.locationName = employee.location!!.name!!
        dto.jobId = employee.jobTitle?.id!!
        dto.jobTitle = employee.jobTitle!!.name!!

//        if (AuthenticationHandler.ADMIN_USER_ID.equals(dto.userId, ignoreCase = true))
//            return dto

//        return dto
        return ResponseEntity.ok(dto)
    }

    @PutMapping("/changepassword")
    fun changePassword(@RequestBody loginRequest: LoginRequest): ResponseEntity<*> {
        var user = userService.loadUserByUsername(loginRequest.username) as User
        user.password = loginRequest.password
//        user.passwordChanged = false
        val updated = userService.saveUser(user)
        return ResponseEntity.ok<Any>(updated)
    }

    @GetMapping("/find-by-username/{username}")
    fun getUser(@PathVariable username: String): ResponseEntity<*> {
        val user = userService.loadUserByUsername(username)
        return ResponseEntity.ok<Any>(user)
    }

    @PostMapping("/search")
    fun search(@RequestBody conditions: Map<String, Any>): ResponseEntity<*> {
        return ResponseEntity.ok(userService.search(SearchCriteria()))
    }

    @GetMapping("/status")
    fun findStatus(): ResponseEntity<*> {
        val statuses = arrayListOf<SelectPOJO>(
                SelectPOJO(name = "ACTIVE", id="ACTIVE"),
                SelectPOJO(name = "INACTIVE", id="INACTIVE")
        )
        return ResponseEntity.ok(statuses)
    }

    @GetMapping("/find/{id}")
    fun findById(@PathVariable("id") id: String): ResponseEntity<*> {
        return ResponseEntity.ok(userService.loadUserById(id))
    }

    @GetMapping("/user-profile/{id}")
    fun getUserProfile(@PathVariable("id") id: String): UserProfileDTO? {
        return userService.getUserProfile(id)
    }

    @PostMapping("/")
    fun saveUser(@RequestBody user: User): ResponseEntity<*>{
        return ResponseEntity.ok<Any>(user)
    }

    @GetMapping("/locations/{id}")
    fun getLocationsForUser(@PathVariable id: Long): ResponseEntity<*> {
        return ResponseEntity.ok(userService.findLocationsForUser(id))
    }

    @PutMapping("/forgot-password/{username}")
    fun forgotPassword(@PathVariable username: String): Boolean{
        return userService.forgotPassword(username)
    }
}
