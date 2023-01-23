package com.squer.prorpel.ui.repository.enums


import com.squer.prorpel.jooq.tables.references.SEARCHCONDITIONMETA
import com.squer.prorpel.persistence.SearchField
import org.jooq.Field

enum class SearchConditionSearchField: SearchField {
    SEARCH_META_ID {
        override fun getFieldName(): String {
            return "SEARCH_META_ID"
        }

        override fun getField(): Field<Any> {
            return SEARCHCONDITIONMETA.SEARCH_META_ID as Field<Any>
        }
    }
}
