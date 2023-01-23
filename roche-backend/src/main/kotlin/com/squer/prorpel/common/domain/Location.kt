package com.squer.prorpel.common.domain

import com.squer.prorpel.persistence.NamedReference
import com.squer.prorpel.persistence.StandardEntity
import java.util.StringJoiner
import javax.print.DocFlavor.STRING

class Location: StandardEntity() {
    var parent: NamedReference? = null
    var heirarchy: NamedReference?= null
    var division: NamedReference? = null
    var status: NamedReference ?= null
    var sapCode: String ?= null
    var externalId: String ?= null
}
