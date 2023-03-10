/*
 * This file is generated by jOOQ.
 */
package com.squer.prorpel.jooq.tables.records


import com.squer.prorpel.jooq.tables.Test

import javax.annotation.processing.Generated

import org.jooq.Field
import org.jooq.Record1
import org.jooq.Row1
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
open class TestRecord() : TableRecordImpl<TestRecord>(Test.TEST), Record1<String?> {

    open var testencr: String?
        set(value): Unit = set(0, value)
        get(): String? = get(0) as String?

    // -------------------------------------------------------------------------
    // Record1 type implementation
    // -------------------------------------------------------------------------

    override fun fieldsRow(): Row1<String?> = super.fieldsRow() as Row1<String?>
    override fun valuesRow(): Row1<String?> = super.valuesRow() as Row1<String?>
    override fun field1(): Field<String?> = Test.TEST.TESTENCR
    override fun component1(): String? = testencr
    override fun value1(): String? = testencr

    override fun value1(value: String?): TestRecord {
        this.testencr = value
        return this
    }

    override fun values(value1: String?): TestRecord {
        this.value1(value1)
        return this
    }

    /**
     * Create a detached, initialised TestRecord
     */
    constructor(testencr: String? = null): this() {
        this.testencr = testencr
    }
}
