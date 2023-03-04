package com.squer.prorpel.common.domain.enums

import com.squer.prorpel.jooq.tables.references.CME_EVENT_APPROVAL_STATUS
import com.squer.prorpel.jooq.tables.references.FMK_SECURITY_USER
import com.squer.prorpel.persistence.SearchField
import org.jooq.Field

enum class EventApprovalStatusSearchField: SearchField {
    APPROVER_ID{
        override fun getFieldName(): String {
            return "approver_id"
        }

        override fun getField(): Field<Any> {
            return CME_EVENT_APPROVAL_STATUS.APPROVER_ID as Field<Any>
        }
    },
    OWNER_ID{
        override fun getFieldName(): String {
            return "owner_id"
        }

        override fun getField(): Field<Any> {
            return CME_EVENT_APPROVAL_STATUS.`as`("cme_event_approval_status").OWNER_ID as Field<Any>
        }
    },
    OWNER_ID1{
        override fun getFieldName(): String {
            return "owner_id"
        }

        override fun getField(): Field<Any> {
            return CME_EVENT_APPROVAL_STATUS.OWNER_ID as Field<Any>
        }
    },
    ACTION{
        override fun getFieldName(): String {
            return "action"
        }

        override fun getField(): Field<Any> {
            return CME_EVENT_APPROVAL_STATUS.`as`("cme_event_approval_status").ACTION as Field<Any>
        }
    },
    ACTION1{
        override fun getFieldName(): String {
            return "action"
        }

        override fun getField(): Field<Any> {
            return CME_EVENT_APPROVAL_STATUS.ACTION as Field<Any>
        }
    },
    CREATED_BY{
        override fun getFieldName(): String {
            return "created_by"
        }

        override fun getField(): Field<Any> {
            return CME_EVENT_APPROVAL_STATUS.`as`("cme_event_approval_status").CREATED_BY as Field<Any>
        }
    },
    CREATED_BY1{
        override fun getFieldName(): String {
            return "created_by"
        }

        override fun getField(): Field<Any> {
            return CME_EVENT_APPROVAL_STATUS.CREATED_BY as Field<Any>
        }
    }
}