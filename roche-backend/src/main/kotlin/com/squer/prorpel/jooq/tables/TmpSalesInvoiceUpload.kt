/*
 * This file is generated by jOOQ.
 */
package com.squer.prorpel.jooq.tables


import com.squer.prorpel.jooq.Public
import com.squer.prorpel.jooq.tables.records.TmpSalesInvoiceUploadRecord

import javax.annotation.processing.Generated

import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.Name
import org.jooq.Record
import org.jooq.Schema
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
open class TmpSalesInvoiceUpload(
    alias: Name,
    child: Table<out Record>?,
    path: ForeignKey<out Record, TmpSalesInvoiceUploadRecord>?,
    aliased: Table<TmpSalesInvoiceUploadRecord>?,
    parameters: Array<Field<*>?>?
): TableImpl<TmpSalesInvoiceUploadRecord>(
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
         * <code>public.tmp_sales_invoice_upload</code>
         */
        val TMP_SALES_INVOICE_UPLOAD: TmpSalesInvoiceUpload = TmpSalesInvoiceUpload()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<TmpSalesInvoiceUploadRecord> = TmpSalesInvoiceUploadRecord::class.java

    /**
     * The column <code>public.tmp_sales_invoice_upload.billing_type</code>.
     */
    val BILLING_TYPE: TableField<TmpSalesInvoiceUploadRecord, String?> = createField(DSL.name("billing_type"), SQLDataType.VARCHAR(100), this, "")

    /**
     * The column <code>public.tmp_sales_invoice_upload.description</code>.
     */
    val DESCRIPTION: TableField<TmpSalesInvoiceUploadRecord, String?> = createField(DSL.name("description"), SQLDataType.VARCHAR(255), this, "")

    /**
     * The column <code>public.tmp_sales_invoice_upload.billing_document</code>.
     */
    val BILLING_DOCUMENT: TableField<TmpSalesInvoiceUploadRecord, String?> = createField(DSL.name("billing_document"), SQLDataType.VARCHAR(100), this, "")

    /**
     * The column
     * <code>public.tmp_sales_invoice_upload.purchase_ordernumber</code>.
     */
    val PURCHASE_ORDERNUMBER: TableField<TmpSalesInvoiceUploadRecord, String?> = createField(DSL.name("purchase_ordernumber"), SQLDataType.VARCHAR(100), this, "")

    /**
     * The column <code>public.tmp_sales_invoice_upload.sales_document</code>.
     */
    val SALES_DOCUMENT: TableField<TmpSalesInvoiceUploadRecord, String?> = createField(DSL.name("sales_document"), SQLDataType.VARCHAR(100), this, "")

    /**
     * The column <code>public.tmp_sales_invoice_upload.sales_type</code>.
     */
    val SALES_TYPE: TableField<TmpSalesInvoiceUploadRecord, String?> = createField(DSL.name("sales_type"), SQLDataType.VARCHAR(100), this, "")

    /**
     * The column <code>public.tmp_sales_invoice_upload.sold_toparty</code>.
     */
    val SOLD_TOPARTY: TableField<TmpSalesInvoiceUploadRecord, String?> = createField(DSL.name("sold_toparty"), SQLDataType.VARCHAR(100), this, "")

    /**
     * The column <code>public.tmp_sales_invoice_upload.sold_toname</code>.
     */
    val SOLD_TONAME: TableField<TmpSalesInvoiceUploadRecord, String?> = createField(DSL.name("sold_toname"), SQLDataType.VARCHAR(255), this, "")

    /**
     * The column <code>public.tmp_sales_invoice_upload.payer</code>.
     */
    val PAYER: TableField<TmpSalesInvoiceUploadRecord, String?> = createField(DSL.name("payer"), SQLDataType.VARCHAR(100), this, "")

    /**
     * The column <code>public.tmp_sales_invoice_upload.payer_name</code>.
     */
    val PAYER_NAME: TableField<TmpSalesInvoiceUploadRecord, String?> = createField(DSL.name("payer_name"), SQLDataType.VARCHAR(255), this, "")

    /**
     * The column <code>public.tmp_sales_invoice_upload.payer_city</code>.
     */
    val PAYER_CITY: TableField<TmpSalesInvoiceUploadRecord, String?> = createField(DSL.name("payer_city"), SQLDataType.VARCHAR(100), this, "")

    /**
     * The column <code>public.tmp_sales_invoice_upload.sub_customer</code>.
     */
    val SUB_CUSTOMER: TableField<TmpSalesInvoiceUploadRecord, String?> = createField(DSL.name("sub_customer"), SQLDataType.VARCHAR(100), this, "")

    /**
     * The column <code>public.tmp_sales_invoice_upload.subcustomer_name</code>.
     */
    val SUBCUSTOMER_NAME: TableField<TmpSalesInvoiceUploadRecord, String?> = createField(DSL.name("subcustomer_name"), SQLDataType.VARCHAR(255), this, "")

    /**
     * The column <code>public.tmp_sales_invoice_upload.sub_customercity</code>.
     */
    val SUB_CUSTOMERCITY: TableField<TmpSalesInvoiceUploadRecord, String?> = createField(DSL.name("sub_customercity"), SQLDataType.VARCHAR(100), this, "")

    /**
     * The column <code>public.tmp_sales_invoice_upload.ship_tostate</code>.
     */
    val SHIP_TOSTATE: TableField<TmpSalesInvoiceUploadRecord, String?> = createField(DSL.name("ship_tostate"), SQLDataType.VARCHAR(100), this, "")

    /**
     * The column <code>public.tmp_sales_invoice_upload.plant</code>.
     */
    val PLANT: TableField<TmpSalesInvoiceUploadRecord, String?> = createField(DSL.name("plant"), SQLDataType.VARCHAR(255), this, "")

    /**
     * The column <code>public.tmp_sales_invoice_upload.material_code</code>.
     */
    val MATERIAL_CODE: TableField<TmpSalesInvoiceUploadRecord, String?> = createField(DSL.name("material_code"), SQLDataType.VARCHAR(100), this, "")

    /**
     * The column <code>public.tmp_sales_invoice_upload.line_description</code>.
     */
    val LINE_DESCRIPTION: TableField<TmpSalesInvoiceUploadRecord, String?> = createField(DSL.name("line_description"), SQLDataType.VARCHAR(255), this, "")

    /**
     * The column <code>public.tmp_sales_invoice_upload.profile_center</code>.
     */
    val PROFILE_CENTER: TableField<TmpSalesInvoiceUploadRecord, String?> = createField(DSL.name("profile_center"), SQLDataType.VARCHAR(100), this, "")

    /**
     * The column <code>public.tmp_sales_invoice_upload.batch_number</code>.
     */
    val BATCH_NUMBER: TableField<TmpSalesInvoiceUploadRecord, String?> = createField(DSL.name("batch_number"), SQLDataType.VARCHAR(100), this, "")

    /**
     * The column <code>public.tmp_sales_invoice_upload.billing_date</code>.
     */
    val BILLING_DATE: TableField<TmpSalesInvoiceUploadRecord, String?> = createField(DSL.name("billing_date"), SQLDataType.VARCHAR(100), this, "")

    /**
     * The column <code>public.tmp_sales_invoice_upload.billed_quantity</code>.
     */
    val BILLED_QUANTITY: TableField<TmpSalesInvoiceUploadRecord, String?> = createField(DSL.name("billed_quantity"), SQLDataType.VARCHAR(100), this, "")

    /**
     * The column
     * <code>public.tmp_sales_invoice_upload.after_discountamount</code>.
     */
    val AFTER_DISCOUNTAMOUNT: TableField<TmpSalesInvoiceUploadRecord, String?> = createField(DSL.name("after_discountamount"), SQLDataType.VARCHAR(100), this, "")

    /**
     * The column <code>public.tmp_sales_invoice_upload.product_id</code>.
     */
    val PRODUCT_ID: TableField<TmpSalesInvoiceUploadRecord, String?> = createField(DSL.name("product_id"), SQLDataType.CHAR(37), this, "")

    /**
     * The column <code>public.tmp_sales_invoice_upload.customer_id</code>.
     */
    val CUSTOMER_ID: TableField<TmpSalesInvoiceUploadRecord, String?> = createField(DSL.name("customer_id"), SQLDataType.CHAR(37), this, "")

    /**
     * The column
     * <code>public.tmp_sales_invoice_upload.location_sap_code</code>.
     */
    val LOCATION_SAP_CODE: TableField<TmpSalesInvoiceUploadRecord, String?> = createField(DSL.name("location_sap_code"), SQLDataType.VARCHAR(100), this, "")

    /**
     * The column <code>public.tmp_sales_invoice_upload.division_id</code>.
     */
    val DIVISION_ID: TableField<TmpSalesInvoiceUploadRecord, String?> = createField(DSL.name("division_id"), SQLDataType.VARCHAR(37), this, "")

    /**
     * The column <code>public.tmp_sales_invoice_upload.job_execution_id</code>.
     */
    val JOB_EXECUTION_ID: TableField<TmpSalesInvoiceUploadRecord, Long?> = createField(DSL.name("job_execution_id"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>public.tmp_sales_invoice_upload.error_message</code>.
     */
    val ERROR_MESSAGE: TableField<TmpSalesInvoiceUploadRecord, String?> = createField(DSL.name("error_message"), SQLDataType.CLOB, this, "")

    /**
     * The column <code>public.tmp_sales_invoice_upload.product_name</code>.
     */
    val PRODUCT_NAME: TableField<TmpSalesInvoiceUploadRecord, String?> = createField(DSL.name("product_name"), SQLDataType.VARCHAR(255), this, "")

    /**
     * The column <code>public.tmp_sales_invoice_upload.division_name</code>.
     */
    val DIVISION_NAME: TableField<TmpSalesInvoiceUploadRecord, String?> = createField(DSL.name("division_name"), SQLDataType.VARCHAR(100), this, "")

    /**
     * The column <code>public.tmp_sales_invoice_upload.parent_id</code>.
     */
    val PARENT_ID: TableField<TmpSalesInvoiceUploadRecord, String?> = createField(DSL.name("parent_id"), SQLDataType.VARCHAR(37), this, "")

    private constructor(alias: Name, aliased: Table<TmpSalesInvoiceUploadRecord>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<TmpSalesInvoiceUploadRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>public.tmp_sales_invoice_upload</code> table
     * reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>public.tmp_sales_invoice_upload</code> table
     * reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>public.tmp_sales_invoice_upload</code> table reference
     */
    constructor(): this(DSL.name("tmp_sales_invoice_upload"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, TmpSalesInvoiceUploadRecord>): this(Internal.createPathAlias(child, key), child, key, TMP_SALES_INVOICE_UPLOAD, null)
    override fun getSchema(): Schema? = if (aliased()) null else Public.PUBLIC
    override fun `as`(alias: String): TmpSalesInvoiceUpload = TmpSalesInvoiceUpload(DSL.name(alias), this)
    override fun `as`(alias: Name): TmpSalesInvoiceUpload = TmpSalesInvoiceUpload(alias, this)
    override fun `as`(alias: Table<*>): TmpSalesInvoiceUpload = TmpSalesInvoiceUpload(alias.getQualifiedName(), this)

    /**
     * Rename this table
     */
    override fun rename(name: String): TmpSalesInvoiceUpload = TmpSalesInvoiceUpload(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): TmpSalesInvoiceUpload = TmpSalesInvoiceUpload(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): TmpSalesInvoiceUpload = TmpSalesInvoiceUpload(name.getQualifiedName(), null)
}
