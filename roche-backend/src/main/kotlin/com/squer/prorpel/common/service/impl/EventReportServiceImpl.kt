package com.squer.prorpel.common.service.impl

import com.squer.prorpel.common.repository.EventReportRepository
import com.squer.prorpel.common.service.EventReportService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class EventReportServiceImpl:  EventReportService{

    @Autowired
    lateinit var eventReportRepository: EventReportRepository

    override fun updateCreatedBy(oldId: String, newId: String) {
        eventReportRepository.updateCreatedBy(oldId, newId)
    }

    override fun updateUpdatedBy(oldId: String, newId: String) {
        eventReportRepository.updateUpdatedBy(oldId, newId)
    }

    override fun updateActionBy(oldId: String, newId: String) {
        eventReportRepository.updateActionBy(oldId, newId)
    }

    override fun updateOldCreatedBy(userId: String) {
        eventReportRepository.updateOldCreatedBy(userId)
    }

}