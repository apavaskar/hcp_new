/*
 * This file is generated by jOOQ.
 */
package com.squer.prorpel.jooq.tables.records


import com.squer.prorpel.jooq.tables.CmeVendorBankDetail

import java.time.OffsetDateTime

import javax.annotation.processing.Generated

import org.jooq.Field
import org.jooq.Record17
import org.jooq.Row17
import org.jooq.impl.TableRecordImpl


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
open class CmeVendorBankDetailRecord() : TableRecordImpl<CmeVendorBankDetailRecord>(CmeVendorBankDetail.CME_VENDOR_BANK_DETAIL), Record17<String?, String?, String?, String?, String?, String?, String?, String?, String?, String?, String?, String?, String?, OffsetDateTime?, String?, OffsetDateTime?, String?> {

    open var vendorName: String?
        set(value): Unit = set(0, value)
        get(): String? = get(0) as String?

    open var id: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

    open var serviceProviderNo: String?
        set(value): Unit = set(2, value)
        get(): String? = get(2) as String?

    open var createdBy: String?
        set(value): Unit = set(3, value)
        get(): String? = get(3) as String?

    open var address: String?
        set(value): Unit = set(4, value)
        get(): String? = get(4) as String?

    open var comments: String?
        set(value): Unit = set(5, value)
        get(): String? = get(5) as String?

    open var cmvdrId: String?
        set(value): Unit = set(6, value)
        get(): String? = get(6) as String?

    open var bankName: String?
        set(value): Unit = set(7, value)
        get(): String? = get(7) as String?

    open var staleId: String?
        set(value): Unit = set(8, value)
        get(): String? = get(8) as String?

    open var branchName: String?
        set(value): Unit = set(9, value)
        get(): String? = get(9) as String?

    open var beneficiaryName: String?
        set(value): Unit = set(10, value)
        get(): String? = get(10) as String?

    open var accountNo: String?
        set(value): Unit = set(11, value)
        get(): String? = get(11) as String?

    open var updatedBy: String?
        set(value): Unit = set(12, value)
        get(): String? = get(12) as String?

    open var updatedOn: OffsetDateTime?
        set(value): Unit = set(13, value)
        get(): OffsetDateTime? = get(13) as OffsetDateTime?

    open var ifscCode: String?
        set(value): Unit = set(14, value)
        get(): String? = get(14) as String?

    open var createdOn: OffsetDateTime?
        set(value): Unit = set(15, value)
        get(): OffsetDateTime? = get(15) as OffsetDateTime?

    open var partnerId: String?
        set(value): Unit = set(16, value)
        get(): String? = get(16) as String?

    // -------------------------------------------------------------------------
    // Record17 type implementation
    // -------------------------------------------------------------------------

    override fun fieldsRow(): Row17<String?, String?, String?, String?, String?, String?, String?, String?, String?, String?, String?, String?, String?, OffsetDateTime?, String?, OffsetDateTime?, String?> = super.fieldsRow() as Row17<String?, String?, String?, String?, String?, String?, String?, String?, String?, String?, String?, String?, String?, OffsetDateTime?, String?, OffsetDateTime?, String?>
    override fun valuesRow(): Row17<String?, String?, String?, String?, String?, String?, String?, String?, String?, String?, String?, String?, String?, OffsetDateTime?, String?, OffsetDateTime?, String?> = super.valuesRow() as Row17<String?, String?, String?, String?, String?, String?, String?, String?, String?, String?, String?, String?, String?, OffsetDateTime?, String?, OffsetDateTime?, String?>
    override fun field1(): Field<String?> = CmeVendorBankDetail.CME_VENDOR_BANK_DETAIL.VENDOR_NAME
    override fun field2(): Field<String?> = CmeVendorBankDetail.CME_VENDOR_BANK_DETAIL.ID
    override fun field3(): Field<String?> = CmeVendorBankDetail.CME_VENDOR_BANK_DETAIL.SERVICE_PROVIDER_NO
    override fun field4(): Field<String?> = CmeVendorBankDetail.CME_VENDOR_BANK_DETAIL.CREATED_BY
    override fun field5(): Field<String?> = CmeVendorBankDetail.CME_VENDOR_BANK_DETAIL.ADDRESS
    override fun field6(): Field<String?> = CmeVendorBankDetail.CME_VENDOR_BANK_DETAIL.COMMENTS
    override fun field7(): Field<String?> = CmeVendorBankDetail.CME_VENDOR_BANK_DETAIL.CMVDR_ID
    override fun field8(): Field<String?> = CmeVendorBankDetail.CME_VENDOR_BANK_DETAIL.BANK_NAME
    override fun field9(): Field<String?> = CmeVendorBankDetail.CME_VENDOR_BANK_DETAIL.STALE_ID
    override fun field10(): Field<String?> = CmeVendorBankDetail.CME_VENDOR_BANK_DETAIL.BRANCH_NAME
    override fun field11(): Field<String?> = CmeVendorBankDetail.CME_VENDOR_BANK_DETAIL.BENEFICIARY_NAME
    override fun field12(): Field<String?> = CmeVendorBankDetail.CME_VENDOR_BANK_DETAIL.ACCOUNT_NO
    override fun field13(): Field<String?> = CmeVendorBankDetail.CME_VENDOR_BANK_DETAIL.UPDATED_BY
    override fun field14(): Field<OffsetDateTime?> = CmeVendorBankDetail.CME_VENDOR_BANK_DETAIL.UPDATED_ON
    override fun field15(): Field<String?> = CmeVendorBankDetail.CME_VENDOR_BANK_DETAIL.IFSC_CODE
    override fun field16(): Field<OffsetDateTime?> = CmeVendorBankDetail.CME_VENDOR_BANK_DETAIL.CREATED_ON
    override fun field17(): Field<String?> = CmeVendorBankDetail.CME_VENDOR_BANK_DETAIL.PARTNER_ID
    override fun component1(): String? = vendorName
    override fun component2(): String? = id
    override fun component3(): String? = serviceProviderNo
    override fun component4(): String? = createdBy
    override fun component5(): String? = address
    override fun component6(): String? = comments
    override fun component7(): String? = cmvdrId
    override fun component8(): String? = bankName
    override fun component9(): String? = staleId
    override fun component10(): String? = branchName
    override fun component11(): String? = beneficiaryName
    override fun component12(): String? = accountNo
    override fun component13(): String? = updatedBy
    override fun component14(): OffsetDateTime? = updatedOn
    override fun component15(): String? = ifscCode
    override fun component16(): OffsetDateTime? = createdOn
    override fun component17(): String? = partnerId
    override fun value1(): String? = vendorName
    override fun value2(): String? = id
    override fun value3(): String? = serviceProviderNo
    override fun value4(): String? = createdBy
    override fun value5(): String? = address
    override fun value6(): String? = comments
    override fun value7(): String? = cmvdrId
    override fun value8(): String? = bankName
    override fun value9(): String? = staleId
    override fun value10(): String? = branchName
    override fun value11(): String? = beneficiaryName
    override fun value12(): String? = accountNo
    override fun value13(): String? = updatedBy
    override fun value14(): OffsetDateTime? = updatedOn
    override fun value15(): String? = ifscCode
    override fun value16(): OffsetDateTime? = createdOn
    override fun value17(): String? = partnerId

