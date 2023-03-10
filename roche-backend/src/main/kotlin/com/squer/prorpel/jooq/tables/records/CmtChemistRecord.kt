/*
 * This file is generated by jOOQ.
 */
package com.squer.prorpel.jooq.tables.records


import com.squer.prorpel.jooq.tables.CmtChemist

import java.time.OffsetDateTime

import javax.annotation.processing.Generated

import org.jooq.Field
import org.jooq.Record15
import org.jooq.Row15
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
open class CmtChemistRecord() : TableRecordImpl<CmtChemistRecord>(CmtChemist.CMT_CHEMIST), Record15<String?, String?, OffsetDateTime?, String?, Long?, String?, OffsetDateTime?, String?, String?, String?, String?, String?, String?, String?, Int?> {

    open var name: String?
        set(value): Unit = set(0, value)
        get(): String? = get(0) as String?

    open var statusId: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

    open var updatedOn: OffsetDateTime?
        set(value): Unit = set(2, value)
        get(): OffsetDateTime? = get(2) as OffsetDateTime?

    open var classificationId: String?
        set(value): Unit = set(3, value)
        get(): String? = get(3) as String?

    open var staleId: Long?
        set(value): Unit = set(4, value)
        get(): Long? = get(4) as Long?

    open var ciName: String?
        set(value): Unit = set(5, value)
        get(): String? = get(5) as String?

    open var createdOn: OffsetDateTime?
        set(value): Unit = set(6, value)
        get(): OffsetDateTime? = get(6) as OffsetDateTime?

    open var locationId: String?
        set(value): Unit = set(7, value)
        get(): String? = get(7) as String?

    open var id: String?
        set(value): Unit = set(8, value)
        get(): String? = get(8) as String?

    open var updatedBy: String?
        set(value): Unit = set(9, value)
        get(): String? = get(9) as String?

    open var code: String?
        set(value): Unit = set(10, value)
        get(): String? = get(10) as String?

    open var createdBy: String?
        set(value): Unit = set(11, value)
        get(): String? = get(11) as String?

    open var externalId: String?
        set(value): Unit = set(12, value)
        get(): String? = get(12) as String?

    open var accountId: String?
        set(value): Unit = set(13, value)
        get(): String? = get(13) as String?

    open var requiredFrequency: Int?
        set(value): Unit = set(14, value)
        get(): Int? = get(14) as Int?

    // -------------------------------------------------------------------------
    // Record15 type implementation
    // -------------------------------------------------------------------------

    override fun fieldsRow(): Row15<String?, String?, OffsetDateTime?, String?, Long?, String?, OffsetDateTime?, String?, String?, String?, String?, String?, String?, String?, Int?> = super.fieldsRow() as Row15<String?, String?, OffsetDateTime?, String?, Long?, String?, OffsetDateTime?, String?, String?, String?, String?, String?, String?, String?, Int?>
    override fun valuesRow(): Row15<String?, String?, OffsetDateTime?, String?, Long?, String?, OffsetDateTime?, String?, String?, String?, String?, String?, String?, String?, Int?> = super.valuesRow() as Row15<String?, String?, OffsetDateTime?, String?, Long?, String?, OffsetDateTime?, String?, String?, String?, String?, String?, String?, String?, Int?>
    override fun field1(): Field<String?> = CmtChemist.CMT_CHEMIST.NAME
    override fun field2(): Field<String?> = CmtChemist.CMT_CHEMIST.STATUS_ID
    override fun field3(): Field<OffsetDateTime?> = CmtChemist.CMT_CHEMIST.UPDATED_ON
    override fun field4(): Field<String?> = CmtChemist.CMT_CHEMIST.CLASSIFICATION_ID
    override fun field5(): Field<Long?> = CmtChemist.CMT_CHEMIST.STALE_ID
    override fun field6(): Field<String?> = CmtChemist.CMT_CHEMIST.CI_NAME
    override fun field7(): Field<OffsetDateTime?> = CmtChemist.CMT_CHEMIST.CREATED_ON
    override fun field8(): Field<String?> = CmtChemist.CMT_CHEMIST.LOCATION_ID
    override fun field9(): Field<String?> = CmtChemist.CMT_CHEMIST.ID
    override fun field10(): Field<String?> = CmtChemist.CMT_CHEMIST.UPDATED_BY
    override fun field11(): Field<String?> = CmtChemist.CMT_CHEMIST.CODE
    override fun field12(): Field<String?> = CmtChemist.CMT_CHEMIST.CREATED_BY
    override fun field13(): Field<String?> = CmtChemist.CMT_CHEMIST.EXTERNAL_ID
    override fun field14(): Field<String?> = CmtChemist.CMT_CHEMIST.ACCOUNT_ID
    override fun field15(): Field<Int?> = CmtChemist.CMT_CHEMIST.REQUIRED_FREQUENCY
    override fun component1(): String? = name
    override fun component2(): String? = statusId
    override fun component3(): OffsetDateTime? = updatedOn
    override fun component4(): String? = classificationId
    override fun component5(): Long? = staleId
    override fun component6(): String? = ciName
    override fun component7(): OffsetDateTime? = createdOn
    override fun component8(): String? = locationId
    override fun component9(): String? = id
    override fun component10(): String? = updatedBy
    override fun component11(): String? = code
    override fun component12(): String? = createdBy
    override fun component13(): String? = externalId
    override fun component14(): String? = accountId
    override fun component15(): Int? = requiredFrequency
    override fun value1(): String? = name
    override fun value2(): String? = statusId
    override fun value3(): OffsetDateTime? = updatedOn
    override fun value4(): String? = classificationId
    override fun value5(): Long? = staleId
    override fun value6(): String? = ciName
    override fun value7(): OffsetDateTime? = createdOn
    override fun value8(): String? = locationId
    override fun value9(): String? = id
    override fun value10(): String? = updatedBy
    override fun value11(): String? = code
    override fun value12(): String? = createdBy
    override fun value13(): String? = externalId
    override fun value14(): String? = accountId
    override fun value15(): Int? = requiredFrequency

