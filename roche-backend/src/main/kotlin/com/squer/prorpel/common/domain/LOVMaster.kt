package com.squer.prorpel.common.domain

import com.squer.prorpel.persistence.NameAwareEntity

class LOVMaster: NameAwareEntity() {
    var displayOrder: Int = 0
    lateinit var type: String
}
