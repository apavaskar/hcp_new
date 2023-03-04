package com.squer.prorpel.common.domain

import com.squer.prorpel.persistence.AuditableEntity
import com.squer.prorpel.persistence.NamedReference
import com.squer.prorpel.persistence.SquerReference

class EventApprovalStatus: AuditableEntity() {
    var ownerId: SquerReference?= null
    var approverReference: NamedReference ?= null
    var actionReference: NamedReference ?= null
    var comment: String ?= null
    var groupId: String ?= null
    var isCurrent: Boolean ?= false
    var cmeType: String ?= null
}