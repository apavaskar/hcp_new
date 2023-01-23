package com.squer.prorpel.ui.domain

import com.squer.prorpel.persistence.SquerEntity
import com.squer.prorpel.persistence.SquerReference

class SearchConditionMeta: SquerEntity() {
    lateinit var searchMeta: SquerReference
    lateinit var name: String
    lateinit var operator: String
    lateinit var formatter: String
}
