package com.squer.prorpel.common.controller

import com.squer.prorpel.common.controller.dto.EmployeeDTO
import com.squer.prorpel.common.domain.Employee
import com.squer.prorpel.common.domain.enums.EmployeeSearchField
import com.squer.prorpel.common.service.EmployeeService
import com.squer.prorpel.persistence.SearchCriteria
import com.squer.prorpel.persistence.SearchField
import com.squer.prorpel.persistence.SearchOperator
import com.squer.prorpel.ui.controller.FormUtils
import com.squer.prorpel.ui.domain.SelectPOJO
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.net.http.HttpResponse

open class EmployeeController @Autowired constructor(
        private val employeeService: EmployeeService,
        private  var formUtils: FormUtils
){

    companion object{
        val conditionsMap = EmployeeSearchField
                .values().associateBy({it.getFieldName()},{it})
    }

    @PostMapping("/search")
    fun getEmployeeList(@RequestBody conditions: Map<String, Any>): ResponseEntity<*>{
        var criteria = SearchCriteria()
        conditions.keys.forEach{
            criteria.addCondition(EmployeeController.conditionsMap[it] as SearchField, SearchOperator.LIKE , "%" + conditions[it].toString().trim().lowercase() + "%")
        }
           // formUtils.formSearchCondition(3, conditions, criteria)
        return ResponseEntity.ok(employeeService.searchEmployee(criteria))
    }

    @GetMapping("/status")
    fun findStatus(): ResponseEntity<*> {
        val statuses = arrayListOf<SelectPOJO>(
                SelectPOJO(name = "ACTIVE", id="SYSLVEMPLYST0000000000000000000000001"),
                SelectPOJO(name = "INACTIVE", id="SYSLVEMPLYST0000000000000000000000002")
        )
        return ResponseEntity.ok(statuses)
    }

    @GetMapping("/all")
    fun findAll(): ResponseEntity<*> {
        val criteria = SearchCriteria()
        criteria.addCondition(EmployeeSearchField.STATUS, "SYSLVEMPLYST0000000000000000000000001")
        return ResponseEntity.ok(employeeService.searchEmployee(criteria))
    }

    @PostMapping("/create")
    fun createEmployee(@RequestBody data: EmployeeDTO): ResponseEntity<*>{
        val employee = employeeService.createEmployee(data)
        if(employee == "Duplicate Code"){
            val errorMap: MutableMap<String, String> = HashMap()
            errorMap["message"] = "Code should be Unique"
            errorMap["error"] = "true"
            return ResponseEntity(errorMap, HttpStatus.BAD_REQUEST)
        }
        else if(employee == "Duplicate Email"){
            val errorMap: MutableMap<String, String> = HashMap()
            errorMap["message"] = "Email Id should be Unique"
            errorMap["error"] = "true"
            return ResponseEntity(errorMap, HttpStatus.BAD_REQUEST)
        }else if(employee == "Something went wrong!"){
            val errorMap: MutableMap<String, String> = HashMap()
            errorMap["message"] = "Something went wrong!"
            errorMap["error"] = "true"
            return ResponseEntity(errorMap, HttpStatus.BAD_REQUEST)
        }else{
            return ResponseEntity.ok<Any>(employee)
        }
    }

    @GetMapping("/find/{id}")
    fun findById(@PathVariable("id") id: String): ResponseEntity<*> {
        return ResponseEntity.ok<Any>(employeeService.findById(id))
    }

    @PutMapping("/save")
    fun saveEmployee(@RequestBody data: Employee): ResponseEntity<*>{
        val employee = employeeService.saveEmployee(data)
        if(employee == "Duplicate Code"){
            val errorMap: MutableMap<String, String> = HashMap()
            errorMap["message"] = "Code should be Unique"
            errorMap["error"] = "true"
            return ResponseEntity(errorMap, HttpStatus.BAD_REQUEST)
        } else if(employee == "Duplicate Email"){
            val errorMap: MutableMap<String, String> = HashMap()
            errorMap["message"] = "Email Id should be Unique"
            errorMap["error"] = "true"
            return ResponseEntity(errorMap, HttpStatus.BAD_REQUEST)
        }else if(employee == "Please Select Location"){
            val errorMap: MutableMap<String, String> = HashMap()
            errorMap["message"] = "Please Select Location"
            errorMap["error"] = "true"
            return ResponseEntity(errorMap, HttpStatus.BAD_REQUEST)
        }else if(employee == "Please Change Location"){
            val errorMap: MutableMap<String, String> = HashMap()
            errorMap["message"] = "Please Change Location"
            errorMap["error"] = "true"
            return ResponseEntity(errorMap, HttpStatus.BAD_REQUEST)
        }
        else if(employee == "Something went wrong!"){
            val errorMap: MutableMap<String, String> = HashMap()
            errorMap["message"] = "Something went wrong!"
            errorMap["error"] = "true"
            return ResponseEntity(errorMap, HttpStatus.BAD_REQUEST)
        }else{
            return ResponseEntity.ok<Any>(employee)
        }
        //return ResponseEntity.ok<Any>(employee)
    }

}