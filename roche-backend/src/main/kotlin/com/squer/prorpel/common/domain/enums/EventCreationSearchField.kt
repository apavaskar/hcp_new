package com.squer.prorpel.common.domain.enums

import com.squer.prorpel.jooq.tables.references.CME_EVENT_CREATION
import com.squer.prorpel.jooq.tables.references.FMK_SECURITY_USER
import com.squer.prorpel.persistence.SearchField
import org.jooq.Field

enum class EventCreationSearchField: SearchField {
    CREATED_BY{
        override fun getFieldName(): String {
            return "created_by"
        }

        override fun getField(): Field<Any> {
            return CME_EVENT_CREATION.`as`("cme_event_creation").CREATED_BY as Field<Any>
        }
    },
    CREATED_BY1{
        override fun getFieldName(): String {
            return "created_by"
        }

        override fun getField(): Field<Any> {
            return CME_EVENT_CREATION.CREATED_BY as Field<Any>
        }
    }
}