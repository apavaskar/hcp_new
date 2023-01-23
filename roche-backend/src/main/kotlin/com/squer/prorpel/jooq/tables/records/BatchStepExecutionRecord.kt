/*
 * This file is generated by jOOQ.
 */
package com.squer.prorpel.jooq.tables.records


import com.squer.prorpel.jooq.tables.BatchStepExecution

import java.time.LocalDateTime

import javax.annotation.processing.Generated

import org.jooq.Field
import org.jooq.Record1
import org.jooq.Record18
import org.jooq.Row18
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
open class BatchStepExecutionRecord() : UpdatableRecordImpl<BatchStepExecutionRecord>(BatchStepExecution.BATCH_STEP_EXECUTION), Record18<Long?, Long?, String?, Long?, LocalDateTime?, LocalDateTime?, String?, Long?, Long?, Long?, Long?, Long?, Long?, Long?, Long?, String?, String?, LocalDateTime?> {

    open var stepExecutionId: Long?
        set(value): Unit = set(0, value)
        get(): Long? = get(0) as Long?

    open var version: Long?
        set(value): Unit = set(1, value)
        get(): Long? = get(1) as Long?

    open var stepName: String?
        set(value): Unit = set(2, value)
        get(): String? = get(2) as String?

    open var jobExecutionId: Long?
        set(value): Unit = set(3, value)
        get(): Long? = get(3) as Long?

    open var startTime: LocalDateTime?
        set(value): Unit = set(4, value)
        get(): LocalDateTime? = get(4) as LocalDateTime?

    open var endTime: LocalDateTime?
        set(value): Unit = set(5, value)
        get(): LocalDateTime? = get(5) as LocalDateTime?

    open var status: String?
        set(value): Unit = set(6, value)
        get(): String? = get(6) as String?

    open var commitCount: Long?
        set(value): Unit = set(7, value)
        get(): Long? = get(7) as Long?

    open var readCount: Long?
        set(value): Unit = set(8, value)
        get(): Long? = get(8) as Long?

    open var filterCount: Long?
        set(value): Unit = set(9, value)
        get(): Long? = get(9) as Long?

    open var writeCount: Long?
        set(value): Unit = set(10, value)
        get(): Long? = get(10) as Long?

    open var readSkipCount: Long?
        set(value): Unit = set(11, value)
        get(): Long? = get(11) as Long?

    open var writeSkipCount: Long?
        set(value): Unit = set(12, value)
        get(): Long? = get(12) as Long?

    open var processSkipCount: Long?
        set(value): Unit = set(13, value)
        get(): Long? = get(13) as Long?

    open var rollbackCount: Long?
        set(value): Unit = set(14, value)
        get(): Long? = get(14) as Long?

    open var exitCode: String?
        set(value): Unit = set(15, value)
        get(): String? = get(15) as String?

    open var exitMessage: String?
        set(value): Unit = set(16, value)
        get(): String? = get(16) as String?

    open var lastUpdated: LocalDateTime?
        set(value): Unit = set(17, value)
        get(): LocalDateTime? = get(17) as LocalDateTime?

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record1<Long?> = super.key() as Record1<Long?>

    // -------------------------------------------------------------------------
    // Record18 type implementation
    // -------------------------------------------------------------------------

