/*
 * This file is generated by jOOQ.
 */
package com.squer.prorpel.jooq.tables


import com.squer.prorpel.jooq.Public
import com.squer.prorpel.jooq.tables.records.CmeDigiDocumentRecord

import java.time.OffsetDateTime
import java.util.function.Function

import javax.annotation.processing.Generated

import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.Name
import org.jooq.Record
import org.jooq.Records
import org.jooq.Row13
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
open class CmeDigiDocument(
    alias: Name,
    child: Table<out Record>?,
    path: ForeignKey<out Record, CmeDigiDocumentRecord>?,
    aliased: Table<CmeDigiDocumentRecord>?,
    parameters: Array<Field<*>?>?
): TableImpl<CmeDigiDocumentRecord>(
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
         * The reference instance of <code>public.cme_digi_document</code>
         */
        val CME_DIGI_DOCUMENT: CmeDigiDocument = CmeDigiDocument()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<CmeDigiDocumentRecord> = CmeDigiDocumentRecord::class.java

    /**
     * The column <code>public.cme_digi_document.id</code>.
     */
    val ID: TableField<CmeDigiDocumentRecord, String?> = createField(DSL.name("id"), SQLDataType.CHAR(37), this, "")

    /**
     * The column <code>public.cme_digi_document.event_id</code>.
     */
    val EVENT_ID: TableField<CmeDigiDocumentRecord, String?> = createField(DSL.name("event_id"), SQLDataType.CHAR(37), this, "")

    /**
     * The column <code>public.cme_digi_document.request_id</code>.
     */
    val REQUEST_ID: TableField<CmeDigiDocumentRecord, String?> = createField(DSL.name("request_id"), SQLDataType.VARCHAR(100), this, "")

    /**
     * The column <code>public.cme_digi_document.gm_id</code>.
     */
    val GM_ID: TableField<CmeDigiDocumentRecord, String?> = createField(DSL.name("gm_id"), SQLDataType.VARCHAR(100), this, "")

    /**
     * The column <code>public.cme_digi_document.dr_id</code>.
     */
    val DR_ID: TableField<CmeDigiDocumentRecord, String?> = createField(DSL.name("dr_id"), SQLDataType.VARCHAR(100), this, "")

    /**
     * The column <code>public.cme_digi_document.document_id</code>.
     */
    val DOCUMENT_ID: TableField<CmeDigiDocumentRecord, String?> = createField(DSL.name("document_id"), SQLDataType.VARCHAR(100), this, "")

    /**
     * The column <code>public.cme_digi_document.title</code>.
     */
    val TITLE: TableField<CmeDigiDocumentRecord, String?> = createField(DSL.name("title"), SQLDataType.VARCHAR(255), this, "")

    /**
     * The column <code>public.cme_digi_document.is_completed</code>.
     */
    val IS_COMPLETED: TableField<CmeDigiDocumentRecord, Boolean?> = createField(DSL.name("is_completed"), SQLDataType.BOOLEAN, this, "")

    /**
     * The column <code>public.cme_digi_document.updated_on</code>.
     */
    val UPDATED_ON: TableField<CmeDigiDocumentRecord, OffsetDateTime?> = createField(DSL.name("updated_on"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "")

    /**
     * The column <code>public.cme_digi_document.created_on</code>.
     */
    val CREATED_ON: TableField<CmeDigiDocumentRecord, OffsetDateTime?> = createField(DSL.name("created_on"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "")

    /**
     * The column <code>public.cme_digi_document.updated_by</code>.
     */
    val UPDATED_BY: TableField<CmeDigiDocumentRecord, String?> = createField(DSL.name("updated_by"), SQLDataType.CHAR(37), this, "")

    /**
     * The column <code>public.cme_digi_document.created_by</code>.
     */
    val CREATED_BY: TableField<CmeDigiDocumentRecord, String?> = createField(DSL.name("created_by"), SQLDataType.CHAR(37), this, "")

    /**
     * The column <code>public.cme_digi_document.stale_id</code>.
     */
    val STALE_ID: TableField<CmeDigiDocumentRecord, String?> = createField(DSL.name("stale_id"), SQLDataType.VARCHAR(255), this, "")

    private constructor(alias: Name, aliased: Table<CmeDigiDocumentRecord>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<CmeDigiDocumentRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>public.cme_digi_document</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>public.cme_digi_document</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>public.cme_digi_document</code> table reference
     */
    constructor(): this(DSL.name("cme_digi_document"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, CmeDigiDocumentRecord>): this(Internal.createPathAlias(child, key), child, key, CME_DIGI_DOCUMENT, null)
    override fun getSchema(): Schema? = if (aliased()) null else Public.PUBLIC
    override fun `as`(alias: String): CmeDigiDocument = CmeDigiDocument(DSL.name(alias), this)
    override fun `as`(alias: Name): CmeDigiDocument = CmeDigiDocument(alias, this)
    override fun `as`(alias: Table<*>): CmeDigiDocument = CmeDigiDocument(alias.getQualifiedName(), this)

    /**
     * Rename this table
     */
    override fun rename(name: String): CmeDigiDocument = CmeDigiDocument(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): CmeDigiDocument = CmeDigiDocument(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): CmeDigiDocument = CmeDigiDocument(name.getQualifiedName(), null)

    // -------------------------------------------------------------------------
    // Row13 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row13<String?, String?, String?, String?, String?, String?, String?, Boolean?, OffsetDateTime?, OffsetDateTime?, String?, String?, String?> = super.fieldsRow() as Row13<String?, String?, String?, String?, String?, String?, String?, Boolean?, OffsetDateTime?, OffsetDateTime?, String?, String?, String?>

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    fun <U> mapping(from: (String?, String?, String?, String?, String?, String?, String?, Boolean?, OffsetDateTime?, OffsetDateTime?, String?, String?, String?) -> U): SelectField<U> = convertFrom(Records.mapping(from))

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    fun <U> mapping(toType: Class<U>, from: (String?, String?, String?, String?, String?, String?, String?, Boolean?, OffsetDateTime?, OffsetDateTime?, String?, String?, String?) -> U): SelectField<U> = convertFrom(toType, Records.mapping(from))
}
