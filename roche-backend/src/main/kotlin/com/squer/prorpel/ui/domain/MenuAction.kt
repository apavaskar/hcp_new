package com.squer.prorpel.ui.domain

import com.squer.prorpel.persistence.NameAwareEntity

class MenuAction: NameAwareEntity() {
    var path: String? = null
    var parentId: String? = null
    lateinit var uiInterface: String
    var privilegeId: Long? = null
}

