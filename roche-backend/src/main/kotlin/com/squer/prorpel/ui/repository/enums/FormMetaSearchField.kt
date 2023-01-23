package com.squer.prorpel.ui.repository.enums


import com.squer.prorpel.jooq.tables.references.FORMMETA
import com.squer.prorpel.persistence.SearchField
import org.jooq.Field

enum class FormMetaSearchField: SearchField {
    CODE {
        override fun getFieldName(): String {
            return "CODE"
        }

        override fun getField(): Field<Any> {
            return FORMMETA.CODE as Field<Any>
        }
    }
}
