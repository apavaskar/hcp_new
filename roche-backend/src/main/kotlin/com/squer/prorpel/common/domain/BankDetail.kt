package com.squer.prorpel.common.domain

import com.squer.prorpel.persistence.AuditableEntity
import com.squer.prorpel.persistence.NamedReference

class BankDetail : AuditableEntity(){
    var hcpName: String?= null
    var address: String?= null
    var beneficiaryName: String?= null
    var bankName: String?= null
    var accountNo: String?= null
    var branchName: String ?= null
    var ifscCode: String?= null
    var partnerId: String ?= null
    var comments: String?= null
    var serviceProviderNo: String?= null
    var owner: NamedReference?= null
}