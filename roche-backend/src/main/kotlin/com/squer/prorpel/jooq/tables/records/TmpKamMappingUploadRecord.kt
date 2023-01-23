/*
 * This file is generated by jOOQ.
 */
package com.squer.prorpel.jooq.tables.records


import com.squer.prorpel.jooq.tables.TmpKamMappingUpload

import javax.annotation.processing.Generated

import org.jooq.Field
import org.jooq.Record9
import org.jooq.Row9
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
open class TmpKamMappingUploadRecord() : TableRecordImpl<TmpKamMappingUploadRecord>(TmpKamMappingUpload.TMP_KAM_MAPPING_UPLOAD), Record9<String?, String?, String?, String?, String?, String?, String?, Long?, String?> {

    open var subCustomer: String?
        set(value): Unit = set(0, value)
        get(): String? = get(0) as String?

    open var sapCode: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

    open var subCustomerName: String?
        set(value): Unit = set(2, value)
        get(): String? = get(2) as String?

    open var account: String?
        set(value): Unit = set(3, value)
        get(): String? = get(3) as String?

    open var seName: String?
        set(value): Unit = set(4, value)
        get(): String? = get(4) as String?

    open var amName: String?
        set(value): Unit = set(5, value)
        get(): String? = get(5) as String?

    open var rmName: String?
        set(value): Unit = set(6, value)
        get(): String? = get(6) as String?

    open var jobExecutionId: Long?
        set(value): Unit = set(7, value)
        get(): Long? = get(7) as Long?

    open var status: String?
        set(value): Unit = set(8, value)
        get(): String? = get(8) as String?

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    override fun fieldsRow(): Row9<String?, String?, String?, String?, String?, String?, String?, Long?, String?> = super.fieldsRow() as Row9<String?, String?, String?, String?, String?, String?, String?, Long?, String?>
    override fun valuesRow(): Row9<String?, String?, String?, String?, String?, String?, String?, Long?, String?> = super.valuesRow() as Row9<String?, String?, String?, String?, String?, String?, String?, Long?, String?>
    override fun field1(): Field<String?> = TmpKamMappingUpload.TMP_KAM_MAPPING_UPLOAD.SUB_CUSTOMER
    override fun field2(): Field<String?> = TmpKamMappingUpload.TMP_KAM_MAPPING_UPLOAD.SAP_CODE
    override fun field3(): Field<String?> = TmpKamMappingUpload.TMP_KAM_MAPPING_UPLOAD.SUB_CUSTOMER_NAME
    override fun field4(): Field<String?> = TmpKamMappingUpload.TMP_KAM_MAPPING_UPLOAD.ACCOUNT
    override fun field5(): Field<String?> = TmpKamMappingUpload.TMP_KAM_MAPPING_UPLOAD.SE_NAME
    override fun field6(): Field<String?> = TmpKamMappingUpload.TMP_KAM_MAPPING_UPLOAD.AM_NAME
    override fun field7(): Field<String?> = TmpKamMappingUpload.TMP_KAM_MAPPING_UPLOAD.RM_NAME
    override fun field8(): Field<Long?> = TmpKamMappingUpload.TMP_KAM_MAPPING_UPLOAD.JOB_EXECUTION_ID
    override fun field9(): Field<String?> = TmpKamMappingUpload.TMP_KAM_MAPPING_UPLOAD.STATUS
    override fun component1(): String? = subCustomer
    override fun component2(): String? = sapCode
    override fun component3(): String? = subCustomerName
    override fun component4(): String? = account
    override fun component5(): String? = seName
    override fun component6(): String? = amName
    override fun component7(): String? = rmName
    override fun component8(): Long? = jobExecutionId
    override fun component9(): String? = status
    override fun value1(): String? = subCustomer
    override fun value2(): String? = sapCode
    override fun value3(): String? = subCustomerName
    override fun value4(): String? = account
    override fun value5(): String? = seName
    override fun value6(): String? = amName
    override fun value7(): String? = rmName
    override fun value8(): Long? = jobExecutionId
    override fun value9(): String? = status

    override fun value1(value: String?): TmpKamMappingUploadRecord {
        this.subCustomer = value
        return this
    }

    override fun value2(value: String?): TmpKamMappingUploadRecord {
        this.sapCode = value
        return this
    }

    override fun value3(value: String?): TmpKamMappingUploadRecord {
        this.subCustomerName = value
        return this
    }

    override fun value4(value: String?): TmpKamMappingUploadRecord {
        this.account = value
        return this
    }

    override fun value5(value: String?): TmpKamMappingUploadRecord {
        this.seName = value
        return this
    }

    override fun value6(value: String?): TmpKamMappingUploadRecord {
        this.amName = value
        return this
    }

    override fun value7(value: String?): TmpKamMappingUploadRecord {
        this.rmName = value
        return this
    }

    override fun value8(value: Long?): TmpKamMappingUploadRecord {
        this.jobExecutionId = value
        return this
    }

    override fun value9(value: String?): TmpKamMappingUploadRecord {
        this.status = value
        return this
    }

    override fun values(value1: String?, value2: String?, value3: String?, value4: String?, value5: String?, value6: String?, value7: String?, value8: Long?, value9: String?): TmpKamMappingUploadRecord {
        this.value1(value1)
        this.value2(value2)
        this.value3(value3)
        this.value4(value4)
        this.value5(value5)
        this.value6(value6)
        this.value7(value7)
        this.value8(value8)
        this.value9(value9)
        return this
    }

    /**
     * Create a detached, initialised TmpKamMappingUploadRecord
     */
    constructor(subCustomer: String? = null, sapCode: String? = null, subCustomerName: String? = null, account: String? = null, seName: String? = null, amName: String? = null, rmName: String? = null, jobExecutionId: Long? = null, status: String? = null): this() {
        this.subCustomer = subCustomer
        this.sapCode = sapCode
        this.subCustomerName = subCustomerName
        this.account = account
        this.seName = seName
        this.amName = amName
        this.rmName = rmName
        this.jobExecutionId = jobExecutionId
        this.status = status
    }
}