package com.squer.prorpel.common.domain.enums

import com.squer.prorpel.jooq.tables.references.CME_EVENT_APPROVAL_STATUS
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
    },
    ACTION1{
        override fun getFieldName(): String {
            return "action"
        }

        override fun getField(): Field<Any> {
            return CME_HCP_APPROVAL_STATUS.ACTION as Field<Any>
        }
    },
    APPROVER_ID{
        override fun getFieldName(): String {
            return "approver_id"
        }

        override fun getField(): Field<Any> {
            return CME_HCP_APPROVAL_STATUS.APPROVER_ID as Field<Any>
        }
    },
    OWNER_ID{
        override fun getFieldName(): String {
            return "cmdoc_id"
        }

        override fun getField(): Field<Any> {
            return CME_HCP_APPROVAL_STATUS.CMDOC_ID as Field<Any>
        }
    },
    CREATED_BY{
        override fun getFieldName(): String {
            return "created_by"
        }

        override fun getField(): Field<Any> {
            return CME_HCP_APPROVAL_STATUS.CREATED_BY as Field<Any>
        }
    }
}