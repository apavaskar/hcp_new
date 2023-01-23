package com.squer.prorpel.common.controller

import com.squer.prorpel.common.domain.Notification
import com.squer.prorpel.common.domain.enums.NotificationSearchField
import com.squer.prorpel.common.service.NotificationService
import com.squer.prorpel.persistence.SearchCriteria
import com.squer.prorpel.persistence.SearchOperator
import com.squer.prorpel.utils.DateUtils
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import java.util.*

open class NotificationController@Autowired constructor(
    private val notificationService: NotificationService
) {

    @GetMapping("/active")
    fun findActiveNotifications(): List<Notification> {
        val criteria = SearchCriteria()
        //criteria.addCondition(NotificationSearchField.FROM_DATE, SearchOperator.LE, DateUtils.getYearMonthDayFromDate(Date()))
        //criteria.addCondition(NotificationSearchField.TO_DATE, SearchOperator.GE, DateUtils.getYearMonthDayFromDate(Date()))
        return notificationService.find(criteria)
    }

}
