package com.squer.prorpel.common.service.impl

import com.squer.prorpel.common.domain.EventApprovalStatus
import com.squer.prorpel.common.repository.EventApprovalStatusRepository
import com.squer.prorpel.common.service.EventApprovalStatusService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class EventApprovalStatusServiceImpl: EventApprovalStatusService {

    @Autowired
    lateinit var eventApprovalStatusRepository: EventApprovalStatusRepository

    override fun updateCreatedBy(oldId: String, newId: String) {
         eventApprovalStatusRepository.updateCreatedBy(oldId, newId)
    }

    override fun updateUpdatedBy(oldId: String, newId: String) {
         eventApprovalStatusRepository.updateUpdatedBy(oldId, newId)
    }

    override fun updateActionBy(oldId: String, newId: String) {
         eventApprovalStatusRepository.updateActionBy(oldId, newId)
    }

    override fun create(entity: EventApprovalStatus): String{
        return eventApprovalStatusRepository.create(entity)
    }
}