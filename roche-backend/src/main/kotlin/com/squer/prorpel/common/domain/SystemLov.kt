package com.squer.prorpel.common.domain

import com.squer.prorpel.persistence.StandardEntity

class SystemLov : StandardEntity(){
    var lovType: String ?= null
    var displayOrder: Int = 0
    var display: Boolean ?= true
}