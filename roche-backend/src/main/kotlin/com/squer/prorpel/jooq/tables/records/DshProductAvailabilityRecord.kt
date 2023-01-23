/*
 * This file is generated by jOOQ.
 */
package com.squer.prorpel.jooq.tables.records


import com.squer.prorpel.jooq.tables.DshProductAvailability

import java.time.OffsetDateTime

import javax.annotation.processing.Generated

import org.jooq.Field
import org.jooq.Record1
import org.jooq.Record10
import org.jooq.Row10
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
open class DshProductAvailabilityRecord() : UpdatableRecordImpl<DshProductAvailabilityRecord>(DshProductAvailability.DSH_PRODUCT_AVAILABILITY), Record10<Int?, String?, Int?, String?, String?, String?, Double?, OffsetDateTime?, OffsetDateTime?, String?> {

    open var year: Int?
        set(value): Unit = set(0, value)
        get(): Int? = get(0) as Int?

    open var id: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

    open var month: Int?
        set(value): Unit = set(2, value)
        get(): Int? = get(2) as Int?

    open var updatedBy: String?
        set(value): Unit = set(3, value)
        get(): String? = get(3) as String?

    open var createdBy: String?
        set(value): Unit = set(4, value)
        get(): String? = get(4) as String?

    open var productId: String?
        set(value): Unit = set(5, value)
        get(): String? = get(5) as String?

    open var total: Double?
        set(value): Unit = set(6, value)
        get(): Double? = get(6) as Double?

    open var updatedOn: OffsetDateTime?
        set(value): Unit = set(7, value)
        get(): OffsetDateTime? = get(7) as OffsetDateTime?

    open var createdOn: OffsetDateTime?
        set(value): Unit = set(8, value)
        get(): OffsetDateTime? = get(8) as OffsetDateTime?

    open var staleId: String?
        set(value): Unit = set(9, value)
        get(): String? = get(9) as String?

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record1<String?> = super.key() as Record1<String?>

    // -------------------------------------------------------------------------
    // Record10 type implementation
    // -------------------------------------------------------------------------

    override fun fieldsRow(): Row10<Int?, String?, Int?, String?, String?, String?, Double?, OffsetDateTime?, OffsetDateTime?, String?> = super.fieldsRow() as Row10<Int?, String?, Int?, String?, String?, String?, Double?, OffsetDateTime?, OffsetDateTime?, String?>
    override fun valuesRow(): Row10<Int?, String?, Int?, String?, String?, String?, Double?, OffsetDateTime?, OffsetDateTime?, String?> = super.valuesRow() as Row10<Int?, String?, Int?, String?, String?, String?, Double?, OffsetDateTime?, OffsetDateTime?, String?>
    override fun field1(): Field<Int?> = DshProductAvailability.DSH_PRODUCT_AVAILABILITY.YEAR
    override fun field2(): Field<String?> = DshProductAvailability.DSH_PRODUCT_AVAILABILITY.ID
    override fun field3(): Field<Int?> = DshProductAvailability.DSH_PRODUCT_AVAILABILITY.MONTH
    override fun field4(): Field<String?> = DshProductAvailability.DSH_PRODUCT_AVAILABILITY.UPDATED_BY
    override fun field5(): Field<String?> = DshProductAvailability.DSH_PRODUCT_AVAILABILITY.CREATED_BY
    override fun field6(): Field<String?> = DshProductAvailability.DSH_PRODUCT_AVAILABILITY.PRODUCT_ID
    override fun field7(): Field<Double?> = DshProductAvailability.DSH_PRODUCT_AVAILABILITY.TOTAL
    override fun field8(): Field<OffsetDateTime?> = DshProductAvailability.DSH_PRODUCT_AVAILABILITY.UPDATED_ON
    override fun field9(): Field<OffsetDateTime?> = DshProductAvailability.DSH_PRODUCT_AVAILABILITY.CREATED_ON
    override fun field10(): Field<String?> = DshProductAvailability.DSH_PRODUCT_AVAILABILITY.STALE_ID
    override fun component1(): Int? = year
    override fun component2(): String? = id
    override fun component3(): Int? = month
    override fun component4(): String? = updatedBy
    override fun component5(): String? = createdBy
    override fun component6(): String? = productId
    override fun component7(): Double? = total
    override fun component8(): OffsetDateTime? = updatedOn
    override fun component9(): OffsetDateTime? = createdOn
    override fun component10(): String? = staleId
    override fun value1(): Int? = year
    override fun value2(): String? = id
    override fun value3(): Int? = month
    override fun value4(): String? = updatedBy
    override fun value5(): String? = createdBy
    override fun value6(): String? = productId
    override fun value7(): Double? = total
    override fun value8(): OffsetDateTime? = updatedOn
    override fun value9(): OffsetDateTime? = createdOn
    override fun value10(): String? = staleId

    override fun value1(value: Int?): DshProductAvailabilityRecord {
        this.year = value
        return this
    }

    override fun value2(value: String?): DshProductAvailabilityRecord {
        this.id = value
        return this
    }

    override fun value3(value: Int?): DshProductAvailabilityRecord {
        this.month = value
        return this
    }

    override fun value4(value: String?): DshProductAvailabilityRecord {
        this.updatedBy = value
        return this
    }

    override fun value5(value: String?): DshProductAvailabilityRecord {
        this.createdBy = value
        return this
    }

    override fun value6(value: String?): DshProductAvailabilityRecord {
        this.productId = value
        return this
    }

    override fun value7(value: Double?): DshProductAvailabilityRecord {
        this.total = value
        return this
    }

    override fun value8(value: OffsetDateTime?): DshProductAvailabilityRecord {
        this.updatedOn = value
        return this
    }

    override fun value9(value: OffsetDateTime?): DshProductAvailabilityRecord {
        this.createdOn = value
        return this
    }

    override fun value10(value: String?): DshProductAvailabilityRecord {
        this.staleId = value
        return this
    }

    override fun values(value1: Int?, value2: String?, value3: Int?, value4: String?, value5: String?, value6: String?, value7: Double?, value8: OffsetDateTime?, value9: OffsetDateTime?, value10: String?): DshProductAvailabilityRecord {
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
        return this
    }

    /**
     * Create a detached, initialised DshProductAvailabilityRecord
     */
    constructor(year: Int? = null, id: String? = null, month: Int? = null, updatedBy: String? = null, createdBy: String? = null, productId: String? = null, total: Double? = null, updatedOn: OffsetDateTime? = null, createdOn: OffsetDateTime? = null, staleId: String? = null): this() {
        this.year = year
        this.id = id
        this.month = month
        this.updatedBy = updatedBy
        this.createdBy = createdBy
        this.productId = productId
        this.total = total
        this.updatedOn = updatedOn
        this.createdOn = createdOn
        this.staleId = staleId
    }
}
