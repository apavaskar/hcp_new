package com.squer.prorpel.common.domain.enums

import com.squer.prorpel.jooq.tables.references.CMT_ORGANIZATION_HEIRARCHY
import com.squer.prorpel.persistence.SearchField
import org.jooq.Field

enum class LocationTypeSearchField: SearchField {
    NAME{
        override fun getFieldName(): String {
            return "name"
        }

        override fun getField(): Field<Any> {
            return CMT_ORGANIZATION_HEIRARCHY.CI_NAME as Field<Any>
        }

    },

}
