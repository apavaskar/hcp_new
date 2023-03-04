package com.squer.prorpel.common.service

import com.squer.prorpel.common.domain.JobTitle
import com.squer.prorpel.persistence.SearchCriteria

interface JobTitleService {

    fun searchJob(): List<JobTitle>

    fun requiredJobTitleSearch(): List<JobTitle>
}