package com.squer.prorpel.security.domain

import com.squer.prorpel.persistence.SquerEntity

class SecurityRole: SquerEntity() {
    var name: String? = null
    var ciName: String? = null
    var privileges: List<SecurityPrivilege> = mutableListOf<SecurityPrivilege>()
}
