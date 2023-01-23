/*
 * This file is generated by jOOQ.
 */
package com.squer.prorpel.jooq.tables.records


import com.squer.prorpel.jooq.tables.Event_10073776

import java.time.OffsetDateTime

import javax.annotation.processing.Generated

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
open class Event_10073776Record() : TableRecordImpl<Event_10073776Record>(Event_10073776.EVENT_10073776) {

    open var id: String?
        set(value): Unit = set(0, value)
        get(): String? = get(0) as String?

    open var doctors: Int?
        set(value): Unit = set(1, value)
        get(): Int? = get(1) as Int?

    open var supportStaff: Int?
        set(value): Unit = set(2, value)
        get(): Int? = get(2) as Int?

    open var approvalComment: String?
        set(value): Unit = set(3, value)
        get(): String? = get(3) as String?

    open var createdBy: String?
        set(value): Unit = set(4, value)
        get(): String? = get(4) as String?

    open var eventVenue: String?
        set(value): Unit = set(5, value)
        get(): String? = get(5) as String?

    open var noOfDoctor: Int?
        set(value): Unit = set(6, value)
        get(): Int? = get(6) as Int?

    open var eventDate: OffsetDateTime?
        set(value): Unit = set(7, value)
        get(): OffsetDateTime? = get(7) as OffsetDateTime?

    open var status: String?
        set(value): Unit = set(8, value)
        get(): String? = get(8) as String?

    open var others: Int?
        set(value): Unit = set(9, value)
        get(): Int? = get(9) as Int?

    open var staleId: String?
        set(value): Unit = set(10, value)
        get(): String? = get(10) as String?

    open var comment: String?
        set(value): Unit = set(11, value)
        get(): String? = get(11) as String?

    open var dne: Int?
        set(value): Unit = set(12, value)
        get(): Int? = get(12) as Int?

    open var groupId: String?
        set(value): Unit = set(13, value)
        get(): String? = get(13) as String?

    open var updatedBy: String?
        set(value): Unit = set(14, value)
        get(): String? = get(14) as String?

    open var actionBy: String?
        set(value): Unit = set(15, value)
        get(): String? = get(15) as String?

    open var currentStatus: String?
        set(value): Unit = set(16, value)
        get(): String? = get(16) as String?

    open var eventTopic: String?
        set(value): Unit = set(17, value)
        get(): String? = get(17) as String?

    open var updatedOn: OffsetDateTime?
        set(value): Unit = set(18, value)
        get(): OffsetDateTime? = get(18) as OffsetDateTime?

    open var createdOn: OffsetDateTime?
        set(value): Unit = set(19, value)
        get(): OffsetDateTime? = get(19) as OffsetDateTime?

    open var eventTypeId: String?
        set(value): Unit = set(20, value)
        get(): String? = get(20) as String?

    open var advancedRequest: Double?
        set(value): Unit = set(21, value)
        get(): Double? = get(21) as Double?

    open var eventNo: Int?
        set(value): Unit = set(22, value)
        get(): Int? = get(22) as Int?

    open var product: String?
        set(value): Unit = set(23, value)
        get(): String? = get(23) as String?

    open var percent: Double?
        set(value): Unit = set(24, value)
        get(): Double? = get(24) as Double?

    /**
     * Create a detached, initialised Event_10073776Record
     */
    constructor(id: String? = null, doctors: Int? = null, supportStaff: Int? = null, approvalComment: String? = null, createdBy: String? = null, eventVenue: String? = null, noOfDoctor: Int? = null, eventDate: OffsetDateTime? = null, status: String? = null, others: Int? = null, staleId: String? = null, comment: String? = null, dne: Int? = null, groupId: String? = null, updatedBy: String? = null, actionBy: String? = null, currentStatus: String? = null, eventTopic: String? = null, updatedOn: OffsetDateTime? = null, createdOn: OffsetDateTime? = null, eventTypeId: String? = null, advancedRequest: Double? = null, eventNo: Int? = null, product: String? = null, percent: Double? = null): this() {
        this.id = id
        this.doctors = doctors
        this.supportStaff = supportStaff
        this.approvalComment = approvalComment
        this.createdBy = createdBy
        this.eventVenue = eventVenue
        this.noOfDoctor = noOfDoctor
        this.eventDate = eventDate
        this.status = status
        this.others = others
        this.staleId = staleId
        this.comment = comment
        this.dne = dne
        this.groupId = groupId
        this.updatedBy = updatedBy
        this.actionBy = actionBy
        this.currentStatus = currentStatus
        this.eventTopic = eventTopic
        this.updatedOn = updatedOn
        this.createdOn = createdOn
        this.eventTypeId = eventTypeId
        this.advancedRequest = advancedRequest
        this.eventNo = eventNo
        this.product = product
        this.percent = percent
    }
}
