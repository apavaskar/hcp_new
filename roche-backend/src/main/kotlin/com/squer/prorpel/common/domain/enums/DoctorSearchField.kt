package com.squer.prorpel.common.domain.enums

import com.squer.prorpel.jooq.tables.references.CME_DOCTOR_MASTER
import com.squer.prorpel.jooq.tables.references.CMT_DOCTOR
import com.squer.prorpel.persistence.SearchField
import org.jooq.Field

enum class DoctorSearchField: SearchField {

    LOCATIION_ID{
        override fun getFieldName(): String {
            return "locationId"
        }

        override fun getField(): Field<Any> {
            val cd = CMT_DOCTOR.`as`("cd")
            return cd.LOCATION_ID as Field<Any>
        }
    }
}