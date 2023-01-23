package com.squer.prorpel.common.service.impl

import com.squer.prorpel.common.domain.Employee
import com.squer.prorpel.common.repository.EmployeeRepository
import com.squer.prorpel.common.service.EmployeeService
import com.squer.prorpel.persistence.NamedReference
import com.squer.prorpel.persistence.SearchCriteria
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class EmployeeServiceImpl: EmployeeService {

    @Autowired
    lateinit var employeeRepository: EmployeeRepository

    override fun findById(id: String): Employee? {
        return employeeRepository.findById(id)
    }

    override fun getEmployeeReference(id: String): NamedReference{
        return employeeRepository.getEmployeeReference(id)
    }

    override fun searchEmployee(searchCriteria: SearchCriteria): List<Employee> {
        return employeeRepository.find(searchCriteria)
    }
}