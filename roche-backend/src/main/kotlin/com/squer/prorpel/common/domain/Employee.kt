package com.squer.prorpel.common.domain

import com.squer.prorpel.persistence.NamedReference
import com.squer.prorpel.persistence.StandardEntity

class Employee : StandardEntity(){
     var code: String?= null
     var manager : NamedReference? = null
     var location: NamedReference?= null
     var status: NamedReference?= null
     var jobTitle: NamedReference?= null
     var externalId: String?= null
     var emailId: String?= null
}