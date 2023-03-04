package com.squer.prorpel.common.service

import com.squer.prorpel.common.domain.EmployeeHistory

interface EmployeeHistoryService {

    fun addEmployeeToHistory(employeeId: String, locationId: String): String

    fun findByLocationId(locationId : String): List<EmployeeHistory>
}