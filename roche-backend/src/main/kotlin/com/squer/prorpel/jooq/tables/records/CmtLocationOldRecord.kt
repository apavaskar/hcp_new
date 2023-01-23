/*
 * This file is generated by jOOQ.
 */
package com.squer.prorpel.jooq.tables.records


import com.squer.prorpel.jooq.tables.CmtLocationOld

import java.time.OffsetDateTime

import javax.annotation.processing.Generated

import org.jooq.Field
import org.jooq.Record1
import org.jooq.Record14
import org.jooq.Row14
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
open class CmtLocationOldRecord() : UpdatableRecordImpl<CmtLocationOldRecord>(CmtLocationOld.CMT_LOCATION_OLD), Record14<OffsetDateTime?, String?, OffsetDateTime?, String?, String?, String?, String?, String?, Long?, String?, String?, String?, String?, String?> {

    open var updatedOn: OffsetDateTime?
        set(value): Unit = set(0, value)
        get(): OffsetDateTime? = get(0) as OffsetDateTime?

    open var ciName: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

    open var createdOn: OffsetDateTime?
        set(value): Unit = set(2, value)
        get(): OffsetDateTime? = get(2) as OffsetDateTime?

    open var externalId: String?
        set(value): Unit = set(3, value)
        get(): String? = get(3) as String?

    open var updatedBy: String?
        set(value): Unit = set(4, value)
        get(): String? = get(4) as String?

    open var parentId: String?
        set(value): Unit = set(5, value)
        get(): String? = get(5) as String?

    open var name: String?
        set(value): Unit = set(6, value)
        get(): String? = get(6) as String?

    open var statusId: String?
        set(value): Unit = set(7, value)
        get(): String? = get(7) as String?

    open var staleId: Long?
        set(value): Unit = set(8, value)
        get(): Long? = get(8) as Long?

    open var heirarchyId: String?
        set(value): Unit = set(9, value)
        get(): String? = get(9) as String?

    open var id: String?
        set(value): Unit = set(10, value)
        get(): String? = get(10) as String?

    open var createdBy: String?
        set(value): Unit = set(11, value)
        get(): String? = get(11) as String?

    open var sapCode: String?
        set(value): Unit = set(12, value)
        get(): String? = get(12) as String?

    open var divisionId: String?
        set(value): Unit = set(13, value)
        get(): String? = get(13) as String?

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record1<String?> = super.key() as Record1<String?>

    // -------------------------------------------------------------------------
    // Record14 type implementation
    // -------------------------------------------------------------------------

    override fun fieldsRow(): Row14<OffsetDateTime?, String?, OffsetDateTime?, String?, String?, String?, String?, String?, Long?, String?, String?, String?, String?, String?> = super.fieldsRow() as Row14<OffsetDateTime?, String?, OffsetDateTime?, String?, String?, String?, String?, String?, Long?, String?, String?, String?, String?, String?>
    override fun valuesRow(): Row14<OffsetDateTime?, String?, OffsetDateTime?, String?, String?, String?, String?, String?, Long?, String?, String?, String?, String?, String?> = super.valuesRow() as Row14<OffsetDateTime?, String?, OffsetDateTime?, String?, String?, String?, String?, String?, Long?, String?, String?, String?, String?, String?>
    override fun field1(): Field<OffsetDateTime?> = CmtLocationOld.CMT_LOCATION_OLD.UPDATED_ON
    override fun field2(): Field<String?> = CmtLocationOld.CMT_LOCATION_OLD.CI_NAME
    override fun field3(): Field<OffsetDateTime?> = CmtLocationOld.CMT_LOCATION_OLD.CREATED_ON
    override fun field4(): Field<String?> = CmtLocationOld.CMT_LOCATION_OLD.EXTERNAL_ID
    override fun field5(): Field<String?> = CmtLocationOld.CMT_LOCATION_OLD.UPDATED_BY
    override fun field6(): Field<String?> = CmtLocationOld.CMT_LOCATION_OLD.PARENT_ID
    override fun field7(): Field<String?> = CmtLocationOld.CMT_LOCATION_OLD.NAME
    override fun field8(): Field<String?> = CmtLocationOld.CMT_LOCATION_OLD.STATUS_ID
    override fun field9(): Field<Long?> = CmtLocationOld.CMT_LOCATION_OLD.STALE_ID
    override fun field10(): Field<String?> = CmtLocationOld.CMT_LOCATION_OLD.HEIRARCHY_ID
    override fun field11(): Field<String?> = CmtLocationOld.CMT_LOCATION_OLD.ID
    override fun field12(): Field<String?> = CmtLocationOld.CMT_LOCATION_OLD.CREATED_BY
    override fun field13(): Field<String?> = CmtLocationOld.CMT_LOCATION_OLD.SAP_CODE
    override fun field14(): Field<String?> = CmtLocationOld.CMT_LOCATION_OLD.DIVISION_ID
    override fun component1(): OffsetDateTime? = updatedOn
    override fun component2(): String? = ciName
    override fun component3(): OffsetDateTime? = createdOn
    override fun component4(): String? = externalId
    override fun component5(): String? = updatedBy
    override fun component6(): String? = parentId
    override fun component7(): String? = name
    override fun component8(): String? = statusId
    override fun component9(): Long? = staleId
    override fun component10(): String? = heirarchyId
    override fun component11(): String? = id
    override fun component12(): String? = createdBy
    override fun component13(): String? = sapCode
    override fun component14(): String? = divisionId
    override fun value1(): OffsetDateTime? = updatedOn
    override fun value2(): String? = ciName
    override fun value3(): OffsetDateTime? = createdOn
    override fun value4(): String? = externalId
    override fun value5(): String? = updatedBy
    override fun value6(): String? = parentId
    override fun value7(): String? = name
    override fun value8(): String? = statusId
    override fun value9(): Long? = staleId
    override fun value10(): String? = heirarchyId
    override fun value11(): String? = id
    override fun value12(): String? = createdBy
    override fun value13(): String? = sapCode
    override fun value14(): String? = divisionId

