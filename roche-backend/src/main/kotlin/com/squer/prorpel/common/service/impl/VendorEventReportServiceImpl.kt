package com.squer.prorpel.common.service.impl

import com.squer.prorpel.common.repository.VendorEventReportRepository
import com.squer.prorpel.common.service.VendorEventReportService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class VendorEventReportServiceImpl: VendorEventReportService {

    @Autowired
    lateinit var vendorEventReportRepository: VendorEventReportRepository

    override fun updateCreatedBy(oldId: String, newId: String) {
         vendorEventReportRepository.updateCreatedBy(oldId, newId)
    }

    override fun updateUpdatedBy(oldId: String, newId: String) {
         vendorEventReportRepository.updateUpdatedBy(oldId, newId)
    }

    override fun updateActionBy(oldId: String, newId: String) {
        vendorEventReportRepository.updateActionBy(oldId, newId)
    }

    override fun updateOldCreatedBy(userId: String) {
        vendorEventReportRepository.updateOldCreatedBy(userId)
    }
}