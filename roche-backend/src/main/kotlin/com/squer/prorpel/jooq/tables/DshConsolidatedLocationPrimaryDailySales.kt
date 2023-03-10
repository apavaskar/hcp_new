/*
 * This file is generated by jOOQ.
 */
package com.squer.prorpel.jooq.tables


import com.squer.prorpel.jooq.Public
import com.squer.prorpel.jooq.tables.records.DshConsolidatedLocationPrimaryDailySalesRecord

import java.time.LocalDateTime
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
open class DshConsolidatedLocationPrimaryDailySales(
    alias: Name,
    child: Table<out Record>?,
    path: ForeignKey<out Record, DshConsolidatedLocationPrimaryDailySalesRecord>?,
    aliased: Table<DshConsolidatedLocationPrimaryDailySalesRecord>?,
    parameters: Array<Field<*>?>?
): TableImpl<DshConsolidatedLocationPrimaryDailySalesRecord>(
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
         * <code>public.dsh_consolidated_location_primary_daily_sales</code>
         */
        val DSH_CONSOLIDATED_LOCATION_PRIMARY_DAILY_SALES: DshConsolidatedLocationPrimaryDailySales = DshConsolidatedLocationPrimaryDailySales()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<DshConsolidatedLocationPrimaryDailySalesRecord> = DshConsolidatedLocationPrimaryDailySalesRecord::class.java

    /**
     * The column
     * <code>public.dsh_consolidated_location_primary_daily_sales.division_id</code>.
     */
    val DIVISION_ID: TableField<DshConsolidatedLocationPrimaryDailySalesRecord, String?> = createField(DSL.name("division_id"), SQLDataType.CHAR(37), this, "")

    /**
     * The column
     * <code>public.dsh_consolidated_location_primary_daily_sales.location_id</code>.
     */
    val LOCATION_ID: TableField<DshConsolidatedLocationPrimaryDailySalesRecord, String?> = createField(DSL.name("location_id"), SQLDataType.CHAR(37), this, "")

    /**
     * The column
     * <code>public.dsh_consolidated_location_primary_daily_sales.sales_date</code>.
     */
    val SALES_DATE: TableField<DshConsolidatedLocationPrimaryDailySalesRecord, LocalDateTime?> = createField(DSL.name("sales_date"), SQLDataType.LOCALDATETIME(6), this, "")

    /**
     * The column
     * <code>public.dsh_consolidated_location_primary_daily_sales.yearmonth</code>.
     */
    val YEARMONTH: TableField<DshConsolidatedLocationPrimaryDailySalesRecord, Int?> = createField(DSL.name("yearmonth"), SQLDataType.INTEGER, this, "")

    /**
     * The column
     * <code>public.dsh_consolidated_location_primary_daily_sales.target_value</code>.
     */
    val TARGET_VALUE: TableField<DshConsolidatedLocationPrimaryDailySalesRecord, Double?> = createField(DSL.name("target_value"), SQLDataType.DOUBLE, this, "")

    /**
     * The column
     * <code>public.dsh_consolidated_location_primary_daily_sales.target_quantity</code>.
     */
    val TARGET_QUANTITY: TableField<DshConsolidatedLocationPrimaryDailySalesRecord, Double?> = createField(DSL.name("target_quantity"), SQLDataType.DOUBLE, this, "")

    /**
     * The column
     * <code>public.dsh_consolidated_location_primary_daily_sales.achievement_quantity</code>.
     */
    val ACHIEVEMENT_QUANTITY: TableField<DshConsolidatedLocationPrimaryDailySalesRecord, Double?> = createField(DSL.name("achievement_quantity"), SQLDataType.DOUBLE, this, "")

    /**
     * The column
     * <code>public.dsh_consolidated_location_primary_daily_sales.achievement_value</code>.
     */
    val ACHIEVEMENT_VALUE: TableField<DshConsolidatedLocationPrimaryDailySalesRecord, Double?> = createField(DSL.name("achievement_value"), SQLDataType.DOUBLE, this, "")

    /**
     * The column
     * <code>public.dsh_consolidated_location_primary_daily_sales.pending_value</code>.
     */
    val PENDING_VALUE: TableField<DshConsolidatedLocationPrimaryDailySalesRecord, Double?> = createField(DSL.name("pending_value"), SQLDataType.DOUBLE, this, "")

    private constructor(alias: Name, aliased: Table<DshConsolidatedLocationPrimaryDailySalesRecord>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<DshConsolidatedLocationPrimaryDailySalesRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased
     * <code>public.dsh_consolidated_location_primary_daily_sales</code> table
     * reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased
     * <code>public.dsh_consolidated_location_primary_daily_sales</code> table
     * reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a
     * <code>public.dsh_consolidated_location_primary_daily_sales</code> table
     * reference
     */
    constructor(): this(DSL.name("dsh_consolidated_location_primary_daily_sales"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, DshConsolidatedLocationPrimaryDailySalesRecord>): this(Internal.createPathAlias(child, key), child, key, DSH_CONSOLIDATED_LOCATION_PRIMARY_DAILY_SALES, null)
    override fun getSchema(): Schema? = if (aliased()) null else Public.PUBLIC
    override fun `as`(alias: String): DshConsolidatedLocationPrimaryDailySales = DshConsolidatedLocationPrimaryDailySales(DSL.name(alias), this)
    override fun `as`(alias: Name): DshConsolidatedLocationPrimaryDailySales = DshConsolidatedLocationPrimaryDailySales(alias, this)
    override fun `as`(alias: Table<*>): DshConsolidatedLocationPrimaryDailySales = DshConsolidatedLocationPrimaryDailySales(alias.getQualifiedName(), this)

    /**
     * Rename this table
     */
    override fun rename(name: String): DshConsolidatedLocationPrimaryDailySales = DshConsolidatedLocationPrimaryDailySales(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): DshConsolidatedLocationPrimaryDailySales = DshConsolidatedLocationPrimaryDailySales(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): DshConsolidatedLocationPrimaryDailySales = DshConsolidatedLocationPrimaryDailySales(name.getQualifiedName(), null)

    // -------------------------------------------------------------------------
    // Row9 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row9<String?, String?, LocalDateTime?, Int?, Double?, Double?, Double?, Double?, Double?> = super.fieldsRow() as Row9<String?, String?, LocalDateTime?, Int?, Double?, Double?, Double?, Double?, Double?>

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    fun <U> mapping(from: (String?, String?, LocalDateTime?, Int?, Double?, Double?, Double?, Double?, Double?) -> U): SelectField<U> = convertFrom(Records.mapping(from))

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    fun <U> mapping(toType: Class<U>, from: (String?, String?, LocalDateTime?, Int?, Double?, Double?, Double?, Double?, Double?) -> U): SelectField<U> = convertFrom(toType, Records.mapping(from))
}
