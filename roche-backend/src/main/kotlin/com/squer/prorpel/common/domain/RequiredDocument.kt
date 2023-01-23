package com.squer.prorpel.common.domain

import com.squer.prorpel.persistence.AuditableEntity
import com.squer.prorpel.persistence.NamedReference
import com.squer.prorpel.persistence.SquerReference

class RequiredDocument: AuditableEntity() {
    var type: NamedReference?= null
    var owner: SquerReference ?= null
    var path: String?= null
    var value: String?= null
    var fileName: String ?= null
}