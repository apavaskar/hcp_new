package com.squer.prorpel.security.dto

import com.squer.prorpel.persistence.NamedReference

class UserProfileDTO {
    var id: Long? = null
    var fullName: String? = null
    var email: String? = null
    lateinit var jobRole: NamedReference
    lateinit var location: NamedReference
}