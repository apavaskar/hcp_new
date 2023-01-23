package com.squer.prorpel.security.domain

import com.squer.prorpel.jooq.tables.references.FMK_SECURITY_USER
import com.squer.prorpel.persistence.SearchField
import org.jooq.Field

enum class UserSearchField: SearchField {
    USER_NAME {
        override fun getFieldName(): String {
            return "user_name"
        }

        override fun getField(): Field<Any> {
            return FMK_SECURITY_USER.USER_NAME as Field<Any>
        }
    };
}