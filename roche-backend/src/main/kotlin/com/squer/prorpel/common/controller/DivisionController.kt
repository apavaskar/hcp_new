package com.squer.prorpel.common.controller

import com.squer.prorpel.common.domain.enums.DivisionSearchField
import com.squer.prorpel.common.domain.enums.EmployeeSearchField
import com.squer.prorpel.common.service.DivisionService
import com.squer.prorpel.persistence.SearchCriteria
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping

open class DivisionController @Autowired constructor(
        private val divisionService: DivisionService
) {

    companion object{
        val conditionsMap = DivisionSearchField
                .values().associateBy({it.getFieldName()},{it})
    }

    @GetMapping("/all")
    fun findAll(): ResponseEntity<*> {
        return ResponseEntity.ok(divisionService.requiredAllDivision())
    }
}