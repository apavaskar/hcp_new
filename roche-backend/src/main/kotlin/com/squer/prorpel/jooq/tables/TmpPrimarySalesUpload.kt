/*
 * This file is generated by jOOQ.
 */
package com.squer.prorpel.jooq.tables


import com.squer.prorpel.jooq.Public
import com.squer.prorpel.jooq.tables.records.TmpPrimarySalesUploadRecord

import javax.annotation.processing.Generated

import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.Identity
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
open class TmpPrimarySalesUpload(
    alias: Name,
    child: Table<out Record>?,
    path: ForeignKey<out Record, TmpPrimarySalesUploadRecord>?,
    aliased: Table<TmpPrimarySalesUploadRecord>?,
    parameters: Array<Field<*>?>?
): TableImpl<TmpPrimarySalesUploadRecord>(
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
         * <code>public.tmp_primary_sales_upload</code>
         */
        val TMP_PRIMARY_SALES_UPLOAD: TmpPrimarySalesUpload = TmpPrimarySalesUpload()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<TmpPrimarySalesUploadRecord> = TmpPrimarySalesUploadRecord::class.java

    /**
     * The column <code>public.tmp_primary_sales_upload.internal_id</code>.
     */
    val INTERNAL_ID: TableField<TmpPrimarySalesUploadRecord, Int?> = createField(DSL.name("internal_id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "")

    /**
     * The column <code>public.tmp_primary_sales_upload.billing_type</code>.
     */
    val BILLING_TYPE: TableField<TmpPrimarySalesUploadRecord, String?> = createField(DSL.name("billing_type"), SQLDataType.VARCHAR(50), this, "")

    /**
     * The column <code>public.tmp_primary_sales_upload.description</code>.
     */
    val DESCRIPTION: TableField<TmpPrimarySalesUploadRecord, String?> = createField(DSL.name("description"), SQLDataType.VARCHAR(50), this, "")

    /**
     * The column <code>public.tmp_primary_sales_upload.billing_document</code>.
     */
    val BILLING_DOCUMENT: TableField<TmpPrimarySalesUploadRecord, String?> = createField(DSL.name("billing_document"), SQLDataType.VARCHAR(50), this, "")

    /**
     * The column <code>public.tmp_primary_sales_upload.billing_date</code>.
     */
    val BILLING_DATE: TableField<TmpPrimarySalesUploadRecord, String?> = createField(DSL.name("billing_date"), SQLDataType.VARCHAR(50), this, "")

    /**
     * The column <code>public.tmp_primary_sales_upload.plant</code>.
     */
    val PLANT: TableField<TmpPrimarySalesUploadRecord, String?> = createField(DSL.name("plant"), SQLDataType.VARCHAR(50), this, "")

    /**
     * The column <code>public.tmp_primary_sales_upload.sales_document</code>.
     */
    val SALES_DOCUMENT: TableField<TmpPrimarySalesUploadRecord, String?> = createField(DSL.name("sales_document"), SQLDataType.VARCHAR(50), this, "")

    /**
     * The column <code>public.tmp_primary_sales_upload.created_on</code>.
     */
    val CREATED_ON: TableField<TmpPrimarySalesUploadRecord, String?> = createField(DSL.name("created_on"), SQLDataType.VARCHAR(50), this, "")

    /**
     * The column <code>public.tmp_primary_sales_upload.sold_to_party</code>.
     */
    val SOLD_TO_PARTY: TableField<TmpPrimarySalesUploadRecord, String?> = createField(DSL.name("sold_to_party"), SQLDataType.VARCHAR(50), this, "")

    /**
     * The column <code>public.tmp_primary_sales_upload.soldto_name</code>.
     */
    val SOLDTO_NAME: TableField<TmpPrimarySalesUploadRecord, String?> = createField(DSL.name("soldto_name"), SQLDataType.VARCHAR(50), this, "")

    /**
     * The column <code>public.tmp_primary_sales_upload.payer_city</code>.
     */
    val PAYER_CITY: TableField<TmpPrimarySalesUploadRecord, String?> = createField(DSL.name("payer_city"), SQLDataType.VARCHAR(50), this, "")

    /**
     * The column <code>public.tmp_primary_sales_upload.postal_code</code>.
     */
    val POSTAL_CODE: TableField<TmpPrimarySalesUploadRecord, String?> = createField(DSL.name("postal_code"), SQLDataType.VARCHAR(50), this, "")

    /**
     * The column
     * <code>public.tmp_primary_sales_upload.customer_gstin_number</code>.
     */
    val CUSTOMER_GSTIN_NUMBER: TableField<TmpPrimarySalesUploadRecord, String?> = createField(DSL.name("customer_gstin_number"), SQLDataType.VARCHAR(50), this, "")

    /**
     * The column <code>public.tmp_primary_sales_upload.ship_to_party</code>.
     */
    val SHIP_TO_PARTY: TableField<TmpPrimarySalesUploadRecord, String?> = createField(DSL.name("ship_to_party"), SQLDataType.VARCHAR(50), this, "")

    /**
     * The column <code>public.tmp_primary_sales_upload.shipto_name</code>.
     */
    val SHIPTO_NAME: TableField<TmpPrimarySalesUploadRecord, String?> = createField(DSL.name("shipto_name"), SQLDataType.VARCHAR(50), this, "")

    /**
     * The column
     * <code>public.tmp_primary_sales_upload.consignee_gstin_number</code>.
     */
    val CONSIGNEE_GSTIN_NUMBER: TableField<TmpPrimarySalesUploadRecord, String?> = createField(DSL.name("consignee_gstin_number"), SQLDataType.VARCHAR(50), this, "")

    /**
     * The column <code>public.tmp_primary_sales_upload.ship_to_state</code>.
     */
    val SHIP_TO_STATE: TableField<TmpPrimarySalesUploadRecord, String?> = createField(DSL.name("ship_to_state"), SQLDataType.VARCHAR(50), this, "")

    /**
     * The column
     * <code>public.tmp_primary_sales_upload.ship_to_partycity</code>.
     */
    val SHIP_TO_PARTYCITY: TableField<TmpPrimarySalesUploadRecord, String?> = createField(DSL.name("ship_to_partycity"), SQLDataType.VARCHAR(50), this, "")

    /**
     * The column <code>public.tmp_primary_sales_upload.material</code>.
     */
    val MATERIAL: TableField<TmpPrimarySalesUploadRecord, String?> = createField(DSL.name("material"), SQLDataType.VARCHAR(50), this, "")

    /**
     * The column <code>public.tmp_primary_sales_upload.hsn_code</code>.
     */
    val HSN_CODE: TableField<TmpPrimarySalesUploadRecord, String?> = createField(DSL.name("hsn_code"), SQLDataType.VARCHAR(50), this, "")

    /**
     * The column <code>public.tmp_primary_sales_upload.description1</code>.
     */
    val DESCRIPTION1: TableField<TmpPrimarySalesUploadRecord, String?> = createField(DSL.name("description1"), SQLDataType.VARCHAR(50), this, "")

    /**
     * The column <code>public.tmp_primary_sales_upload.billed_quantity</code>.
     */
    val BILLED_QUANTITY: TableField<TmpPrimarySalesUploadRecord, String?> = createField(DSL.name("billed_quantity"), SQLDataType.VARCHAR(50), this, "")

    /**
     * The column <code>public.tmp_primary_sales_upload.batch_number</code>.
     */
    val BATCH_NUMBER: TableField<TmpPrimarySalesUploadRecord, String?> = createField(DSL.name("batch_number"), SQLDataType.VARCHAR(50), this, "")

    /**
     * The column <code>public.tmp_primary_sales_upload.sledbbd</code>.
     */
    val SLEDBBD: TableField<TmpPrimarySalesUploadRecord, String?> = createField(DSL.name("sledbbd"), SQLDataType.VARCHAR(50), this, "")

    /**
     * The column <code>public.tmp_primary_sales_upload.rate</code>.
     */
    val RATE: TableField<TmpPrimarySalesUploadRecord, String?> = createField(DSL.name("rate"), SQLDataType.VARCHAR(50), this, "")

    /**
     * The column <code>public.tmp_primary_sales_upload.tax_perc</code>.
     */
    val TAX_PERC: TableField<TmpPrimarySalesUploadRecord, String?> = createField(DSL.name("tax_perc"), SQLDataType.VARCHAR(50), this, "")

    /**
     * The column <code>public.tmp_primary_sales_upload.taxes</code>.
     */
    val TAXES: TableField<TmpPrimarySalesUploadRecord, String?> = createField(DSL.name("taxes"), SQLDataType.VARCHAR(50), this, "")

    /**
     * The column <code>public.tmp_primary_sales_upload.paise_adj</code>.
     */
    val PAISE_ADJ: TableField<TmpPrimarySalesUploadRecord, String?> = createField(DSL.name("paise_adj"), SQLDataType.VARCHAR(50), this, "")

    /**
     * The column <code>public.tmp_primary_sales_upload.net_amount</code>.
     */
    val NET_AMOUNT: TableField<TmpPrimarySalesUploadRecord, String?> = createField(DSL.name("net_amount"), SQLDataType.VARCHAR(50), this, "")

    /**
     * The column <code>public.tmp_primary_sales_upload.airway_bill_no</code>.
     */
    val AIRWAY_BILL_NO: TableField<TmpPrimarySalesUploadRecord, String?> = createField(DSL.name("airway_bill_no"), SQLDataType.VARCHAR(50), this, "")

    /**
     * The column <code>public.tmp_primary_sales_upload.airway_bill_date</code>.
     */
    val AIRWAY_BILL_DATE: TableField<TmpPrimarySalesUploadRecord, String?> = createField(DSL.name("airway_bill_date"), SQLDataType.VARCHAR(50), this, "")

    /**
     * The column <code>public.tmp_primary_sales_upload.delivery_date</code>.
     */
    val DELIVERY_DATE: TableField<TmpPrimarySalesUploadRecord, String?> = createField(DSL.name("delivery_date"), SQLDataType.VARCHAR(50), this, "")

    /**
     * The column
     * <code>public.tmp_primary_sales_upload.purchase_order_number</code>.
     */
    val PURCHASE_ORDER_NUMBER: TableField<TmpPrimarySalesUploadRecord, String?> = createField(DSL.name("purchase_order_number"), SQLDataType.VARCHAR(50), this, "")

    /**
     * The column <code>public.tmp_primary_sales_upload.sales_type</code>.
     */
    val SALES_TYPE: TableField<TmpPrimarySalesUploadRecord, String?> = createField(DSL.name("sales_type"), SQLDataType.VARCHAR(50), this, "")

    /**
     * The column <code>public.tmp_primary_sales_upload.sales_group</code>.
     */
    val SALES_GROUP: TableField<TmpPrimarySalesUploadRecord, String?> = createField(DSL.name("sales_group"), SQLDataType.VARCHAR(50), this, "")

    /**
     * The column <code>public.tmp_primary_sales_upload.sales_office</code>.
     */
    val SALES_OFFICE: TableField<TmpPrimarySalesUploadRecord, String?> = createField(DSL.name("sales_office"), SQLDataType.VARCHAR(50), this, "")

    /**
     * The column
     * <code>public.tmp_primary_sales_upload.outbound_delivery_number</code>.
     */
    val OUTBOUND_DELIVERY_NUMBER: TableField<TmpPrimarySalesUploadRecord, String?> = createField(DSL.name("outbound_delivery_number"), SQLDataType.VARCHAR(50), this, "")

    /**
     * The column <code>public.tmp_primary_sales_upload.sub_customer</code>.
     */
    val SUB_CUSTOMER: TableField<TmpPrimarySalesUploadRecord, String?> = createField(DSL.name("sub_customer"), SQLDataType.VARCHAR(50), this, "")

    /**
     * The column <code>public.tmp_primary_sales_upload.sub_cust_name</code>.
     */
    val SUB_CUST_NAME: TableField<TmpPrimarySalesUploadRecord, String?> = createField(DSL.name("sub_cust_name"), SQLDataType.VARCHAR(50), this, "")

    /**
     * The column <code>public.tmp_primary_sales_upload.sub_cust_city</code>.
     */
    val SUB_CUST_CITY: TableField<TmpPrimarySalesUploadRecord, String?> = createField(DSL.name("sub_cust_city"), SQLDataType.VARCHAR(50), this, "")

    /**
     * The column <code>public.tmp_primary_sales_upload.commcode</code>.
     */
    val COMMCODE: TableField<TmpPrimarySalesUploadRecord, String?> = createField(DSL.name("commcode"), SQLDataType.VARCHAR(50), this, "")

    /**
     * The column <code>public.tmp_primary_sales_upload.matertype</code>.
     */
    val MATERTYPE: TableField<TmpPrimarySalesUploadRecord, String?> = createField(DSL.name("matertype"), SQLDataType.VARCHAR(50), this, "")

    /**
     * The column <code>public.tmp_primary_sales_upload.storage_loc</code>.
     */
    val STORAGE_LOC: TableField<TmpPrimarySalesUploadRecord, String?> = createField(DSL.name("storage_loc"), SQLDataType.VARCHAR(50), this, "")

    /**
     * The column <code>public.tmp_primary_sales_upload.profit_center</code>.
     */
    val PROFIT_CENTER: TableField<TmpPrimarySalesUploadRecord, String?> = createField(DSL.name("profit_center"), SQLDataType.VARCHAR(50), this, "")

    /**
     * The column
     * <code>public.tmp_primary_sales_upload.profit_centre_text</code>.
     */
    val PROFIT_CENTRE_TEXT: TableField<TmpPrimarySalesUploadRecord, String?> = createField(DSL.name("profit_centre_text"), SQLDataType.VARCHAR(50), this, "")

    /**
     * The column <code>public.tmp_primary_sales_upload.discount_amount</code>.
     */
    val DISCOUNT_AMOUNT: TableField<TmpPrimarySalesUploadRecord, String?> = createField(DSL.name("discount_amount"), SQLDataType.VARCHAR(50), this, "")

    /**
     * The column
     * <code>public.tmp_primary_sales_upload.after_discount_amount</code>.
     */
    val AFTER_DISCOUNT_AMOUNT: TableField<TmpPrimarySalesUploadRecord, String?> = createField(DSL.name("after_discount_amount"), SQLDataType.VARCHAR(50), this, "")

    /**
     * The column <code>public.tmp_primary_sales_upload.ref_invoice</code>.
     */
    val REF_INVOICE: TableField<TmpPrimarySalesUploadRecord, String?> = createField(DSL.name("ref_invoice"), SQLDataType.VARCHAR(50), this, "")

    /**
     * The column <code>public.tmp_primary_sales_upload.brand_id</code>.
     */
    val BRAND_ID: TableField<TmpPrimarySalesUploadRecord, String?> = createField(DSL.name("brand_id"), SQLDataType.CHAR(37), this, "")

    /**
     * The column <code>public.tmp_primary_sales_upload.division_id</code>.
     */
    val DIVISION_ID: TableField<TmpPrimarySalesUploadRecord, String?> = createField(DSL.name("division_id"), SQLDataType.CHAR(37), this, "")

    /**
     * The column <code>public.tmp_primary_sales_upload.sap_code</code>.
     */
    val SAP_CODE: TableField<TmpPrimarySalesUploadRecord, String?> = createField(DSL.name("sap_code"), SQLDataType.VARCHAR(50), this, "")

    /**
     * The column <code>public.tmp_primary_sales_upload.upload_error</code>.
     */
    val UPLOAD_ERROR: TableField<TmpPrimarySalesUploadRecord, Int?> = createField(DSL.name("upload_error"), SQLDataType.INTEGER, this, "")

    /**
     * The column <code>public.tmp_primary_sales_upload.upload_message</code>.
     */
    val UPLOAD_MESSAGE: TableField<TmpPrimarySalesUploadRecord, String?> = createField(DSL.name("upload_message"), SQLDataType.CLOB, this, "")

    private constructor(alias: Name, aliased: Table<TmpPrimarySalesUploadRecord>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<TmpPrimarySalesUploadRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>public.tmp_primary_sales_upload</code> table
     * reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>public.tmp_primary_sales_upload</code> table
     * reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>public.tmp_primary_sales_upload</code> table reference
     */
    constructor(): this(DSL.name("tmp_primary_sales_upload"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, TmpPrimarySalesUploadRecord>): this(Internal.createPathAlias(child, key), child, key, TMP_PRIMARY_SALES_UPLOAD, null)
    override fun getSchema(): Schema? = if (aliased()) null else Public.PUBLIC
    override fun getIdentity(): Identity<TmpPrimarySalesUploadRecord, Int?> = super.getIdentity() as Identity<TmpPrimarySalesUploadRecord, Int?>
    override fun `as`(alias: String): TmpPrimarySalesUpload = TmpPrimarySalesUpload(DSL.name(alias), this)
    override fun `as`(alias: Name): TmpPrimarySalesUpload = TmpPrimarySalesUpload(alias, this)
    override fun `as`(alias: Table<*>): TmpPrimarySalesUpload = TmpPrimarySalesUpload(alias.getQualifiedName(), this)

    /**
     * Rename this table
     */
    override fun rename(name: String): TmpPrimarySalesUpload = TmpPrimarySalesUpload(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): TmpPrimarySalesUpload = TmpPrimarySalesUpload(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): TmpPrimarySalesUpload = TmpPrimarySalesUpload(name.getQualifiedName(), null)
}
