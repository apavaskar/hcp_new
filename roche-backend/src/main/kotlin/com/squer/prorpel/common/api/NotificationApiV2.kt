package com.squer.prorpel.common.api

import com.squer.prorpel.common.controller.NotificationController
import com.squer.prorpel.common.service.NotificationService
import io.swagger.v3.oas.annotations.security.SecurityRequirement
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v2/notifications")
@Tag(name = "V2 notifications APIs")
@SecurityRequirement(name = "bearer-key")
@CrossOrigin
class NotificationApiV2(
    notificationService: NotificationService,
) :
    NotificationController(
        notificationService = notificationService
    )
