package com.squer.prorpel.persistence

import org.jooq.Field

interface SearchField {
    fun getFieldName(): String

    fun getField(): Field<Any>
}
