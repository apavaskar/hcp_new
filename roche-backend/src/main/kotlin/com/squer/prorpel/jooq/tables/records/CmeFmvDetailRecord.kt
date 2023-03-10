/*
 * This file is generated by jOOQ.
 */
package com.squer.prorpel.jooq.tables.records


import com.squer.prorpel.jooq.tables.CmeFmvDetail

import java.time.OffsetDateTime

import javax.annotation.processing.Generated

import org.jooq.Field
import org.jooq.Record1
import org.jooq.Record15
import org.jooq.Row15
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
open class CmeFmvDetailRecord() : UpdatableRecordImpl<CmeFmvDetailRecord>(CmeFmvDetail.CME_FMV_DETAIL), Record15<String?, String?, String?, String?, Double?, String?, Boolean?, String?, String?, String?, Double?, String?, OffsetDateTime?, String?, OffsetDateTime?> {

    open var hcpSpeciality: String?
        set(value): Unit = set(0, value)
        get(): String? = get(0) as String?

    open var id: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

    open var place: String?
        set(value): Unit = set(2, value)
        get(): String? = get(2) as String?

    open var createdBy: String?
        set(value): Unit = set(3, value)
        get(): String? = get(3) as String?

    open var hourlyRate: Double?
        set(value): Unit = set(4, value)
        get(): Double? = get(4) as Double?

    open var qualification: String?
        set(value): Unit = set(5, value)
        get(): String? = get(5) as String?

    @Suppress("INAPPLICABLE_JVM_NAME")
    @set:JvmName("setIsCurrent")
    open var isCurrent: Boolean?
        set(value): Unit = set(6, value)
        get(): Boolean? = get(6) as Boolean?

    open var tier: String?
        set(value): Unit = set(7, value)
        get(): String? = get(7) as String?

    open var staleId: String?
        set(value): Unit = set(8, value)
        get(): String? = get(8) as String?

    open var updatedBy: String?
        set(value): Unit = set(9, value)
        get(): String? = get(9) as String?

    open var experience: Double?
        set(value): Unit = set(10, value)
        get(): Double? = get(10) as Double?

    open var cmdocId: String?
        set(value): Unit = set(11, value)
        get(): String? = get(11) as String?

    open var updatedOn: OffsetDateTime?
        set(value): Unit = set(12, value)
        get(): OffsetDateTime? = get(12) as OffsetDateTime?

    open var comments: String?
        set(value): Unit = set(13, value)
        get(): String? = get(13) as String?

    open var createdOn: OffsetDateTime?
        set(value): Unit = set(14, value)
        get(): OffsetDateTime? = get(14) as OffsetDateTime?

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record1<String?> = super.key() as Record1<String?>

    // -------------------------------------------------------------------------
    // Record15 type implementation
    // -------------------------------------------------------------------------

    override fun fieldsRow(): Row15<String?, String?, String?, String?, Double?, String?, Boolean?, String?, String?, String?, Double?, String?, OffsetDateTime?, String?, OffsetDateTime?> = super.fieldsRow() as Row15<String?, String?, String?, String?, Double?, String?, Boolean?, String?, String?, String?, Double?, String?, OffsetDateTime?, String?, OffsetDateTime?>
    override fun valuesRow(): Row15<String?, String?, String?, String?, Double?, String?, Boolean?, String?, String?, String?, Double?, String?, OffsetDateTime?, String?, OffsetDateTime?> = super.valuesRow() as Row15<String?, String?, String?, String?, Double?, String?, Boolean?, String?, String?, String?, Double?, String?, OffsetDateTime?, String?, OffsetDateTime?>
    override fun field1(): Field<String?> = CmeFmvDetail.CME_FMV_DETAIL.HCP_SPECIALITY
    override fun field2(): Field<String?> = CmeFmvDetail.CME_FMV_DETAIL.ID
    override fun field3(): Field<String?> = CmeFmvDetail.CME_FMV_DETAIL.PLACE
    override fun field4(): Field<String?> = CmeFmvDetail.CME_FMV_DETAIL.CREATED_BY
    override fun field5(): Field<Double?> = CmeFmvDetail.CME_FMV_DETAIL.HOURLY_RATE
    override fun field6(): Field<String?> = CmeFmvDetail.CME_FMV_DETAIL.QUALIFICATION
    override fun field7(): Field<Boolean?> = CmeFmvDetail.CME_FMV_DETAIL.IS_CURRENT
    override fun field8(): Field<String?> = CmeFmvDetail.CME_FMV_DETAIL.TIER
    override fun field9(): Field<String?> = CmeFmvDetail.CME_FMV_DETAIL.STALE_ID
    override fun field10(): Field<String?> = CmeFmvDetail.CME_FMV_DETAIL.UPDATED_BY
    override fun field11(): Field<Double?> = CmeFmvDetail.CME_FMV_DETAIL.EXPERIENCE
    override fun field12(): Field<String?> = CmeFmvDetail.CME_FMV_DETAIL.CMDOC_ID
    override fun field13(): Field<OffsetDateTime?> = CmeFmvDetail.CME_FMV_DETAIL.UPDATED_ON
    override fun field14(): Field<String?> = CmeFmvDetail.CME_FMV_DETAIL.COMMENTS
    override fun field15(): Field<OffsetDateTime?> = CmeFmvDetail.CME_FMV_DETAIL.CREATED_ON
    override fun component1(): String? = hcpSpeciality
    override fun component2(): String? = id
    override fun component3(): String? = place
    override fun component4(): String? = createdBy
    override fun component5(): Double? = hourlyRate
    override fun component6(): String? = qualification
    override fun component7(): Boolean? = isCurrent
    override fun component8(): String? = tier
    override fun component9(): String? = staleId
    override fun component10(): String? = updatedBy
    override fun component11(): Double? = experience
    override fun component12(): String? = cmdocId
    override fun component13(): OffsetDateTime? = updatedOn
    override fun component14(): String? = comments
    override fun component15(): OffsetDateTime? = createdOn
    override fun value1(): String? = hcpSpeciality
    override fun value2(): String? = id
    override fun value3(): String? = place
    override fun value4(): String? = createdBy
    override fun value5(): Double? = hourlyRate
    override fun value6(): String? = qualification
    override fun value7(): Boolean? = isCurrent
    override fun value8(): String? = tier
    override fun value9(): String? = staleId
    override fun value10(): String? = updatedBy
    override fun value11(): Double? = experience
    override fun value12(): String? = cmdocId
    override fun value13(): OffsetDateTime? = updatedOn
    override fun value14(): String? = comments
    override fun value15(): OffsetDateTime? = createdOn

