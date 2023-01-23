package com.squer.prorpel.ui.repository.enums


import com.squer.prorpel.jooq.tables.references.SEARCHMETA
import com.squer.prorpel.persistence.SearchField
import org.jooq.Field

enum class SearchMetaSearchField: SearchField {
    ENTITY_NAME {
        override fun getFieldName(): String {
            return "entity_name"
        }

        override fun getField(): Field<Any> {
            return SEARCHMETA.ENTITY_NAME as Field<Any>
        }
    }
}
