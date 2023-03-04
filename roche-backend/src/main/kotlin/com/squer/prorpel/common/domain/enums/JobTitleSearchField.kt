package com.squer.prorpel.common.domain.enums

import com.squer.prorpel.jooq.tables.references.CMT_EMPLOYEE
import com.squer.prorpel.jooq.tables.references.CMT_JOB_TITLE
import com.squer.prorpel.persistence.SearchField
import org.jooq.Field

enum class JobTitleSearchField : SearchField{

    ID{
        override fun getFieldName(): String {
            return "id"
        }

        override fun getField(): Field<Any> {
            return CMT_JOB_TITLE.ID as Field<Any>
        }
    }
}