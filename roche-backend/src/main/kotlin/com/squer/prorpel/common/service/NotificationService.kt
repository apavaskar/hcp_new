package com.squer.prorpel.common.service

import com.squer.prorpel.common.domain.Notification
import com.squer.prorpel.persistence.SearchCriteria

interface NotificationService {

    fun find(searchCriteria: SearchCriteria): List<Notification>
}
