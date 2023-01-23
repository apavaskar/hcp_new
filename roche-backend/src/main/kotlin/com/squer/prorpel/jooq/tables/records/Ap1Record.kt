/*
 * This file is generated by jOOQ.
 */
package com.squer.prorpel.jooq.tables.records


import com.squer.prorpel.jooq.tables.Ap1

import java.time.OffsetDateTime

import javax.annotation.processing.Generated

import org.jooq.Field
import org.jooq.Record12
import org.jooq.Row12
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
open class Ap1Record() : TableRecordImpl<Ap1Record>(Ap1.AP1), Record12<String?, String?, String?, String?, String?, String?, Boolean?, OffsetDateTime?, OffsetDateTime?, String?, String?, String?> {

    open var id: String?
        set(value): Unit = set(0, value)
        get(): String? = get(0) as String?

    open var updatedBy: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

    open var groupId: String?
        set(value): Unit = set(2, value)
        get(): String? = get(2) as String?

    open var cmdocId: String?
        set(value): Unit = set(3, value)
        get(): String? = get(3) as String?

    open var approverId: String?
        set(value): Unit = set(4, value)
        get(): String? = get(4) as String?

    open var createdBy: String?
        set(value): Unit = set(5, value)
        get(): String? = get(5) as String?

    @Suppress("INAPPLICABLE_JVM_NAME")
    @set:JvmName("setIsCurrent")
    open var isCurrent: Boolean?
        set(value): Unit = set(6, value)
        get(): Boolean? = get(6) as Boolean?

    open var updatedOn: OffsetDateTime?
        set(value): Unit = set(7, value)
        get(): OffsetDateTime? = get(7) as OffsetDateTime?

    open var createdOn: OffsetDateTime?
        set(value): Unit = set(8, value)
        get(): OffsetDateTime? = get(8) as OffsetDateTime?

    open var action: String?
        set(value): Unit = set(9, value)
        get(): String? = get(9) as String?

    open var staleId: String?
        set(value): Unit = set(10, value)
        get(): String? = get(10) as String?

    open var comment: String?
        set(value): Unit = set(11, value)
        get(): String? = get(11) as String?

    // -------------------------------------------------------------------------
    // Record12 type implementation
    // -------------------------------------------------------------------------

    override fun fieldsRow(): Row12<String?, String?, String?, String?, String?, String?, Boolean?, OffsetDateTime?, OffsetDateTime?, String?, String?, String?> = super.fieldsRow() as Row12<String?, String?, String?, String?, String?, String?, Boolean?, OffsetDateTime?, OffsetDateTime?, String?, String?, String?>
    override fun valuesRow(): Row12<String?, String?, String?, String?, String?, String?, Boolean?, OffsetDateTime?, OffsetDateTime?, String?, String?, String?> = super.valuesRow() as Row12<String?, String?, String?, String?, String?, String?, Boolean?, OffsetDateTime?, OffsetDateTime?, String?, String?, String?>
    override fun field1(): Field<String?> = Ap1.AP1.ID
    override fun field2(): Field<String?> = Ap1.AP1.UPDATED_BY
    override fun field3(): Field<String?> = Ap1.AP1.GROUP_ID
    override fun field4(): Field<String?> = Ap1.AP1.CMDOC_ID
    override fun field5(): Field<String?> = Ap1.AP1.APPROVER_ID
    override fun field6(): Field<String?> = Ap1.AP1.CREATED_BY
    override fun field7(): Field<Boolean?> = Ap1.AP1.IS_CURRENT
    override fun field8(): Field<OffsetDateTime?> = Ap1.AP1.UPDATED_ON
    override fun field9(): Field<OffsetDateTime?> = Ap1.AP1.CREATED_ON
    override fun field10(): Field<String?> = Ap1.AP1.ACTION
    override fun field11(): Field<String?> = Ap1.AP1.STALE_ID
    override fun field12(): Field<String?> = Ap1.AP1.COMMENT
    override fun component1(): String? = id
    override fun component2(): String? = updatedBy
    override fun component3(): String? = groupId
    override fun component4(): String? = cmdocId
    override fun component5(): String? = approverId
    override fun component6(): String? = createdBy
    override fun component7(): Boolean? = isCurrent
    override fun component8(): OffsetDateTime? = updatedOn
    override fun component9(): OffsetDateTime? = createdOn
    override fun component10(): String? = action
    override fun component11(): String? = staleId
    override fun component12(): String? = comment
    override fun value1(): String? = id
    override fun value2(): String? = updatedBy
    override fun value3(): String? = groupId
    override fun value4(): String? = cmdocId
    override fun value5(): String? = approverId
    override fun value6(): String? = createdBy
    override fun value7(): Boolean? = isCurrent
    override fun value8(): OffsetDateTime? = updatedOn
    override fun value9(): OffsetDateTime? = createdOn
    override fun value10(): String? = action
    override fun value11(): String? = staleId
    override fun value12(): String? = comment

    override fun value1(value: String?): Ap1Record {
        this.id = value
        return this
    }

    override fun value2(value: String?): Ap1Record {
        this.updatedBy = value
        return this
    }

    override fun value3(value: String?): Ap1Record {
        this.groupId = value
        return this
    }

    override fun value4(value: String?): Ap1Record {
        this.cmdocId = value
        return this
    }

    override fun value5(value: String?): Ap1Record {
        this.approverId = value
        return this
    }

    override fun value6(value: String?): Ap1Record {
        this.createdBy = value
        return this
    }

    override fun value7(value: Boolean?): Ap1Record {
        this.isCurrent = value
        return this
    }

    override fun value8(value: OffsetDateTime?): Ap1Record {
        this.updatedOn = value
        return this
    }

    override fun value9(value: OffsetDateTime?): Ap1Record {
        this.createdOn = value
        return this
    }

    override fun value10(value: String?): Ap1Record {
        this.action = value
        return this
    }

    override fun value11(value: String?): Ap1Record {
        this.staleId = value
        return this
    }

    override fun value12(value: String?): Ap1Record {
        this.comment = value
        return this
    }

    override fun values(value1: String?, value2: String?, value3: String?, value4: String?, value5: String?, value6: String?, value7: Boolean?, value8: OffsetDateTime?, value9: OffsetDateTime?, value10: String?, value11: String?, value12: String?): Ap1Record {
        this.value1(value1)
        this.value2(value2)
        this.value3(value3)
        this.value4(value4)
        this.value5(value5)
        this.value6(value6)
        this.value7(value7)
        this.value8(value8)
        this.value9(value9)
        this.value10(value10)
        this.value11(value11)
        this.value12(value12)
        return this
    }

    /**
     * Create a detached, initialised Ap1Record
     */
    constructor(id: String? = null, updatedBy: String? = null, groupId: String? = null, cmdocId: String? = null, approverId: String? = null, createdBy: String? = null, isCurrent: Boolean? = null, updatedOn: OffsetDateTime? = null, createdOn: OffsetDateTime? = null, action: String? = null, staleId: String? = null, comment: String? = null): this() {
        this.id = id
        this.updatedBy = updatedBy
        this.groupId = groupId
        this.cmdocId = cmdocId
        this.approverId = approverId
        this.createdBy = createdBy
        this.isCurrent = isCurrent
        this.updatedOn = updatedOn
        this.createdOn = createdOn
        this.action = action
        this.staleId = staleId
        this.comment = comment
    }
}
