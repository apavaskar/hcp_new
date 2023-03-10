/*
 * This file is generated by jOOQ.
 */
package com.squer.prorpel.jooq.tables


import com.squer.prorpel.jooq.Public
import com.squer.prorpel.jooq.keys.CME_SPEAKER_STAY_PKEY
import com.squer.prorpel.jooq.tables.records.CmeSpeakerStayRecord

import java.time.OffsetDateTime
import java.util.function.Function

import javax.annotation.processing.Generated

import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.Name
import org.jooq.Record
import org.jooq.Records
import org.jooq.Row12
import org.jooq.Schema
import org.jooq.SelectField
import org.jooq.Table
import org.jooq.TableField
import org.jooq.TableOptions
import org.jooq.UniqueKey
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
open class CmeSpeakerStay(
    alias: Name,
    child: Table<out Record>?,
    path: ForeignKey<out Record, CmeSpeakerStayRecord>?,
    aliased: Table<CmeSpeakerStayRecord>?,
    parameters: Array<Field<*>?>?
): TableImpl<CmeSpeakerStayRecord>(
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
         * The reference instance of <code>public.cme_speaker_stay</code>
         */
        val CME_SPEAKER_STAY: CmeSpeakerStay = CmeSpeakerStay()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<CmeSpeakerStayRecord> = CmeSpeakerStayRecord::class.java

    /**
     * The column <code>public.cme_speaker_stay.updated_on</code>.
     */
    val UPDATED_ON: TableField<CmeSpeakerStayRecord, OffsetDateTime?> = createField(DSL.name("updated_on"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "")

    /**
     * The column <code>public.cme_speaker_stay.created_on</code>.
     */
    val CREATED_ON: TableField<CmeSpeakerStayRecord, OffsetDateTime?> = createField(DSL.name("created_on"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "")

    /**
     * The column <code>public.cme_speaker_stay.stay_details</code>.
     */
    val STAY_DETAILS: TableField<CmeSpeakerStayRecord, String?> = createField(DSL.name("stay_details"), SQLDataType.VARCHAR(255), this, "")

    /**
     * The column <code>public.cme_speaker_stay.updated_by</code>.
     */
    val UPDATED_BY: TableField<CmeSpeakerStayRecord, String?> = createField(DSL.name("updated_by"), SQLDataType.CHAR(37), this, "")

    /**
     * The column <code>public.cme_speaker_stay.hotel_name</code>.
     */
    val HOTEL_NAME: TableField<CmeSpeakerStayRecord, String?> = createField(DSL.name("hotel_name"), SQLDataType.VARCHAR(255), this, "")

    /**
     * The column <code>public.cme_speaker_stay.stale_id</code>.
     */
    val STALE_ID: TableField<CmeSpeakerStayRecord, Long?> = createField(DSL.name("stale_id"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>public.cme_speaker_stay.hotel_grade</code>.
     */
    val HOTEL_GRADE: TableField<CmeSpeakerStayRecord, String?> = createField(DSL.name("hotel_grade"), SQLDataType.VARCHAR(25), this, "")

    /**
     * The column <code>public.cme_speaker_stay.room_cost</code>.
     */
    val ROOM_COST: TableField<CmeSpeakerStayRecord, Double?> = createField(DSL.name("room_cost"), SQLDataType.DOUBLE, this, "")

    /**
     * The column <code>public.cme_speaker_stay.id</code>.
     */
    val ID: TableField<CmeSpeakerStayRecord, String?> = createField(DSL.name("id"), SQLDataType.CHAR(37).nullable(false), this, "")

    /**
     * The column <code>public.cme_speaker_stay.occupancy</code>.
     */
    val OCCUPANCY: TableField<CmeSpeakerStayRecord, Int?> = createField(DSL.name("occupancy"), SQLDataType.INTEGER, this, "")

    /**
     * The column <code>public.cme_speaker_stay.address</code>.
     */
    val ADDRESS: TableField<CmeSpeakerStayRecord, String?> = createField(DSL.name("address"), SQLDataType.VARCHAR(255), this, "")

    /**
     * The column <code>public.cme_speaker_stay.created_by</code>.
     */
    val CREATED_BY: TableField<CmeSpeakerStayRecord, String?> = createField(DSL.name("created_by"), SQLDataType.CHAR(37), this, "")

    private constructor(alias: Name, aliased: Table<CmeSpeakerStayRecord>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<CmeSpeakerStayRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>public.cme_speaker_stay</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>public.cme_speaker_stay</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>public.cme_speaker_stay</code> table reference
     */
    constructor(): this(DSL.name("cme_speaker_stay"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, CmeSpeakerStayRecord>): this(Internal.createPathAlias(child, key), child, key, CME_SPEAKER_STAY, null)
    override fun getSchema(): Schema? = if (aliased()) null else Public.PUBLIC
    override fun getPrimaryKey(): UniqueKey<CmeSpeakerStayRecord> = CME_SPEAKER_STAY_PKEY
    override fun `as`(alias: String): CmeSpeakerStay = CmeSpeakerStay(DSL.name(alias), this)
    override fun `as`(alias: Name): CmeSpeakerStay = CmeSpeakerStay(alias, this)
    override fun `as`(alias: Table<*>): CmeSpeakerStay = CmeSpeakerStay(alias.getQualifiedName(), this)

    /**
     * Rename this table
     */
    override fun rename(name: String): CmeSpeakerStay = CmeSpeakerStay(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): CmeSpeakerStay = CmeSpeakerStay(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): CmeSpeakerStay = CmeSpeakerStay(name.getQualifiedName(), null)

    // -------------------------------------------------------------------------
    // Row12 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row12<OffsetDateTime?, OffsetDateTime?, String?, String?, String?, Long?, String?, Double?, String?, Int?, String?, String?> = super.fieldsRow() as Row12<OffsetDateTime?, OffsetDateTime?, String?, String?, String?, Long?, String?, Double?, String?, Int?, String?, String?>

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    fun <U> mapping(from: (OffsetDateTime?, OffsetDateTime?, String?, String?, String?, Long?, String?, Double?, String?, Int?, String?, String?) -> U): SelectField<U> = convertFrom(Records.mapping(from))

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    fun <U> mapping(toType: Class<U>, from: (OffsetDateTime?, OffsetDateTime?, String?, String?, String?, Long?, String?, Double?, String?, Int?, String?, String?) -> U): SelectField<U> = convertFrom(toType, Records.mapping(from))
}
