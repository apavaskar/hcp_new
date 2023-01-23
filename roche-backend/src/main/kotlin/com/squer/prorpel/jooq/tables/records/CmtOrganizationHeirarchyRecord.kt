/*
 * This file is generated by jOOQ.
 */
package com.squer.prorpel.jooq.tables.records


import com.squer.prorpel.jooq.tables.CmtOrganizationHeirarchy

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
open class CmtOrganizationHeirarchyRecord() : UpdatableRecordImpl<CmtOrganizationHeirarchyRecord>(CmtOrganizationHeirarchy.CMT_ORGANIZATION_HEIRARCHY), Record10<String?, String?, OffsetDateTime?, Long?, String?, OffsetDateTime?, String?, String?, String?, String?> {

    open var name: String?
        set(value): Unit = set(0, value)
        get(): String? = get(0) as String?

    open var externalId: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

    open var updatedOn: OffsetDateTime?
        set(value): Unit = set(2, value)
        get(): OffsetDateTime? = get(2) as OffsetDateTime?

    open var staleId: Long?
        set(value): Unit = set(3, value)
        get(): Long? = get(3) as Long?

    open var ciName: String?
        set(value): Unit = set(4, value)
        get(): String? = get(4) as String?

    open var createdOn: OffsetDateTime?
        set(value): Unit = set(5, value)
        get(): OffsetDateTime? = get(5) as OffsetDateTime?

    open var id: String?
        set(value): Unit = set(6, value)
        get(): String? = get(6) as String?

    open var parentId: String?
        set(value): Unit = set(7, value)
        get(): String? = get(7) as String?

    open var updatedBy: String?
        set(value): Unit = set(8, value)
        get(): String? = get(8) as String?

    open var createdBy: String?
        set(value): Unit = set(9, value)
        get(): String? = get(9) as String?

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record1<String?> = super.key() as Record1<String?>

    // -------------------------------------------------------------------------
    // Record10 type implementation
    // -------------------------------------------------------------------------

    override fun fieldsRow(): Row10<String?, String?, OffsetDateTime?, Long?, String?, OffsetDateTime?, String?, String?, String?, String?> = super.fieldsRow() as Row10<String?, String?, OffsetDateTime?, Long?, String?, OffsetDateTime?, String?, String?, String?, String?>
    override fun valuesRow(): Row10<String?, String?, OffsetDateTime?, Long?, String?, OffsetDateTime?, String?, String?, String?, String?> = super.valuesRow() as Row10<String?, String?, OffsetDateTime?, Long?, String?, OffsetDateTime?, String?, String?, String?, String?>
    override fun field1(): Field<String?> = CmtOrganizationHeirarchy.CMT_ORGANIZATION_HEIRARCHY.NAME
    override fun field2(): Field<String?> = CmtOrganizationHeirarchy.CMT_ORGANIZATION_HEIRARCHY.EXTERNAL_ID
    override fun field3(): Field<OffsetDateTime?> = CmtOrganizationHeirarchy.CMT_ORGANIZATION_HEIRARCHY.UPDATED_ON
    override fun field4(): Field<Long?> = CmtOrganizationHeirarchy.CMT_ORGANIZATION_HEIRARCHY.STALE_ID
    override fun field5(): Field<String?> = CmtOrganizationHeirarchy.CMT_ORGANIZATION_HEIRARCHY.CI_NAME
    override fun field6(): Field<OffsetDateTime?> = CmtOrganizationHeirarchy.CMT_ORGANIZATION_HEIRARCHY.CREATED_ON
    override fun field7(): Field<String?> = CmtOrganizationHeirarchy.CMT_ORGANIZATION_HEIRARCHY.ID
    override fun field8(): Field<String?> = CmtOrganizationHeirarchy.CMT_ORGANIZATION_HEIRARCHY.PARENT_ID
    override fun field9(): Field<String?> = CmtOrganizationHeirarchy.CMT_ORGANIZATION_HEIRARCHY.UPDATED_BY
    override fun field10(): Field<String?> = CmtOrganizationHeirarchy.CMT_ORGANIZATION_HEIRARCHY.CREATED_BY
    override fun component1(): String? = name
    override fun component2(): String? = externalId
    override fun component3(): OffsetDateTime? = updatedOn
    override fun component4(): Long? = staleId
    override fun component5(): String? = ciName
    override fun component6(): OffsetDateTime? = createdOn
    override fun component7(): String? = id
    override fun component8(): String? = parentId
    override fun component9(): String? = updatedBy
    override fun component10(): String? = createdBy
    override fun value1(): String? = name
    override fun value2(): String? = externalId
    override fun value3(): OffsetDateTime? = updatedOn
    override fun value4(): Long? = staleId
    override fun value5(): String? = ciName
    override fun value6(): OffsetDateTime? = createdOn
    override fun value7(): String? = id
    override fun value8(): String? = parentId
    override fun value9(): String? = updatedBy
    override fun value10(): String? = createdBy

    override fun value1(value: String?): CmtOrganizationHeirarchyRecord {
        this.name = value
        return this
    }

    override fun value2(value: String?): CmtOrganizationHeirarchyRecord {
        this.externalId = value
        return this
    }

    override fun value3(value: OffsetDateTime?): CmtOrganizationHeirarchyRecord {
        this.updatedOn = value
        return this
    }

    override fun value4(value: Long?): CmtOrganizationHeirarchyRecord {
        this.staleId = value
        return this
    }

    override fun value5(value: String?): CmtOrganizationHeirarchyRecord {
        this.ciName = value
        return this
    }

    override fun value6(value: OffsetDateTime?): CmtOrganizationHeirarchyRecord {
        this.createdOn = value
        return this
    }

    override fun value7(value: String?): CmtOrganizationHeirarchyRecord {
        this.id = value
        return this
    }

    override fun value8(value: String?): CmtOrganizationHeirarchyRecord {
        this.parentId = value
        return this
    }

    override fun value9(value: String?): CmtOrganizationHeirarchyRecord {
        this.updatedBy = value
        return this
    }

    override fun value10(value: String?): CmtOrganizationHeirarchyRecord {
        this.createdBy = value
        return this
    }

    override fun values(value1: String?, value2: String?, value3: OffsetDateTime?, value4: Long?, value5: String?, value6: OffsetDateTime?, value7: String?, value8: String?, value9: String?, value10: String?): CmtOrganizationHeirarchyRecord {
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
     * Create a detached, initialised CmtOrganizationHeirarchyRecord
     */
    constructor(name: String? = null, externalId: String? = null, updatedOn: OffsetDateTime? = null, staleId: Long? = null, ciName: String? = null, createdOn: OffsetDateTime? = null, id: String? = null, parentId: String? = null, updatedBy: String? = null, createdBy: String? = null): this() {
        this.name = name
        this.externalId = externalId
        this.updatedOn = updatedOn
        this.staleId = staleId
        this.ciName = ciName
        this.createdOn = createdOn
        this.id = id
        this.parentId = parentId
        this.updatedBy = updatedBy
        this.createdBy = createdBy
    }
}
