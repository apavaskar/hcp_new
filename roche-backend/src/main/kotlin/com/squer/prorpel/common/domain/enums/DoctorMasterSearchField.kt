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
            return "specializationReference"
        }

        override fun getField(): Field<Any> {
            val cdm = CME_DOCTOR_MASTER.`as`("cdm")
            return cdm.SPECIALIZATION as Field<Any>
        }
    },
    CREATED_BY{
        override fun getFieldName(): String {
            return "created_by"
        }

        override fun getField(): Field<Any> {
            val cdm = CME_DOCTOR_MASTER.`as`("cdm")
            return cdm.CREATED_BY as Field<Any>
        }
    },
    CREATED_BY_CDM{
        override fun getFieldName(): String {
            return "created_by"
        }

        override fun getField(): Field<Any> {
            return CME_DOCTOR_MASTER.CREATED_BY as Field<Any>
        }
    },
    UPDATED_BY_CDM{
        override fun getFieldName(): String {
            return "updated_by"
        }

        override fun getField(): Field<Any> {
            return CME_DOCTOR_MASTER.UPDATED_BY as Field<Any>
        }
    },

}