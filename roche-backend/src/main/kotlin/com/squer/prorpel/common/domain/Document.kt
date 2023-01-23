package com.squer.prorpel.common.domain

import com.squer.prorpel.persistence.NamedReference
import com.squer.prorpel.persistence.StandardEntity

class Document: StandardEntity() {
    var ownerId: Long? = null
    var filePath: String? = null
    var type: NamedReference? = null
    var status: NamedReference? = null
}