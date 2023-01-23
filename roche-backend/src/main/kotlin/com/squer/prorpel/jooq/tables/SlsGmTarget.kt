/*
 * This file is generated by jOOQ.
 */
package com.squer.prorpel.jooq.tables


import com.squer.prorpel.jooq.Public
import com.squer.prorpel.jooq.tables.records.SlsGmTargetRecord

import java.util.function.Function

import javax.annotation.processing.Generated

import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.Name
import org.jooq.Record
import org.jooq.Records
import org.jooq.Row5
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
open class SlsGmTarget(
    alias: Name,
    child: Table<out Record>?,
    path: ForeignKey<out Record, SlsGmTargetRecord>?,
    aliased: Table<SlsGmTargetRecord>?,
    parameters: Array<Field<*>?>?
): TableImpl<SlsGmTargetRecord>(
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
         * The reference instance of <code>public.sls_gm_target</code>
         */
        val SLS_GM_TARGET: SlsGmTarget = SlsGmTarget()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<SlsGmTargetRecord> = SlsGmTargetRecord::class.java

    /**
     * The column <code>public.sls_gm_target.location_id</code>.
     */
    val LOCATION_ID: TableField<SlsGmTargetRecord, String?> = createField(DSL.name("location_id"), SQLDataType.CHAR(37), this, "")

    /**
     * The column <code>public.sls_gm_target.month</code>.
     */
    val MONTH: TableField<SlsGmTargetRecord, Int?> = createField(DSL.name("month"), SQLDataType.INTEGER, this, "")

    /**
     * The column <code>public.sls_gm_target.year</code>.
     */
    val YEAR: TableField<SlsGmTargetRecord, Int?> = createField(DSL.name("year"), SQLDataType.INTEGER, this, "")

    /**
     * The column <code>public.sls_gm_target.to_target</code>.
     */
    val TO_TARGET: TableField<SlsGmTargetRecord, Double?> = createField(DSL.name("to_target"), SQLDataType.DOUBLE, this, "")

    /**
     * The column <code>public.sls_gm_target.mo_target</code>.
     */
    val MO_TARGET: TableField<SlsGmTargetRecord, Double?> = createField(DSL.name("mo_target"), SQLDataType.DOUBLE, this, "")

    private constructor(alias: Name, aliased: Table<SlsGmTargetRecord>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<SlsGmTargetRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>public.sls_gm_target</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>public.sls_gm_target</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>public.sls_gm_target</code> table reference
     */
    constructor(): this(DSL.name("sls_gm_target"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, SlsGmTargetRecord>): this(Internal.createPathAlias(child, key), child, key, SLS_GM_TARGET, null)
    override fun getSchema(): Schema? = if (aliased()) null else Public.PUBLIC
    override fun `as`(alias: String): SlsGmTarget = SlsGmTarget(DSL.name(alias), this)
    override fun `as`(alias: Name): SlsGmTarget = SlsGmTarget(alias, this)
    override fun `as`(alias: Table<*>): SlsGmTarget = SlsGmTarget(alias.getQualifiedName(), this)

    /**
     * Rename this table
     */
    override fun rename(name: String): SlsGmTarget = SlsGmTarget(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): SlsGmTarget = SlsGmTarget(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): SlsGmTarget = SlsGmTarget(name.getQualifiedName(), null)

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row5<String?, Int?, Int?, Double?, Double?> = super.fieldsRow() as Row5<String?, Int?, Int?, Double?, Double?>

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    fun <U> mapping(from: (String?, Int?, Int?, Double?, Double?) -> U): SelectField<U> = convertFrom(Records.mapping(from))

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    fun <U> mapping(toType: Class<U>, from: (String?, Int?, Int?, Double?, Double?) -> U): SelectField<U> = convertFrom(toType, Records.mapping(from))
}