/*
 * This file is generated by jOOQ.
 */
package com.squer.prorpel.jooq.tables.records


import com.squer.prorpel.jooq.tables.TmpLocationSales

import javax.annotation.processing.Generated

import org.jooq.Field
import org.jooq.Record6
import org.jooq.Row6
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
open class TmpLocationSalesRecord() : TableRecordImpl<TmpLocationSalesRecord>(TmpLocationSales.TMP_LOCATION_SALES), Record6<Long?, Long?, Long?, String?, String?, Double?> {

    open var yyyymm: Long?
        set(value): Unit = set(0, value)
        get(): Long? = get(0) as Long?

    open var yyyy: Long?
        set(value): Unit = set(1, value)
        get(): Long? = get(1) as Long?

    open var mm: Long?
        set(value): Unit = set(2, value)
        get(): Long? = get(2) as Long?

    open var divisionId: String?
        set(value): Unit = set(3, value)
        get(): String? = get(3) as String?

    open var locationId: String?
        set(value): Unit = set(4, value)
        get(): String? = get(4) as String?

    open var salesAmount: Double?
        set(value): Unit = set(5, value)
        get(): Double? = get(5) as Double?

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    override fun fieldsRow(): Row6<Long?, Long?, Long?, String?, String?, Double?> = super.fieldsRow() as Row6<Long?, Long?, Long?, String?, String?, Double?>
    override fun valuesRow(): Row6<Long?, Long?, Long?, String?, String?, Double?> = super.valuesRow() as Row6<Long?, Long?, Long?, String?, String?, Double?>
    override fun field1(): Field<Long?> = TmpLocationSales.TMP_LOCATION_SALES.YYYYMM
    override fun field2(): Field<Long?> = TmpLocationSales.TMP_LOCATION_SALES.YYYY
    override fun field3(): Field<Long?> = TmpLocationSales.TMP_LOCATION_SALES.MM
    override fun field4(): Field<String?> = TmpLocationSales.TMP_LOCATION_SALES.DIVISION_ID
    override fun field5(): Field<String?> = TmpLocationSales.TMP_LOCATION_SALES.LOCATION_ID
    override fun field6(): Field<Double?> = TmpLocationSales.TMP_LOCATION_SALES.SALES_AMOUNT
    override fun component1(): Long? = yyyymm
    override fun component2(): Long? = yyyy
    override fun component3(): Long? = mm
    override fun component4(): String? = divisionId
    override fun component5(): String? = locationId
    override fun component6(): Double? = salesAmount
    override fun value1(): Long? = yyyymm
    override fun value2(): Long? = yyyy
    override fun value3(): Long? = mm
    override fun value4(): String? = divisionId
    override fun value5(): String? = locationId
    override fun value6(): Double? = salesAmount

    override fun value1(value: Long?): TmpLocationSalesRecord {
        this.yyyymm = value
        return this
    }

    override fun value2(value: Long?): TmpLocationSalesRecord {
        this.yyyy = value
        return this
    }

    override fun value3(value: Long?): TmpLocationSalesRecord {
        this.mm = value
        return this
    }

    override fun value4(value: String?): TmpLocationSalesRecord {
        this.divisionId = value
        return this
    }

    override fun value5(value: String?): TmpLocationSalesRecord {
        this.locationId = value
        return this
    }

    override fun value6(value: Double?): TmpLocationSalesRecord {
        this.salesAmount = value
        return this
    }

    override fun values(value1: Long?, value2: Long?, value3: Long?, value4: String?, value5: String?, value6: Double?): TmpLocationSalesRecord {
        this.value1(value1)
        this.value2(value2)
        this.value3(value3)
        this.value4(value4)
        this.value5(value5)
        this.value6(value6)
        return this
    }

    /**
     * Create a detached, initialised TmpLocationSalesRecord
     */
    constructor(yyyymm: Long? = null, yyyy: Long? = null, mm: Long? = null, divisionId: String? = null, locationId: String? = null, salesAmount: Double? = null): this() {
        this.yyyymm = yyyymm
        this.yyyy = yyyy
        this.mm = mm
        this.divisionId = divisionId
        this.locationId = locationId
        this.salesAmount = salesAmount
    }
}