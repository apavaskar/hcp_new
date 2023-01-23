package com.squer.prorpel.ui.controller

import com.squer.prorpel.ui.service.FormMetaService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

open class FormMetaController @Autowired constructor(
    private val formMetaService: FormMetaService
)  {

    @GetMapping("/by-code/{code}")
    fun getFormMeta(@PathVariable("code") code: String): ResponseEntity<*> {
        return ResponseEntity.ok(formMetaService.findFormMeta(code))
    }
}
