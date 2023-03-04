package com.squer.prorpel.common.service.impl

import com.squer.prorpel.common.domain.Vendor
import com.squer.prorpel.common.repository.VendorRepository
import com.squer.prorpel.common.service.VendorService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Repository
import org.springframework.stereotype.Service

@Service
class VendorServiceImpl: VendorService {

    @Autowired
    lateinit var vendorRepository: VendorRepository

    override fun updateCreatedBy(oldId: String, newId: String) {
         vendorRepository.updateCreatedBy(oldId, newId)
    }

    override fun updateUpdatedBy(oldId: String, newId: String) {
         vendorRepository.updateUpdatedBy(oldId, newId)
    }

    override fun updateActionBy(oldId: String, newId: String) {
        vendorRepository.updateActionBy(oldId, newId)
    }

    override fun updateOldCreatedBy(userId: String) {
        vendorRepository.updateOldCreatedBy(userId)
    }
}