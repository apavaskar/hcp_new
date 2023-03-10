/*
 * This file is generated by jOOQ.
 */
package com.squer.prorpel.jooq.tables


import com.squer.prorpel.jooq.Public
import com.squer.prorpel.jooq.keys.CME_HONORANIUM_PKEY
import com.squer.prorpel.jooq.tables.records.CmeHonoraniumRecord

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
open class CmeHonoranium(
    alias: Name,
    child: Table<out Record>?,
    path: ForeignKey<out Record, CmeHonoraniumRecord>?,
    aliased: Table<CmeHonoraniumRecord>?,
    parameters: Array<Field<*>?>?
): TableImpl<CmeHonoraniumRecord>(
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
         * The reference instance of <code>public.cme_honoranium</code>
         */
        val CME_HONORANIUM: CmeHonoranium = CmeHonoranium()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<CmeHonoraniumRecord> = CmeHonoraniumRecord::class.java

    /**
     * The column <code>public.cme_honoranium.id</code>.
     */
    val ID: TableField<CmeHonoraniumRecord, String?> = createField(DSL.name("id"), SQLDataType.CHAR(37).nullable(false), this, "")

    /**
     * The column <code>public.cme_honoranium.updated_by</code>.
     */
    val UPDATED_BY: TableField<CmeHonoraniumRecord, String?> = createField(DSL.name("updated_by"), SQLDataType.CHAR(37), this, "")

    /**
     * The column <code>public.cme_honoranium.fmv_amount</code>.
     */
    val FMV_AMOUNT: TableField<CmeHonoraniumRecord, Double?> = createField(DSL.name("fmv_amount"), SQLDataType.DOUBLE, this, "")

    /**
     * The column <code>public.cme_honoranium.created_by</code>.
     */
    val CREATED_BY: TableField<CmeHonoraniumRecord, String?> = createField(DSL.name("created_by"), SQLDataType.CHAR(37), this, "")

    /**
     * The column <code>public.cme_honoranium.total_inr</code>.
     */
    val TOTAL_INR: TableField<CmeHonoraniumRecord, Double?> = createField(DSL.name("total_inr"), SQLDataType.DOUBLE, this, "")

    /**
     * The column <code>public.cme_honoranium.updated_on</code>.
     */
    val UPDATED_ON: TableField<CmeHonoraniumRecord, OffsetDateTime?> = createField(DSL.name("updated_on"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "")

    /**
     * The column <code>public.cme_honoranium.created_on</code>.
     */
    val CREATED_ON: TableField<CmeHonoraniumRecord, OffsetDateTime?> = createField(DSL.name("created_on"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "")

    /**
     * The column <code>public.cme_honoranium.stale_id</code>.
     */
    val STALE_ID: TableField<CmeHonoraniumRecord, String?> = createField(DSL.name("stale_id"), SQLDataType.VARCHAR(255), this, "")

    /**
     * The column <code>public.cme_honoranium.no_of_hours</code>.
     */
    val NO_OF_HOURS: TableField<CmeHonoraniumRecord, Double?> = createField(DSL.name("no_of_hours"), SQLDataType.DOUBLE, this, "")

    private constructor(alias: Name, aliased: Table<CmeHonoraniumRecord>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<CmeHonoraniumRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>public.cme_honoranium</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>public.cme_honoranium</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>public.cme_honoranium</code> table reference
     */
    constructor(): this(DSL.name("cme_honoranium"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, CmeHonoraniumRecord>): this(Internal.createPathAlias(child, key), child, key, CME_HONORANIUM, null)
    override fun getSchema(): Schema? = if (aliased()) null else Public.PUBLIC
    override fun getPrimaryKey(): UniqueKey<CmeHonoraniumRecord> = CME_HONORANIUM_PKEY
    override fun `as`(alias: String): CmeHonoranium = CmeHonoranium(DSL.name(alias), this)
    override fun `as`(alias: Name): CmeHonoranium = CmeHonoranium(alias, this)
    override fun `as`(alias: Table<*>): CmeHonoranium = CmeHonoranium(alias.getQualifiedName(), this)

    /**
     * Rename this table
     */
    override fun rename(name: String): CmeHonoranium = CmeHonoranium(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): CmeHonoranium = CmeHonoranium(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): CmeHonoranium = CmeHonoranium(name.getQualifiedName(), null)

    // -------------------------------------------------------------------------
    // Row9 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row9<String?, String?, Double?, String?, Double?, OffsetDateTime?, OffsetDateTime?, String?, Double?> = super.fieldsRow() as Row9<String?, String?, Double?, String?, Double?, OffsetDateTime?, OffsetDateTime?, String?, Double?>

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    fun <U> mapping(from: (String?, String?, Double?, String?, Double?, OffsetDateTime?, OffsetDateTime?, String?, Double?) -> U): SelectField<U> = convertFrom(Records.mapping(from))

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    fun <U> mapping(toType: Class<U>, from: (String?, String?, Double?, String?, Double?, OffsetDateTime?, OffsetDateTime?, String?, Double?) -> U): SelectField<U> = convertFrom(toType, Records.mapping(from))
}
