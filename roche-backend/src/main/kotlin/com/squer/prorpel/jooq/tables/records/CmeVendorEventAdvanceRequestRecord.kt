/*
 * This file is generated by jOOQ.
 */
package com.squer.prorpel.jooq.tables.records


import com.squer.prorpel.jooq.tables.CmeVendorEventAdvanceRequest

import java.time.LocalDateTime
import java.time.OffsetDateTime

import javax.annotation.processing.Generated

import org.jooq.Field
import org.jooq.Record14
import org.jooq.Row14
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
open class CmeVendorEventAdvanceRequestRecord() : TableRecordImpl<CmeVendorEventAdvanceRequestRecord>(CmeVendorEventAdvanceRequest.CME_VENDOR_EVENT_ADVANCE_REQUEST), Record14<String?, String?, Double?, String?, String?, Double?, String?, LocalDateTime?, String?, String?, OffsetDateTime?, OffsetDateTime?, String?, String?> {

    open var id: String?
        set(value): Unit = set(0, value)
        get(): String? = get(0) as String?

    open var ownerId: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

    open var advancedRequest: Double?
        set(value): Unit = set(2, value)
        get(): Double? = get(2) as Double?

    open var typeId: String?
        set(value): Unit = set(3, value)
        get(): String? = get(3) as String?

    open var vendorId: String?
        set(value): Unit = set(4, value)
        get(): String? = get(4) as String?

    open var paidAdvancedRequest: Double?
        set(value): Unit = set(5, value)
        get(): Double? = get(5) as Double?

    open var utrNumber: String?
        set(value): Unit = set(6, value)
        get(): String? = get(6) as String?

    open var utrDate: LocalDateTime?
        set(value): Unit = set(7, value)
        get(): LocalDateTime? = get(7) as LocalDateTime?

    open var transactionDetail: String?
        set(value): Unit = set(8, value)
        get(): String? = get(8) as String?

    open var createdBy: String?
        set(value): Unit = set(9, value)
        get(): String? = get(9) as String?

    open var updatedOn: OffsetDateTime?
        set(value): Unit = set(10, value)
        get(): OffsetDateTime? = get(10) as OffsetDateTime?

    open var createdOn: OffsetDateTime?
        set(value): Unit = set(11, value)
        get(): OffsetDateTime? = get(11) as OffsetDateTime?

    open var updatedBy: String?
        set(value): Unit = set(12, value)
        get(): String? = get(12) as String?

    open var staleId: String?
        set(value): Unit = set(13, value)
        get(): String? = get(13) as String?

    // -------------------------------------------------------------------------
    // Record14 type implementation
    // -------------------------------------------------------------------------

    override fun fieldsRow(): Row14<String?, String?, Double?, String?, String?, Double?, String?, LocalDateTime?, String?, String?, OffsetDateTime?, OffsetDateTime?, String?, String?> = super.fieldsRow() as Row14<String?, String?, Double?, String?, String?, Double?, String?, LocalDateTime?, String?, String?, OffsetDateTime?, OffsetDateTime?, String?, String?>
    override fun valuesRow(): Row14<String?, String?, Double?, String?, String?, Double?, String?, LocalDateTime?, String?, String?, OffsetDateTime?, OffsetDateTime?, String?, String?> = super.valuesRow() as Row14<String?, String?, Double?, String?, String?, Double?, String?, LocalDateTime?, String?, String?, OffsetDateTime?, OffsetDateTime?, String?, String?>
    override fun field1(): Field<String?> = CmeVendorEventAdvanceRequest.CME_VENDOR_EVENT_ADVANCE_REQUEST.ID
    override fun field2(): Field<String?> = CmeVendorEventAdvanceRequest.CME_VENDOR_EVENT_ADVANCE_REQUEST.OWNER_ID
    override fun field3(): Field<Double?> = CmeVendorEventAdvanceRequest.CME_VENDOR_EVENT_ADVANCE_REQUEST.ADVANCED_REQUEST
    override fun field4(): Field<String?> = CmeVendorEventAdvanceRequest.CME_VENDOR_EVENT_ADVANCE_REQUEST.TYPE_ID
    override fun field5(): Field<String?> = CmeVendorEventAdvanceRequest.CME_VENDOR_EVENT_ADVANCE_REQUEST.VENDOR_ID
    override fun field6(): Field<Double?> = CmeVendorEventAdvanceRequest.CME_VENDOR_EVENT_ADVANCE_REQUEST.PAID_ADVANCED_REQUEST
    override fun field7(): Field<String?> = CmeVendorEventAdvanceRequest.CME_VENDOR_EVENT_ADVANCE_REQUEST.UTR_NUMBER
    override fun field8(): Field<LocalDateTime?> = CmeVendorEventAdvanceRequest.CME_VENDOR_EVENT_ADVANCE_REQUEST.UTR_DATE
    override fun field9(): Field<String?> = CmeVendorEventAdvanceRequest.CME_VENDOR_EVENT_ADVANCE_REQUEST.TRANSACTION_DETAIL
    override fun field10(): Field<String?> = CmeVendorEventAdvanceRequest.CME_VENDOR_EVENT_ADVANCE_REQUEST.CREATED_BY
    override fun field11(): Field<OffsetDateTime?> = CmeVendorEventAdvanceRequest.CME_VENDOR_EVENT_ADVANCE_REQUEST.UPDATED_ON
    override fun field12(): Field<OffsetDateTime?> = CmeVendorEventAdvanceRequest.CME_VENDOR_EVENT_ADVANCE_REQUEST.CREATED_ON
    override fun field13(): Field<String?> = CmeVendorEventAdvanceRequest.CME_VENDOR_EVENT_ADVANCE_REQUEST.UPDATED_BY
    override fun field14(): Field<String?> = CmeVendorEventAdvanceRequest.CME_VENDOR_EVENT_ADVANCE_REQUEST.STALE_ID
    override fun component1(): String? = id
    override fun component2(): String? = ownerId
    override fun component3(): Double? = advancedRequest
    override fun component4(): String? = typeId
    override fun component5(): String? = vendorId
    override fun component6(): Double? = paidAdvancedRequest
    override fun component7(): String? = utrNumber
    override fun component8(): LocalDateTime? = utrDate
    override fun component9(): String? = transactionDetail
    override fun component10(): String? = createdBy
    override fun component11(): OffsetDateTime? = updatedOn
    override fun component12(): OffsetDateTime? = createdOn
    override fun component13(): String? = updatedBy
    override fun component14(): String? = staleId
    override fun value1(): String? = id
    override fun value2(): String? = ownerId
    override fun value3(): Double? = advancedRequest
    override fun value4(): String? = typeId
    override fun value5(): String? = vendorId
    override fun value6(): Double? = paidAdvancedRequest
    override fun value7(): String? = utrNumber
    override fun value8(): LocalDateTime? = utrDate
    override fun value9(): String? = transactionDetail
    override fun value10(): String? = createdBy
    override fun value11(): OffsetDateTime? = updatedOn
    override fun value12(): OffsetDateTime? = createdOn
    override fun value13(): String? = updatedBy
    override fun value14(): String? = staleId

