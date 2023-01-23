/*
 * This file is generated by jOOQ.
 */
package com.squer.prorpel.jooq.tables.records


import com.squer.prorpel.jooq.tables.DshActivityDetails

import java.time.LocalDate
import java.time.OffsetDateTime

import javax.annotation.processing.Generated

import org.jooq.Field
import org.jooq.Record1
import org.jooq.Record12
import org.jooq.Row12
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
open class DshActivityDetailsRecord() : UpdatableRecordImpl<DshActivityDetailsRecord>(DshActivityDetails.DSH_ACTIVITY_DETAILS), Record12<String?, Boolean?, String?, String?, String?, String?, OffsetDateTime?, LocalDate?, OffsetDateTime?, String?, String?, Int?> {

    open var id: String?
        set(value): Unit = set(0, value)
        get(): String? = get(0) as String?

    @Suppress("INAPPLICABLE_JVM_NAME")
    @set:JvmName("setIsVisited")
    open var isVisited: Boolean?
        set(value): Unit = set(1, value)
        get(): Boolean? = get(1) as Boolean?

    open var updatedBy: String?
        set(value): Unit = set(2, value)
        get(): String? = get(2) as String?

    open var createdBy: String?
        set(value): Unit = set(3, value)
        get(): String? = get(3) as String?

    open var activityType: String?
        set(value): Unit = set(4, value)
        get(): String? = get(4) as String?

    open var ownerId: String?
        set(value): Unit = set(5, value)
        get(): String? = get(5) as String?

    open var updatedOn: OffsetDateTime?
        set(value): Unit = set(6, value)
        get(): OffsetDateTime? = get(6) as OffsetDateTime?

    open var activityDate: LocalDate?
        set(value): Unit = set(7, value)
        get(): LocalDate? = get(7) as LocalDate?

    open var createdOn: OffsetDateTime?
        set(value): Unit = set(8, value)
        get(): OffsetDateTime? = get(8) as OffsetDateTime?

    open var staleId: String?
        set(value): Unit = set(9, value)
        get(): String? = get(9) as String?

    open var locationId: String?
        set(value): Unit = set(10, value)
        get(): String? = get(10) as String?

    open var yearmonth: Int?
        set(value): Unit = set(11, value)
        get(): Int? = get(11) as Int?

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record1<String?> = super.key() as Record1<String?>

    // -------------------------------------------------------------------------
    // Record12 type implementation
    // -------------------------------------------------------------------------

    override fun fieldsRow(): Row12<String?, Boolean?, String?, String?, String?, String?, OffsetDateTime?, LocalDate?, OffsetDateTime?, String?, String?, Int?> = super.fieldsRow() as Row12<String?, Boolean?, String?, String?, String?, String?, OffsetDateTime?, LocalDate?, OffsetDateTime?, String?, String?, Int?>
    override fun valuesRow(): Row12<String?, Boolean?, String?, String?, String?, String?, OffsetDateTime?, LocalDate?, OffsetDateTime?, String?, String?, Int?> = super.valuesRow() as Row12<String?, Boolean?, String?, String?, String?, String?, OffsetDateTime?, LocalDate?, OffsetDateTime?, String?, String?, Int?>
    override fun field1(): Field<String?> = DshActivityDetails.DSH_ACTIVITY_DETAILS.ID
    override fun field2(): Field<Boolean?> = DshActivityDetails.DSH_ACTIVITY_DETAILS.IS_VISITED
    override fun field3(): Field<String?> = DshActivityDetails.DSH_ACTIVITY_DETAILS.UPDATED_BY
    override fun field4(): Field<String?> = DshActivityDetails.DSH_ACTIVITY_DETAILS.CREATED_BY
    override fun field5(): Field<String?> = DshActivityDetails.DSH_ACTIVITY_DETAILS.ACTIVITY_TYPE
    override fun field6(): Field<String?> = DshActivityDetails.DSH_ACTIVITY_DETAILS.OWNER_ID
    override fun field7(): Field<OffsetDateTime?> = DshActivityDetails.DSH_ACTIVITY_DETAILS.UPDATED_ON
    override fun field8(): Field<LocalDate?> = DshActivityDetails.DSH_ACTIVITY_DETAILS.ACTIVITY_DATE
    override fun field9(): Field<OffsetDateTime?> = DshActivityDetails.DSH_ACTIVITY_DETAILS.CREATED_ON
    override fun field10(): Field<String?> = DshActivityDetails.DSH_ACTIVITY_DETAILS.STALE_ID
    override fun field11(): Field<String?> = DshActivityDetails.DSH_ACTIVITY_DETAILS.LOCATION_ID
    override fun field12(): Field<Int?> = DshActivityDetails.DSH_ACTIVITY_DETAILS.YEARMONTH
    override fun component1(): String? = id
    override fun component2(): Boolean? = isVisited
    override fun component3(): String? = updatedBy
    override fun component4(): String? = createdBy
    override fun component5(): String? = activityType
    override fun component6(): String? = ownerId
    override fun component7(): OffsetDateTime? = updatedOn
    override fun component8(): LocalDate? = activityDate
    override fun component9(): OffsetDateTime? = createdOn
    override fun component10(): String? = staleId
    override fun component11(): String? = locationId
    override fun component12(): Int? = yearmonth
    override fun value1(): String? = id
    override fun value2(): Boolean? = isVisited
    override fun value3(): String? = updatedBy
    override fun value4(): String? = createdBy
    override fun value5(): String? = activityType
    override fun value6(): String? = ownerId
    override fun value7(): OffsetDateTime? = updatedOn
    override fun value8(): LocalDate? = activityDate
    override fun value9(): OffsetDateTime? = createdOn
    override fun value10(): String? = staleId
    override fun value11(): String? = locationId
    override fun value12(): Int? = yearmonth

