/*
 * This file is generated by jOOQ.
 */
package com.squer.prorpel.jooq.tables


import com.squer.prorpel.jooq.Public
import com.squer.prorpel.jooq.tables.records.DshMonthlyConsolidatedLocationwiseAvailabilityRecord

import java.util.function.Function

import javax.annotation.processing.Generated

import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.Name
import org.jooq.Record
import org.jooq.Records
import org.jooq.Row10
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
open class DshMonthlyConsolidatedLocationwiseAvailability(
    alias: Name,
    child: Table<out Record>?,
    path: ForeignKey<out Record, DshMonthlyConsolidatedLocationwiseAvailabilityRecord>?,
    aliased: Table<DshMonthlyConsolidatedLocationwiseAvailabilityRecord>?,
    parameters: Array<Field<*>?>?
): TableImpl<DshMonthlyConsolidatedLocationwiseAvailabilityRecord>(
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
         * <code>public.dsh_monthly_consolidated_locationwise_availability</code>
         */
        val DSH_MONTHLY_CONSOLIDATED_LOCATIONWISE_AVAILABILITY: DshMonthlyConsolidatedLocationwiseAvailability = DshMonthlyConsolidatedLocationwiseAvailability()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<DshMonthlyConsolidatedLocationwiseAvailabilityRecord> = DshMonthlyConsolidatedLocationwiseAvailabilityRecord::class.java

    /**
     * The column
     * <code>public.dsh_monthly_consolidated_locationwise_availability.division_id</code>.
     */
    val DIVISION_ID: TableField<DshMonthlyConsolidatedLocationwiseAvailabilityRecord, String?> = createField(DSL.name("division_id"), SQLDataType.CHAR(37), this, "")

    /**
     * The column
     * <code>public.dsh_monthly_consolidated_locationwise_availability.location_id</code>.
     */
    val LOCATION_ID: TableField<DshMonthlyConsolidatedLocationwiseAvailabilityRecord, String?> = createField(DSL.name("location_id"), SQLDataType.CHAR(37), this, "")

    /**
     * The column
     * <code>public.dsh_monthly_consolidated_locationwise_availability.availability_1</code>.
     */
    val AVAILABILITY_1: TableField<DshMonthlyConsolidatedLocationwiseAvailabilityRecord, Int?> = createField(DSL.name("availability_1"), SQLDataType.INTEGER, this, "")

    /**
     * The column
     * <code>public.dsh_monthly_consolidated_locationwise_availability.availability_2</code>.
     */
    val AVAILABILITY_2: TableField<DshMonthlyConsolidatedLocationwiseAvailabilityRecord, Int?> = createField(DSL.name("availability_2"), SQLDataType.INTEGER, this, "")

    /**
     * The column
     * <code>public.dsh_monthly_consolidated_locationwise_availability.availability_3</code>.
     */
    val AVAILABILITY_3: TableField<DshMonthlyConsolidatedLocationwiseAvailabilityRecord, Int?> = createField(DSL.name("availability_3"), SQLDataType.INTEGER, this, "")

    /**
     * The column
     * <code>public.dsh_monthly_consolidated_locationwise_availability.availability_4</code>.
     */
    val AVAILABILITY_4: TableField<DshMonthlyConsolidatedLocationwiseAvailabilityRecord, Int?> = createField(DSL.name("availability_4"), SQLDataType.INTEGER, this, "")

    /**
     * The column
     * <code>public.dsh_monthly_consolidated_locationwise_availability.month</code>.
     */
    val MONTH: TableField<DshMonthlyConsolidatedLocationwiseAvailabilityRecord, Int?> = createField(DSL.name("month"), SQLDataType.INTEGER, this, "")

    /**
     * The column
     * <code>public.dsh_monthly_consolidated_locationwise_availability.year</code>.
     */
    val YEAR: TableField<DshMonthlyConsolidatedLocationwiseAvailabilityRecord, Int?> = createField(DSL.name("year"), SQLDataType.INTEGER, this, "")

    /**
     * The column
     * <code>public.dsh_monthly_consolidated_locationwise_availability.yearmonth</code>.
     */
    val YEARMONTH: TableField<DshMonthlyConsolidatedLocationwiseAvailabilityRecord, Int?> = createField(DSL.name("yearmonth"), SQLDataType.INTEGER, this, "")

    /**
     * The column
     * <code>public.dsh_monthly_consolidated_locationwise_availability.availability_5</code>.
     */
    val AVAILABILITY_5: TableField<DshMonthlyConsolidatedLocationwiseAvailabilityRecord, Int?> = createField(DSL.name("availability_5"), SQLDataType.INTEGER, this, "")

    private constructor(alias: Name, aliased: Table<DshMonthlyConsolidatedLocationwiseAvailabilityRecord>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<DshMonthlyConsolidatedLocationwiseAvailabilityRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased
     * <code>public.dsh_monthly_consolidated_locationwise_availability</code>
     * table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased
     * <code>public.dsh_monthly_consolidated_locationwise_availability</code>
     * table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a
     * <code>public.dsh_monthly_consolidated_locationwise_availability</code>
     * table reference
     */
    constructor(): this(DSL.name("dsh_monthly_consolidated_locationwise_availability"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, DshMonthlyConsolidatedLocationwiseAvailabilityRecord>): this(Internal.createPathAlias(child, key), child, key, DSH_MONTHLY_CONSOLIDATED_LOCATIONWISE_AVAILABILITY, null)
    override fun getSchema(): Schema? = if (aliased()) null else Public.PUBLIC
    override fun `as`(alias: String): DshMonthlyConsolidatedLocationwiseAvailability = DshMonthlyConsolidatedLocationwiseAvailability(DSL.name(alias), this)
    override fun `as`(alias: Name): DshMonthlyConsolidatedLocationwiseAvailability = DshMonthlyConsolidatedLocationwiseAvailability(alias, this)
    override fun `as`(alias: Table<*>): DshMonthlyConsolidatedLocationwiseAvailability = DshMonthlyConsolidatedLocationwiseAvailability(alias.getQualifiedName(), this)

    /**
     * Rename this table
     */
    override fun rename(name: String): DshMonthlyConsolidatedLocationwiseAvailability = DshMonthlyConsolidatedLocationwiseAvailability(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): DshMonthlyConsolidatedLocationwiseAvailability = DshMonthlyConsolidatedLocationwiseAvailability(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): DshMonthlyConsolidatedLocationwiseAvailability = DshMonthlyConsolidatedLocationwiseAvailability(name.getQualifiedName(), null)

    // -------------------------------------------------------------------------
    // Row10 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row10<String?, String?, Int?, Int?, Int?, Int?, Int?, Int?, Int?, Int?> = super.fieldsRow() as Row10<String?, String?, Int?, Int?, Int?, Int?, Int?, Int?, Int?, Int?>

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    fun <U> mapping(from: (String?, String?, Int?, Int?, Int?, Int?, Int?, Int?, Int?, Int?) -> U): SelectField<U> = convertFrom(Records.mapping(from))

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    fun <U> mapping(toType: Class<U>, from: (String?, String?, Int?, Int?, Int?, Int?, Int?, Int?, Int?, Int?) -> U): SelectField<U> = convertFrom(toType, Records.mapping(from))
}