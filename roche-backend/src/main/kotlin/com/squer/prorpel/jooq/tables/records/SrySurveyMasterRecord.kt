/*
 * This file is generated by jOOQ.
 */
package com.squer.prorpel.jooq.tables.records


import com.squer.prorpel.jooq.tables.SrySurveyMaster

import java.time.OffsetDateTime

import javax.annotation.processing.Generated

import org.jooq.Field
import org.jooq.Record13
import org.jooq.Row13
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
open class SrySurveyMasterRecord() : TableRecordImpl<SrySurveyMasterRecord>(SrySurveyMaster.SRY_SURVEY_MASTER), Record13<OffsetDateTime?, String?, OffsetDateTime?, Boolean?, String?, String?, OffsetDateTime?, String?, Long?, OffsetDateTime?, String?, String?, String?> {

    open var updatedOn: OffsetDateTime?
        set(value): Unit = set(0, value)
        get(): OffsetDateTime? = get(0) as OffsetDateTime?

    open var ciName: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

    open var createdOn: OffsetDateTime?
        set(value): Unit = set(2, value)
        get(): OffsetDateTime? = get(2) as OffsetDateTime?

    open var showAdditional: Boolean?
        set(value): Unit = set(3, value)
        get(): Boolean? = get(3) as Boolean?

    open var typeId: String?
        set(value): Unit = set(4, value)
        get(): String? = get(4) as String?

    open var updatedBy: String?
        set(value): Unit = set(5, value)
        get(): String? = get(5) as String?

    open var activeTo: OffsetDateTime?
        set(value): Unit = set(6, value)
        get(): OffsetDateTime? = get(6) as OffsetDateTime?

    open var name: String?
        set(value): Unit = set(7, value)
        get(): String? = get(7) as String?

    open var staleId: Long?
        set(value): Unit = set(8, value)
        get(): Long? = get(8) as Long?

    open var activeFrom: OffsetDateTime?
        set(value): Unit = set(9, value)
        get(): OffsetDateTime? = get(9) as OffsetDateTime?

    open var id: String?
        set(value): Unit = set(10, value)
        get(): String? = get(10) as String?

    open var statusId: String?
        set(value): Unit = set(11, value)
        get(): String? = get(11) as String?

    open var createdBy: String?
        set(value): Unit = set(12, value)
        get(): String? = get(12) as String?

    // -------------------------------------------------------------------------
    // Record13 type implementation
    // -------------------------------------------------------------------------

    override fun fieldsRow(): Row13<OffsetDateTime?, String?, OffsetDateTime?, Boolean?, String?, String?, OffsetDateTime?, String?, Long?, OffsetDateTime?, String?, String?, String?> = super.fieldsRow() as Row13<OffsetDateTime?, String?, OffsetDateTime?, Boolean?, String?, String?, OffsetDateTime?, String?, Long?, OffsetDateTime?, String?, String?, String?>
    override fun valuesRow(): Row13<OffsetDateTime?, String?, OffsetDateTime?, Boolean?, String?, String?, OffsetDateTime?, String?, Long?, OffsetDateTime?, String?, String?, String?> = super.valuesRow() as Row13<OffsetDateTime?, String?, OffsetDateTime?, Boolean?, String?, String?, OffsetDateTime?, String?, Long?, OffsetDateTime?, String?, String?, String?>
    override fun field1(): Field<OffsetDateTime?> = SrySurveyMaster.SRY_SURVEY_MASTER.UPDATED_ON
    override fun field2(): Field<String?> = SrySurveyMaster.SRY_SURVEY_MASTER.CI_NAME
    override fun field3(): Field<OffsetDateTime?> = SrySurveyMaster.SRY_SURVEY_MASTER.CREATED_ON
    override fun field4(): Field<Boolean?> = SrySurveyMaster.SRY_SURVEY_MASTER.SHOW_ADDITIONAL
    override fun field5(): Field<String?> = SrySurveyMaster.SRY_SURVEY_MASTER.TYPE_ID
    override fun field6(): Field<String?> = SrySurveyMaster.SRY_SURVEY_MASTER.UPDATED_BY
    override fun field7(): Field<OffsetDateTime?> = SrySurveyMaster.SRY_SURVEY_MASTER.ACTIVE_TO
    override fun field8(): Field<String?> = SrySurveyMaster.SRY_SURVEY_MASTER.NAME
    override fun field9(): Field<Long?> = SrySurveyMaster.SRY_SURVEY_MASTER.STALE_ID
    override fun field10(): Field<OffsetDateTime?> = SrySurveyMaster.SRY_SURVEY_MASTER.ACTIVE_FROM
    override fun field11(): Field<String?> = SrySurveyMaster.SRY_SURVEY_MASTER.ID
    override fun field12(): Field<String?> = SrySurveyMaster.SRY_SURVEY_MASTER.STATUS_ID
    override fun field13(): Field<String?> = SrySurveyMaster.SRY_SURVEY_MASTER.CREATED_BY
    override fun component1(): OffsetDateTime? = updatedOn
    override fun component2(): String? = ciName
    override fun component3(): OffsetDateTime? = createdOn
    override fun component4(): Boolean? = showAdditional
    override fun component5(): String? = typeId
    override fun component6(): String? = updatedBy
    override fun component7(): OffsetDateTime? = activeTo
    override fun component8(): String? = name
    override fun component9(): Long? = staleId
    override fun component10(): OffsetDateTime? = activeFrom
    override fun component11(): String? = id
    override fun component12(): String? = statusId
    override fun component13(): String? = createdBy
    override fun value1(): OffsetDateTime? = updatedOn
    override fun value2(): String? = ciName
    override fun value3(): OffsetDateTime? = createdOn
    override fun value4(): Boolean? = showAdditional
    override fun value5(): String? = typeId
    override fun value6(): String? = updatedBy
    override fun value7(): OffsetDateTime? = activeTo
    override fun value8(): String? = name
    override fun value9(): Long? = staleId
    override fun value10(): OffsetDateTime? = activeFrom
    override fun value11(): String? = id
    override fun value12(): String? = statusId
    override fun value13(): String? = createdBy

