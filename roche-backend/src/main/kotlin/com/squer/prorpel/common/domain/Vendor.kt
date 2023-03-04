package com.squer.prorpel.common.domain

import com.squer.prorpel.persistence.NamedReference
import com.squer.prorpel.persistence.StandardEntity

class Vendor: StandardEntity() {
    var email: String?= null
    var phone: String?= null
    var sfdcNumber: String ?= null
    var gst: String ?= null
    var pancardNo: String ?= null
    var actionByReference: NamedReference?= null
    var specializationReference: NamedReference?= null
    var statusReference: NamedReference?= null
    var currentStatusReference: NamedReference?= null
    var approvalComment: String ?= null
    var groupId: String ?= null
    var oldCreatedBy: String ?= null
    var msme: String ?= null
    var creditDay: Int ?= 0
}