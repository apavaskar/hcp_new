package com.squer.prorpel.common.domain

import com.squer.prorpel.persistence.StandardEntity

class UserLov: StandardEntity() {
    var lovType: String ?= null
    var displayOrder: Int = 0
    var display: Boolean ?= true
}