    override fun value1(value: String?): CmtChemistRecord {
        this.name = value
        return this
    }

    override fun value2(value: String?): CmtChemistRecord {
        this.statusId = value
        return this
    }

    override fun value3(value: OffsetDateTime?): CmtChemistRecord {
        this.updatedOn = value
        return this
    }

    override fun value4(value: String?): CmtChemistRecord {
        this.classificationId = value
        return this
    }

    override fun value5(value: Long?): CmtChemistRecord {
        this.staleId = value
        return this
    }

    override fun value6(value: String?): CmtChemistRecord {
        this.ciName = value
        return this
    }

    override fun value7(value: OffsetDateTime?): CmtChemistRecord {
        this.createdOn = value
        return this
    }

    override fun value8(value: String?): CmtChemistRecord {
        this.locationId = value
        return this
    }

    override fun value9(value: String?): CmtChemistRecord {
        this.id = value
        return this
    }

    override fun value10(value: String?): CmtChemistRecord {
        this.updatedBy = value
        return this
    }

    override fun value11(value: String?): CmtChemistRecord {
        this.code = value
        return this
    }

    override fun value12(value: String?): CmtChemistRecord {
        this.createdBy = value
        return this
    }

    override fun value13(value: String?): CmtChemistRecord {
        this.externalId = value
        return this
    }

    override fun value14(value: String?): CmtChemistRecord {
        this.accountId = value
        return this
    }

    override fun value15(value: Int?): CmtChemistRecord {
        this.requiredFrequency = value
        return this
    }

    override fun values(value1: String?, value2: String?, value3: OffsetDateTime?, value4: String?, value5: Long?, value6: String?, value7: OffsetDateTime?, value8: String?, value9: String?, value10: String?, value11: String?, value12: String?, value13: String?, value14: String?, value15: Int?): CmtChemistRecord {
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
        this.value15(value15)
        return this
    }

    /**
     * Create a detached, initialised CmtChemistRecord
     */
    constructor(name: String? = null, statusId: String? = null, updatedOn: OffsetDateTime? = null, classificationId: String? = null, staleId: Long? = null, ciName: String? = null, createdOn: OffsetDateTime? = null, locationId: String? = null, id: String? = null, updatedBy: String? = null, code: String? = null, createdBy: String? = null, externalId: String? = null, accountId: String? = null, requiredFrequency: Int? = null): this() {
        this.name = name
        this.statusId = statusId
        this.updatedOn = updatedOn
        this.classificationId = classificationId
        this.staleId = staleId
        this.ciName = ciName
        this.createdOn = createdOn
        this.locationId = locationId
        this.id = id
        this.updatedBy = updatedBy
        this.code = code
        this.createdBy = createdBy
        this.externalId = externalId
        this.accountId = accountId
        this.requiredFrequency = requiredFrequency
    }
}
