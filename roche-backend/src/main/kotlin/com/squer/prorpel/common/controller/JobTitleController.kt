package com.squer.prorpel.common.controller

import com.squer.prorpel.common.domain.enums.EmployeeSearchField
import com.squer.prorpel.common.domain.enums.JobTitleSearchField
import com.squer.prorpel.common.service.JobTitleService
import com.squer.prorpel.persistence.SearchCriteria
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping

open class JobTitleController @Autowired constructor(
        private val jobTitleService: JobTitleService
) {
    companion object{
        val conditionsMap = JobTitleSearchField
                .values().associateBy({it.getFieldName()},{it})
    }

    @GetMapping("/all")
    fun findAll(): ResponseEntity<*> {
        return ResponseEntity.ok(jobTitleService.requiredJobTitleSearch())
    }

}