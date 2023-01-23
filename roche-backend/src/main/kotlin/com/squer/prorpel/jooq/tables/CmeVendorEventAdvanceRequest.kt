/*
 * This file is generated by jOOQ.
 */
package com.squer.prorpel.jooq.tables


import com.squer.prorpel.jooq.Public
import com.squer.prorpel.jooq.tables.records.CmeVendorEventAdvanceRequestRecord

import java.time.LocalDateTime
import java.time.OffsetDateTime
import java.util.function.Function

import javax.annotation.processing.Generated

import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.Name
import org.jooq.Record
import org.jooq.Records
import org.jooq.Row14
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
open class CmeVendorEventAdvanceRequest(
    alias: Name,
    child: Table<out Record>?,
    path: ForeignKey<out Record, CmeVendorEventAdvanceRequestRecord>?,
    aliased: Table<CmeVendorEventAdvanceRequestRecord>?,
    parameters: Array<Field<*>?>?
): TableImpl<CmeVendorEventAdvanceRequestRecord>(
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
         * The reference instance of
         * <code>public.cme_vendor_event_advance_request</code>
         */
        val CME_VENDOR_EVENT_ADVANCE_REQUEST: CmeVendorEventAdvanceRequest = CmeVendorEventAdvanceRequest()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<CmeVendorEventAdvanceRequestRecord> = CmeVendorEventAdvanceRequestRecord::class.java

    /**
     * The column <code>public.cme_vendor_event_advance_request.id</code>.
     */
    val ID: TableField<CmeVendorEventAdvanceRequestRecord, String?> = createField(DSL.name("id"), SQLDataType.CHAR(37), this, "")

    /**
     * The column <code>public.cme_vendor_event_advance_request.owner_id</code>.
     */
    val OWNER_ID: TableField<CmeVendorEventAdvanceRequestRecord, String?> = createField(DSL.name("owner_id"), SQLDataType.CHAR(37), this, "")

    /**
     * The column
     * <code>public.cme_vendor_event_advance_request.advanced_request</code>.
     */
    val ADVANCED_REQUEST: TableField<CmeVendorEventAdvanceRequestRecord, Double?> = createField(DSL.name("advanced_request"), SQLDataType.DOUBLE, this, "")

    /**
     * The column <code>public.cme_vendor_event_advance_request.type_id</code>.
     */
    val TYPE_ID: TableField<CmeVendorEventAdvanceRequestRecord, String?> = createField(DSL.name("type_id"), SQLDataType.CHAR(37), this, "")

    /**
     * The column
     * <code>public.cme_vendor_event_advance_request.vendor_id</code>.
     */
    val VENDOR_ID: TableField<CmeVendorEventAdvanceRequestRecord, String?> = createField(DSL.name("vendor_id"), SQLDataType.CHAR(37), this, "")

    /**
     * The column
     * <code>public.cme_vendor_event_advance_request.paid_advanced_request</code>.
     */
    val PAID_ADVANCED_REQUEST: TableField<CmeVendorEventAdvanceRequestRecord, Double?> = createField(DSL.name("paid_advanced_request"), SQLDataType.DOUBLE, this, "")

    /**
     * The column
     * <code>public.cme_vendor_event_advance_request.utr_number</code>.
     */
    val UTR_NUMBER: TableField<CmeVendorEventAdvanceRequestRecord, String?> = createField(DSL.name("utr_number"), SQLDataType.VARCHAR(25), this, "")

    /**
     * The column <code>public.cme_vendor_event_advance_request.utr_date</code>.
     */
    val UTR_DATE: TableField<CmeVendorEventAdvanceRequestRecord, LocalDateTime?> = createField(DSL.name("utr_date"), SQLDataType.LOCALDATETIME(6), this, "")

    /**
     * The column
     * <code>public.cme_vendor_event_advance_request.transaction_detail</code>.
     */
    val TRANSACTION_DETAIL: TableField<CmeVendorEventAdvanceRequestRecord, String?> = createField(DSL.name("transaction_detail"), SQLDataType.VARCHAR(255), this, "")

    /**
     * The column
     * <code>public.cme_vendor_event_advance_request.created_by</code>.
     */
    val CREATED_BY: TableField<CmeVendorEventAdvanceRequestRecord, String?> = createField(DSL.name("created_by"), SQLDataType.CHAR(37), this, "")

    /**
     * The column
     * <code>public.cme_vendor_event_advance_request.updated_on</code>.
     */
    val UPDATED_ON: TableField<CmeVendorEventAdvanceRequestRecord, OffsetDateTime?> = createField(DSL.name("updated_on"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "")

    /**
     * The column
     * <code>public.cme_vendor_event_advance_request.created_on</code>.
     */
    val CREATED_ON: TableField<CmeVendorEventAdvanceRequestRecord, OffsetDateTime?> = createField(DSL.name("created_on"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "")

    /**
     * The column
     * <code>public.cme_vendor_event_advance_request.updated_by</code>.
     */
    val UPDATED_BY: TableField<CmeVendorEventAdvanceRequestRecord, String?> = createField(DSL.name("updated_by"), SQLDataType.CHAR(37), this, "")

    /**
     * The column <code>public.cme_vendor_event_advance_request.stale_id</code>.
     */
    val STALE_ID: TableField<CmeVendorEventAdvanceRequestRecord, String?> = createField(DSL.name("stale_id"), SQLDataType.VARCHAR(255), this, "")

    private constructor(alias: Name, aliased: Table<CmeVendorEventAdvanceRequestRecord>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<CmeVendorEventAdvanceRequestRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>public.cme_vendor_event_advance_request</code>
     * table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>public.cme_vendor_event_advance_request</code>
     * table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>public.cme_vendor_event_advance_request</code> table
     * reference
     */
    constructor(): this(DSL.name("cme_vendor_event_advance_request"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, CmeVendorEventAdvanceRequestRecord>): this(Internal.createPathAlias(child, key), child, key, CME_VENDOR_EVENT_ADVANCE_REQUEST, null)
    override fun getSchema(): Schema? = if (aliased()) null else Public.PUBLIC
    override fun `as`(alias: String): CmeVendorEventAdvanceRequest = CmeVendorEventAdvanceRequest(DSL.name(alias), this)
    override fun `as`(alias: Name): CmeVendorEventAdvanceRequest = CmeVendorEventAdvanceRequest(alias, this)
    override fun `as`(alias: Table<*>): CmeVendorEventAdvanceRequest = CmeVendorEventAdvanceRequest(alias.getQualifiedName(), this)

    /**
     * Rename this table
     */
    override fun rename(name: String): CmeVendorEventAdvanceRequest = CmeVendorEventAdvanceRequest(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): CmeVendorEventAdvanceRequest = CmeVendorEventAdvanceRequest(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): CmeVendorEventAdvanceRequest = CmeVendorEventAdvanceRequest(name.getQualifiedName(), null)

    // -------------------------------------------------------------------------
    // Row14 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row14<String?, String?, Double?, String?, String?, Double?, String?, LocalDateTime?, String?, String?, OffsetDateTime?, OffsetDateTime?, String?, String?> = super.fieldsRow() as Row14<String?, String?, Double?, String?, String?, Double?, String?, LocalDateTime?, String?, String?, OffsetDateTime?, OffsetDateTime?, String?, String?>

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    fun <U> mapping(from: (String?, String?, Double?, String?, String?, Double?, String?, LocalDateTime?, String?, String?, OffsetDateTime?, OffsetDateTime?, String?, String?) -> U): SelectField<U> = convertFrom(Records.mapping(from))

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    fun <U> mapping(toType: Class<U>, from: (String?, String?, Double?, String?, String?, Double?, String?, LocalDateTime?, String?, String?, OffsetDateTime?, OffsetDateTime?, String?, String?) -> U): SelectField<U> = convertFrom(toType, Records.mapping(from))
}
