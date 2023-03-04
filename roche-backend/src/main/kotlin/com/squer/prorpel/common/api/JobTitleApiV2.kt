package com.squer.prorpel.common.api

import com.squer.prorpel.common.controller.JobTitleController
import com.squer.prorpel.common.service.JobTitleService
import io.swagger.v3.oas.annotations.security.SecurityRequirement
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v2/job")
@Tag(name = "V2 Job APIs")
@SecurityRequirement(name = "bearer-key")
@CrossOrigin
class JobTitleApiV2(
        jobTitleService: JobTitleService
): JobTitleController(
        jobTitleService = jobTitleService
) {
}