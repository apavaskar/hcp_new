/*
 * This file is generated by jOOQ.
 */
package com.squer.prorpel.jooq.tables


import com.squer.prorpel.jooq.Public
import com.squer.prorpel.jooq.tables.records.CmeEventSpeakerRecord

import java.util.function.Function

import javax.annotation.processing.Generated

import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.Name
import org.jooq.Record
import org.jooq.Records
import org.jooq.Row2
import org.jooq.Schema
import org.jooq.SelectField
import org.jooq.Table
import org.jooq.TableField
import org.jooq.TableOptions
import org.jooq.impl.DSL
import org.jooq.impl.Internal
import org.jooq.impl.SQLDataType
import org.jooq.impl.TableImpl


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
open class CmeEventSpeaker(
    alias: Name,
    child: Table<out Record>?,
    path: ForeignKey<out Record, CmeEventSpeakerRecord>?,
    aliased: Table<CmeEventSpeakerRecord>?,
    parameters: Array<Field<*>?>?
): TableImpl<CmeEventSpeakerRecord>(
    alias,
    Public.PUBLIC,
    child,
    path,
    aliased,
    parameters,
    DSL.comment(""),
    TableOptions.table()
) {
    companion object {

        /**
         * The reference instance of <code>public.cme_event_speaker</code>
         */
        val CME_EVENT_SPEAKER: CmeEventSpeaker = CmeEventSpeaker()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<CmeEventSpeakerRecord> = CmeEventSpeakerRecord::class.java

    /**
     * The column <code>public.cme_event_speaker.event_id</code>.
     */
    val EVENT_ID: TableField<CmeEventSpeakerRecord, String?> = createField(DSL.name("event_id"), SQLDataType.CHAR(37), this, "")

    /**
     * The column <code>public.cme_event_speaker.speaker_id</code>.
     */
    val SPEAKER_ID: TableField<CmeEventSpeakerRecord, String?> = createField(DSL.name("speaker_id"), SQLDataType.CHAR(37), this, "")

    private constructor(alias: Name, aliased: Table<CmeEventSpeakerRecord>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<CmeEventSpeakerRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>public.cme_event_speaker</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>public.cme_event_speaker</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>public.cme_event_speaker</code> table reference
     */
    constructor(): this(DSL.name("cme_event_speaker"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, CmeEventSpeakerRecord>): this(Internal.createPathAlias(child, key), child, key, CME_EVENT_SPEAKER, null)
    override fun getSchema(): Schema? = if (aliased()) null else Public.PUBLIC
    override fun `as`(alias: String): CmeEventSpeaker = CmeEventSpeaker(DSL.name(alias), this)
    override fun `as`(alias: Name): CmeEventSpeaker = CmeEventSpeaker(alias, this)
    override fun `as`(alias: Table<*>): CmeEventSpeaker = CmeEventSpeaker(alias.getQualifiedName(), this)

    /**
     * Rename this table
     */
    override fun rename(name: String): CmeEventSpeaker = CmeEventSpeaker(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): CmeEventSpeaker = CmeEventSpeaker(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): CmeEventSpeaker = CmeEventSpeaker(name.getQualifiedName(), null)

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row2<String?, String?> = super.fieldsRow() as Row2<String?, String?>

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    fun <U> mapping(from: (String?, String?) -> U): SelectField<U> = convertFrom(Records.mapping(from))

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    fun <U> mapping(toType: Class<U>, from: (String?, String?) -> U): SelectField<U> = convertFrom(toType, Records.mapping(from))
}