    override fun value1(value: String?): CmeVendorEventAdvanceRequestRecord {
        this.id = value
        return this
    }

    override fun value2(value: String?): CmeVendorEventAdvanceRequestRecord {
        this.ownerId = value
        return this
    }

    override fun value3(value: Double?): CmeVendorEventAdvanceRequestRecord {
        this.advancedRequest = value
        return this
    }

    override fun value4(value: String?): CmeVendorEventAdvanceRequestRecord {
        this.typeId = value
        return this
    }

    override fun value5(value: String?): CmeVendorEventAdvanceRequestRecord {
        this.vendorId = value
        return this
    }

    override fun value6(value: Double?): CmeVendorEventAdvanceRequestRecord {
        this.paidAdvancedRequest = value
        return this
    }

    override fun value7(value: String?): CmeVendorEventAdvanceRequestRecord {
        this.utrNumber = value
        return this
    }

    override fun value8(value: LocalDateTime?): CmeVendorEventAdvanceRequestRecord {
        this.utrDate = value
        return this
    }

    override fun value9(value: String?): CmeVendorEventAdvanceRequestRecord {
        this.transactionDetail = value
        return this
    }

    override fun value10(value: String?): CmeVendorEventAdvanceRequestRecord {
        this.createdBy = value
        return this
    }

    override fun value11(value: OffsetDateTime?): CmeVendorEventAdvanceRequestRecord {
        this.updatedOn = value
        return this
    }

    override fun value12(value: OffsetDateTime?): CmeVendorEventAdvanceRequestRecord {
        this.createdOn = value
        return this
    }

    override fun value13(value: String?): CmeVendorEventAdvanceRequestRecord {
        this.updatedBy = value
        return this
    }

    override fun value14(value: String?): CmeVendorEventAdvanceRequestRecord {
        this.staleId = value
        return this
    }

    override fun values(value1: String?, value2: String?, value3: Double?, value4: String?, value5: String?, value6: Double?, value7: String?, value8: LocalDateTime?, value9: String?, value10: String?, value11: OffsetDateTime?, value12: OffsetDateTime?, value13: String?, value14: String?): CmeVendorEventAdvanceRequestRecord {
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
     * Create a detached, initialised CmeVendorEventAdvanceRequestRecord
     */
    constructor(id: String? = null, ownerId: String? = null, advancedRequest: Double? = null, typeId: String? = null, vendorId: String? = null, paidAdvancedRequest: Double? = null, utrNumber: String? = null, utrDate: LocalDateTime? = null, transactionDetail: String? = null, createdBy: String? = null, updatedOn: OffsetDateTime? = null, createdOn: OffsetDateTime? = null, updatedBy: String? = null, staleId: String? = null): this() {
        this.id = id
        this.ownerId = ownerId
        this.advancedRequest = advancedRequest
        this.typeId = typeId
        this.vendorId = vendorId
        this.paidAdvancedRequest = paidAdvancedRequest
        this.utrNumber = utrNumber
        this.utrDate = utrDate
        this.transactionDetail = transactionDetail
        this.createdBy = createdBy
        this.updatedOn = updatedOn
        this.createdOn = createdOn
        this.updatedBy = updatedBy
        this.staleId = staleId
    }
}
