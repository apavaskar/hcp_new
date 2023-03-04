package com.squer.prorpel.common.domain

import com.squer.prorpel.persistence.SquerEntity
import java.time.LocalDateTime

class EmployeeHistory : SquerEntity(){
    var employeeId: String ?= null
    var locationId: String ?= null
    var createdDate : LocalDateTime?= LocalDateTime.now()
}