    override fun value1(value: OffsetDateTime?): SrySurveyMasterRecord {
        this.updatedOn = value
        return this
    }

    override fun value2(value: String?): SrySurveyMasterRecord {
        this.ciName = value
        return this
    }

    override fun value3(value: OffsetDateTime?): SrySurveyMasterRecord {
        this.createdOn = value
        return this
    }

    override fun value4(value: Boolean?): SrySurveyMasterRecord {
        this.showAdditional = value
        return this
    }

    override fun value5(value: String?): SrySurveyMasterRecord {
        this.typeId = value
        return this
    }

    override fun value6(value: String?): SrySurveyMasterRecord {
        this.updatedBy = value
        return this
    }

    override fun value7(value: OffsetDateTime?): SrySurveyMasterRecord {
        this.activeTo = value
        return this
    }

    override fun value8(value: String?): SrySurveyMasterRecord {
        this.name = value
        return this
    }

    override fun value9(value: Long?): SrySurveyMasterRecord {
        this.staleId = value
        return this
    }

    override fun value10(value: OffsetDateTime?): SrySurveyMasterRecord {
        this.activeFrom = value
        return this
    }

    override fun value11(value: String?): SrySurveyMasterRecord {
        this.id = value
        return this
    }

    override fun value12(value: String?): SrySurveyMasterRecord {
        this.statusId = value
        return this
    }

    override fun value13(value: String?): SrySurveyMasterRecord {
        this.createdBy = value
        return this
    }

    override fun values(value1: OffsetDateTime?, value2: String?, value3: OffsetDateTime?, value4: Boolean?, value5: String?, value6: String?, value7: OffsetDateTime?, value8: String?, value9: Long?, value10: OffsetDateTime?, value11: String?, value12: String?, value13: String?): SrySurveyMasterRecord {
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
        return this
    }

    /**
     * Create a detached, initialised SrySurveyMasterRecord
     */
    constructor(updatedOn: OffsetDateTime? = null, ciName: String? = null, createdOn: OffsetDateTime? = null, showAdditional: Boolean? = null, typeId: String? = null, updatedBy: String? = null, activeTo: OffsetDateTime? = null, name: String? = null, staleId: Long? = null, activeFrom: OffsetDateTime? = null, id: String? = null, statusId: String? = null, createdBy: String? = null): this() {
        this.updatedOn = updatedOn
        this.ciName = ciName
        this.createdOn = createdOn
        this.showAdditional = showAdditional
        this.typeId = typeId
        this.updatedBy = updatedBy
        this.activeTo = activeTo
        this.name = name
        this.staleId = staleId
        this.activeFrom = activeFrom
        this.id = id
        this.statusId = statusId
        this.createdBy = createdBy
    }
}
