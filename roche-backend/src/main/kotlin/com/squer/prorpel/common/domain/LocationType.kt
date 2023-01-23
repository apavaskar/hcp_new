package com.squer.prorpel.common.domain

import com.squer.prorpel.persistence.NameAwareEntity
import com.squer.prorpel.persistence.NamedReference
import com.squer.prorpel.persistence.StandardEntity

class LocationType: StandardEntity() {
    var parent: NamedReference? = null
    var externalId: String ?= null
}
