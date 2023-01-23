package com.squer.prorpel.common.controller

import com.squer.prorpel.common.domain.enums.EmployeeSearchField
import com.squer.prorpel.common.domain.enums.LocationSearchField
import com.squer.prorpel.common.service.EmployeeService
import com.squer.prorpel.persistence.SearchCriteria
import com.squer.prorpel.persistence.SearchField
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody

open class EmployeeController @Autowired constructor(
        private val employeeService: EmployeeService
){

    companion object{
        val conditionsMap = EmployeeSearchField
                .values().associateBy({it.getFieldName()},{it})
    }

    @PostMapping("/search")
    fun getEmployeeList(@RequestBody conditions: Map<String, Any>): ResponseEntity<*>{
        var criteria = SearchCriteria()
        conditions.keys.forEach{
            criteria.addCondition(EmployeeController.conditionsMap[it] as SearchField,conditions[it] as Any)
        }
        return ResponseEntity.ok(employeeService.searchEmployee(criteria))
    }

}