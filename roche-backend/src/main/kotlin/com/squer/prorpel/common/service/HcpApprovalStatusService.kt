package com.squer.prorpel.common.service

import com.squer.prorpel.common.domain.HcpApprovalStatus
import com.squer.prorpel.persistence.SearchCriteria

interface HcpApprovalStatusService {

    fun updateCreatedBy(oldId: String, newId: String)

    fun updateUpdatedBy(oldId: String, newId: String)

    fun find(criteria: SearchCriteria): List<HcpApprovalStatus>

    fun updateActionBy(oldId: String, newId: String)
}