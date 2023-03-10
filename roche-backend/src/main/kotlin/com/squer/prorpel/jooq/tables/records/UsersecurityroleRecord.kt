/*
 * This file is generated by jOOQ.
 */
package com.squer.prorpel.jooq.tables.records


import com.squer.prorpel.jooq.tables.Usersecurityrole

import javax.annotation.processing.Generated

import org.jooq.Field
import org.jooq.Record2
import org.jooq.Row2
import org.jooq.impl.TableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = [
        "https://www.jooq.org",
        "jOOQ version:3.17.2"
    ],
    comments = "This class is generated by jOOQ"
)
@Suppress("UNCHECKED_CAST")
open class UsersecurityroleRecord() : TableRecordImpl<UsersecurityroleRecord>(Usersecurityrole.USERSECURITYROLE), Record2<String?, Long?> {

    open var userId: String?
        set(value): Unit = set(0, value)
        get(): String? = get(0) as String?

    open var roleId: Long?
        set(value): Unit = set(1, value)
        get(): Long? = get(1) as Long?

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    override fun fieldsRow(): Row2<String?, Long?> = super.fieldsRow() as Row2<String?, Long?>
    override fun valuesRow(): Row2<String?, Long?> = super.valuesRow() as Row2<String?, Long?>
    override fun field1(): Field<String?> = Usersecurityrole.USERSECURITYROLE.USER_ID
    override fun field2(): Field<Long?> = Usersecurityrole.USERSECURITYROLE.ROLE_ID
    override fun component1(): String? = userId
    override fun component2(): Long? = roleId
    override fun value1(): String? = userId
    override fun value2(): Long? = roleId

    override fun value1(value: String?): UsersecurityroleRecord {
        this.userId = value
        return this
    }

    override fun value2(value: Long?): UsersecurityroleRecord {
        this.roleId = value
        return this
    }

    override fun values(value1: String?, value2: Long?): UsersecurityroleRecord {
        this.value1(value1)
        this.value2(value2)
        return this
    }

    /**
     * Create a detached, initialised UsersecurityroleRecord
     */
    constructor(userId: String? = null, roleId: Long? = null): this() {
        this.userId = userId
        this.roleId = roleId
    }
}
