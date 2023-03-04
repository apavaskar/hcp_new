package com.squer.prorpel.common.domain

import com.squer.prorpel.persistence.AuditableEntity
import com.squer.prorpel.persistence.NamedReference

class HcpApprovalStatus: AuditableEntity() {
    var actionReference: NamedReference ?= null
    var ownerReference: NamedReference ?= null
    var approverReference: NamedReference ?= null
    var comment: String ?= null
    var groupId: String ?= null
    var isCurrent: Boolean ?= true
}