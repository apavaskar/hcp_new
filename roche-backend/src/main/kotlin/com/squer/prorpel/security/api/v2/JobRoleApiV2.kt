package com.squer.prorpel.security.api.v2

import com.squer.prorpel.security.controller.JobRoleController
import com.squer.prorpel.security.service.JobRoleService
import io.swagger.v3.oas.annotations.security.SecurityRequirement
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v2/job-role")
@Tag(name = "V2 Job Role APIs")
@SecurityRequirement(name = "bearer-key")
@CrossOrigin
class JobRoleApiV2(
    jobRoleService: JobRoleService

) :
    JobRoleController(
            jobRoleService = jobRoleService
    )
