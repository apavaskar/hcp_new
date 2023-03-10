/*
 * This file is generated by jOOQ.
 */
package com.squer.prorpel.jooq.tables


import com.squer.prorpel.jooq.Public
import com.squer.prorpel.jooq.keys.CMT_JOB_TITLE_PKEY
import com.squer.prorpel.jooq.tables.records.CmtJobTitleRecord

import java.time.OffsetDateTime
import java.util.function.Function

import javax.annotation.processing.Generated

import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.Name
import org.jooq.Record
import org.jooq.Records
import org.jooq.Row9
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
open class CmtJobTitle(
    alias: Name,
    child: Table<out Record>?,
    path: ForeignKey<out Record, CmtJobTitleRecord>?,
    aliased: Table<CmtJobTitleRecord>?,
    parameters: Array<Field<*>?>?
): TableImpl<CmtJobTitleRecord>(
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
         * The reference instance of <code>public.cmt_job_title</code>
         */
        val CMT_JOB_TITLE: CmtJobTitle = CmtJobTitle()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<CmtJobTitleRecord> = CmtJobTitleRecord::class.java

    /**
     * The column <code>public.cmt_job_title.name</code>.
     */
    val NAME: TableField<CmtJobTitleRecord, String?> = createField(DSL.name("name"), SQLDataType.VARCHAR(255), this, "")

    /**
     * The column <code>public.cmt_job_title.updated_on</code>.
     */
    val UPDATED_ON: TableField<CmtJobTitleRecord, OffsetDateTime?> = createField(DSL.name("updated_on"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "")

    /**
     * The column <code>public.cmt_job_title.stale_id</code>.
     */
    val STALE_ID: TableField<CmtJobTitleRecord, Long?> = createField(DSL.name("stale_id"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>public.cmt_job_title.ci_name</code>.
     */
    val CI_NAME: TableField<CmtJobTitleRecord, String?> = createField(DSL.name("ci_name"), SQLDataType.VARCHAR(255), this, "")

    /**
     * The column <code>public.cmt_job_title.created_on</code>.
     */
    val CREATED_ON: TableField<CmtJobTitleRecord, OffsetDateTime?> = createField(DSL.name("created_on"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "")

    /**
     * The column <code>public.cmt_job_title.id</code>.
     */
    val ID: TableField<CmtJobTitleRecord, String?> = createField(DSL.name("id"), SQLDataType.CHAR(37).nullable(false), this, "")

    /**
     * The column <code>public.cmt_job_title.external_id</code>.
     */
    val EXTERNAL_ID: TableField<CmtJobTitleRecord, String?> = createField(DSL.name("external_id"), SQLDataType.VARCHAR(100), this, "")

    /**
     * The column <code>public.cmt_job_title.updated_by</code>.
     */
    val UPDATED_BY: TableField<CmtJobTitleRecord, String?> = createField(DSL.name("updated_by"), SQLDataType.CHAR(37), this, "")

    /**
     * The column <code>public.cmt_job_title.created_by</code>.
     */
    val CREATED_BY: TableField<CmtJobTitleRecord, String?> = createField(DSL.name("created_by"), SQLDataType.CHAR(37), this, "")

    private constructor(alias: Name, aliased: Table<CmtJobTitleRecord>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<CmtJobTitleRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>public.cmt_job_title</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>public.cmt_job_title</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>public.cmt_job_title</code> table reference
     */
    constructor(): this(DSL.name("cmt_job_title"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, CmtJobTitleRecord>): this(Internal.createPathAlias(child, key), child, key, CMT_JOB_TITLE, null)
    override fun getSchema(): Schema? = if (aliased()) null else Public.PUBLIC
    override fun getPrimaryKey(): UniqueKey<CmtJobTitleRecord> = CMT_JOB_TITLE_PKEY
    override fun `as`(alias: String): CmtJobTitle = CmtJobTitle(DSL.name(alias), this)
    override fun `as`(alias: Name): CmtJobTitle = CmtJobTitle(alias, this)
    override fun `as`(alias: Table<*>): CmtJobTitle = CmtJobTitle(alias.getQualifiedName(), this)

    /**
     * Rename this table
     */
    override fun rename(name: String): CmtJobTitle = CmtJobTitle(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): CmtJobTitle = CmtJobTitle(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): CmtJobTitle = CmtJobTitle(name.getQualifiedName(), null)

    // -------------------------------------------------------------------------
    // Row9 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row9<String?, OffsetDateTime?, Long?, String?, OffsetDateTime?, String?, String?, String?, String?> = super.fieldsRow() as Row9<String?, OffsetDateTime?, Long?, String?, OffsetDateTime?, String?, String?, String?, String?>

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    fun <U> mapping(from: (String?, OffsetDateTime?, Long?, String?, OffsetDateTime?, String?, String?, String?, String?) -> U): SelectField<U> = convertFrom(Records.mapping(from))

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    fun <U> mapping(toType: Class<U>, from: (String?, OffsetDateTime?, Long?, String?, OffsetDateTime?, String?, String?, String?, String?) -> U): SelectField<U> = convertFrom(toType, Records.mapping(from))
}
