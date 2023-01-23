/*
 * This file is generated by jOOQ.
 */
package com.squer.prorpel.jooq.tables


import com.squer.prorpel.jooq.Public
import com.squer.prorpel.jooq.keys.DSH_INVOICE_DETAILS_PKEY
import com.squer.prorpel.jooq.tables.records.DshInvoiceDetailsRecord

import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.function.Function

import javax.annotation.processing.Generated

import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.Name
import org.jooq.Record
import org.jooq.Records
import org.jooq.Row14
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
open class DshInvoiceDetails(
    alias: Name,
    child: Table<out Record>?,
    path: ForeignKey<out Record, DshInvoiceDetailsRecord>?,
    aliased: Table<DshInvoiceDetailsRecord>?,
    parameters: Array<Field<*>?>?
): TableImpl<DshInvoiceDetailsRecord>(
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
         * The reference instance of <code>public.dsh_invoice_details</code>
         */
        val DSH_INVOICE_DETAILS: DshInvoiceDetails = DshInvoiceDetails()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<DshInvoiceDetailsRecord> = DshInvoiceDetailsRecord::class.java

    /**
     * The column <code>public.dsh_invoice_details.division_id</code>.
     */
    val DIVISION_ID: TableField<DshInvoiceDetailsRecord, String?> = createField(DSL.name("division_id"), SQLDataType.CHAR(37), this, "")

    /**
     * The column <code>public.dsh_invoice_details.id</code>.
     */
    val ID: TableField<DshInvoiceDetailsRecord, String?> = createField(DSL.name("id"), SQLDataType.CHAR(37).nullable(false), this, "")

    /**
     * The column <code>public.dsh_invoice_details.created_by</code>.
     */
    val CREATED_BY: TableField<DshInvoiceDetailsRecord, String?> = createField(DSL.name("created_by"), SQLDataType.CHAR(37), this, "")

    /**
     * The column <code>public.dsh_invoice_details.tax_value</code>.
     */
    val TAX_VALUE: TableField<DshInvoiceDetailsRecord, Double?> = createField(DSL.name("tax_value"), SQLDataType.DOUBLE, this, "")

    /**
     * The column <code>public.dsh_invoice_details.invoice_no</code>.
     */
    val INVOICE_NO: TableField<DshInvoiceDetailsRecord, String?> = createField(DSL.name("invoice_no"), SQLDataType.VARCHAR(100), this, "")

    /**
     * The column <code>public.dsh_invoice_details.stale_id</code>.
     */
    val STALE_ID: TableField<DshInvoiceDetailsRecord, String?> = createField(DSL.name("stale_id"), SQLDataType.VARCHAR(255), this, "")

    /**
     * The column <code>public.dsh_invoice_details.stockist_id</code>.
     */
    val STOCKIST_ID: TableField<DshInvoiceDetailsRecord, String?> = createField(DSL.name("stockist_id"), SQLDataType.CHAR(37), this, "")

    /**
     * The column <code>public.dsh_invoice_details.value</code>.
     */
    val VALUE: TableField<DshInvoiceDetailsRecord, Double?> = createField(DSL.name("value"), SQLDataType.DOUBLE, this, "")

    /**
     * The column <code>public.dsh_invoice_details.updated_by</code>.
     */
    val UPDATED_BY: TableField<DshInvoiceDetailsRecord, String?> = createField(DSL.name("updated_by"), SQLDataType.CHAR(37), this, "")

    /**
     * The column <code>public.dsh_invoice_details.product_id</code>.
     */
    val PRODUCT_ID: TableField<DshInvoiceDetailsRecord, String?> = createField(DSL.name("product_id"), SQLDataType.CHAR(37), this, "")

    /**
     * The column <code>public.dsh_invoice_details.quantity</code>.
     */
    val QUANTITY: TableField<DshInvoiceDetailsRecord, Double?> = createField(DSL.name("quantity"), SQLDataType.DOUBLE, this, "")

    /**
     * The column <code>public.dsh_invoice_details.updated_on</code>.
     */
    val UPDATED_ON: TableField<DshInvoiceDetailsRecord, OffsetDateTime?> = createField(DSL.name("updated_on"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "")

    /**
     * The column <code>public.dsh_invoice_details.created_on</code>.
     */
    val CREATED_ON: TableField<DshInvoiceDetailsRecord, OffsetDateTime?> = createField(DSL.name("created_on"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "")

    /**
     * The column <code>public.dsh_invoice_details.invoice_date</code>.
     */
    val INVOICE_DATE: TableField<DshInvoiceDetailsRecord, LocalDate?> = createField(DSL.name("invoice_date"), SQLDataType.LOCALDATE, this, "")

    private constructor(alias: Name, aliased: Table<DshInvoiceDetailsRecord>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<DshInvoiceDetailsRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>public.dsh_invoice_details</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>public.dsh_invoice_details</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>public.dsh_invoice_details</code> table reference
     */
    constructor(): this(DSL.name("dsh_invoice_details"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, DshInvoiceDetailsRecord>): this(Internal.createPathAlias(child, key), child, key, DSH_INVOICE_DETAILS, null)
    override fun getSchema(): Schema? = if (aliased()) null else Public.PUBLIC
    override fun getPrimaryKey(): UniqueKey<DshInvoiceDetailsRecord> = DSH_INVOICE_DETAILS_PKEY
    override fun `as`(alias: String): DshInvoiceDetails = DshInvoiceDetails(DSL.name(alias), this)
    override fun `as`(alias: Name): DshInvoiceDetails = DshInvoiceDetails(alias, this)
    override fun `as`(alias: Table<*>): DshInvoiceDetails = DshInvoiceDetails(alias.getQualifiedName(), this)

    /**
     * Rename this table
     */
    override fun rename(name: String): DshInvoiceDetails = DshInvoiceDetails(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): DshInvoiceDetails = DshInvoiceDetails(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): DshInvoiceDetails = DshInvoiceDetails(name.getQualifiedName(), null)

    // -------------------------------------------------------------------------
    // Row14 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row14<String?, String?, String?, Double?, String?, String?, String?, Double?, String?, String?, Double?, OffsetDateTime?, OffsetDateTime?, LocalDate?> = super.fieldsRow() as Row14<String?, String?, String?, Double?, String?, String?, String?, Double?, String?, String?, Double?, OffsetDateTime?, OffsetDateTime?, LocalDate?>

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    fun <U> mapping(from: (String?, String?, String?, Double?, String?, String?, String?, Double?, String?, String?, Double?, OffsetDateTime?, OffsetDateTime?, LocalDate?) -> U): SelectField<U> = convertFrom(Records.mapping(from))

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    fun <U> mapping(toType: Class<U>, from: (String?, String?, String?, Double?, String?, String?, String?, Double?, String?, String?, Double?, OffsetDateTime?, OffsetDateTime?, LocalDate?) -> U): SelectField<U> = convertFrom(toType, Records.mapping(from))
}
