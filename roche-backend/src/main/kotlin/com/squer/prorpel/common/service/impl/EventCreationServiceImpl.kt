package com.squer.prorpel.common.service.impl

import com.squer.prorpel.common.repository.EventCreationRepository
import com.squer.prorpel.common.service.EventCreationService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class EventCreationServiceImpl: EventCreationService {

    @Autowired
    lateinit var eventCreationRepository: EventCreationRepository

    override fun updateCreatedBy(oldId: String, newId: String) {
         eventCreationRepository.updateCreatedBy(oldId, newId)
    }

    override fun updateUpdatedBy(oldId: String, newId: String) {
         eventCreationRepository.updateUpdatedBy(oldId, newId)
    }

    override fun updateActionBy(oldId: String, newId: String) {
         eventCreationRepository.updateActionBy(oldId, newId)
    }

    override fun updateOldCreatedBy(userId: String) {
        eventCreationRepository.updatedOldCreatedBy(userId)
    }
}