/*
 * This file is generated by jOOQ.
 */
package com.squer.prorpel.jooq.tables.records


import com.squer.prorpel.jooq.tables.BatchJobType

import javax.annotation.processing.Generated

import org.jooq.Field
import org.jooq.Record7
import org.jooq.Row7
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
open class BatchJobTypeRecord() : TableRecordImpl<BatchJobTypeRecord>(BatchJobType.BATCH_JOB_TYPE), Record7<Long?, String?, String?, Int?, Int?, String?, String?> {

    open var jobExecutionId: Long?
        set(value): Unit = set(0, value)
        get(): Long? = get(0) as Long?

    open var jobType: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

    open var fileName: String?
        set(value): Unit = set(2, value)
        get(): String? = get(2) as String?

    open var totalRecord: Int?
        set(value): Unit = set(3, value)
        get(): Int? = get(3) as Int?

    open var errorRecord: Int?
        set(value): Unit = set(4, value)
        get(): Int? = get(4) as Int?

    open var status: String?
        set(value): Unit = set(5, value)
        get(): String? = get(5) as String?

    open var uploadid: String?
        set(value): Unit = set(6, value)
        get(): String? = get(6) as String?

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    override fun fieldsRow(): Row7<Long?, String?, String?, Int?, Int?, String?, String?> = super.fieldsRow() as Row7<Long?, String?, String?, Int?, Int?, String?, String?>
    override fun valuesRow(): Row7<Long?, String?, String?, Int?, Int?, String?, String?> = super.valuesRow() as Row7<Long?, String?, String?, Int?, Int?, String?, String?>
    override fun field1(): Field<Long?> = BatchJobType.BATCH_JOB_TYPE.JOB_EXECUTION_ID
    override fun field2(): Field<String?> = BatchJobType.BATCH_JOB_TYPE.JOB_TYPE
    override fun field3(): Field<String?> = BatchJobType.BATCH_JOB_TYPE.FILE_NAME
    override fun field4(): Field<Int?> = BatchJobType.BATCH_JOB_TYPE.TOTAL_RECORD
    override fun field5(): Field<Int?> = BatchJobType.BATCH_JOB_TYPE.ERROR_RECORD
    override fun field6(): Field<String?> = BatchJobType.BATCH_JOB_TYPE.STATUS
    override fun field7(): Field<String?> = BatchJobType.BATCH_JOB_TYPE.UPLOADID
    override fun component1(): Long? = jobExecutionId
    override fun component2(): String? = jobType
    override fun component3(): String? = fileName
    override fun component4(): Int? = totalRecord
    override fun component5(): Int? = errorRecord
    override fun component6(): String? = status
    override fun component7(): String? = uploadid
    override fun value1(): Long? = jobExecutionId
    override fun value2(): String? = jobType
    override fun value3(): String? = fileName
    override fun value4(): Int? = totalRecord
    override fun value5(): Int? = errorRecord
    override fun value6(): String? = status
    override fun value7(): String? = uploadid

    override fun value1(value: Long?): BatchJobTypeRecord {
        this.jobExecutionId = value
        return this
    }

    override fun value2(value: String?): BatchJobTypeRecord {
        this.jobType = value
        return this
    }

    override fun value3(value: String?): BatchJobTypeRecord {
        this.fileName = value
        return this
    }

    override fun value4(value: Int?): BatchJobTypeRecord {
        this.totalRecord = value
        return this
    }

    override fun value5(value: Int?): BatchJobTypeRecord {
        this.errorRecord = value
        return this
    }

    override fun value6(value: String?): BatchJobTypeRecord {
        this.status = value
        return this
    }

    override fun value7(value: String?): BatchJobTypeRecord {
        this.uploadid = value
        return this
    }

    override fun values(value1: Long?, value2: String?, value3: String?, value4: Int?, value5: Int?, value6: String?, value7: String?): BatchJobTypeRecord {
        this.value1(value1)
        this.value2(value2)
        this.value3(value3)
        this.value4(value4)
        this.value5(value5)
        this.value6(value6)
        this.value7(value7)
        return this
    }

    /**
     * Create a detached, initialised BatchJobTypeRecord
     */
    constructor(jobExecutionId: Long? = null, jobType: String? = null, fileName: String? = null, totalRecord: Int? = null, errorRecord: Int? = null, status: String? = null, uploadid: String? = null): this() {
        this.jobExecutionId = jobExecutionId
        this.jobType = jobType
        this.fileName = fileName
        this.totalRecord = totalRecord
        this.errorRecord = errorRecord
        this.status = status
        this.uploadid = uploadid
    }
}