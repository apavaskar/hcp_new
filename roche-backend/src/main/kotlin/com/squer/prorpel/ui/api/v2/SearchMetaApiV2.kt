package com.squer.prorpel.ui.api.v2

import com.squer.prorpel.ui.controller.SearchMetaController
import com.squer.prorpel.ui.service.SearchMetaService
import io.swagger.v3.oas.annotations.security.SecurityRequirement
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v2/search-meta")
@Tag(name = "V2 Search Meta APIs")
@SecurityRequirement(name = "bearer-key")
@CrossOrigin
class SearchMetaApiV2(
  searchMetaService: SearchMetaService
): SearchMetaController(
    searchMetaService = searchMetaService
)
