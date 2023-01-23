/*
 * This file is generated by jOOQ.
 */
package com.squer.prorpel.jooq.tables.records


import com.squer.prorpel.jooq.tables.Securityrole

import javax.annotation.processing.Generated

import org.jooq.Field
import org.jooq.Record1
import org.jooq.Record3
import org.jooq.Row3
import org.jooq.impl.UpdatableRecordImpl


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
open class SecurityroleRecord() : UpdatableRecordImpl<SecurityroleRecord>(Securityrole.SECURITYROLE), Record3<Long?, String?, String?> {

    open var id: Long?
        set(value): Unit = set(0, value)
        get(): Long? = get(0) as Long?

    open var name: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

    open var ciName: String?
        set(value): Unit = set(2, value)
        get(): String? = get(2) as String?

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record1<Long?> = super.key() as Record1<Long?>

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    override fun fieldsRow(): Row3<Long?, String?, String?> = super.fieldsRow() as Row3<Long?, String?, String?>
    override fun valuesRow(): Row3<Long?, String?, String?> = super.valuesRow() as Row3<Long?, String?, String?>
    override fun field1(): Field<Long?> = Securityrole.SECURITYROLE.ID
    override fun field2(): Field<String?> = Securityrole.SECURITYROLE.NAME
    override fun field3(): Field<String?> = Securityrole.SECURITYROLE.CI_NAME
    override fun component1(): Long? = id
    override fun component2(): String? = name
    override fun component3(): String? = ciName
    override fun value1(): Long? = id
    override fun value2(): String? = name
    override fun value3(): String? = ciName

    override fun value1(value: Long?): SecurityroleRecord {
        this.id = value
        return this
    }

    override fun value2(value: String?): SecurityroleRecord {
        this.name = value
        return this
    }

    override fun value3(value: String?): SecurityroleRecord {
        this.ciName = value
        return this
    }

    override fun values(value1: Long?, value2: String?, value3: String?): SecurityroleRecord {
        this.value1(value1)
        this.value2(value2)
        this.value3(value3)
        return this
    }

    /**
     * Create a detached, initialised SecurityroleRecord
     */
    constructor(id: Long? = null, name: String? = null, ciName: String? = null): this() {
        this.id = id
        this.name = name
        this.ciName = ciName
    }
}