    override fun fieldsRow(): Row18<Long?, Long?, String?, Long?, LocalDateTime?, LocalDateTime?, String?, Long?, Long?, Long?, Long?, Long?, Long?, Long?, Long?, String?, String?, LocalDateTime?> = super.fieldsRow() as Row18<Long?, Long?, String?, Long?, LocalDateTime?, LocalDateTime?, String?, Long?, Long?, Long?, Long?, Long?, Long?, Long?, Long?, String?, String?, LocalDateTime?>
    override fun valuesRow(): Row18<Long?, Long?, String?, Long?, LocalDateTime?, LocalDateTime?, String?, Long?, Long?, Long?, Long?, Long?, Long?, Long?, Long?, String?, String?, LocalDateTime?> = super.valuesRow() as Row18<Long?, Long?, String?, Long?, LocalDateTime?, LocalDateTime?, String?, Long?, Long?, Long?, Long?, Long?, Long?, Long?, Long?, String?, String?, LocalDateTime?>
    override fun field1(): Field<Long?> = BatchStepExecution.BATCH_STEP_EXECUTION.STEP_EXECUTION_ID
    override fun field2(): Field<Long?> = BatchStepExecution.BATCH_STEP_EXECUTION.VERSION
    override fun field3(): Field<String?> = BatchStepExecution.BATCH_STEP_EXECUTION.STEP_NAME
    override fun field4(): Field<Long?> = BatchStepExecution.BATCH_STEP_EXECUTION.JOB_EXECUTION_ID
    override fun field5(): Field<LocalDateTime?> = BatchStepExecution.BATCH_STEP_EXECUTION.START_TIME
    override fun field6(): Field<LocalDateTime?> = BatchStepExecution.BATCH_STEP_EXECUTION.END_TIME
    override fun field7(): Field<String?> = BatchStepExecution.BATCH_STEP_EXECUTION.STATUS
    override fun field8(): Field<Long?> = BatchStepExecution.BATCH_STEP_EXECUTION.COMMIT_COUNT
    override fun field9(): Field<Long?> = BatchStepExecution.BATCH_STEP_EXECUTION.READ_COUNT
    override fun field10(): Field<Long?> = BatchStepExecution.BATCH_STEP_EXECUTION.FILTER_COUNT
    override fun field11(): Field<Long?> = BatchStepExecution.BATCH_STEP_EXECUTION.WRITE_COUNT
    override fun field12(): Field<Long?> = BatchStepExecution.BATCH_STEP_EXECUTION.READ_SKIP_COUNT
    override fun field13(): Field<Long?> = BatchStepExecution.BATCH_STEP_EXECUTION.WRITE_SKIP_COUNT
    override fun field14(): Field<Long?> = BatchStepExecution.BATCH_STEP_EXECUTION.PROCESS_SKIP_COUNT
    override fun field15(): Field<Long?> = BatchStepExecution.BATCH_STEP_EXECUTION.ROLLBACK_COUNT
    override fun field16(): Field<String?> = BatchStepExecution.BATCH_STEP_EXECUTION.EXIT_CODE
    override fun field17(): Field<String?> = BatchStepExecution.BATCH_STEP_EXECUTION.EXIT_MESSAGE
    override fun field18(): Field<LocalDateTime?> = BatchStepExecution.BATCH_STEP_EXECUTION.LAST_UPDATED
    override fun component1(): Long? = stepExecutionId
    override fun component2(): Long? = version
    override fun component3(): String? = stepName
    override fun component4(): Long? = jobExecutionId
    override fun component5(): LocalDateTime? = startTime
    override fun component6(): LocalDateTime? = endTime
    override fun component7(): String? = status
    override fun component8(): Long? = commitCount
    override fun component9(): Long? = readCount
    override fun component10(): Long? = filterCount
    override fun component11(): Long? = writeCount
    override fun component12(): Long? = readSkipCount
    override fun component13(): Long? = writeSkipCount
    override fun component14(): Long? = processSkipCount
    override fun component15(): Long? = rollbackCount
    override fun component16(): String? = exitCode
    override fun component17(): String? = exitMessage
    override fun component18(): LocalDateTime? = lastUpdated
    override fun value1(): Long? = stepExecutionId
    override fun value2(): Long? = version
    override fun value3(): String? = stepName
    override fun value4(): Long? = jobExecutionId
    override fun value5(): LocalDateTime? = startTime
    override fun value6(): LocalDateTime? = endTime
    override fun value7(): String? = status
    override fun value8(): Long? = commitCount
    override fun value9(): Long? = readCount
    override fun value10(): Long? = filterCount
    override fun value11(): Long? = writeCount
    override fun value12(): Long? = readSkipCount
    override fun value13(): Long? = writeSkipCount
    override fun value14(): Long? = processSkipCount
    override fun value15(): Long? = rollbackCount
    override fun value16(): String? = exitCode
    override fun value17(): String? = exitMessage
    override fun value18(): LocalDateTime? = lastUpdated

