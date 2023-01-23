package com.squer.prorpel.ui.controller

import com.squer.prorpel.ui.service.SearchMetaService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

open class SearchMetaController @Autowired constructor(
    private val searchMetaService: SearchMetaService
)  {

    @GetMapping("/by-name/{entityName}")
    fun getFormMeta(@PathVariable("entityName") entityName: String): ResponseEntity<*> {
        return ResponseEntity.ok(searchMetaService.findSearchMeta(entityName))
    }
}
