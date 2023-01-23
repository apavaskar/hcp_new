package com.squer.prorpel.common.domain

import com.squer.prorpel.persistence.StandardEntity


class Division: StandardEntity() {
    var code: String? = null
    var isActive: Boolean? = null
}