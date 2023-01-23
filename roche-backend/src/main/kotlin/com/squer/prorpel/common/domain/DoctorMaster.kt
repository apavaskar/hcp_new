package com.squer.prorpel.common.domain

import com.squer.prorpel.persistence.NamedReference
import com.squer.prorpel.persistence.StandardEntity
import javax.naming.Name

class DoctorMaster: StandardEntity() {
    var email: String?= null
    var doctor: NamedReference ?= null
    var phone: String?= null
    var sfdcNumber: String ?= null
    var gst: String ?= null
    var pancardNo: String ?= null
    var actionBy: NamedReference ?= null
    var specialization: NamedReference ?= null
    var status: NamedReference ?= null
    var currentStatus: NamedReference ?= null
    var approvalComment: String ?= null
    var groupId: String ?= null

    var approvalId: String?= null
    var action: NamedReference ?= null
}