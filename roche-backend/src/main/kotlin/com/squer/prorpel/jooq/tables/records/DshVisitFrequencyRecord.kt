/*
 * This file is generated by jOOQ.
 */
package com.squer.prorpel.jooq.tables.records


import com.squer.prorpel.jooq.tables.DshVisitFrequency

import javax.annotation.processing.Generated

import org.jooq.Field
import org.jooq.Record5
import org.jooq.Row5
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
open class DshVisitFrequencyRecord() : TableRecordImpl<DshVisitFrequencyRecord>(DshVisitFrequency.DSH_VISIT_FREQUENCY), Record5<Int?, Int?, String?, String?, Int?> {

    open var month: Int?
        set(value): Unit = set(0, value)
        get(): Int? = get(0) as Int?

    open var year: Int?
        set(value): Unit = set(1, value)
        get(): Int? = get(1) as Int?

    open var employeeId: String?
        set(value): Unit = set(2, value)
        get(): String? = get(2) as String?

    open var doctorId: String?
        set(value): Unit = set(3, value)
        get(): String? = get(3) as String?

    open var visitCout: Int?
        set(value): Unit = set(4, value)
        get(): Int? = get(4) as Int?

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    override fun fieldsRow(): Row5<Int?, Int?, String?, String?, Int?> = super.fieldsRow() as Row5<Int?, Int?, String?, String?, Int?>
    override fun valuesRow(): Row5<Int?, Int?, String?, String?, Int?> = super.valuesRow() as Row5<Int?, Int?, String?, String?, Int?>
    override fun field1(): Field<Int?> = DshVisitFrequency.DSH_VISIT_FREQUENCY.MONTH
    override fun field2(): Field<Int?> = DshVisitFrequency.DSH_VISIT_FREQUENCY.YEAR
    override fun field3(): Field<String?> = DshVisitFrequency.DSH_VISIT_FREQUENCY.EMPLOYEE_ID
    override fun field4(): Field<String?> = DshVisitFrequency.DSH_VISIT_FREQUENCY.DOCTOR_ID
    override fun field5(): Field<Int?> = DshVisitFrequency.DSH_VISIT_FREQUENCY.VISIT_COUT
    override fun component1(): Int? = month
    override fun component2(): Int? = year
    override fun component3(): String? = employeeId
    override fun component4(): String? = doctorId
    override fun component5(): Int? = visitCout
    override fun value1(): Int? = month
    override fun value2(): Int? = year
    override fun value3(): String? = employeeId
    override fun value4(): String? = doctorId
    override fun value5(): Int? = visitCout

    override fun value1(value: Int?): DshVisitFrequencyRecord {
        this.month = value
        return this
    }

    override fun value2(value: Int?): DshVisitFrequencyRecord {
        this.year = value
        return this
    }

    override fun value3(value: String?): DshVisitFrequencyRecord {
        this.employeeId = value
        return this
    }

    override fun value4(value: String?): DshVisitFrequencyRecord {
        this.doctorId = value
        return this
    }

    override fun value5(value: Int?): DshVisitFrequencyRecord {
        this.visitCout = value
        return this
    }

    override fun values(value1: Int?, value2: Int?, value3: String?, value4: String?, value5: Int?): DshVisitFrequencyRecord {
        this.value1(value1)
        this.value2(value2)
        this.value3(value3)
        this.value4(value4)
        this.value5(value5)
        return this
    }

    /**
     * Create a detached, initialised DshVisitFrequencyRecord
     */
    constructor(month: Int? = null, year: Int? = null, employeeId: String? = null, doctorId: String? = null, visitCout: Int? = null): this() {
        this.month = month
        this.year = year
        this.employeeId = employeeId
        this.doctorId = doctorId
        this.visitCout = visitCout
    }
}
