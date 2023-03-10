/*
 * This file is generated by jOOQ.
 */
package com.squer.prorpel.jooq.tables


import com.squer.prorpel.jooq.Public
import com.squer.prorpel.jooq.keys.DSH_RETAILER_PRODUCT_AVAILABILITY_PKEY
import com.squer.prorpel.jooq.tables.records.DshRetailerProductAvailabilityRecord

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
open class DshRetailerProductAvailability(
    alias: Name,
    child: Table<out Record>?,
    path: ForeignKey<out Record, DshRetailerProductAvailabilityRecord>?,
    aliased: Table<DshRetailerProductAvailabilityRecord>?,
    parameters: Array<Field<*>?>?
): TableImpl<DshRetailerProductAvailabilityRecord>(
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
         * <code>public.dsh_retailer_product_availability</code>
         */
        val DSH_RETAILER_PRODUCT_AVAILABILITY: DshRetailerProductAvailability = DshRetailerProductAvailability()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<DshRetailerProductAvailabilityRecord> = DshRetailerProductAvailabilityRecord::class.java

    /**
     * The column <code>public.dsh_retailer_product_availability.id</code>.
     */
    val ID: TableField<DshRetailerProductAvailabilityRecord, String?> = createField(DSL.name("id"), SQLDataType.CHAR(37).nullable(false), this, "")

    /**
     * The column
     * <code>public.dsh_retailer_product_availability.updated_by</code>.
     */
    val UPDATED_BY: TableField<DshRetailerProductAvailabilityRecord, String?> = createField(DSL.name("updated_by"), SQLDataType.CHAR(37), this, "")

    /**
     * The column <code>public.dsh_retailer_product_availability.month</code>.
     */
    val MONTH: TableField<DshRetailerProductAvailabilityRecord, Int?> = createField(DSL.name("month"), SQLDataType.INTEGER, this, "")

    /**
     * The column
     * <code>public.dsh_retailer_product_availability.retailer_id</code>.
     */
    val RETAILER_ID: TableField<DshRetailerProductAvailabilityRecord, String?> = createField(DSL.name("retailer_id"), SQLDataType.CHAR(37), this, "")

    /**
     * The column <code>public.dsh_retailer_product_availability.year</code>.
     */
    val YEAR: TableField<DshRetailerProductAvailabilityRecord, Int?> = createField(DSL.name("year"), SQLDataType.INTEGER, this, "")

    /**
     * The column
     * <code>public.dsh_retailer_product_availability.created_by</code>.
     */
    val CREATED_BY: TableField<DshRetailerProductAvailabilityRecord, String?> = createField(DSL.name("created_by"), SQLDataType.CHAR(37), this, "")

    /**
     * The column
     * <code>public.dsh_retailer_product_availability.brand_id</code>.
     */
    val BRAND_ID: TableField<DshRetailerProductAvailabilityRecord, String?> = createField(DSL.name("brand_id"), SQLDataType.CHAR(37), this, "")

    /**
     * The column <code>public.dsh_retailer_product_availability.total</code>.
     */
    val TOTAL: TableField<DshRetailerProductAvailabilityRecord, Double?> = createField(DSL.name("total"), SQLDataType.DOUBLE, this, "")

    /**
     * The column
     * <code>public.dsh_retailer_product_availability.updated_on</code>.
     */
    val UPDATED_ON: TableField<DshRetailerProductAvailabilityRecord, OffsetDateTime?> = createField(DSL.name("updated_on"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "")

    /**
     * The column
     * <code>public.dsh_retailer_product_availability.created_on</code>.
     */
    val CREATED_ON: TableField<DshRetailerProductAvailabilityRecord, OffsetDateTime?> = createField(DSL.name("created_on"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "")

    /**
     * The column
     * <code>public.dsh_retailer_product_availability.stale_id</code>.
     */
    val STALE_ID: TableField<DshRetailerProductAvailabilityRecord, String?> = createField(DSL.name("stale_id"), SQLDataType.VARCHAR(255), this, "")

    private constructor(alias: Name, aliased: Table<DshRetailerProductAvailabilityRecord>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<DshRetailerProductAvailabilityRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>public.dsh_retailer_product_availability</code>
     * table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>public.dsh_retailer_product_availability</code>
     * table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>public.dsh_retailer_product_availability</code> table
     * reference
     */
    constructor(): this(DSL.name("dsh_retailer_product_availability"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, DshRetailerProductAvailabilityRecord>): this(Internal.createPathAlias(child, key), child, key, DSH_RETAILER_PRODUCT_AVAILABILITY, null)
    override fun getSchema(): Schema? = if (aliased()) null else Public.PUBLIC
    override fun getPrimaryKey(): UniqueKey<DshRetailerProductAvailabilityRecord> = DSH_RETAILER_PRODUCT_AVAILABILITY_PKEY
    override fun `as`(alias: String): DshRetailerProductAvailability = DshRetailerProductAvailability(DSL.name(alias), this)
    override fun `as`(alias: Name): DshRetailerProductAvailability = DshRetailerProductAvailability(alias, this)
    override fun `as`(alias: Table<*>): DshRetailerProductAvailability = DshRetailerProductAvailability(alias.getQualifiedName(), this)

    /**
     * Rename this table
     */
    override fun rename(name: String): DshRetailerProductAvailability = DshRetailerProductAvailability(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): DshRetailerProductAvailability = DshRetailerProductAvailability(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): DshRetailerProductAvailability = DshRetailerProductAvailability(name.getQualifiedName(), null)

    // -------------------------------------------------------------------------
    // Row11 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row11<String?, String?, Int?, String?, Int?, String?, String?, Double?, OffsetDateTime?, OffsetDateTime?, String?> = super.fieldsRow() as Row11<String?, String?, Int?, String?, Int?, String?, String?, Double?, OffsetDateTime?, OffsetDateTime?, String?>

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    fun <U> mapping(from: (String?, String?, Int?, String?, Int?, String?, String?, Double?, OffsetDateTime?, OffsetDateTime?, String?) -> U): SelectField<U> = convertFrom(Records.mapping(from))

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    fun <U> mapping(toType: Class<U>, from: (String?, String?, Int?, String?, Int?, String?, String?, Double?, OffsetDateTime?, OffsetDateTime?, String?) -> U): SelectField<U> = convertFrom(toType, Records.mapping(from))
}
