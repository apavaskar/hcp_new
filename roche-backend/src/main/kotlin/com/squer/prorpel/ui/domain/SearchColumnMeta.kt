package com.squer.prorpel.ui.domain

import com.squer.prorpel.persistence.SquerEntity
import com.squer.prorpel.persistence.SquerReference

class SearchColumnMeta: SquerEntity() {
    lateinit var searchMeta: SquerReference
    lateinit var title: String
    lateinit var dataIndex: String
    lateinit var key: String
    var render: String? = null
    var displayOrder: Int = 0
}
