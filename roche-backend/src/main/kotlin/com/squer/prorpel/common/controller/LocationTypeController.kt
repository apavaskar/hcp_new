package com.squer.prorpel.common.controller

import com.squer.prorpel.common.domain.enums.LocationTypeSearchField
import com.squer.prorpel.common.service.LocationTypeService
import com.squer.prorpel.persistence.SearchCriteria
import com.squer.prorpel.ui.domain.SelectPOJO
import lombok.extern.slf4j.Slf4j
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody

@Slf4j
open class LocationTypeController @Autowired constructor(
    private val locationTypeService: LocationTypeService
) {

    companion object{
        val conditionsMap = LocationTypeSearchField.values().associateBy({it.getFieldName()},{it})
    }

    @PostMapping("/search")
    fun search(@RequestBody conditions: Map<String, Any>): ResponseEntity<*> {
        val field =  conditionsMap.get("name")
        return ResponseEntity.ok(locationTypeService.searchLocationTypes(SearchCriteria()))
    }

    @GetMapping("/all")
    fun findAll(): ResponseEntity<*> {
        val criteria = SearchCriteria()
        return ResponseEntity.ok(locationTypeService.searchLocationTypes(criteria))
    }

    @GetMapping("/status")
    fun findStatus(): ResponseEntity<*> {
        val statuses = arrayListOf<SelectPOJO>(
            SelectPOJO(name = "ACTIVE", id="ACTIVE"),
            SelectPOJO(name = "INACTIVE", id="INACTIVE")
        )
        return ResponseEntity.ok(statuses)
    }

    @GetMapping("/find/{id}")
    fun findById(@PathVariable("id") id: String): ResponseEntity<*> {
        return ResponseEntity.ok<Any>(locationTypeService.findById(id))
    }
}
