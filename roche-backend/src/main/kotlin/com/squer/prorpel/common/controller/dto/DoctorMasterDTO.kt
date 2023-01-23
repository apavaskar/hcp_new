package com.squer.prorpel.common.controller.dto

import com.squer.prorpel.persistence.NamedReference

class DoctorMasterDTO {
    var id: String?= null
    var name: String?= null
    var email: String ?= null
    var doctor: NamedReference ?= null
    var phone: String ?= null
    var sfdcNumber: String ?= null
    var gst: String ?= null
    var pancardNo: String ?= null
    var actionBy: NamedReference ?= null
    var status: NamedReference ?= null
    var specialization: NamedReference ?= null
    var location: NamedReference?= null
    var requiredDocumentDto: RequiredDocumentDto ?= null
    var approvalId: String?= null
    var actionDate: Long ?= null
    var initiatedDate: Long ?= null
    var initiatedBy: NamedReference ?= null
    var groupId: String?= null
    var approvalComment: String ?= null
    var isRejected: Boolean ?= false
    var currentStatus: NamedReference?= null
}