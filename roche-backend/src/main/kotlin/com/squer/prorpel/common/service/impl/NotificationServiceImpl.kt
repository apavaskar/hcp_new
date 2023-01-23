package com.squer.prorpel.common.service.impl

import com.squer.prorpel.common.domain.Notification
import com.squer.prorpel.common.repository.NotificationRepository
import com.squer.prorpel.common.service.NotificationService
import com.squer.prorpel.persistence.SearchCriteria
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class NotificationServiceImpl: NotificationService {

    @Autowired
    lateinit var notificationRepository: NotificationRepository

    override fun find(searchCriteria: SearchCriteria): List<Notification> {
        return notificationRepository.find(searchCriteria)
    }
}
