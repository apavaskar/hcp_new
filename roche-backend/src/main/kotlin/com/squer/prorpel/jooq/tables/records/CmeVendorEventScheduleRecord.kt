/*
 * This file is generated by jOOQ.
 */
package com.squer.prorpel.jooq.tables.records


import com.squer.prorpel.jooq.tables.CmeVendorEventSchedule

import java.time.OffsetDateTime

import javax.annotation.processing.Generated

import org.jooq.Field
import org.jooq.Record11
import org.jooq.Row11
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
open class CmeVendorEventScheduleRecord() : TableRecordImpl<CmeVendorEventScheduleRecord>(CmeVendorEventSchedule.CME_VENDOR_EVENT_SCHEDULE), Record11<String?, String?, String?, String?, String?, OffsetDateTime?, OffsetDateTime?, OffsetDateTime?, String?, String?, String?> {

    open var id: String?
        set(value): Unit = set(0, value)
        get(): String? = get(0) as String?

    open var updatedBy: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

    open var eventId: String?
        set(value): Unit = set(2, value)
        get(): String? = get(2) as String?

    open var createdBy: String?
        set(value): Unit = set(3, value)
        get(): String? = get(3) as String?

    open var eventVenue: String?
        set(value): Unit = set(4, value)
        get(): String? = get(4) as String?

    open var eventDate: OffsetDateTime?
        set(value): Unit = set(5, value)
        get(): OffsetDateTime? = get(5) as OffsetDateTime?

    open var updatedOn: OffsetDateTime?
        set(value): Unit = set(6, value)
        get(): OffsetDateTime? = get(6) as OffsetDateTime?

    open var createdOn: OffsetDateTime?
        set(value): Unit = set(7, value)
        get(): OffsetDateTime? = get(7) as OffsetDateTime?

    open var staleId: String?
        set(value): Unit = set(8, value)
        get(): String? = get(8) as String?

    open var eventTopic: String?
        set(value): Unit = set(9, value)
        get(): String? = get(9) as String?

    open var inviteType: String?
        set(value): Unit = set(10, value)
        get(): String? = get(10) as String?

    // -------------------------------------------------------------------------
    // Record11 type implementation
    // -------------------------------------------------------------------------

    override fun fieldsRow(): Row11<String?, String?, String?, String?, String?, OffsetDateTime?, OffsetDateTime?, OffsetDateTime?, String?, String?, String?> = super.fieldsRow() as Row11<String?, String?, String?, String?, String?, OffsetDateTime?, OffsetDateTime?, OffsetDateTime?, String?, String?, String?>
    override fun valuesRow(): Row11<String?, String?, String?, String?, String?, OffsetDateTime?, OffsetDateTime?, OffsetDateTime?, String?, String?, String?> = super.valuesRow() as Row11<String?, String?, String?, String?, String?, OffsetDateTime?, OffsetDateTime?, OffsetDateTime?, String?, String?, String?>
    override fun field1(): Field<String?> = CmeVendorEventSchedule.CME_VENDOR_EVENT_SCHEDULE.ID
    override fun field2(): Field<String?> = CmeVendorEventSchedule.CME_VENDOR_EVENT_SCHEDULE.UPDATED_BY
    override fun field3(): Field<String?> = CmeVendorEventSchedule.CME_VENDOR_EVENT_SCHEDULE.EVENT_ID
    override fun field4(): Field<String?> = CmeVendorEventSchedule.CME_VENDOR_EVENT_SCHEDULE.CREATED_BY
    override fun field5(): Field<String?> = CmeVendorEventSchedule.CME_VENDOR_EVENT_SCHEDULE.EVENT_VENUE
    override fun field6(): Field<OffsetDateTime?> = CmeVendorEventSchedule.CME_VENDOR_EVENT_SCHEDULE.EVENT_DATE
    override fun field7(): Field<OffsetDateTime?> = CmeVendorEventSchedule.CME_VENDOR_EVENT_SCHEDULE.UPDATED_ON
    override fun field8(): Field<OffsetDateTime?> = CmeVendorEventSchedule.CME_VENDOR_EVENT_SCHEDULE.CREATED_ON
    override fun field9(): Field<String?> = CmeVendorEventSchedule.CME_VENDOR_EVENT_SCHEDULE.STALE_ID
    override fun field10(): Field<String?> = CmeVendorEventSchedule.CME_VENDOR_EVENT_SCHEDULE.EVENT_TOPIC
    override fun field11(): Field<String?> = CmeVendorEventSchedule.CME_VENDOR_EVENT_SCHEDULE.INVITE_TYPE
    override fun component1(): String? = id
    override fun component2(): String? = updatedBy
    override fun component3(): String? = eventId
    override fun component4(): String? = createdBy
    override fun component5(): String? = eventVenue
    override fun component6(): OffsetDateTime? = eventDate
    override fun component7(): OffsetDateTime? = updatedOn
    override fun component8(): OffsetDateTime? = createdOn
    override fun component9(): String? = staleId
    override fun component10(): String? = eventTopic
    override fun component11(): String? = inviteType
    override fun value1(): String? = id
    override fun value2(): String? = updatedBy
    override fun value3(): String? = eventId
    override fun value4(): String? = createdBy
    override fun value5(): String? = eventVenue
    override fun value6(): OffsetDateTime? = eventDate
    override fun value7(): OffsetDateTime? = updatedOn
    override fun value8(): OffsetDateTime? = createdOn
    override fun value9(): String? = staleId
    override fun value10(): String? = eventTopic
    override fun value11(): String? = inviteType

