package com.squer.prorpel.ui.domain

import com.squer.prorpel.persistence.SquerEntity

class SearchMeta: SquerEntity() {
    lateinit var entityName: String
    lateinit var conditions: List<SearchConditionMeta>
    lateinit var result: List<SearchColumnMeta>
}
