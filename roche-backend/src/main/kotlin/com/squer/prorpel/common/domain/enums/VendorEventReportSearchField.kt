package com.squer.prorpel.common.domain.enums

import com.squer.prorpel.jooq.tables.references.CME_EVENT_REPORT
import com.squer.prorpel.jooq.tables.references.CME_VENDOR_EVENT_REPORT
import com.squer.prorpel.persistence.SearchField
import org.jooq.Field

enum class VendorEventReportSearchField: SearchField {
    CREATED_BY{
        override fun getFieldName(): String {
            return "created_by"
        }

        override fun getField(): Field<Any> {
            return CME_VENDOR_EVENT_REPORT.CREATED_BY as Field<Any>
        }
    }
}