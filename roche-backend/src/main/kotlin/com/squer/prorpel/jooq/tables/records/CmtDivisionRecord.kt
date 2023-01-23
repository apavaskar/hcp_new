/*
 * This file is generated by jOOQ.
 */
package com.squer.prorpel.jooq.tables.records


import com.squer.prorpel.jooq.tables.CmtDivision

import java.time.OffsetDateTime

import javax.annotation.processing.Generated

import org.jooq.Field
import org.jooq.Record1
import org.jooq.Record11
import org.jooq.Row11
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
open class CmtDivisionRecord() : UpdatableRecordImpl<CmtDivisionRecord>(CmtDivision.CMT_DIVISION), Record11<String?, OffsetDateTime?, Long?, String?, OffsetDateTime?, String?, String?, String?, String?, String?, String?> {

    open var name: String?
        set(value): Unit = set(0, value)
        get(): String? = get(0) as String?

    open var updatedOn: OffsetDateTime?
        set(value): Unit = set(1, value)
        get(): OffsetDateTime? = get(1) as OffsetDateTime?

    open var staleId: Long?
        set(value): Unit = set(2, value)
        get(): Long? = get(2) as Long?

    open var ciName: String?
        set(value): Unit = set(3, value)
        get(): String? = get(3) as String?

    open var createdOn: OffsetDateTime?
        set(value): Unit = set(4, value)
        get(): OffsetDateTime? = get(4) as OffsetDateTime?

    open var divisionCode: String?
        set(value): Unit = set(5, value)
        get(): String? = get(5) as String?

    open var id: String?
        set(value): Unit = set(6, value)
        get(): String? = get(6) as String?

    open var statusId: String?
        set(value): Unit = set(7, value)
        get(): String? = get(7) as String?

    open var updatedBy: String?
        set(value): Unit = set(8, value)
        get(): String? = get(8) as String?

    open var externalId: String?
        set(value): Unit = set(9, value)
        get(): String? = get(9) as String?

    open var createdBy: String?
        set(value): Unit = set(10, value)
        get(): String? = get(10) as String?

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record1<String?> = super.key() as Record1<String?>

    // -------------------------------------------------------------------------
    // Record11 type implementation
    // -------------------------------------------------------------------------

    override fun fieldsRow(): Row11<String?, OffsetDateTime?, Long?, String?, OffsetDateTime?, String?, String?, String?, String?, String?, String?> = super.fieldsRow() as Row11<String?, OffsetDateTime?, Long?, String?, OffsetDateTime?, String?, String?, String?, String?, String?, String?>
    override fun valuesRow(): Row11<String?, OffsetDateTime?, Long?, String?, OffsetDateTime?, String?, String?, String?, String?, String?, String?> = super.valuesRow() as Row11<String?, OffsetDateTime?, Long?, String?, OffsetDateTime?, String?, String?, String?, String?, String?, String?>
    override fun field1(): Field<String?> = CmtDivision.CMT_DIVISION.NAME
    override fun field2(): Field<OffsetDateTime?> = CmtDivision.CMT_DIVISION.UPDATED_ON
    override fun field3(): Field<Long?> = CmtDivision.CMT_DIVISION.STALE_ID
    override fun field4(): Field<String?> = CmtDivision.CMT_DIVISION.CI_NAME
    override fun field5(): Field<OffsetDateTime?> = CmtDivision.CMT_DIVISION.CREATED_ON
    override fun field6(): Field<String?> = CmtDivision.CMT_DIVISION.DIVISION_CODE
    override fun field7(): Field<String?> = CmtDivision.CMT_DIVISION.ID
    override fun field8(): Field<String?> = CmtDivision.CMT_DIVISION.STATUS_ID
    override fun field9(): Field<String?> = CmtDivision.CMT_DIVISION.UPDATED_BY
    override fun field10(): Field<String?> = CmtDivision.CMT_DIVISION.EXTERNAL_ID
    override fun field11(): Field<String?> = CmtDivision.CMT_DIVISION.CREATED_BY
    override fun component1(): String? = name
    override fun component2(): OffsetDateTime? = updatedOn
    override fun component3(): Long? = staleId
    override fun component4(): String? = ciName
    override fun component5(): OffsetDateTime? = createdOn
    override fun component6(): String? = divisionCode
    override fun component7(): String? = id
    override fun component8(): String? = statusId
    override fun component9(): String? = updatedBy
    override fun component10(): String? = externalId
    override fun component11(): String? = createdBy
    override fun value1(): String? = name
    override fun value2(): OffsetDateTime? = updatedOn
    override fun value3(): Long? = staleId
    override fun value4(): String? = ciName
    override fun value5(): OffsetDateTime? = createdOn
    override fun value6(): String? = divisionCode
    override fun value7(): String? = id
    override fun value8(): String? = statusId
    override fun value9(): String? = updatedBy
    override fun value10(): String? = externalId
    override fun value11(): String? = createdBy

    override fun value1(value: String?): CmtDivisionRecord {
        this.name = value
        return this
    }

    override fun value2(value: OffsetDateTime?): CmtDivisionRecord {
        this.updatedOn = value
        return this
    }

    override fun value3(value: Long?): CmtDivisionRecord {
        this.staleId = value
        return this
    }

    override fun value4(value: String?): CmtDivisionRecord {
        this.ciName = value
        return this
    }

    override fun value5(value: OffsetDateTime?): CmtDivisionRecord {
        this.createdOn = value
        return this
    }

    override fun value6(value: String?): CmtDivisionRecord {
        this.divisionCode = value
        return this
    }

    override fun value7(value: String?): CmtDivisionRecord {
        this.id = value
        return this
    }

    override fun value8(value: String?): CmtDivisionRecord {
        this.statusId = value
        return this
    }

    override fun value9(value: String?): CmtDivisionRecord {
        this.updatedBy = value
        return this
    }

    override fun value10(value: String?): CmtDivisionRecord {
        this.externalId = value
        return this
    }

    override fun value11(value: String?): CmtDivisionRecord {
        this.createdBy = value
        return this
    }

    override fun values(value1: String?, value2: OffsetDateTime?, value3: Long?, value4: String?, value5: OffsetDateTime?, value6: String?, value7: String?, value8: String?, value9: String?, value10: String?, value11: String?): CmtDivisionRecord {
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
        return this
    }

    /**
     * Create a detached, initialised CmtDivisionRecord
     */
    constructor(name: String? = null, updatedOn: OffsetDateTime? = null, staleId: Long? = null, ciName: String? = null, createdOn: OffsetDateTime? = null, divisionCode: String? = null, id: String? = null, statusId: String? = null, updatedBy: String? = null, externalId: String? = null, createdBy: String? = null): this() {
        this.name = name
        this.updatedOn = updatedOn
        this.staleId = staleId
        this.ciName = ciName
        this.createdOn = createdOn
        this.divisionCode = divisionCode
        this.id = id
        this.statusId = statusId
        this.updatedBy = updatedBy
        this.externalId = externalId
        this.createdBy = createdBy
    }
}
