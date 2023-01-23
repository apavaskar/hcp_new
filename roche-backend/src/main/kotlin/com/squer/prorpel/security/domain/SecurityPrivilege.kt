package com.squer.prorpel.security.domain

import com.squer.prorpel.persistence.SquerEntity

class SecurityPrivilege: SquerEntity() {
    private var privName: String ?= null
    private var privDescription: String ?= null
}
