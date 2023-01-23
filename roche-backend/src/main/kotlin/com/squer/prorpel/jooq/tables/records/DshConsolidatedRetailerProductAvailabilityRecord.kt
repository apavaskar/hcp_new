/*
 * This file is generated by jOOQ.
 */
package com.squer.prorpel.jooq.tables.records


import com.squer.prorpel.jooq.tables.DshConsolidatedRetailerProductAvailability

import java.math.BigDecimal

import javax.annotation.processing.Generated

import org.jooq.Field
import org.jooq.Record4
import org.jooq.Row4
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
open class DshConsolidatedRetailerProductAvailabilityRecord() : TableRecordImpl<DshConsolidatedRetailerProductAvailabilityRecord>(DshConsolidatedRetailerProductAvailability.DSH_CONSOLIDATED_RETAILER_PRODUCT_AVAILABILITY), Record4<Int?, Int?, String?, BigDecimal?> {

    open var month: Int?
        set(value): Unit = set(0, value)
        get(): Int? = get(0) as Int?

    open var year: Int?
        set(value): Unit = set(1, value)
        get(): Int? = get(1) as Int?

    open var retailerId: String?
        set(value): Unit = set(2, value)
        get(): String? = get(2) as String?

    open var availability: BigDecimal?
        set(value): Unit = set(3, value)
        get(): BigDecimal? = get(3) as BigDecimal?

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    override fun fieldsRow(): Row4<Int?, Int?, String?, BigDecimal?> = super.fieldsRow() as Row4<Int?, Int?, String?, BigDecimal?>
    override fun valuesRow(): Row4<Int?, Int?, String?, BigDecimal?> = super.valuesRow() as Row4<Int?, Int?, String?, BigDecimal?>
    override fun field1(): Field<Int?> = DshConsolidatedRetailerProductAvailability.DSH_CONSOLIDATED_RETAILER_PRODUCT_AVAILABILITY.MONTH
    override fun field2(): Field<Int?> = DshConsolidatedRetailerProductAvailability.DSH_CONSOLIDATED_RETAILER_PRODUCT_AVAILABILITY.YEAR
    override fun field3(): Field<String?> = DshConsolidatedRetailerProductAvailability.DSH_CONSOLIDATED_RETAILER_PRODUCT_AVAILABILITY.RETAILER_ID
    override fun field4(): Field<BigDecimal?> = DshConsolidatedRetailerProductAvailability.DSH_CONSOLIDATED_RETAILER_PRODUCT_AVAILABILITY.AVAILABILITY
    override fun component1(): Int? = month
    override fun component2(): Int? = year
    override fun component3(): String? = retailerId
    override fun component4(): BigDecimal? = availability
    override fun value1(): Int? = month
    override fun value2(): Int? = year
    override fun value3(): String? = retailerId
    override fun value4(): BigDecimal? = availability

    override fun value1(value: Int?): DshConsolidatedRetailerProductAvailabilityRecord {
        this.month = value
        return this
    }

    override fun value2(value: Int?): DshConsolidatedRetailerProductAvailabilityRecord {
        this.year = value
        return this
    }

    override fun value3(value: String?): DshConsolidatedRetailerProductAvailabilityRecord {
        this.retailerId = value
        return this
    }

    override fun value4(value: BigDecimal?): DshConsolidatedRetailerProductAvailabilityRecord {
        this.availability = value
        return this
    }

    override fun values(value1: Int?, value2: Int?, value3: String?, value4: BigDecimal?): DshConsolidatedRetailerProductAvailabilityRecord {
        this.value1(value1)
        this.value2(value2)
        this.value3(value3)
        this.value4(value4)
        return this
    }

    /**
     * Create a detached, initialised
     * DshConsolidatedRetailerProductAvailabilityRecord
     */
    constructor(month: Int? = null, year: Int? = null, retailerId: String? = null, availability: BigDecimal? = null): this() {
        this.month = month
        this.year = year
        this.retailerId = retailerId
        this.availability = availability
    }
}