/*
 * This file is generated by jOOQ.
 */
package com.squer.prorpel.jooq.tables


import com.squer.prorpel.jooq.Public
import com.squer.prorpel.jooq.indexes.DSH_LOCATIONWISE_CONSOLIDATED_PRODUCT_AVAILABILITY_BRAND_ID_IND
import com.squer.prorpel.jooq.indexes.DSH_LOCATIONWISE_CONSOLIDATED_PRODUCT_AVAILABILITY_DIVISION_ID_
import com.squer.prorpel.jooq.indexes.DSH_LOCATIONWISE_CONSOLIDATED_PRODUCT_AVAILABILITY_LOCATION_ID_
import com.squer.prorpel.jooq.indexes.DSH_LOCATIONWISE_CONSOLIDATED_PRODUCT_AVAILABILITY_YEARMONTH_IN
import com.squer.prorpel.jooq.tables.records.DshLocationwiseConsolidatedProductAvailabilityRecord

import java.util.function.Function

import javax.annotation.processing.Generated

import kotlin.collections.List

import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.Index
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
open class DshLocationwiseConsolidatedProductAvailability(
    alias: Name,
    child: Table<out Record>?,
    path: ForeignKey<out Record, DshLocationwiseConsolidatedProductAvailabilityRecord>?,
    aliased: Table<DshLocationwiseConsolidatedProductAvailabilityRecord>?,
    parameters: Array<Field<*>?>?
): TableImpl<DshLocationwiseConsolidatedProductAvailabilityRecord>(
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
         * <code>public.dsh_locationwise_consolidated_product_availability</code>
         */
        val DSH_LOCATIONWISE_CONSOLIDATED_PRODUCT_AVAILABILITY: DshLocationwiseConsolidatedProductAvailability = DshLocationwiseConsolidatedProductAvailability()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<DshLocationwiseConsolidatedProductAvailabilityRecord> = DshLocationwiseConsolidatedProductAvailabilityRecord::class.java

    /**
     * The column
     * <code>public.dsh_locationwise_consolidated_product_availability.division_id</code>.
     */
    val DIVISION_ID: TableField<DshLocationwiseConsolidatedProductAvailabilityRecord, String?> = createField(DSL.name("division_id"), SQLDataType.CHAR(37), this, "")

    /**
     * The column
     * <code>public.dsh_locationwise_consolidated_product_availability.location_id</code>.
     */
    val LOCATION_ID: TableField<DshLocationwiseConsolidatedProductAvailabilityRecord, String?> = createField(DSL.name("location_id"), SQLDataType.CHAR(37), this, "")

    /**
     * The column
     * <code>public.dsh_locationwise_consolidated_product_availability.brand_id</code>.
     */
    val BRAND_ID: TableField<DshLocationwiseConsolidatedProductAvailabilityRecord, String?> = createField(DSL.name("brand_id"), SQLDataType.CHAR(37), this, "")

    /**
     * The column
     * <code>public.dsh_locationwise_consolidated_product_availability.classification_id</code>.
     */
    val CLASSIFICATION_ID: TableField<DshLocationwiseConsolidatedProductAvailabilityRecord, String?> = createField(DSL.name("classification_id"), SQLDataType.CHAR(37), this, "")

    /**
     * The column
     * <code>public.dsh_locationwise_consolidated_product_availability.is_competition</code>.
     */
    val IS_COMPETITION: TableField<DshLocationwiseConsolidatedProductAvailabilityRecord, Boolean?> = createField(DSL.name("is_competition"), SQLDataType.BOOLEAN, this, "")

    /**
     * The column
     * <code>public.dsh_locationwise_consolidated_product_availability.availability</code>.
     */
    val AVAILABILITY: TableField<DshLocationwiseConsolidatedProductAvailabilityRecord, Int?> = createField(DSL.name("availability"), SQLDataType.INTEGER, this, "")

    /**
     * The column
     * <code>public.dsh_locationwise_consolidated_product_availability.month</code>.
     */
    val MONTH: TableField<DshLocationwiseConsolidatedProductAvailabilityRecord, Int?> = createField(DSL.name("month"), SQLDataType.INTEGER, this, "")

    /**
     * The column
     * <code>public.dsh_locationwise_consolidated_product_availability.year</code>.
     */
    val YEAR: TableField<DshLocationwiseConsolidatedProductAvailabilityRecord, Int?> = createField(DSL.name("year"), SQLDataType.INTEGER, this, "")

    /**
     * The column
     * <code>public.dsh_locationwise_consolidated_product_availability.yearmonth</code>.
     */
    val YEARMONTH: TableField<DshLocationwiseConsolidatedProductAvailabilityRecord, Int?> = createField(DSL.name("yearmonth"), SQLDataType.INTEGER, this, "")

    /**
     * The column
     * <code>public.dsh_locationwise_consolidated_product_availability.retailers</code>.
     */
    val RETAILERS: TableField<DshLocationwiseConsolidatedProductAvailabilityRecord, Int?> = createField(DSL.name("retailers"), SQLDataType.INTEGER, this, "")

    private constructor(alias: Name, aliased: Table<DshLocationwiseConsolidatedProductAvailabilityRecord>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<DshLocationwiseConsolidatedProductAvailabilityRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased
     * <code>public.dsh_locationwise_consolidated_product_availability</code>
     * table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased
     * <code>public.dsh_locationwise_consolidated_product_availability</code>
     * table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a
     * <code>public.dsh_locationwise_consolidated_product_availability</code>
     * table reference
     */
    constructor(): this(DSL.name("dsh_locationwise_consolidated_product_availability"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, DshLocationwiseConsolidatedProductAvailabilityRecord>): this(Internal.createPathAlias(child, key), child, key, DSH_LOCATIONWISE_CONSOLIDATED_PRODUCT_AVAILABILITY, null)
    override fun getSchema(): Schema? = if (aliased()) null else Public.PUBLIC
    override fun getIndexes(): List<Index> = listOf(DSH_LOCATIONWISE_CONSOLIDATED_PRODUCT_AVAILABILITY_BRAND_ID_IND, DSH_LOCATIONWISE_CONSOLIDATED_PRODUCT_AVAILABILITY_DIVISION_ID_, DSH_LOCATIONWISE_CONSOLIDATED_PRODUCT_AVAILABILITY_LOCATION_ID_, DSH_LOCATIONWISE_CONSOLIDATED_PRODUCT_AVAILABILITY_YEARMONTH_IN)
    override fun `as`(alias: String): DshLocationwiseConsolidatedProductAvailability = DshLocationwiseConsolidatedProductAvailability(DSL.name(alias), this)
    override fun `as`(alias: Name): DshLocationwiseConsolidatedProductAvailability = DshLocationwiseConsolidatedProductAvailability(alias, this)
    override fun `as`(alias: Table<*>): DshLocationwiseConsolidatedProductAvailability = DshLocationwiseConsolidatedProductAvailability(alias.getQualifiedName(), this)

    /**
     * Rename this table
     */
    override fun rename(name: String): DshLocationwiseConsolidatedProductAvailability = DshLocationwiseConsolidatedProductAvailability(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): DshLocationwiseConsolidatedProductAvailability = DshLocationwiseConsolidatedProductAvailability(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): DshLocationwiseConsolidatedProductAvailability = DshLocationwiseConsolidatedProductAvailability(name.getQualifiedName(), null)

    // -------------------------------------------------------------------------
    // Row10 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row10<String?, String?, String?, String?, Boolean?, Int?, Int?, Int?, Int?, Int?> = super.fieldsRow() as Row10<String?, String?, String?, String?, Boolean?, Int?, Int?, Int?, Int?, Int?>

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    fun <U> mapping(from: (String?, String?, String?, String?, Boolean?, Int?, Int?, Int?, Int?, Int?) -> U): SelectField<U> = convertFrom(Records.mapping(from))

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    fun <U> mapping(toType: Class<U>, from: (String?, String?, String?, String?, Boolean?, Int?, Int?, Int?, Int?, Int?) -> U): SelectField<U> = convertFrom(toType, Records.mapping(from))
}
