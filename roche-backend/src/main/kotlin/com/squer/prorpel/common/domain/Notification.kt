package com.squer.prorpel.common.domain

import com.squer.prorpel.persistence.StandardEntity

class Notification: StandardEntity() {
    lateinit var text: String
    var fromDate: Int = 0
    var toDate: Int = 0
}
