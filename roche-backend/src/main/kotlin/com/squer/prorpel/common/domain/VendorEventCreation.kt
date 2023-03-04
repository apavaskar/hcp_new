package com.squer.prorpel.common.domain

import com.squer.prorpel.persistence.AuditableEntity
import com.squer.prorpel.persistence.NamedReference
import java.util.*

class VendorEventCreation: AuditableEntity() {
    var eventTypeReference: NamedReference?= null
    var eventDate: Date?= null
    var eventTopic: String?= null
    var eventVenue : String ?= null
    var comment: String ?= null
    var noOfDoctor: Int?= 0
    var doctors : Int ?=0
    var dne: Int?= 0
    var supportStaff: Int ?= 0
    var others: Int ?= 0
    var statusReference: NamedReference?= null
    var actionByReference: NamedReference?= null
    var currentStatusReference: NamedReference?= null
    var approvalComment: String ?= null
    var groupId: String ?= null
    var advanceRequest: Double ?= 0.0
    var paidAdvancedRequest : Double?= 0.0
    var eventNo: Int?= 0
    var oldEventDate: Date?= null
    var transactionDetail : String ?= null
    var transactionDate: Date?= null
    var isConducted: Date?= null
    var conductedDate: Date?= null
    var abortedReason: String?= null
    var oldCreatedBy: String ?= null
}