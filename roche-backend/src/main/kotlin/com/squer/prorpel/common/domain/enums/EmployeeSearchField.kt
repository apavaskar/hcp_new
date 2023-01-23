package com.squer.prorpel.common.domain.enums

import com.squer.prorpel.jooq.tables.references.CMT_EMPLOYEE
import com.squer.prorpel.jooq.tables.references.CMT_LOCATION
import com.squer.prorpel.persistence.SearchField
import org.jooq.Field

enum class EmployeeSearchField: SearchField {
    NAME{
        override fun getFieldName(): String {
            return "name"
        }

        override fun getField(): Field<Any> {
            return CMT_EMPLOYEE.CI_NAME as Field<Any>
        }
    },
    CODE{
        override fun getFieldName(): String {
            return "code"
        }

        override fun getField(): Field<Any> {
            return CMT_EMPLOYEE.CODE as Field<Any>
        }
    }
}