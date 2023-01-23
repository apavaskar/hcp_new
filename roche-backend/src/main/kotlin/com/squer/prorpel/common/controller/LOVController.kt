package com.squer.prorpel.common.controller

import com.squer.prorpel.common.service.LovService
import com.squer.prorpel.persistence.SearchCriteria
import lombok.extern.slf4j.Slf4j
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

@Slf4j
open class LOVController @Autowired constructor(
    private val lovService: LovService
) {

    @GetMapping("/find-by-type/{table}/{type}")
    fun findById(@PathVariable("table") table: String,@PathVariable("type") type: String): ResponseEntity<*> {
        //criteria.addCondition(LOVSearchField.TYPE, type)
        return ResponseEntity.ok<Any>(lovService.findByType(table, type))
    }
}
