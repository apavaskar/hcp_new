package com.squer.prorpel.common.service.impl

import com.squer.prorpel.common.repository.VendorEventCreationRepository
import com.squer.prorpel.common.service.VendorEventCreationService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class VendorEventCreationServiceImpl: VendorEventCreationService {

    @Autowired
    lateinit var vendorEventCreationRepository: VendorEventCreationRepository

    override fun updateCreatedBy(oldId: String, newId: String) {
         vendorEventCreationRepository.updateCreatedBy(oldId, newId)
    }

    override fun updateUpdatedBy(oldId: String, newId: String) {
         vendorEventCreationRepository.updateUpdatedBy(oldId, newId)
    }

    override fun updateActionBy(oldId: String, newId: String) {
        vendorEventCreationRepository.updateActionBy(oldId, newId)
    }

    override fun updateOldCreatedBy(userId: String) {
        vendorEventCreationRepository.updateOldCreatedBy(userId)
    }
}