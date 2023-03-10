/*
 * This file is generated by jOOQ.
 */
package com.squer.prorpel.jooq.tables.records


import com.squer.prorpel.jooq.tables.DshInvoiceDetails

import java.time.LocalDate
import java.time.OffsetDateTime

import javax.annotation.processing.Generated

import org.jooq.Field
import org.jooq.Record1
import org.jooq.Record14
import org.jooq.Row14
import org.jooq.impl.UpdatableRecordImpl


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
open class DshInvoiceDetailsRecord() : UpdatableRecordImpl<DshInvoiceDetailsRecord>(DshInvoiceDetails.DSH_INVOICE_DETAILS), Record14<String?, String?, String?, Double?, String?, String?, String?, Double?, String?, String?, Double?, OffsetDateTime?, OffsetDateTime?, LocalDate?> {

    open var divisionId: String?
        set(value): Unit = set(0, value)
        get(): String? = get(0) as String?

    open var id: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

    open var createdBy: String?
        set(value): Unit = set(2, value)
        get(): String? = get(2) as String?

    open var taxValue: Double?
        set(value): Unit = set(3, value)
        get(): Double? = get(3) as Double?

    open var invoiceNo: String?
        set(value): Unit = set(4, value)
        get(): String? = get(4) as String?

    open var staleId: String?
        set(value): Unit = set(5, value)
        get(): String? = get(5) as String?

    open var stockistId: String?
        set(value): Unit = set(6, value)
        get(): String? = get(6) as String?

    open var value: Double?
        set(value): Unit = set(7, value)
        get(): Double? = get(7) as Double?

    open var updatedBy: String?
        set(value): Unit = set(8, value)
        get(): String? = get(8) as String?

    open var productId: String?
        set(value): Unit = set(9, value)
        get(): String? = get(9) as String?

    open var quantity: Double?
        set(value): Unit = set(10, value)
        get(): Double? = get(10) as Double?

    open var updatedOn: OffsetDateTime?
        set(value): Unit = set(11, value)
        get(): OffsetDateTime? = get(11) as OffsetDateTime?

    open var createdOn: OffsetDateTime?
        set(value): Unit = set(12, value)
        get(): OffsetDateTime? = get(12) as OffsetDateTime?

    open var invoiceDate: LocalDate?
        set(value): Unit = set(13, value)
        get(): LocalDate? = get(13) as LocalDate?

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record1<String?> = super.key() as Record1<String?>

    // -------------------------------------------------------------------------
    // Record14 type implementation
    // -------------------------------------------------------------------------

    override fun fieldsRow(): Row14<String?, String?, String?, Double?, String?, String?, String?, Double?, String?, String?, Double?, OffsetDateTime?, OffsetDateTime?, LocalDate?> = super.fieldsRow() as Row14<String?, String?, String?, Double?, String?, String?, String?, Double?, String?, String?, Double?, OffsetDateTime?, OffsetDateTime?, LocalDate?>
    override fun valuesRow(): Row14<String?, String?, String?, Double?, String?, String?, String?, Double?, String?, String?, Double?, OffsetDateTime?, OffsetDateTime?, LocalDate?> = super.valuesRow() as Row14<String?, String?, String?, Double?, String?, String?, String?, Double?, String?, String?, Double?, OffsetDateTime?, OffsetDateTime?, LocalDate?>
    override fun field1(): Field<String?> = DshInvoiceDetails.DSH_INVOICE_DETAILS.DIVISION_ID
    override fun field2(): Field<String?> = DshInvoiceDetails.DSH_INVOICE_DETAILS.ID
    override fun field3(): Field<String?> = DshInvoiceDetails.DSH_INVOICE_DETAILS.CREATED_BY
    override fun field4(): Field<Double?> = DshInvoiceDetails.DSH_INVOICE_DETAILS.TAX_VALUE
    override fun field5(): Field<String?> = DshInvoiceDetails.DSH_INVOICE_DETAILS.INVOICE_NO
    override fun field6(): Field<String?> = DshInvoiceDetails.DSH_INVOICE_DETAILS.STALE_ID
    override fun field7(): Field<String?> = DshInvoiceDetails.DSH_INVOICE_DETAILS.STOCKIST_ID
    override fun field8(): Field<Double?> = DshInvoiceDetails.DSH_INVOICE_DETAILS.VALUE
    override fun field9(): Field<String?> = DshInvoiceDetails.DSH_INVOICE_DETAILS.UPDATED_BY
    override fun field10(): Field<String?> = DshInvoiceDetails.DSH_INVOICE_DETAILS.PRODUCT_ID
    override fun field11(): Field<Double?> = DshInvoiceDetails.DSH_INVOICE_DETAILS.QUANTITY
    override fun field12(): Field<OffsetDateTime?> = DshInvoiceDetails.DSH_INVOICE_DETAILS.UPDATED_ON
    override fun field13(): Field<OffsetDateTime?> = DshInvoiceDetails.DSH_INVOICE_DETAILS.CREATED_ON
    override fun field14(): Field<LocalDate?> = DshInvoiceDetails.DSH_INVOICE_DETAILS.INVOICE_DATE
    override fun component1(): String? = divisionId
    override fun component2(): String? = id
    override fun component3(): String? = createdBy
    override fun component4(): Double? = taxValue
    override fun component5(): String? = invoiceNo
    override fun component6(): String? = staleId
    override fun component7(): String? = stockistId
    override fun component8(): Double? = value
    override fun component9(): String? = updatedBy
    override fun component10(): String? = productId
    override fun component11(): Double? = quantity
    override fun component12(): OffsetDateTime? = updatedOn
    override fun component13(): OffsetDateTime? = createdOn
    override fun component14(): LocalDate? = invoiceDate
    override fun value1(): String? = divisionId
    override fun value2(): String? = id
    override fun value3(): String? = createdBy
    override fun value4(): Double? = taxValue
    override fun value5(): String? = invoiceNo
    override fun value6(): String? = staleId
    override fun value7(): String? = stockistId
    override fun value8(): Double? = value
    override fun value9(): String? = updatedBy
    override fun value10(): String? = productId
    override fun value11(): Double? = quantity
    override fun value12(): OffsetDateTime? = updatedOn
    override fun value13(): OffsetDateTime? = createdOn
    override fun value14(): LocalDate? = invoiceDate

