package com.squer.prorpel.ui.api.v2

import com.squer.prorpel.ui.controller.FormMetaController
import com.squer.prorpel.ui.service.FormMetaService
import io.swagger.v3.oas.annotations.security.SecurityRequirement
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v2/form-meta")
@Tag(name = "V2 Form Meta APIs")
@SecurityRequirement(name = "bearer-key")
@CrossOrigin
class FormMetaApiV2(
  formMetaService: FormMetaService
): FormMetaController(
    formMetaService = formMetaService
)
