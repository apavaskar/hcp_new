/*
 * This file is generated by jOOQ.
 */
package com.squer.prorpel.jooq.tables.records


import com.squer.prorpel.jooq.tables.CmeEventSpeaker

import javax.annotation.processing.Generated

import org.jooq.Field
import org.jooq.Record2
import org.jooq.Row2
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
open class CmeEventSpeakerRecord() : TableRecordImpl<CmeEventSpeakerRecord>(CmeEventSpeaker.CME_EVENT_SPEAKER), Record2<String?, String?> {

    open var eventId: String?
        set(value): Unit = set(0, value)
        get(): String? = get(0) as String?

    open var speakerId: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    override fun fieldsRow(): Row2<String?, String?> = super.fieldsRow() as Row2<String?, String?>
    override fun valuesRow(): Row2<String?, String?> = super.valuesRow() as Row2<String?, String?>
    override fun field1(): Field<String?> = CmeEventSpeaker.CME_EVENT_SPEAKER.EVENT_ID
    override fun field2(): Field<String?> = CmeEventSpeaker.CME_EVENT_SPEAKER.SPEAKER_ID
    override fun component1(): String? = eventId
    override fun component2(): String? = speakerId
    override fun value1(): String? = eventId
    override fun value2(): String? = speakerId

    override fun value1(value: String?): CmeEventSpeakerRecord {
        this.eventId = value
        return this
    }

    override fun value2(value: String?): CmeEventSpeakerRecord {
        this.speakerId = value
        return this
    }

    override fun values(value1: String?, value2: String?): CmeEventSpeakerRecord {
        this.value1(value1)
        this.value2(value2)
        return this
    }

    /**
     * Create a detached, initialised CmeEventSpeakerRecord
     */
    constructor(eventId: String? = null, speakerId: String? = null): this() {
        this.eventId = eventId
        this.speakerId = speakerId
    }
}