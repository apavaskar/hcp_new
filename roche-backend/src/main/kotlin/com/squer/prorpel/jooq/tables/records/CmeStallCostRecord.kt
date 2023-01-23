/*
 * This file is generated by jOOQ.
 */
package com.squer.prorpel.jooq.tables.records


import com.squer.prorpel.jooq.tables.CmeStallCost

import java.time.OffsetDateTime

import javax.annotation.processing.Generated

import org.jooq.Field
import org.jooq.Record7
import org.jooq.Row7
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
open class CmeStallCostRecord() : TableRecordImpl<CmeStallCostRecord>(CmeStallCost.CME_STALL_COST), Record7<String?, String?, Double?, String?, OffsetDateTime?, OffsetDateTime?, String?> {

    open var id: String?
        set(value): Unit = set(0, value)
        get(): String? = get(0) as String?

    open var updatedBy: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

    open var amount: Double?
        set(value): Unit = set(2, value)
        get(): Double? = get(2) as Double?

    open var createdBy: String?
        set(value): Unit = set(3, value)
        get(): String? = get(3) as String?

    open var updatedOn: OffsetDateTime?
        set(value): Unit = set(4, value)
        get(): OffsetDateTime? = get(4) as OffsetDateTime?

    open var createdOn: OffsetDateTime?
        set(value): Unit = set(5, value)
        get(): OffsetDateTime? = get(5) as OffsetDateTime?

    open var staleId: String?
        set(value): Unit = set(6, value)
        get(): String? = get(6) as String?

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    override fun fieldsRow(): Row7<String?, String?, Double?, String?, OffsetDateTime?, OffsetDateTime?, String?> = super.fieldsRow() as Row7<String?, String?, Double?, String?, OffsetDateTime?, OffsetDateTime?, String?>
    override fun valuesRow(): Row7<String?, String?, Double?, String?, OffsetDateTime?, OffsetDateTime?, String?> = super.valuesRow() as Row7<String?, String?, Double?, String?, OffsetDateTime?, OffsetDateTime?, String?>
    override fun field1(): Field<String?> = CmeStallCost.CME_STALL_COST.ID
    override fun field2(): Field<String?> = CmeStallCost.CME_STALL_COST.UPDATED_BY
    override fun field3(): Field<Double?> = CmeStallCost.CME_STALL_COST.AMOUNT
    override fun field4(): Field<String?> = CmeStallCost.CME_STALL_COST.CREATED_BY
    override fun field5(): Field<OffsetDateTime?> = CmeStallCost.CME_STALL_COST.UPDATED_ON
    override fun field6(): Field<OffsetDateTime?> = CmeStallCost.CME_STALL_COST.CREATED_ON
    override fun field7(): Field<String?> = CmeStallCost.CME_STALL_COST.STALE_ID
    override fun component1(): String? = id
    override fun component2(): String? = updatedBy
    override fun component3(): Double? = amount
    override fun component4(): String? = createdBy
    override fun component5(): OffsetDateTime? = updatedOn
    override fun component6(): OffsetDateTime? = createdOn
    override fun component7(): String? = staleId
    override fun value1(): String? = id
    override fun value2(): String? = updatedBy
    override fun value3(): Double? = amount
    override fun value4(): String? = createdBy
    override fun value5(): OffsetDateTime? = updatedOn
    override fun value6(): OffsetDateTime? = createdOn
    override fun value7(): String? = staleId

    override fun value1(value: String?): CmeStallCostRecord {
        this.id = value
        return this
    }

    override fun value2(value: String?): CmeStallCostRecord {
        this.updatedBy = value
        return this
    }

    override fun value3(value: Double?): CmeStallCostRecord {
        this.amount = value
        return this
    }

    override fun value4(value: String?): CmeStallCostRecord {
        this.createdBy = value
        return this
    }

    override fun value5(value: OffsetDateTime?): CmeStallCostRecord {
        this.updatedOn = value
        return this
    }

    override fun value6(value: OffsetDateTime?): CmeStallCostRecord {
        this.createdOn = value
        return this
    }

    override fun value7(value: String?): CmeStallCostRecord {
        this.staleId = value
        return this
    }

    override fun values(value1: String?, value2: String?, value3: Double?, value4: String?, value5: OffsetDateTime?, value6: OffsetDateTime?, value7: String?): CmeStallCostRecord {
        this.value1(value1)
        this.value2(value2)
        this.value3(value3)
        this.value4(value4)
        this.value5(value5)
        this.value6(value6)
        this.value7(value7)
        return this
    }

    /**
     * Create a detached, initialised CmeStallCostRecord
     */
    constructor(id: String? = null, updatedBy: String? = null, amount: Double? = null, createdBy: String? = null, updatedOn: OffsetDateTime? = null, createdOn: OffsetDateTime? = null, staleId: String? = null): this() {
        this.id = id
        this.updatedBy = updatedBy
        this.amount = amount
        this.createdBy = createdBy
        this.updatedOn = updatedOn
        this.createdOn = createdOn
        this.staleId = staleId
    }
}