    override fun value1(value: String?): DshInvoiceDetailsRecord {
        this.divisionId = value
        return this
    }

    override fun value2(value: String?): DshInvoiceDetailsRecord {
        this.id = value
        return this
    }

    override fun value3(value: String?): DshInvoiceDetailsRecord {
        this.createdBy = value
        return this
    }

    override fun value4(value: Double?): DshInvoiceDetailsRecord {
        this.taxValue = value
        return this
    }

    override fun value5(value: String?): DshInvoiceDetailsRecord {
        this.invoiceNo = value
        return this
    }

    override fun value6(value: String?): DshInvoiceDetailsRecord {
        this.staleId = value
        return this
    }

    override fun value7(value: String?): DshInvoiceDetailsRecord {
        this.stockistId = value
        return this
    }

    override fun value8(value: Double?): DshInvoiceDetailsRecord {
        this.value = value
        return this
    }

    override fun value9(value: String?): DshInvoiceDetailsRecord {
        this.updatedBy = value
        return this
    }

    override fun value10(value: String?): DshInvoiceDetailsRecord {
        this.productId = value
        return this
    }

    override fun value11(value: Double?): DshInvoiceDetailsRecord {
        this.quantity = value
        return this
    }

    override fun value12(value: OffsetDateTime?): DshInvoiceDetailsRecord {
        this.updatedOn = value
        return this
    }

    override fun value13(value: OffsetDateTime?): DshInvoiceDetailsRecord {
        this.createdOn = value
        return this
    }

    override fun value14(value: LocalDate?): DshInvoiceDetailsRecord {
        this.invoiceDate = value
        return this
    }

    override fun values(value1: String?, value2: String?, value3: String?, value4: Double?, value5: String?, value6: String?, value7: String?, value8: Double?, value9: String?, value10: String?, value11: Double?, value12: OffsetDateTime?, value13: OffsetDateTime?, value14: LocalDate?): DshInvoiceDetailsRecord {
        this.value1(value1)
        this.value2(value2)
        this.value3(value3)
        this.value4(value4)
        this.value5(value5)
        this.value6(value6)
        this.value7(value7)
        this.value8(value8)
        this.value9(value9)
        this.value10(value10)
        this.value11(value11)
        this.value12(value12)
        this.value13(value13)
        this.value14(value14)
        return this
    }

    /**
     * Create a detached, initialised DshInvoiceDetailsRecord
     */
    constructor(divisionId: String? = null, id: String? = null, createdBy: String? = null, taxValue: Double? = null, invoiceNo: String? = null, staleId: String? = null, stockistId: String? = null, value: Double? = null, updatedBy: String? = null, productId: String? = null, quantity: Double? = null, updatedOn: OffsetDateTime? = null, createdOn: OffsetDateTime? = null, invoiceDate: LocalDate? = null): this() {
        this.divisionId = divisionId
        this.id = id
        this.createdBy = createdBy
        this.taxValue = taxValue
        this.invoiceNo = invoiceNo
        this.staleId = staleId
        this.stockistId = stockistId
        this.value = value
        this.updatedBy = updatedBy
        this.productId = productId
        this.quantity = quantity
        this.updatedOn = updatedOn
        this.createdOn = createdOn
        this.invoiceDate = invoiceDate
    }
}
