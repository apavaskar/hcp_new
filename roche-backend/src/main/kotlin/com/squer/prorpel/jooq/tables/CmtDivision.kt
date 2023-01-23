/*
 * This file is generated by jOOQ.
 */
package com.squer.prorpel.jooq.tables


import com.squer.prorpel.jooq.Public
import com.squer.prorpel.jooq.keys.CMT_DIVISION_PKEY
import com.squer.prorpel.jooq.tables.records.CmtDivisionRecord

import java.time.OffsetDateTime
import java.util.function.Function

import javax.annotation.processing.Generated

import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.Name
import org.jooq.Record
import org.jooq.Records
import org.jooq.Row11
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
open class CmtDivision(
    alias: Name,
    child: Table<out Record>?,
    path: ForeignKey<out Record, CmtDivisionRecord>?,
    aliased: Table<CmtDivisionRecord>?,
    parameters: Array<Field<*>?>?
): TableImpl<CmtDivisionRecord>(
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
         * The reference instance of <code>public.cmt_division</code>
         */
        val CMT_DIVISION: CmtDivision = CmtDivision()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<CmtDivisionRecord> = CmtDivisionRecord::class.java

    /**
     * The column <code>public.cmt_division.name</code>.
     */
    val NAME: TableField<CmtDivisionRecord, String?> = createField(DSL.name("name"), SQLDataType.VARCHAR(255), this, "")

    /**
     * The column <code>public.cmt_division.updated_on</code>.
     */
    val UPDATED_ON: TableField<CmtDivisionRecord, OffsetDateTime?> = createField(DSL.name("updated_on"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "")

    /**
     * The column <code>public.cmt_division.stale_id</code>.
     */
    val STALE_ID: TableField<CmtDivisionRecord, Long?> = createField(DSL.name("stale_id"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>public.cmt_division.ci_name</code>.
     */
    val CI_NAME: TableField<CmtDivisionRecord, String?> = createField(DSL.name("ci_name"), SQLDataType.VARCHAR(255), this, "")

    /**
     * The column <code>public.cmt_division.created_on</code>.
     */
    val CREATED_ON: TableField<CmtDivisionRecord, OffsetDateTime?> = createField(DSL.name("created_on"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "")

    /**
     * The column <code>public.cmt_division.division_code</code>.
     */
    val DIVISION_CODE: TableField<CmtDivisionRecord, String?> = createField(DSL.name("division_code"), SQLDataType.VARCHAR(25), this, "")

    /**
     * The column <code>public.cmt_division.id</code>.
     */
    val ID: TableField<CmtDivisionRecord, String?> = createField(DSL.name("id"), SQLDataType.CHAR(37).nullable(false), this, "")

    /**
     * The column <code>public.cmt_division.status_id</code>.
     */
    val STATUS_ID: TableField<CmtDivisionRecord, String?> = createField(DSL.name("status_id"), SQLDataType.CHAR(37), this, "")

    /**
     * The column <code>public.cmt_division.updated_by</code>.
     */
    val UPDATED_BY: TableField<CmtDivisionRecord, String?> = createField(DSL.name("updated_by"), SQLDataType.CHAR(37), this, "")

    /**
     * The column <code>public.cmt_division.external_id</code>.
     */
    val EXTERNAL_ID: TableField<CmtDivisionRecord, String?> = createField(DSL.name("external_id"), SQLDataType.VARCHAR(100), this, "")

    /**
     * The column <code>public.cmt_division.created_by</code>.
     */
    val CREATED_BY: TableField<CmtDivisionRecord, String?> = createField(DSL.name("created_by"), SQLDataType.CHAR(37), this, "")

    private constructor(alias: Name, aliased: Table<CmtDivisionRecord>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<CmtDivisionRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>public.cmt_division</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>public.cmt_division</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>public.cmt_division</code> table reference
     */
    constructor(): this(DSL.name("cmt_division"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, CmtDivisionRecord>): this(Internal.createPathAlias(child, key), child, key, CMT_DIVISION, null)
    override fun getSchema(): Schema? = if (aliased()) null else Public.PUBLIC
    override fun getPrimaryKey(): UniqueKey<CmtDivisionRecord> = CMT_DIVISION_PKEY
    override fun `as`(alias: String): CmtDivision = CmtDivision(DSL.name(alias), this)
    override fun `as`(alias: Name): CmtDivision = CmtDivision(alias, this)
    override fun `as`(alias: Table<*>): CmtDivision = CmtDivision(alias.getQualifiedName(), this)

    /**
     * Rename this table
     */
    override fun rename(name: String): CmtDivision = CmtDivision(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): CmtDivision = CmtDivision(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): CmtDivision = CmtDivision(name.getQualifiedName(), null)

    // -------------------------------------------------------------------------
    // Row11 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row11<String?, OffsetDateTime?, Long?, String?, OffsetDateTime?, String?, String?, String?, String?, String?, String?> = super.fieldsRow() as Row11<String?, OffsetDateTime?, Long?, String?, OffsetDateTime?, String?, String?, String?, String?, String?, String?>

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    fun <U> mapping(from: (String?, OffsetDateTime?, Long?, String?, OffsetDateTime?, String?, String?, String?, String?, String?, String?) -> U): SelectField<U> = convertFrom(Records.mapping(from))

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    fun <U> mapping(toType: Class<U>, from: (String?, OffsetDateTime?, Long?, String?, OffsetDateTime?, String?, String?, String?, String?, String?, String?) -> U): SelectField<U> = convertFrom(toType, Records.mapping(from))
}