package com.squer.prorpel.ui.domain

import com.squer.prorpel.persistence.SquerEntity

class LabelMeta: SquerEntity() {
    lateinit var code: String
    lateinit var label: String
    var isDefault: Boolean = false
}