    override fun value1(value: OffsetDateTime?): CmtLocationOldRecord {
        this.updatedOn = value
        return this
    }

    override fun value2(value: String?): CmtLocationOldRecord {
        this.ciName = value
        return this
    }

    override fun value3(value: OffsetDateTime?): CmtLocationOldRecord {
        this.createdOn = value
        return this
    }

    override fun value4(value: String?): CmtLocationOldRecord {
        this.externalId = value
        return this
    }

    override fun value5(value: String?): CmtLocationOldRecord {
        this.updatedBy = value
        return this
    }

    override fun value6(value: String?): CmtLocationOldRecord {
        this.parentId = value
        return this
    }

    override fun value7(value: String?): CmtLocationOldRecord {
        this.name = value
        return this
    }

    override fun value8(value: String?): CmtLocationOldRecord {
        this.statusId = value
        return this
    }

    override fun value9(value: Long?): CmtLocationOldRecord {
        this.staleId = value
        return this
    }

    override fun value10(value: String?): CmtLocationOldRecord {
        this.heirarchyId = value
        return this
    }

    override fun value11(value: String?): CmtLocationOldRecord {
        this.id = value
        return this
    }

    override fun value12(value: String?): CmtLocationOldRecord {
        this.createdBy = value
        return this
    }

    override fun value13(value: String?): CmtLocationOldRecord {
        this.sapCode = value
        return this
    }

    override fun value14(value: String?): CmtLocationOldRecord {
        this.divisionId = value
        return this
    }

    override fun values(value1: OffsetDateTime?, value2: String?, value3: OffsetDateTime?, value4: String?, value5: String?, value6: String?, value7: String?, value8: String?, value9: Long?, value10: String?, value11: String?, value12: String?, value13: String?, value14: String?): CmtLocationOldRecord {
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
        this.value13(value13)
        this.value14(value14)
        return this
    }

    /**
     * Create a detached, initialised CmtLocationOldRecord
     */
    constructor(updatedOn: OffsetDateTime? = null, ciName: String? = null, createdOn: OffsetDateTime? = null, externalId: String? = null, updatedBy: String? = null, parentId: String? = null, name: String? = null, statusId: String? = null, staleId: Long? = null, heirarchyId: String? = null, id: String? = null, createdBy: String? = null, sapCode: String? = null, divisionId: String? = null): this() {
        this.updatedOn = updatedOn
        this.ciName = ciName
        this.createdOn = createdOn
        this.externalId = externalId
        this.updatedBy = updatedBy
        this.parentId = parentId
        this.name = name
        this.statusId = statusId
        this.staleId = staleId
        this.heirarchyId = heirarchyId
        this.id = id
        this.createdBy = createdBy
        this.sapCode = sapCode
        this.divisionId = divisionId
    }
}
