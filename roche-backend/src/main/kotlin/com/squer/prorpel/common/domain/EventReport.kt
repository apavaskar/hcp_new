package com.squer.prorpel.common.domain

import com.squer.prorpel.persistence.AuditableEntity
import com.squer.prorpel.persistence.NamedReference
import java.util.*

class EventReport: AuditableEntity() {
    var noOfDoctor: Int ?= 0
    var doctors: Int ?= 0
    var dne: Int ?= 0
    var supportStaff: Int ?= 0
    var others: Int ?= 0
    var statusReference: NamedReference ?= null
    var actionByReference: NamedReference ?= null
    var currentStatusReference: NamedReference ?= null
    var approvalComment: String ?= null
    var groupId: String ?= null
    var eventCreation: String ?= null
    var remark: String ?= null
    var paymentDate: Date?= null
    var paymentAmount: Double ?= 0.0
    var oldCreatedBy: String ?= null
}