/*
 * This file is generated by jOOQ.
 */
package com.squer.prorpel.jooq.tables.records


import com.squer.prorpel.jooq.tables.TmpProductMappingUploadOld

import javax.annotation.processing.Generated

import org.jooq.Field
import org.jooq.Record10
import org.jooq.Row10
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
open class TmpProductMappingUploadOldRecord() : TableRecordImpl<TmpProductMappingUploadOldRecord>(TmpProductMappingUploadOld.TMP_PRODUCT_MAPPING_UPLOAD_OLD), Record10<String?, String?, String?, String?, String?, String?, String?, String?, String?, Long?> {

    open var payer: String?
        set(value): Unit = set(0, value)
        get(): String? = get(0) as String?

    open var payerSapCode: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

    open var payerName: String?
        set(value): Unit = set(2, value)
        get(): String? = get(2) as String?

    open var productCode: String?
        set(value): Unit = set(3, value)
        get(): String? = get(3) as String?

    open var productName: String?
        set(value): Unit = set(4, value)
        get(): String? = get(4) as String?

    open var seName: String?
        set(value): Unit = set(5, value)
        get(): String? = get(5) as String?

    open var amName: String?
        set(value): Unit = set(6, value)
        get(): String? = get(6) as String?

    open var rmName: String?
        set(value): Unit = set(7, value)
        get(): String? = get(7) as String?

    open var divName: String?
        set(value): Unit = set(8, value)
        get(): String? = get(8) as String?

    open var jobExecutionId: Long?
        set(value): Unit = set(9, value)
        get(): Long? = get(9) as Long?

    // -------------------------------------------------------------------------
    // Record10 type implementation
    // -------------------------------------------------------------------------

    override fun fieldsRow(): Row10<String?, String?, String?, String?, String?, String?, String?, String?, String?, Long?> = super.fieldsRow() as Row10<String?, String?, String?, String?, String?, String?, String?, String?, String?, Long?>
    override fun valuesRow(): Row10<String?, String?, String?, String?, String?, String?, String?, String?, String?, Long?> = super.valuesRow() as Row10<String?, String?, String?, String?, String?, String?, String?, String?, String?, Long?>
    override fun field1(): Field<String?> = TmpProductMappingUploadOld.TMP_PRODUCT_MAPPING_UPLOAD_OLD.PAYER
    override fun field2(): Field<String?> = TmpProductMappingUploadOld.TMP_PRODUCT_MAPPING_UPLOAD_OLD.PAYER_SAP_CODE
    override fun field3(): Field<String?> = TmpProductMappingUploadOld.TMP_PRODUCT_MAPPING_UPLOAD_OLD.PAYER_NAME
    override fun field4(): Field<String?> = TmpProductMappingUploadOld.TMP_PRODUCT_MAPPING_UPLOAD_OLD.PRODUCT_CODE
    override fun field5(): Field<String?> = TmpProductMappingUploadOld.TMP_PRODUCT_MAPPING_UPLOAD_OLD.PRODUCT_NAME
    override fun field6(): Field<String?> = TmpProductMappingUploadOld.TMP_PRODUCT_MAPPING_UPLOAD_OLD.SE_NAME
    override fun field7(): Field<String?> = TmpProductMappingUploadOld.TMP_PRODUCT_MAPPING_UPLOAD_OLD.AM_NAME
    override fun field8(): Field<String?> = TmpProductMappingUploadOld.TMP_PRODUCT_MAPPING_UPLOAD_OLD.RM_NAME
    override fun field9(): Field<String?> = TmpProductMappingUploadOld.TMP_PRODUCT_MAPPING_UPLOAD_OLD.DIV_NAME
    override fun field10(): Field<Long?> = TmpProductMappingUploadOld.TMP_PRODUCT_MAPPING_UPLOAD_OLD.JOB_EXECUTION_ID
    override fun component1(): String? = payer
    override fun component2(): String? = payerSapCode
    override fun component3(): String? = payerName
    override fun component4(): String? = productCode
    override fun component5(): String? = productName
    override fun component6(): String? = seName
    override fun component7(): String? = amName
    override fun component8(): String? = rmName
    override fun component9(): String? = divName
    override fun component10(): Long? = jobExecutionId
    override fun value1(): String? = payer
    override fun value2(): String? = payerSapCode
    override fun value3(): String? = payerName
    override fun value4(): String? = productCode
    override fun value5(): String? = productName
    override fun value6(): String? = seName
    override fun value7(): String? = amName
    override fun value8(): String? = rmName
    override fun value9(): String? = divName
    override fun value10(): Long? = jobExecutionId

    override fun value1(value: String?): TmpProductMappingUploadOldRecord {
        this.payer = value
        return this
    }

    override fun value2(value: String?): TmpProductMappingUploadOldRecord {
        this.payerSapCode = value
        return this
    }

    override fun value3(value: String?): TmpProductMappingUploadOldRecord {
        this.payerName = value
        return this
    }

    override fun value4(value: String?): TmpProductMappingUploadOldRecord {
        this.productCode = value
        return this
    }

    override fun value5(value: String?): TmpProductMappingUploadOldRecord {
        this.productName = value
        return this
    }

    override fun value6(value: String?): TmpProductMappingUploadOldRecord {
        this.seName = value
        return this
    }

    override fun value7(value: String?): TmpProductMappingUploadOldRecord {
        this.amName = value
        return this
    }

    override fun value8(value: String?): TmpProductMappingUploadOldRecord {
        this.rmName = value
        return this
    }

    override fun value9(value: String?): TmpProductMappingUploadOldRecord {
        this.divName = value
        return this
    }

    override fun value10(value: Long?): TmpProductMappingUploadOldRecord {
        this.jobExecutionId = value
        return this
    }

    override fun values(value1: String?, value2: String?, value3: String?, value4: String?, value5: String?, value6: String?, value7: String?, value8: String?, value9: String?, value10: Long?): TmpProductMappingUploadOldRecord {
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
        return this
    }

    /**
     * Create a detached, initialised TmpProductMappingUploadOldRecord
     */
    constructor(payer: String? = null, payerSapCode: String? = null, payerName: String? = null, productCode: String? = null, productName: String? = null, seName: String? = null, amName: String? = null, rmName: String? = null, divName: String? = null, jobExecutionId: Long? = null): this() {
        this.payer = payer
        this.payerSapCode = payerSapCode
        this.payerName = payerName
        this.productCode = productCode
        this.productName = productName
        this.seName = seName
        this.amName = amName
        this.rmName = rmName
        this.divName = divName
        this.jobExecutionId = jobExecutionId
    }
}
