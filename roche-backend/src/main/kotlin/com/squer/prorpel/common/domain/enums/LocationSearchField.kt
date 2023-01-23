package com.squer.prorpel.common.domain.enums

import com.squer.prorpel.jooq.tables.references.CMT_LOCATION
import com.squer.prorpel.persistence.SearchField
import org.jooq.Field

enum class LocationSearchField: SearchField {
    NAME{
        override fun getFieldName(): String {
            return "name"
        }

        override fun getField(): Field<Any> {
            return CMT_LOCATION.`as`("child").CI_NAME as Field<Any>
        }

    },
    STATUS{
        override fun getFieldName(): String {
            return "status"
        }

        override fun getField(): Field<Any> {
            return  CMT_LOCATION.`as`("child").STATUS_ID as Field<Any>
        }
    },
    TYPE_ID{
        override fun getFieldName(): String {
            return "type_id"
        }

        override fun getField(): Field<Any> {
            return  CMT_LOCATION.`as`("child").HEIRARCHY_ID as Field<Any>
        }
    }
}