    override fun value1(value: Long?): BatchStepExecutionRecord {
        this.stepExecutionId = value
        return this
    }

    override fun value2(value: Long?): BatchStepExecutionRecord {
        this.version = value
        return this
    }

    override fun value3(value: String?): BatchStepExecutionRecord {
        this.stepName = value
        return this
    }

    override fun value4(value: Long?): BatchStepExecutionRecord {
        this.jobExecutionId = value
        return this
    }

    override fun value5(value: LocalDateTime?): BatchStepExecutionRecord {
        this.startTime = value
        return this
    }

    override fun value6(value: LocalDateTime?): BatchStepExecutionRecord {
        this.endTime = value
        return this
    }

    override fun value7(value: String?): BatchStepExecutionRecord {
        this.status = value
        return this
    }

    override fun value8(value: Long?): BatchStepExecutionRecord {
        this.commitCount = value
        return this
    }

    override fun value9(value: Long?): BatchStepExecutionRecord {
        this.readCount = value
        return this
    }

    override fun value10(value: Long?): BatchStepExecutionRecord {
        this.filterCount = value
        return this
    }

    override fun value11(value: Long?): BatchStepExecutionRecord {
        this.writeCount = value
        return this
    }

    override fun value12(value: Long?): BatchStepExecutionRecord {
        this.readSkipCount = value
        return this
    }

    override fun value13(value: Long?): BatchStepExecutionRecord {
        this.writeSkipCount = value
        return this
    }

    override fun value14(value: Long?): BatchStepExecutionRecord {
        this.processSkipCount = value
        return this
    }

    override fun value15(value: Long?): BatchStepExecutionRecord {
        this.rollbackCount = value
        return this
    }

    override fun value16(value: String?): BatchStepExecutionRecord {
        this.exitCode = value
        return this
    }

    override fun value17(value: String?): BatchStepExecutionRecord {
        this.exitMessage = value
        return this
    }

    override fun value18(value: LocalDateTime?): BatchStepExecutionRecord {
        this.lastUpdated = value
        return this
    }

    override fun values(value1: Long?, value2: Long?, value3: String?, value4: Long?, value5: LocalDateTime?, value6: LocalDateTime?, value7: String?, value8: Long?, value9: Long?, value10: Long?, value11: Long?, value12: Long?, value13: Long?, value14: Long?, value15: Long?, value16: String?, value17: String?, value18: LocalDateTime?): BatchStepExecutionRecord {
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
        this.value18(value18)
        return this
    }

    /**
     * Create a detached, initialised BatchStepExecutionRecord
     */
    constructor(stepExecutionId: Long? = null, version: Long? = null, stepName: String? = null, jobExecutionId: Long? = null, startTime: LocalDateTime? = null, endTime: LocalDateTime? = null, status: String? = null, commitCount: Long? = null, readCount: Long? = null, filterCount: Long? = null, writeCount: Long? = null, readSkipCount: Long? = null, writeSkipCount: Long? = null, processSkipCount: Long? = null, rollbackCount: Long? = null, exitCode: String? = null, exitMessage: String? = null, lastUpdated: LocalDateTime? = null): this() {
        this.stepExecutionId = stepExecutionId
        this.version = version
        this.stepName = stepName
        this.jobExecutionId = jobExecutionId
        this.startTime = startTime
        this.endTime = endTime
        this.status = status
        this.commitCount = commitCount
        this.readCount = readCount
        this.filterCount = filterCount
        this.writeCount = writeCount
        this.readSkipCount = readSkipCount
        this.writeSkipCount = writeSkipCount
        this.processSkipCount = processSkipCount
        this.rollbackCount = rollbackCount
        this.exitCode = exitCode
        this.exitMessage = exitMessage
        this.lastUpdated = lastUpdated
    }
}
