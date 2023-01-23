package com.squer.prorpel.ui.domain

import com.squer.prorpel.persistence.SquerEntity
import com.squer.prorpel.persistence.SquerReference

class FormAttributeMeta: SquerEntity(){
    lateinit var name: String
    lateinit var type: String
    lateinit var form: SquerReference
    var span: Int = 0
    var offset: Int = 0
    var displayOrder: Int = 0
    var label: String? = null
    var placeholder: String? = null
    var action: String?  =null
    var onSelect: String? = null
    var onChange: String? = null
    var onSearch: String? = null
    var defaultValue: String? = null
    var dataType: String? = null
    var isRequired: Boolean? = false
    var isEnabled: Boolean? = null
    var minValue: String? = null
    var maxValue: String? = null
    var minLength: Int? = null
    var maxLength: Int? = null
    var pattern: String? = null
    var message: String? = null
    var reference: String? = null
}
