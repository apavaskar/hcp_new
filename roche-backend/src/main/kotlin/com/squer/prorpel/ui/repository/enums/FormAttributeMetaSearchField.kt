package com.squer.prorpel.ui.repository.enums

import com.squer.prorpel.jooq.tables.references.FORMATTRIBUTEMETA
import com.squer.prorpel.persistence.SearchField
import org.jooq.Field

enum class FormAttributeMetaSearchField: SearchField {
    FORM_ID {
        override fun getFieldName(): String {
            return "FORM_ID"
        }

        override fun getField(): Field<Any> {
            return FORMATTRIBUTEMETA.FORM_ID as Field<Any>
        }
    }
}
