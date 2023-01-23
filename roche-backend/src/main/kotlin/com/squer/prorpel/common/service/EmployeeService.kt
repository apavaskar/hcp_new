package com.squer.prorpel.common.service

import com.squer.prorpel.common.domain.Employee
import com.squer.prorpel.persistence.NamedReference
import com.squer.prorpel.persistence.SearchCriteria

interface EmployeeService {
    fun findById(id: String): Employee?

    fun getEmployeeReference(id: String): NamedReference

    fun searchEmployee(searchCriteria: SearchCriteria): List<Employee>
}