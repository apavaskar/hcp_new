/*
 * This file is generated by jOOQ.
 */
package com.squer.prorpel.jooq.tables.records


import com.squer.prorpel.jooq.tables.Tempterritoryps

import javax.annotation.processing.Generated

import org.jooq.Field
import org.jooq.Record10
import org.jooq.Row10
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
open class TempterritorypsRecord() : TableRecordImpl<TempterritorypsRecord>(Tempterritoryps.TEMPTERRITORYPS), Record10<String?, String?, String?, Int?, Int?, Int?, Int?, Double?, Int?, Double?> {

    open var divisionId: String?
        set(value): Unit = set(0, value)
        get(): String? = get(0) as String?

    open var locationId: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

    open var brandId: String?
        set(value): Unit = set(2, value)
        get(): String? = get(2) as String?

    open var month: Int?
        set(value): Unit = set(3, value)
        get(): Int? = get(3) as Int?

    open var year: Int?
        set(value): Unit = set(4, value)
        get(): Int? = get(4) as Int?

    open var yearmonth: Int?
        set(value): Unit = set(5, value)
        get(): Int? = get(5) as Int?

    open var targetQuantity: Int?
        set(value): Unit = set(6, value)
        get(): Int? = get(6) as Int?

    open var targetValue: Double?
        set(value): Unit = set(7, value)
        get(): Double? = get(7) as Double?

    open var achievementQuantity: Int?
        set(value): Unit = set(8, value)
        get(): Int? = get(8) as Int?

    open var achievementValue: Double?
        set(value): Unit = set(9, value)
        get(): Double? = get(9) as Double?

    // -------------------------------------------------------------------------
    // Record10 type implementation
    // -------------------------------------------------------------------------

    override fun fieldsRow(): Row10<String?, String?, String?, Int?, Int?, Int?, Int?, Double?, Int?, Double?> = super.fieldsRow() as Row10<String?, String?, String?, Int?, Int?, Int?, Int?, Double?, Int?, Double?>
    override fun valuesRow(): Row10<String?, String?, String?, Int?, Int?, Int?, Int?, Double?, Int?, Double?> = super.valuesRow() as Row10<String?, String?, String?, Int?, Int?, Int?, Int?, Double?, Int?, Double?>
    override fun field1(): Field<String?> = Tempterritoryps.TEMPTERRITORYPS.DIVISION_ID
    override fun field2(): Field<String?> = Tempterritoryps.TEMPTERRITORYPS.LOCATION_ID
    override fun field3(): Field<String?> = Tempterritoryps.TEMPTERRITORYPS.BRAND_ID
    override fun field4(): Field<Int?> = Tempterritoryps.TEMPTERRITORYPS.MONTH
    override fun field5(): Field<Int?> = Tempterritoryps.TEMPTERRITORYPS.YEAR
    override fun field6(): Field<Int?> = Tempterritoryps.TEMPTERRITORYPS.YEARMONTH
    override fun field7(): Field<Int?> = Tempterritoryps.TEMPTERRITORYPS.TARGET_QUANTITY
    override fun field8(): Field<Double?> = Tempterritoryps.TEMPTERRITORYPS.TARGET_VALUE
    override fun field9(): Field<Int?> = Tempterritoryps.TEMPTERRITORYPS.ACHIEVEMENT_QUANTITY
    override fun field10(): Field<Double?> = Tempterritoryps.TEMPTERRITORYPS.ACHIEVEMENT_VALUE
    override fun component1(): String? = divisionId
    override fun component2(): String? = locationId
    override fun component3(): String? = brandId
    override fun component4(): Int? = month
    override fun component5(): Int? = year
    override fun component6(): Int? = yearmonth
    override fun component7(): Int? = targetQuantity
    override fun component8(): Double? = targetValue
    override fun component9(): Int? = achievementQuantity
    override fun component10(): Double? = achievementValue
    override fun value1(): String? = divisionId
    override fun value2(): String? = locationId
    override fun value3(): String? = brandId
    override fun value4(): Int? = month
    override fun value5(): Int? = year
    override fun value6(): Int? = yearmonth
    override fun value7(): Int? = targetQuantity
    override fun value8(): Double? = targetValue
    override fun value9(): Int? = achievementQuantity
    override fun value10(): Double? = achievementValue

    override fun value1(value: String?): TempterritorypsRecord {
        this.divisionId = value
        return this
    }

    override fun value2(value: String?): TempterritorypsRecord {
        this.locationId = value
        return this
    }

    override fun value3(value: String?): TempterritorypsRecord {
        this.brandId = value
        return this
    }

    override fun value4(value: Int?): TempterritorypsRecord {
        this.month = value
        return this
    }

    override fun value5(value: Int?): TempterritorypsRecord {
        this.year = value
        return this
    }

    override fun value6(value: Int?): TempterritorypsRecord {
        this.yearmonth = value
        return this
    }

    override fun value7(value: Int?): TempterritorypsRecord {
        this.targetQuantity = value
        return this
    }

    override fun value8(value: Double?): TempterritorypsRecord {
        this.targetValue = value
        return this
    }

    override fun value9(value: Int?): TempterritorypsRecord {
        this.achievementQuantity = value
        return this
    }

    override fun value10(value: Double?): TempterritorypsRecord {
        this.achievementValue = value
        return this
    }

    override fun values(value1: String?, value2: String?, value3: String?, value4: Int?, value5: Int?, value6: Int?, value7: Int?, value8: Double?, value9: Int?, value10: Double?): TempterritorypsRecord {
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
     * Create a detached, initialised TempterritorypsRecord
     */
    constructor(divisionId: String? = null, locationId: String? = null, brandId: String? = null, month: Int? = null, year: Int? = null, yearmonth: Int? = null, targetQuantity: Int? = null, targetValue: Double? = null, achievementQuantity: Int? = null, achievementValue: Double? = null): this() {
        this.divisionId = divisionId
        this.locationId = locationId
        this.brandId = brandId
        this.month = month
        this.year = year
        this.yearmonth = yearmonth
        this.targetQuantity = targetQuantity
        this.targetValue = targetValue
        this.achievementQuantity = achievementQuantity
        this.achievementValue = achievementValue
    }
}
