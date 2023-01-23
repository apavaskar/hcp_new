package com.squer.prorpel.common.domain

import com.squer.prorpel.persistence.NamedReference
import com.squer.prorpel.persistence.StandardEntity

class Doctor: StandardEntity() {
    var code: String ?= null
    var status: NamedReference? = null
    var location: NamedReference ?= null
    var classification: NamedReference ?= null
    var externalId: String ?= null
    var requiredFrequency: Int = 0
    var email: String ?= null
    var phone: String ?= null
    var accountId: String ?= null
}