/*
 * This file is generated by jOOQ.
 */
package com.squer.prorpel.jooq.tables.records


import com.squer.prorpel.jooq.tables.SryAnswerMaster

import java.time.OffsetDateTime

import javax.annotation.processing.Generated

import org.jooq.Field
import org.jooq.Record11
import org.jooq.Row11
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
open class SryAnswerMasterRecord() : TableRecordImpl<SryAnswerMasterRecord>(SryAnswerMaster.SRY_ANSWER_MASTER), Record11<String?, Int?, OffsetDateTime?, Long?, String?, OffsetDateTime?, Int?, String?, String?, String?, String?> {

    open var name: String?
        set(value): Unit = set(0, value)
        get(): String? = get(0) as String?

    open var displayOrder: Int?
        set(value): Unit = set(1, value)
        get(): Int? = get(1) as Int?

    open var updatedOn: OffsetDateTime?
        set(value): Unit = set(2, value)
        get(): OffsetDateTime? = get(2) as OffsetDateTime?

    open var staleId: Long?
        set(value): Unit = set(3, value)
        get(): Long? = get(3) as Long?

    open var ciName: String?
        set(value): Unit = set(4, value)
        get(): String? = get(4) as String?

    open var createdOn: OffsetDateTime?
        set(value): Unit = set(5, value)
        get(): OffsetDateTime? = get(5) as OffsetDateTime?

    open var score: Int?
        set(value): Unit = set(6, value)
        get(): Int? = get(6) as Int?

    open var id: String?
        set(value): Unit = set(7, value)
        get(): String? = get(7) as String?

    open var updatedBy: String?
        set(value): Unit = set(8, value)
        get(): String? = get(8) as String?

    open var questionId: String?
        set(value): Unit = set(9, value)
        get(): String? = get(9) as String?

    open var createdBy: String?
        set(value): Unit = set(10, value)
        get(): String? = get(10) as String?

    // -------------------------------------------------------------------------
    // Record11 type implementation
    // -------------------------------------------------------------------------

    override fun fieldsRow(): Row11<String?, Int?, OffsetDateTime?, Long?, String?, OffsetDateTime?, Int?, String?, String?, String?, String?> = super.fieldsRow() as Row11<String?, Int?, OffsetDateTime?, Long?, String?, OffsetDateTime?, Int?, String?, String?, String?, String?>
    override fun valuesRow(): Row11<String?, Int?, OffsetDateTime?, Long?, String?, OffsetDateTime?, Int?, String?, String?, String?, String?> = super.valuesRow() as Row11<String?, Int?, OffsetDateTime?, Long?, String?, OffsetDateTime?, Int?, String?, String?, String?, String?>
    override fun field1(): Field<String?> = SryAnswerMaster.SRY_ANSWER_MASTER.NAME
    override fun field2(): Field<Int?> = SryAnswerMaster.SRY_ANSWER_MASTER.DISPLAY_ORDER
    override fun field3(): Field<OffsetDateTime?> = SryAnswerMaster.SRY_ANSWER_MASTER.UPDATED_ON
    override fun field4(): Field<Long?> = SryAnswerMaster.SRY_ANSWER_MASTER.STALE_ID
    override fun field5(): Field<String?> = SryAnswerMaster.SRY_ANSWER_MASTER.CI_NAME
    override fun field6(): Field<OffsetDateTime?> = SryAnswerMaster.SRY_ANSWER_MASTER.CREATED_ON
    override fun field7(): Field<Int?> = SryAnswerMaster.SRY_ANSWER_MASTER.SCORE
    override fun field8(): Field<String?> = SryAnswerMaster.SRY_ANSWER_MASTER.ID
    override fun field9(): Field<String?> = SryAnswerMaster.SRY_ANSWER_MASTER.UPDATED_BY
    override fun field10(): Field<String?> = SryAnswerMaster.SRY_ANSWER_MASTER.QUESTION_ID
    override fun field11(): Field<String?> = SryAnswerMaster.SRY_ANSWER_MASTER.CREATED_BY
    override fun component1(): String? = name
    override fun component2(): Int? = displayOrder
    override fun component3(): OffsetDateTime? = updatedOn
    override fun component4(): Long? = staleId
    override fun component5(): String? = ciName
    override fun component6(): OffsetDateTime? = createdOn
    override fun component7(): Int? = score
    override fun component8(): String? = id
    override fun component9(): String? = updatedBy
    override fun component10(): String? = questionId
    override fun component11(): String? = createdBy
    override fun value1(): String? = name
    override fun value2(): Int? = displayOrder
    override fun value3(): OffsetDateTime? = updatedOn
    override fun value4(): Long? = staleId
    override fun value5(): String? = ciName
    override fun value6(): OffsetDateTime? = createdOn
    override fun value7(): Int? = score
    override fun value8(): String? = id
    override fun value9(): String? = updatedBy
    override fun value10(): String? = questionId
    override fun value11(): String? = createdBy

    override fun value1(value: String?): SryAnswerMasterRecord {
        this.name = value
        return this
    }

    override fun value2(value: Int?): SryAnswerMasterRecord {
        this.displayOrder = value
        return this
    }

    override fun value3(value: OffsetDateTime?): SryAnswerMasterRecord {
        this.updatedOn = value
        return this
    }

    override fun value4(value: Long?): SryAnswerMasterRecord {
        this.staleId = value
        return this
    }

    override fun value5(value: String?): SryAnswerMasterRecord {
        this.ciName = value
        return this
    }

    override fun value6(value: OffsetDateTime?): SryAnswerMasterRecord {
        this.createdOn = value
        return this
    }

    override fun value7(value: Int?): SryAnswerMasterRecord {
        this.score = value
        return this
    }

    override fun value8(value: String?): SryAnswerMasterRecord {
        this.id = value
        return this
    }

    override fun value9(value: String?): SryAnswerMasterRecord {
        this.updatedBy = value
        return this
    }

    override fun value10(value: String?): SryAnswerMasterRecord {
        this.questionId = value
        return this
    }

    override fun value11(value: String?): SryAnswerMasterRecord {
        this.createdBy = value
        return this
    }

    override fun values(value1: String?, value2: Int?, value3: OffsetDateTime?, value4: Long?, value5: String?, value6: OffsetDateTime?, value7: Int?, value8: String?, value9: String?, value10: String?, value11: String?): SryAnswerMasterRecord {
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
        return this
    }

    /**
     * Create a detached, initialised SryAnswerMasterRecord
     */
    constructor(name: String? = null, displayOrder: Int? = null, updatedOn: OffsetDateTime? = null, staleId: Long? = null, ciName: String? = null, createdOn: OffsetDateTime? = null, score: Int? = null, id: String? = null, updatedBy: String? = null, questionId: String? = null, createdBy: String? = null): this() {
        this.name = name
        this.displayOrder = displayOrder
        this.updatedOn = updatedOn
        this.staleId = staleId
        this.ciName = ciName
        this.createdOn = createdOn
        this.score = score
        this.id = id
        this.updatedBy = updatedBy
        this.questionId = questionId
        this.createdBy = createdBy
    }
}
