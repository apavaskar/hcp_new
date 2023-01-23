package com.squer.prorpel.ui.repository.enums
import com.squer.prorpel.jooq.tables.references.FMK_SECURITY_USER
import com.squer.prorpel.jooq.tables.references.MENUACTIONS
import com.squer.prorpel.persistence.SearchField
import org.jooq.Field

enum class MenuActionSearchField: SearchField {

    USER_ID{
        override fun getFieldName(): String {
            return "USER.ID"
        }

        override fun getField(): Field<Any> {
            return FMK_SECURITY_USER.ID as Field<Any>
            //return SECURITYUSERROLE.USERID as Field<Any>
        }
    },
    PARENT_ID{
        override fun getFieldName(): String {
            return "PARENT_ID"
        }

        override fun getField(): Field<Any> {
            return MENUACTIONS .PARENT_ID as Field<Any>
        }
    },
    UI_INTERFACE{
        override fun getFieldName(): String {
            return "UI_INTERFACE"
        }
        override fun getField(): Field<Any> {
            return MENUACTIONS.UI_INTERFACE as Field<Any>
        }
    }
}
