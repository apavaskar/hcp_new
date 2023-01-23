package com.squer.prorpel.ui.api.v2

import com.squer.prorpel.ui.controller.MenuController
import com.squer.prorpel.ui.service.MenuService
import io.swagger.v3.oas.annotations.security.SecurityRequirement
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v2/menu")
@Tag(name = "V1 User APIs")
@SecurityRequirement(name = "bearer-key")
@CrossOrigin
class MenuApiV2(
  menuService: MenuService
): MenuController(
    menuService = menuService
)
