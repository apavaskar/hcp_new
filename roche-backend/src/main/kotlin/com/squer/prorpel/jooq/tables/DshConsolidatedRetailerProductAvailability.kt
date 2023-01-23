/*
 * This file is generated by jOOQ.
 */
package com.squer.prorpel.jooq.tables


import com.squer.prorpel.jooq.Public
import com.squer.prorpel.jooq.tables.records.DshConsolidatedRetailerProductAvailabilityRecord

import java.math.BigDecimal
import java.util.function.Function

import javax.annotation.processing.Generated

import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.Name
import org.jooq.Record
import org.jooq.Records
import org.jooq.Row4
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
open class DshConsolidatedRetailerProductAvailability(
    alias: Name,
    child: Table<out Record>?,
    path: ForeignKey<out Record, DshConsolidatedRetailerProductAvailabilityRecord>?,
    aliased: Table<DshConsolidatedRetailerProductAvailabilityRecord>?,
    parameters: Array<Field<*>?>?
): TableImpl<DshConsolidatedRetailerProductAvailabilityRecord>(
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
         * <code>public.dsh_consolidated_retailer_product_availability</code>
         */
        val DSH_CONSOLIDATED_RETAILER_PRODUCT_AVAILABILITY: DshConsolidatedRetailerProductAvailability = DshConsolidatedRetailerProductAvailability()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<DshConsolidatedRetailerProductAvailabilityRecord> = DshConsolidatedRetailerProductAvailabilityRecord::class.java

    /**
     * The column
     * <code>public.dsh_consolidated_retailer_product_availability.month</code>.
     */
    val MONTH: TableField<DshConsolidatedRetailerProductAvailabilityRecord, Int?> = createField(DSL.name("month"), SQLDataType.INTEGER, this, "")

    /**
     * The column
     * <code>public.dsh_consolidated_retailer_product_availability.year</code>.
     */
    val YEAR: TableField<DshConsolidatedRetailerProductAvailabilityRecord, Int?> = createField(DSL.name("year"), SQLDataType.INTEGER, this, "")

    /**
     * The column
     * <code>public.dsh_consolidated_retailer_product_availability.retailer_id</code>.
     */
    val RETAILER_ID: TableField<DshConsolidatedRetailerProductAvailabilityRecord, String?> = createField(DSL.name("retailer_id"), SQLDataType.CHAR(37), this, "")

    /**
     * The column
     * <code>public.dsh_consolidated_retailer_product_availability.availability</code>.
     */
    val AVAILABILITY: TableField<DshConsolidatedRetailerProductAvailabilityRecord, BigDecimal?> = createField(DSL.name("availability"), SQLDataType.NUMERIC, this, "")

    private constructor(alias: Name, aliased: Table<DshConsolidatedRetailerProductAvailabilityRecord>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<DshConsolidatedRetailerProductAvailabilityRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased
     * <code>public.dsh_consolidated_retailer_product_availability</code> table
     * reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased
     * <code>public.dsh_consolidated_retailer_product_availability</code> table
     * reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a
     * <code>public.dsh_consolidated_retailer_product_availability</code> table
     * reference
     */
    constructor(): this(DSL.name("dsh_consolidated_retailer_product_availability"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, DshConsolidatedRetailerProductAvailabilityRecord>): this(Internal.createPathAlias(child, key), child, key, DSH_CONSOLIDATED_RETAILER_PRODUCT_AVAILABILITY, null)
    override fun getSchema(): Schema? = if (aliased()) null else Public.PUBLIC
    override fun `as`(alias: String): DshConsolidatedRetailerProductAvailability = DshConsolidatedRetailerProductAvailability(DSL.name(alias), this)
    override fun `as`(alias: Name): DshConsolidatedRetailerProductAvailability = DshConsolidatedRetailerProductAvailability(alias, this)
    override fun `as`(alias: Table<*>): DshConsolidatedRetailerProductAvailability = DshConsolidatedRetailerProductAvailability(alias.getQualifiedName(), this)

    /**
     * Rename this table
     */
    override fun rename(name: String): DshConsolidatedRetailerProductAvailability = DshConsolidatedRetailerProductAvailability(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): DshConsolidatedRetailerProductAvailability = DshConsolidatedRetailerProductAvailability(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): DshConsolidatedRetailerProductAvailability = DshConsolidatedRetailerProductAvailability(name.getQualifiedName(), null)

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row4<Int?, Int?, String?, BigDecimal?> = super.fieldsRow() as Row4<Int?, Int?, String?, BigDecimal?>

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    fun <U> mapping(from: (Int?, Int?, String?, BigDecimal?) -> U): SelectField<U> = convertFrom(Records.mapping(from))

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    fun <U> mapping(toType: Class<U>, from: (Int?, Int?, String?, BigDecimal?) -> U): SelectField<U> = convertFrom(toType, Records.mapping(from))
}