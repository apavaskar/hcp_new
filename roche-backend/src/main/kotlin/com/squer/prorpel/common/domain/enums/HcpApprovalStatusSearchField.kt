package com.squer.prorpel.common.domain.enums

import com.squer.prorpel.jooq.tables.references.CME_HCP_APPROVAL_STATUS
import com.squer.prorpel.persistence.SearchField
import org.jooq.Field

enum class HcpApprovalStatusSearchField: SearchField {
    ACTION{
        override fun getFieldName(): String {
            return "action"
        }

        override fun getField(): Field<Any> {
            val chas = CME_HCP_APPROVAL_STATUS.`as`("chas")
            return chas.ACTION as Field<Any>
        }
    }
}