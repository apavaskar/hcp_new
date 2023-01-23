package com.squer.prorpel.ui.repository.enums


import com.squer.prorpel.jooq.tables.references.SEARCHCOLUMNMETA
import com.squer.prorpel.persistence.SearchField
import org.jooq.Field

enum class SearchColumnSearchField: SearchField {
    SEARCH_META_ID {
        override fun getFieldName(): String {
            return "SEARCH_META_ID"
        }

        override fun getField(): Field<Any> {
            return SEARCHCOLUMNMETA.SEARCH_META_ID as Field<Any>
        }
    }
}
