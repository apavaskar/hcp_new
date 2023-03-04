package com.squer.prorpel.common.service.impl

import com.squer.prorpel.common.domain.EmployeeHistory
import com.squer.prorpel.common.repository.EmployeeHistoryRepository
import com.squer.prorpel.common.service.EmployeeHistoryService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class EmployeeHistoryServiceImpl: EmployeeHistoryService {

    @Autowired
    private lateinit var employeeHistoryRepository: EmployeeHistoryRepository

    override fun addEmployeeToHistory(employeeId: String, locationId: String): String {
        var employeeHistory = EmployeeHistory()
        employeeHistory.employeeId = employeeId
        employeeHistory.locationId = locationId
        return employeeHistoryRepository.create(employeeHistory)
    }

    override fun findByLocationId(locationId: String): List<EmployeeHistory> {
        return employeeHistoryRepository.findByLocationId(locationId)
    }
}