    override fun value1(value: String?): CmeVendorEventScheduleRecord {
        this.id = value
        return this
    }

    override fun value2(value: String?): CmeVendorEventScheduleRecord {
        this.updatedBy = value
        return this
    }

    override fun value3(value: String?): CmeVendorEventScheduleRecord {
        this.eventId = value
        return this
    }

    override fun value4(value: String?): CmeVendorEventScheduleRecord {
        this.createdBy = value
        return this
    }

    override fun value5(value: String?): CmeVendorEventScheduleRecord {
        this.eventVenue = value
        return this
    }

    override fun value6(value: OffsetDateTime?): CmeVendorEventScheduleRecord {
        this.eventDate = value
        return this
    }

    override fun value7(value: OffsetDateTime?): CmeVendorEventScheduleRecord {
        this.updatedOn = value
        return this
    }

    override fun value8(value: OffsetDateTime?): CmeVendorEventScheduleRecord {
        this.createdOn = value
        return this
    }

    override fun value9(value: String?): CmeVendorEventScheduleRecord {
        this.staleId = value
        return this
    }

    override fun value10(value: String?): CmeVendorEventScheduleRecord {
        this.eventTopic = value
        return this
    }

    override fun value11(value: String?): CmeVendorEventScheduleRecord {
        this.inviteType = value
        return this
    }

    override fun values(value1: String?, value2: String?, value3: String?, value4: String?, value5: String?, value6: OffsetDateTime?, value7: OffsetDateTime?, value8: OffsetDateTime?, value9: String?, value10: String?, value11: String?): CmeVendorEventScheduleRecord {
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
        return this
    }

    /**
     * Create a detached, initialised CmeVendorEventScheduleRecord
     */
    constructor(id: String? = null, updatedBy: String? = null, eventId: String? = null, createdBy: String? = null, eventVenue: String? = null, eventDate: OffsetDateTime? = null, updatedOn: OffsetDateTime? = null, createdOn: OffsetDateTime? = null, staleId: String? = null, eventTopic: String? = null, inviteType: String? = null): this() {
        this.id = id
        this.updatedBy = updatedBy
        this.eventId = eventId
        this.createdBy = createdBy
        this.eventVenue = eventVenue
        this.eventDate = eventDate
        this.updatedOn = updatedOn
        this.createdOn = createdOn
        this.staleId = staleId
        this.eventTopic = eventTopic
        this.inviteType = inviteType
    }
}
