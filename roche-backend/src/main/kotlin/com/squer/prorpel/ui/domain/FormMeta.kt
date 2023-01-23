package com.squer.prorpel.ui.domain

import com.squer.prorpel.persistence.SquerEntity

class FormMeta: SquerEntity() {
    lateinit var code: String
    lateinit var title: String
    var subTitle: String? = null
    var numColumns: Int = 0
    var isInline: Boolean = false
    lateinit var attributes: MutableList<FormAttributeMeta>
    var parentId: String? = null
    var parentType: String? = null
    var submitAction: String? = null
    var initAction: String? = null
}
