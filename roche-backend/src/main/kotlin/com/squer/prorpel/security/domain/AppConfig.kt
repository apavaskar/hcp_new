package com.squer.prorpel.security.domain

import com.squer.prorpel.persistence.SquerEntity

class AppConfig: SquerEntity() {
    lateinit var appVersion: String
    lateinit var adminPassword: String
}