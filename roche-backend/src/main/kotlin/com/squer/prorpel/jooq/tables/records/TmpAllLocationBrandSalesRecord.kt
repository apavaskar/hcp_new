/*
 * This file is generated by jOOQ.
 */
package com.squer.prorpel.jooq.tables.records


import com.squer.prorpel.jooq.tables.TmpAllLocationBrandSales

import javax.annotation.processing.Generated

import org.jooq.Field
import org.jooq.Record8
import org.jooq.Row8
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
open class TmpAllLocationBrandSalesRecord() : TableRecordImpl<TmpAllLocationBrandSalesRecord>(TmpAllLocationBrandSales.TMP_ALL_LOCATION_BRAND_SALES), Record8<Int?, Int?, Int?, String?, String?, String?, Double?, Double?> {

    open var yyyymm: Int?
        set(value): Unit = set(0, value)
        get(): Int? = get(0) as Int?

    open var yearSls: Int?
        set(value): Unit = set(1, value)
        get(): Int? = get(1) as Int?

    open var monthSls: Int?
        set(value): Unit = set(2, value)
        get(): Int? = get(2) as Int?

    open var divisionId: String?
        set(value): Unit = set(3, value)
        get(): String? = get(3) as String?

    open var locationId: String?
        set(value): Unit = set(4, value)
        get(): String? = get(4) as String?

    open var brandId: String?
        set(value): Unit = set(5, value)
        get(): String? = get(5) as String?

    open var salesAmount: Double?
        set(value): Unit = set(6, value)
        get(): Double? = get(6) as Double?

    open var targetAmount: Double?
        set(value): Unit = set(7, value)
        get(): Double? = get(7) as Double?

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    override fun fieldsRow(): Row8<Int?, Int?, Int?, String?, String?, String?, Double?, Double?> = super.fieldsRow() as Row8<Int?, Int?, Int?, String?, String?, String?, Double?, Double?>
    override fun valuesRow(): Row8<Int?, Int?, Int?, String?, String?, String?, Double?, Double?> = super.valuesRow() as Row8<Int?, Int?, Int?, String?, String?, String?, Double?, Double?>
    override fun field1(): Field<Int?> = TmpAllLocationBrandSales.TMP_ALL_LOCATION_BRAND_SALES.YYYYMM
    override fun field2(): Field<Int?> = TmpAllLocationBrandSales.TMP_ALL_LOCATION_BRAND_SALES.YEAR_SLS
    override fun field3(): Field<Int?> = TmpAllLocationBrandSales.TMP_ALL_LOCATION_BRAND_SALES.MONTH_SLS
    override fun field4(): Field<String?> = TmpAllLocationBrandSales.TMP_ALL_LOCATION_BRAND_SALES.DIVISION_ID
    override fun field5(): Field<String?> = TmpAllLocationBrandSales.TMP_ALL_LOCATION_BRAND_SALES.LOCATION_ID
    override fun field6(): Field<String?> = TmpAllLocationBrandSales.TMP_ALL_LOCATION_BRAND_SALES.BRAND_ID
    override fun field7(): Field<Double?> = TmpAllLocationBrandSales.TMP_ALL_LOCATION_BRAND_SALES.SALES_AMOUNT
    override fun field8(): Field<Double?> = TmpAllLocationBrandSales.TMP_ALL_LOCATION_BRAND_SALES.TARGET_AMOUNT
    override fun component1(): Int? = yyyymm
    override fun component2(): Int? = yearSls
    override fun component3(): Int? = monthSls
    override fun component4(): String? = divisionId
    override fun component5(): String? = locationId
    override fun component6(): String? = brandId
    override fun component7(): Double? = salesAmount
    override fun component8(): Double? = targetAmount
    override fun value1(): Int? = yyyymm
    override fun value2(): Int? = yearSls
    override fun value3(): Int? = monthSls
    override fun value4(): String? = divisionId
    override fun value5(): String? = locationId
    override fun value6(): String? = brandId
    override fun value7(): Double? = salesAmount
    override fun value8(): Double? = targetAmount

    override fun value1(value: Int?): TmpAllLocationBrandSalesRecord {
        this.yyyymm = value
        return this
    }

    override fun value2(value: Int?): TmpAllLocationBrandSalesRecord {
        this.yearSls = value
        return this
    }

    override fun value3(value: Int?): TmpAllLocationBrandSalesRecord {
        this.monthSls = value
        return this
    }

    override fun value4(value: String?): TmpAllLocationBrandSalesRecord {
        this.divisionId = value
        return this
    }

    override fun value5(value: String?): TmpAllLocationBrandSalesRecord {
        this.locationId = value
        return this
    }

    override fun value6(value: String?): TmpAllLocationBrandSalesRecord {
        this.brandId = value
        return this
    }

    override fun value7(value: Double?): TmpAllLocationBrandSalesRecord {
        this.salesAmount = value
        return this
    }

    override fun value8(value: Double?): TmpAllLocationBrandSalesRecord {
        this.targetAmount = value
        return this
    }

    override fun values(value1: Int?, value2: Int?, value3: Int?, value4: String?, value5: String?, value6: String?, value7: Double?, value8: Double?): TmpAllLocationBrandSalesRecord {
        this.value1(value1)
        this.value2(value2)
        this.value3(value3)
        this.value4(value4)
        this.value5(value5)
        this.value6(value6)
        this.value7(value7)
        this.value8(value8)
        return this
    }

    /**
     * Create a detached, initialised TmpAllLocationBrandSalesRecord
     */
    constructor(yyyymm: Int? = null, yearSls: Int? = null, monthSls: Int? = null, divisionId: String? = null, locationId: String? = null, brandId: String? = null, salesAmount: Double? = null, targetAmount: Double? = null): this() {
        this.yyyymm = yyyymm
        this.yearSls = yearSls
        this.monthSls = monthSls
        this.divisionId = divisionId
        this.locationId = locationId
        this.brandId = brandId
        this.salesAmount = salesAmount
        this.targetAmount = targetAmount
    }
}