    override fun value1(value: String?): DshActivityDetailsRecord {
        this.id = value
        return this
    }

    override fun value2(value: Boolean?): DshActivityDetailsRecord {
        this.isVisited = value
        return this
    }

    override fun value3(value: String?): DshActivityDetailsRecord {
        this.updatedBy = value
        return this
    }

    override fun value4(value: String?): DshActivityDetailsRecord {
        this.createdBy = value
        return this
    }

    override fun value5(value: String?): DshActivityDetailsRecord {
        this.activityType = value
        return this
    }

    override fun value6(value: String?): DshActivityDetailsRecord {
        this.ownerId = value
        return this
    }

    override fun value7(value: OffsetDateTime?): DshActivityDetailsRecord {
        this.updatedOn = value
        return this
    }

    override fun value8(value: LocalDate?): DshActivityDetailsRecord {
        this.activityDate = value
        return this
    }

    override fun value9(value: OffsetDateTime?): DshActivityDetailsRecord {
        this.createdOn = value
        return this
    }

    override fun value10(value: String?): DshActivityDetailsRecord {
        this.staleId = value
        return this
    }

    override fun value11(value: String?): DshActivityDetailsRecord {
        this.locationId = value
        return this
    }

    override fun value12(value: Int?): DshActivityDetailsRecord {
        this.yearmonth = value
        return this
    }

    override fun values(value1: String?, value2: Boolean?, value3: String?, value4: String?, value5: String?, value6: String?, value7: OffsetDateTime?, value8: LocalDate?, value9: OffsetDateTime?, value10: String?, value11: String?, value12: Int?): DshActivityDetailsRecord {
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
     * Create a detached, initialised DshActivityDetailsRecord
     */
    constructor(id: String? = null, isVisited: Boolean? = null, updatedBy: String? = null, createdBy: String? = null, activityType: String? = null, ownerId: String? = null, updatedOn: OffsetDateTime? = null, activityDate: LocalDate? = null, createdOn: OffsetDateTime? = null, staleId: String? = null, locationId: String? = null, yearmonth: Int? = null): this() {
        this.id = id
        this.isVisited = isVisited
        this.updatedBy = updatedBy
        this.createdBy = createdBy
        this.activityType = activityType
        this.ownerId = ownerId
        this.updatedOn = updatedOn
        this.activityDate = activityDate
        this.createdOn = createdOn
        this.staleId = staleId
        this.locationId = locationId
        this.yearmonth = yearmonth
    }
}