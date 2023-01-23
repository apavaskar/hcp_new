package com.squer.prorpel.common.domain.enums

import com.squer.prorpel.jooq.tables.references.CME_DOCTOR_MASTER
import com.squer.prorpel.persistence.SearchField
import org.jooq.Field

enum class DoctorMasterSearchField : SearchField{
    NAME{
        override fun getFieldName(): String {
            return "name"
        }

        override fun getField(): Field<Any> {
            val cdm = CME_DOCTOR_MASTER.`as`("cdm")
            return cdm.CI_NAME as Field<Any>
        }

    },
    SPECIALIZATION{
        override fun getFieldName(): String {
            return "specialization"
        }

        override fun getField(): Field<Any> {
            val cdm = CME_DOCTOR_MASTER.`as`("cdm")
            return cdm.SPECIALIZATION as Field<Any>
        }
    }
}