    override fun value1(value: String?): CmeFmvDetailRecord {
        this.hcpSpeciality = value
        return this
    }

    override fun value2(value: String?): CmeFmvDetailRecord {
        this.id = value
        return this
    }

    override fun value3(value: String?): CmeFmvDetailRecord {
        this.place = value
        return this
    }

    override fun value4(value: String?): CmeFmvDetailRecord {
        this.createdBy = value
        return this
    }

    override fun value5(value: Double?): CmeFmvDetailRecord {
        this.hourlyRate = value
        return this
    }

    override fun value6(value: String?): CmeFmvDetailRecord {
        this.qualification = value
        return this
    }

    override fun value7(value: Boolean?): CmeFmvDetailRecord {
        this.isCurrent = value
        return this
    }

    override fun value8(value: String?): CmeFmvDetailRecord {
        this.tier = value
        return this
    }

    override fun value9(value: String?): CmeFmvDetailRecord {
        this.staleId = value
        return this
    }

    override fun value10(value: String?): CmeFmvDetailRecord {
        this.updatedBy = value
        return this
    }

    override fun value11(value: Double?): CmeFmvDetailRecord {
        this.experience = value
        return this
    }

    override fun value12(value: String?): CmeFmvDetailRecord {
        this.cmdocId = value
        return this
    }

    override fun value13(value: OffsetDateTime?): CmeFmvDetailRecord {
        this.updatedOn = value
        return this
    }

    override fun value14(value: String?): CmeFmvDetailRecord {
        this.comments = value
        return this
    }

    override fun value15(value: OffsetDateTime?): CmeFmvDetailRecord {
        this.createdOn = value
        return this
    }

    override fun values(value1: String?, value2: String?, value3: String?, value4: String?, value5: Double?, value6: String?, value7: Boolean?, value8: String?, value9: String?, value10: String?, value11: Double?, value12: String?, value13: OffsetDateTime?, value14: String?, value15: OffsetDateTime?): CmeFmvDetailRecord {
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
     * Create a detached, initialised CmeFmvDetailRecord
     */
    constructor(hcpSpeciality: String? = null, id: String? = null, place: String? = null, createdBy: String? = null, hourlyRate: Double? = null, qualification: String? = null, isCurrent: Boolean? = null, tier: String? = null, staleId: String? = null, updatedBy: String? = null, experience: Double? = null, cmdocId: String? = null, updatedOn: OffsetDateTime? = null, comments: String? = null, createdOn: OffsetDateTime? = null): this() {
        this.hcpSpeciality = hcpSpeciality
        this.id = id
        this.place = place
        this.createdBy = createdBy
        this.hourlyRate = hourlyRate
        this.qualification = qualification
        this.isCurrent = isCurrent
        this.tier = tier
        this.staleId = staleId
        this.updatedBy = updatedBy
        this.experience = experience
        this.cmdocId = cmdocId
        this.updatedOn = updatedOn
        this.comments = comments
        this.createdOn = createdOn
    }
}
