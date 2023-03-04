package com.squer.prorpel.common.service.impl

import com.squer.prorpel.common.domain.HcpApprovalStatus
import com.squer.prorpel.common.repository.HcpApprovalStatusRepository
import com.squer.prorpel.common.service.HcpApprovalStatusService
import com.squer.prorpel.persistence.SearchCriteria
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class HcpServiceApprovalStatusImpl: HcpApprovalStatusService {

    @Autowired
    lateinit var hcpApprovalStatusRepository: HcpApprovalStatusRepository

    override fun updateCreatedBy(oldId: String, newId: String) {
         hcpApprovalStatusRepository.updateCreatedBy(oldId, newId)
    }

    override fun updateUpdatedBy(oldId: String, newId: String) {
         hcpApprovalStatusRepository.updateUpdatedBy(oldId, newId)
    }

    override fun find(criteria: SearchCriteria): List<HcpApprovalStatus> {
        return hcpApprovalStatusRepository.find(criteria)
    }

    override fun updateActionBy(oldId: String, newId: String) {
        hcpApprovalStatusRepository.updateApprover(oldId,newId)
    }
}