    override fun value1(value: String?): CmeVendorBankDetailRecord {
        this.vendorName = value
        return this
    }

    override fun value2(value: String?): CmeVendorBankDetailRecord {
        this.id = value
        return this
    }

    override fun value3(value: String?): CmeVendorBankDetailRecord {
        this.serviceProviderNo = value
        return this
    }

    override fun value4(value: String?): CmeVendorBankDetailRecord {
        this.createdBy = value
        return this
    }

    override fun value5(value: String?): CmeVendorBankDetailRecord {
        this.address = value
        return this
    }

    override fun value6(value: String?): CmeVendorBankDetailRecord {
        this.comments = value
        return this
    }

    override fun value7(value: String?): CmeVendorBankDetailRecord {
        this.cmvdrId = value
        return this
    }

    override fun value8(value: String?): CmeVendorBankDetailRecord {
        this.bankName = value
        return this
    }

    override fun value9(value: String?): CmeVendorBankDetailRecord {
        this.staleId = value
        return this
    }

    override fun value10(value: String?): CmeVendorBankDetailRecord {
        this.branchName = value
        return this
    }

    override fun value11(value: String?): CmeVendorBankDetailRecord {
        this.beneficiaryName = value
        return this
    }

    override fun value12(value: String?): CmeVendorBankDetailRecord {
        this.accountNo = value
        return this
    }

    override fun value13(value: String?): CmeVendorBankDetailRecord {
        this.updatedBy = value
        return this
    }

    override fun value14(value: OffsetDateTime?): CmeVendorBankDetailRecord {
        this.updatedOn = value
        return this
    }

    override fun value15(value: String?): CmeVendorBankDetailRecord {
        this.ifscCode = value
        return this
    }

    override fun value16(value: OffsetDateTime?): CmeVendorBankDetailRecord {
        this.createdOn = value
        return this
    }

    override fun value17(value: String?): CmeVendorBankDetailRecord {
        this.partnerId = value
        return this
    }

    override fun values(value1: String?, value2: String?, value3: String?, value4: String?, value5: String?, value6: String?, value7: String?, value8: String?, value9: String?, value10: String?, value11: String?, value12: String?, value13: String?, value14: OffsetDateTime?, value15: String?, value16: OffsetDateTime?, value17: String?): CmeVendorBankDetailRecord {
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
        this.value15(value15)
        this.value16(value16)
        this.value17(value17)
        return this
    }

    /**
     * Create a detached, initialised CmeVendorBankDetailRecord
     */
    constructor(vendorName: String? = null, id: String? = null, serviceProviderNo: String? = null, createdBy: String? = null, address: String? = null, comments: String? = null, cmvdrId: String? = null, bankName: String? = null, staleId: String? = null, branchName: String? = null, beneficiaryName: String? = null, accountNo: String? = null, updatedBy: String? = null, updatedOn: OffsetDateTime? = null, ifscCode: String? = null, createdOn: OffsetDateTime? = null, partnerId: String? = null): this() {
        this.vendorName = vendorName
        this.id = id
        this.serviceProviderNo = serviceProviderNo
        this.createdBy = createdBy
        this.address = address
        this.comments = comments
        this.cmvdrId = cmvdrId
        this.bankName = bankName
        this.staleId = staleId
        this.branchName = branchName
        this.beneficiaryName = beneficiaryName
        this.accountNo = accountNo
        this.updatedBy = updatedBy
        this.updatedOn = updatedOn
        this.ifscCode = ifscCode
        this.createdOn = createdOn
        this.partnerId = partnerId
    }
}
