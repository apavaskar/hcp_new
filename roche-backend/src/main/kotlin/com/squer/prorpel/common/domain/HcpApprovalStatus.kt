package com.squer.prorpel.common.domain

import com.squer.prorpel.persistence.AuditableEntity
import com.squer.prorpel.persistence.NamedReference

class HcpApprovalStatus: AuditableEntity() {
    var action: NamedReference ?= null
    var owner: NamedReference ?= null
    var approver: NamedReference ?= null
    var comment: String ?= null
    var groupId: String ?= null
    var isCurrent: Boolean ?= true
}