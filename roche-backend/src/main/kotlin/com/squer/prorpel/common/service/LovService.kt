package com.squer.prorpel.common.service

import com.squer.prorpel.persistence.NamedReference

interface LovService {
    fun findByType(table: String, type: String): List<NamedReference>
}