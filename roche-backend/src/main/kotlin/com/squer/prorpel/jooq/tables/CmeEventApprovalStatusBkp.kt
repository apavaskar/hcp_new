/*
 * This file is generated by jOOQ.
 */
package com.squer.prorpel.jooq.tables


import com.squer.prorpel.jooq.Public
import com.squer.prorpel.jooq.tables.records.CmeEventApprovalStatusBkpRecord

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
open class CmeEventApprovalStatusBkp(
    alias: Name,
    child: Table<out Record>?,
    path: ForeignKey<out Record, CmeEventApprovalStatusBkpRecord>?,
    aliased: Table<CmeEventApprovalStatusBkpRecord>?,
    parameters: Array<Field<*>?>?
): TableImpl<CmeEventApprovalStatusBkpRecord>(
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
         * <code>public.cme_event_approval_status_bkp</code>
         */
        val CME_EVENT_APPROVAL_STATUS_BKP: CmeEventApprovalStatusBkp = CmeEventApprovalStatusBkp()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<CmeEventApprovalStatusBkpRecord> = CmeEventApprovalStatusBkpRecord::class.java

    /**
     * The column <code>public.cme_event_approval_status_bkp.id</code>.
     */
    val ID: TableField<CmeEventApprovalStatusBkpRecord, String?> = createField(DSL.name("id"), SQLDataType.CHAR(37), this, "")

    /**
     * The column <code>public.cme_event_approval_status_bkp.action</code>.
     */
    val ACTION: TableField<CmeEventApprovalStatusBkpRecord, String?> = createField(DSL.name("action"), SQLDataType.CHAR(37), this, "")

    /**
     * The column <code>public.cme_event_approval_status_bkp.comment</code>.
     */
    val COMMENT: TableField<CmeEventApprovalStatusBkpRecord, String?> = createField(DSL.name("comment"), SQLDataType.VARCHAR(255), this, "")

    /**
     * The column <code>public.cme_event_approval_status_bkp.created_by</code>.
     */
    val CREATED_BY: TableField<CmeEventApprovalStatusBkpRecord, String?> = createField(DSL.name("created_by"), SQLDataType.CHAR(37), this, "")

    /**
     * The column <code>public.cme_event_approval_status_bkp.is_current</code>.
     */
    val IS_CURRENT: TableField<CmeEventApprovalStatusBkpRecord, Boolean?> = createField(DSL.name("is_current"), SQLDataType.BOOLEAN, this, "")

    /**
     * The column <code>public.cme_event_approval_status_bkp.stale_id</code>.
     */
    val STALE_ID: TableField<CmeEventApprovalStatusBkpRecord, String?> = createField(DSL.name("stale_id"), SQLDataType.VARCHAR(255), this, "")

    /**
     * The column <code>public.cme_event_approval_status_bkp.cme_type</code>.
     */
    val CME_TYPE: TableField<CmeEventApprovalStatusBkpRecord, String?> = createField(DSL.name("cme_type"), SQLDataType.VARCHAR(25), this, "")

    /**
     * The column <code>public.cme_event_approval_status_bkp.updated_by</code>.
     */
    val UPDATED_BY: TableField<CmeEventApprovalStatusBkpRecord, String?> = createField(DSL.name("updated_by"), SQLDataType.CHAR(37), this, "")

    /**
     * The column <code>public.cme_event_approval_status_bkp.owner_id</code>.
     */
    val OWNER_ID: TableField<CmeEventApprovalStatusBkpRecord, String?> = createField(DSL.name("owner_id"), SQLDataType.CHAR(37), this, "")

    /**
     * The column <code>public.cme_event_approval_status_bkp.approver_id</code>.
     */
    val APPROVER_ID: TableField<CmeEventApprovalStatusBkpRecord, String?> = createField(DSL.name("approver_id"), SQLDataType.CHAR(37), this, "")

    /**
     * The column <code>public.cme_event_approval_status_bkp.updated_on</code>.
     */
    val UPDATED_ON: TableField<CmeEventApprovalStatusBkpRecord, OffsetDateTime?> = createField(DSL.name("updated_on"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "")

    /**
     * The column <code>public.cme_event_approval_status_bkp.created_on</code>.
     */
    val CREATED_ON: TableField<CmeEventApprovalStatusBkpRecord, OffsetDateTime?> = createField(DSL.name("created_on"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "")

    /**
     * The column <code>public.cme_event_approval_status_bkp.group_id</code>.
     */
    val GROUP_ID: TableField<CmeEventApprovalStatusBkpRecord, String?> = createField(DSL.name("group_id"), SQLDataType.CHAR(37), this, "")

    private constructor(alias: Name, aliased: Table<CmeEventApprovalStatusBkpRecord>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<CmeEventApprovalStatusBkpRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>public.cme_event_approval_status_bkp</code> table
     * reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>public.cme_event_approval_status_bkp</code> table
     * reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>public.cme_event_approval_status_bkp</code> table
     * reference
     */
    constructor(): this(DSL.name("cme_event_approval_status_bkp"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, CmeEventApprovalStatusBkpRecord>): this(Internal.createPathAlias(child, key), child, key, CME_EVENT_APPROVAL_STATUS_BKP, null)
    override fun getSchema(): Schema? = if (aliased()) null else Public.PUBLIC
    override fun `as`(alias: String): CmeEventApprovalStatusBkp = CmeEventApprovalStatusBkp(DSL.name(alias), this)
    override fun `as`(alias: Name): CmeEventApprovalStatusBkp = CmeEventApprovalStatusBkp(alias, this)
    override fun `as`(alias: Table<*>): CmeEventApprovalStatusBkp = CmeEventApprovalStatusBkp(alias.getQualifiedName(), this)

    /**
     * Rename this table
     */
    override fun rename(name: String): CmeEventApprovalStatusBkp = CmeEventApprovalStatusBkp(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): CmeEventApprovalStatusBkp = CmeEventApprovalStatusBkp(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): CmeEventApprovalStatusBkp = CmeEventApprovalStatusBkp(name.getQualifiedName(), null)

    // -------------------------------------------------------------------------
    // Row13 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row13<String?, String?, String?, String?, Boolean?, String?, String?, String?, String?, String?, OffsetDateTime?, OffsetDateTime?, String?> = super.fieldsRow() as Row13<String?, String?, String?, String?, Boolean?, String?, String?, String?, String?, String?, OffsetDateTime?, OffsetDateTime?, String?>

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    fun <U> mapping(from: (String?, String?, String?, String?, Boolean?, String?, String?, String?, String?, String?, OffsetDateTime?, OffsetDateTime?, String?) -> U): SelectField<U> = convertFrom(Records.mapping(from))

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    fun <U> mapping(toType: Class<U>, from: (String?, String?, String?, String?, Boolean?, String?, String?, String?, String?, String?, OffsetDateTime?, OffsetDateTime?, String?) -> U): SelectField<U> = convertFrom(toType, Records.mapping(from))
}
