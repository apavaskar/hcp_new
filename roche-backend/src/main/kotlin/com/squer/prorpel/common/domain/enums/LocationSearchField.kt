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
            return "status_id"
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
    },
    ID{
        override fun getFieldName(): String {
            return "id"
        }

        override fun getField(): Field<Any> {
            return  CMT_LOCATION.`as`("child").ID as Field<Any>
        }
    },
    PARENT_ID{
        override fun getFieldName(): String {
            return "parent_id"
        }

        override fun getField(): Field<Any> {
            return  CMT_LOCATION.`as`("child").PARENT_ID as Field<Any>
        }
    },
    CI_NAME{
        override fun getFieldName(): String {
            return "ci_name"
        }

        override fun getField(): Field<Any> {
            return  CMT_LOCATION.`as`("child").CI_NAME as Field<Any>
        }
    },
    HEIRARCHY_ID{
        override fun getFieldName(): String {
            return "heirarchy_id"
        }

        override fun getField(): Field<Any> {
            return  CMT_LOCATION.`as`("child").HEIRARCHY_ID as Field<Any>
        }
    }
}
