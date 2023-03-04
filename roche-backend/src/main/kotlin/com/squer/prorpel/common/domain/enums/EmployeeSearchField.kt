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
    },
    STATUS{
        override fun getFieldName(): String {
            return "status"
        }

        override fun getField(): Field<Any> {
            return CMT_EMPLOYEE.STATUS_ID as Field<Any>
        }
    },
    EMAIL_ID{
        override fun getFieldName(): String {
            return "email_id"
        }

        override fun getField(): Field<Any> {
            return CMT_EMPLOYEE.EMAIL_ID as Field<Any>
        }
    },
    LOCATION_ID{
        override fun getFieldName(): String {
            return "location_id"
        }

        override fun getField(): Field<Any> {
            return CMT_EMPLOYEE.LOCATION_ID as Field<Any>
        }
    },
    JOB_TITLE_ID{
        override fun getFieldName(): String {
            return "job_title_id"
        }

        override fun getField(): Field<Any> {
            return CMT_EMPLOYEE.JOB_TITLE_ID as Field<Any>
        }
    },
}