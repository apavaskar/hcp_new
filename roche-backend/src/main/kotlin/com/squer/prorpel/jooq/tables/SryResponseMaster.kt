/*
 * This file is generated by jOOQ.
 */
package com.squer.prorpel.jooq.tables


import com.squer.prorpel.jooq.Public
import com.squer.prorpel.jooq.tables.records.SryResponseMasterRecord

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
open class SryResponseMaster(
    alias: Name,
    child: Table<out Record>?,
    path: ForeignKey<out Record, SryResponseMasterRecord>?,
    aliased: Table<SryResponseMasterRecord>?,
    parameters: Array<Field<*>?>?
): TableImpl<SryResponseMasterRecord>(
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
         * The reference instance of <code>public.sry_response_master</code>
         */
        val SRY_RESPONSE_MASTER: SryResponseMaster = SryResponseMaster()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<SryResponseMasterRecord> = SryResponseMasterRecord::class.java

    /**
     * The column <code>public.sry_response_master.id</code>.
     */
    val ID: TableField<SryResponseMasterRecord, String?> = createField(DSL.name("id"), SQLDataType.CHAR(37), this, "")

    /**
     * The column <code>public.sry_response_master.created_by</code>.
     */
    val CREATED_BY: TableField<SryResponseMasterRecord, String?> = createField(DSL.name("created_by"), SQLDataType.CHAR(37), this, "")

    /**
     * The column <code>public.sry_response_master.survey_date</code>.
     */
    val SURVEY_DATE: TableField<SryResponseMasterRecord, OffsetDateTime?> = createField(DSL.name("survey_date"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "")

    /**
     * The column <code>public.sry_response_master.survey_by</code>.
     */
    val SURVEY_BY: TableField<SryResponseMasterRecord, String?> = createField(DSL.name("survey_by"), SQLDataType.CHAR(37), this, "")

    /**
     * The column <code>public.sry_response_master.year_month</code>.
     */
    val YEAR_MONTH: TableField<SryResponseMasterRecord, Int?> = createField(DSL.name("year_month"), SQLDataType.INTEGER, this, "")

    /**
     * The column <code>public.sry_response_master.survey_year</code>.
     */
    val SURVEY_YEAR: TableField<SryResponseMasterRecord, Int?> = createField(DSL.name("survey_year"), SQLDataType.INTEGER, this, "")

    /**
     * The column <code>public.sry_response_master.stale_id</code>.
     */
    val STALE_ID: TableField<SryResponseMasterRecord, String?> = createField(DSL.name("stale_id"), SQLDataType.VARCHAR(255), this, "")

    /**
     * The column <code>public.sry_response_master.survey_for</code>.
     */
    val SURVEY_FOR: TableField<SryResponseMasterRecord, String?> = createField(DSL.name("survey_for"), SQLDataType.CHAR(37), this, "")

    /**
     * The column <code>public.sry_response_master.updated_by</code>.
     */
    val UPDATED_BY: TableField<SryResponseMasterRecord, String?> = createField(DSL.name("updated_by"), SQLDataType.CHAR(37), this, "")

    /**
     * The column <code>public.sry_response_master.survey_id</code>.
     */
    val SURVEY_ID: TableField<SryResponseMasterRecord, String?> = createField(DSL.name("survey_id"), SQLDataType.CHAR(37), this, "")

    /**
     * The column <code>public.sry_response_master.survey_month</code>.
     */
    val SURVEY_MONTH: TableField<SryResponseMasterRecord, Int?> = createField(DSL.name("survey_month"), SQLDataType.INTEGER, this, "")

    /**
     * The column <code>public.sry_response_master.updated_on</code>.
     */
    val UPDATED_ON: TableField<SryResponseMasterRecord, OffsetDateTime?> = createField(DSL.name("updated_on"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "")

    /**
     * The column <code>public.sry_response_master.created_on</code>.
     */
    val CREATED_ON: TableField<SryResponseMasterRecord, OffsetDateTime?> = createField(DSL.name("created_on"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "")

    private constructor(alias: Name, aliased: Table<SryResponseMasterRecord>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<SryResponseMasterRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>public.sry_response_master</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>public.sry_response_master</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>public.sry_response_master</code> table reference
     */
    constructor(): this(DSL.name("sry_response_master"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, SryResponseMasterRecord>): this(Internal.createPathAlias(child, key), child, key, SRY_RESPONSE_MASTER, null)
    override fun getSchema(): Schema? = if (aliased()) null else Public.PUBLIC
    override fun `as`(alias: String): SryResponseMaster = SryResponseMaster(DSL.name(alias), this)
    override fun `as`(alias: Name): SryResponseMaster = SryResponseMaster(alias, this)
    override fun `as`(alias: Table<*>): SryResponseMaster = SryResponseMaster(alias.getQualifiedName(), this)

    /**
     * Rename this table
     */
    override fun rename(name: String): SryResponseMaster = SryResponseMaster(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): SryResponseMaster = SryResponseMaster(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): SryResponseMaster = SryResponseMaster(name.getQualifiedName(), null)

    // -------------------------------------------------------------------------
    // Row13 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row13<String?, String?, OffsetDateTime?, String?, Int?, Int?, String?, String?, String?, String?, Int?, OffsetDateTime?, OffsetDateTime?> = super.fieldsRow() as Row13<String?, String?, OffsetDateTime?, String?, Int?, Int?, String?, String?, String?, String?, Int?, OffsetDateTime?, OffsetDateTime?>

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    fun <U> mapping(from: (String?, String?, OffsetDateTime?, String?, Int?, Int?, String?, String?, String?, String?, Int?, OffsetDateTime?, OffsetDateTime?) -> U): SelectField<U> = convertFrom(Records.mapping(from))

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    fun <U> mapping(toType: Class<U>, from: (String?, String?, OffsetDateTime?, String?, Int?, Int?, String?, String?, String?, String?, Int?, OffsetDateTime?, OffsetDateTime?) -> U): SelectField<U> = convertFrom(toType, Records.mapping(from))
}