package com.squer.prorpel.common.api

import io.swagger.v3.oas.annotations.security.SecurityRequirement
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import com.squer.prorpel.common.controller.DocumentController
import com.squer.prorpel.common.service.DocumentService

@RestController
@RequestMapping("/v2/document")
@Tag(name = "V2 Upload APIs")
@SecurityRequirement(name = "bearer-key")
@CrossOrigin
class DocumentApi (entityService: DocumentService): DocumentController (entityService = entityService)