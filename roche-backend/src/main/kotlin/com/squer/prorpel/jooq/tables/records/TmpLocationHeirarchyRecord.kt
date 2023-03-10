/*
 * This file is generated by jOOQ.
 */
package com.squer.prorpel.jooq.tables.records


import com.squer.prorpel.jooq.tables.TmpLocationHeirarchy

import javax.annotation.processing.Generated

import org.jooq.Field
import org.jooq.Record9
import org.jooq.Row9
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
open class TmpLocationHeirarchyRecord() : TableRecordImpl<TmpLocationHeirarchyRecord>(TmpLocationHeirarchy.TMP_LOCATION_HEIRARCHY), Record9<String?, String?, String?, String?, String?, String?, String?, String?, Long?> {

    open var locationId: String?
        set(value): Unit = set(0, value)
        get(): String? = get(0) as String?

    open var areaId: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

    open var areaTypeId: String?
        set(value): Unit = set(2, value)
        get(): String? = get(2) as String?

    open var regionId: String?
        set(value): Unit = set(3, value)
        get(): String? = get(3) as String?

    open var regionTypeId: String?
        set(value): Unit = set(4, value)
        get(): String? = get(4) as String?

    open var buHeadId: String?
        set(value): Unit = set(5, value)
        get(): String? = get(5) as String?

    open var buHeadTypeId: String?
        set(value): Unit = set(6, value)
        get(): String? = get(6) as String?

    open var divisionId: String?
        set(value): Unit = set(7, value)
        get(): String? = get(7) as String?

    open var jobExecutionId: Long?
        set(value): Unit = set(8, value)
        get(): Long? = get(8) as Long?

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    override fun fieldsRow(): Row9<String?, String?, String?, String?, String?, String?, String?, String?, Long?> = super.fieldsRow() as Row9<String?, String?, String?, String?, String?, String?, String?, String?, Long?>
    override fun valuesRow(): Row9<String?, String?, String?, String?, String?, String?, String?, String?, Long?> = super.valuesRow() as Row9<String?, String?, String?, String?, String?, String?, String?, String?, Long?>
    override fun field1(): Field<String?> = TmpLocationHeirarchy.TMP_LOCATION_HEIRARCHY.LOCATION_ID
    override fun field2(): Field<String?> = TmpLocationHeirarchy.TMP_LOCATION_HEIRARCHY.AREA_ID
    override fun field3(): Field<String?> = TmpLocationHeirarchy.TMP_LOCATION_HEIRARCHY.AREA_TYPE_ID
    override fun field4(): Field<String?> = TmpLocationHeirarchy.TMP_LOCATION_HEIRARCHY.REGION_ID
    override fun field5(): Field<String?> = TmpLocationHeirarchy.TMP_LOCATION_HEIRARCHY.REGION_TYPE_ID
    override fun field6(): Field<String?> = TmpLocationHeirarchy.TMP_LOCATION_HEIRARCHY.BU_HEAD_ID
    override fun field7(): Field<String?> = TmpLocationHeirarchy.TMP_LOCATION_HEIRARCHY.BU_HEAD_TYPE_ID
    override fun field8(): Field<String?> = TmpLocationHeirarchy.TMP_LOCATION_HEIRARCHY.DIVISION_ID
    override fun field9(): Field<Long?> = TmpLocationHeirarchy.TMP_LOCATION_HEIRARCHY.JOB_EXECUTION_ID
    override fun component1(): String? = locationId
    override fun component2(): String? = areaId
    override fun component3(): String? = areaTypeId
    override fun component4(): String? = regionId
    override fun component5(): String? = regionTypeId
    override fun component6(): String? = buHeadId
    override fun component7(): String? = buHeadTypeId
    override fun component8(): String? = divisionId
    override fun component9(): Long? = jobExecutionId
    override fun value1(): String? = locationId
    override fun value2(): String? = areaId
    override fun value3(): String? = areaTypeId
    override fun value4(): String? = regionId
    override fun value5(): String? = regionTypeId
    override fun value6(): String? = buHeadId
    override fun value7(): String? = buHeadTypeId
    override fun value8(): String? = divisionId
    override fun value9(): Long? = jobExecutionId

    override fun value1(value: String?): TmpLocationHeirarchyRecord {
        this.locationId = value
        return this
    }

    override fun value2(value: String?): TmpLocationHeirarchyRecord {
        this.areaId = value
        return this
    }

    override fun value3(value: String?): TmpLocationHeirarchyRecord {
        this.areaTypeId = value
        return this
    }

    override fun value4(value: String?): TmpLocationHeirarchyRecord {
        this.regionId = value
        return this
    }

    override fun value5(value: String?): TmpLocationHeirarchyRecord {
        this.regionTypeId = value
        return this
    }

    override fun value6(value: String?): TmpLocationHeirarchyRecord {
        this.buHeadId = value
        return this
    }

    override fun value7(value: String?): TmpLocationHeirarchyRecord {
        this.buHeadTypeId = value
        return this
    }

    override fun value8(value: String?): TmpLocationHeirarchyRecord {
        this.divisionId = value
        return this
    }

    override fun value9(value: Long?): TmpLocationHeirarchyRecord {
        this.jobExecutionId = value
        return this
    }

    override fun values(value1: String?, value2: String?, value3: String?, value4: String?, value5: String?, value6: String?, value7: String?, value8: String?, value9: Long?): TmpLocationHeirarchyRecord {
        this.value1(value1)
        this.value2(value2)
        this.value3(value3)
        this.value4(value4)
        this.value5(value5)
        this.value6(value6)
        this.value7(value7)
        this.value8(value8)
        this.value9(value9)
        return this
    }

    /**
     * Create a detached, initialised TmpLocationHeirarchyRecord
     */
    constructor(locationId: String? = null, areaId: String? = null, areaTypeId: String? = null, regionId: String? = null, regionTypeId: String? = null, buHeadId: String? = null, buHeadTypeId: String? = null, divisionId: String? = null, jobExecutionId: Long? = null): this() {
        this.locationId = locationId
        this.areaId = areaId
        this.areaTypeId = areaTypeId
        this.regionId = regionId
        this.regionTypeId = regionTypeId
        this.buHeadId = buHeadId
        this.buHeadTypeId = buHeadTypeId
        this.divisionId = divisionId
        this.jobExecutionId = jobExecutionId
    }
}
