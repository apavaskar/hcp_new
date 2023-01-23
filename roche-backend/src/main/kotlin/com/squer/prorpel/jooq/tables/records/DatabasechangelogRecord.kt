/*
 * This file is generated by jOOQ.
 */
package com.squer.prorpel.jooq.tables.records


import com.squer.prorpel.jooq.tables.Databasechangelog

import java.time.LocalDateTime

import javax.annotation.processing.Generated

import org.jooq.Field
import org.jooq.Record14
import org.jooq.Row14
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
open class DatabasechangelogRecord() : TableRecordImpl<DatabasechangelogRecord>(Databasechangelog.DATABASECHANGELOG), Record14<String?, String?, String?, LocalDateTime?, Int?, String?, String?, String?, String?, String?, String?, String?, String?, String?> {

    open var id: String?
        set(value): Unit = set(0, value)
        get(): String? = get(0) as String?

    open var author: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

    open var filename: String?
        set(value): Unit = set(2, value)
        get(): String? = get(2) as String?

    open var dateexecuted: LocalDateTime?
        set(value): Unit = set(3, value)
        get(): LocalDateTime? = get(3) as LocalDateTime?

    open var orderexecuted: Int?
        set(value): Unit = set(4, value)
        get(): Int? = get(4) as Int?

    open var exectype: String?
        set(value): Unit = set(5, value)
        get(): String? = get(5) as String?

    open var md5sum: String?
        set(value): Unit = set(6, value)
        get(): String? = get(6) as String?

    open var description: String?
        set(value): Unit = set(7, value)
        get(): String? = get(7) as String?

    open var comments: String?
        set(value): Unit = set(8, value)
        get(): String? = get(8) as String?

    open var tag: String?
        set(value): Unit = set(9, value)
        get(): String? = get(9) as String?

    open var liquibase: String?
        set(value): Unit = set(10, value)
        get(): String? = get(10) as String?

    open var contexts: String?
        set(value): Unit = set(11, value)
        get(): String? = get(11) as String?

    open var labels: String?
        set(value): Unit = set(12, value)
        get(): String? = get(12) as String?

    open var deploymentId: String?
        set(value): Unit = set(13, value)
        get(): String? = get(13) as String?

    // -------------------------------------------------------------------------
    // Record14 type implementation
    // -------------------------------------------------------------------------

    override fun fieldsRow(): Row14<String?, String?, String?, LocalDateTime?, Int?, String?, String?, String?, String?, String?, String?, String?, String?, String?> = super.fieldsRow() as Row14<String?, String?, String?, LocalDateTime?, Int?, String?, String?, String?, String?, String?, String?, String?, String?, String?>
    override fun valuesRow(): Row14<String?, String?, String?, LocalDateTime?, Int?, String?, String?, String?, String?, String?, String?, String?, String?, String?> = super.valuesRow() as Row14<String?, String?, String?, LocalDateTime?, Int?, String?, String?, String?, String?, String?, String?, String?, String?, String?>
    override fun field1(): Field<String?> = Databasechangelog.DATABASECHANGELOG.ID
    override fun field2(): Field<String?> = Databasechangelog.DATABASECHANGELOG.AUTHOR
    override fun field3(): Field<String?> = Databasechangelog.DATABASECHANGELOG.FILENAME
    override fun field4(): Field<LocalDateTime?> = Databasechangelog.DATABASECHANGELOG.DATEEXECUTED
    override fun field5(): Field<Int?> = Databasechangelog.DATABASECHANGELOG.ORDEREXECUTED
    override fun field6(): Field<String?> = Databasechangelog.DATABASECHANGELOG.EXECTYPE
    override fun field7(): Field<String?> = Databasechangelog.DATABASECHANGELOG.MD5SUM
    override fun field8(): Field<String?> = Databasechangelog.DATABASECHANGELOG.DESCRIPTION
    override fun field9(): Field<String?> = Databasechangelog.DATABASECHANGELOG.COMMENTS
    override fun field10(): Field<String?> = Databasechangelog.DATABASECHANGELOG.TAG
    override fun field11(): Field<String?> = Databasechangelog.DATABASECHANGELOG.LIQUIBASE
    override fun field12(): Field<String?> = Databasechangelog.DATABASECHANGELOG.CONTEXTS
    override fun field13(): Field<String?> = Databasechangelog.DATABASECHANGELOG.LABELS
    override fun field14(): Field<String?> = Databasechangelog.DATABASECHANGELOG.DEPLOYMENT_ID
    override fun component1(): String? = id
    override fun component2(): String? = author
    override fun component3(): String? = filename
    override fun component4(): LocalDateTime? = dateexecuted
    override fun component5(): Int? = orderexecuted
    override fun component6(): String? = exectype
    override fun component7(): String? = md5sum
    override fun component8(): String? = description
    override fun component9(): String? = comments
    override fun component10(): String? = tag
    override fun component11(): String? = liquibase
    override fun component12(): String? = contexts
    override fun component13(): String? = labels
    override fun component14(): String? = deploymentId
    override fun value1(): String? = id
    override fun value2(): String? = author
    override fun value3(): String? = filename
    override fun value4(): LocalDateTime? = dateexecuted
    override fun value5(): Int? = orderexecuted
    override fun value6(): String? = exectype
    override fun value7(): String? = md5sum
    override fun value8(): String? = description
    override fun value9(): String? = comments
    override fun value10(): String? = tag
    override fun value11(): String? = liquibase
    override fun value12(): String? = contexts
    override fun value13(): String? = labels
    override fun value14(): String? = deploymentId

    override fun value1(value: String?): DatabasechangelogRecord {
        this.id = value
        return this
    }

    override fun value2(value: String?): DatabasechangelogRecord {
        this.author = value
        return this
    }

    override fun value3(value: String?): DatabasechangelogRecord {
        this.filename = value
        return this
    }

    override fun value4(value: LocalDateTime?): DatabasechangelogRecord {
        this.dateexecuted = value
        return this
    }

    override fun value5(value: Int?): DatabasechangelogRecord {
        this.orderexecuted = value
        return this
    }

    override fun value6(value: String?): DatabasechangelogRecord {
        this.exectype = value
        return this
    }

    override fun value7(value: String?): DatabasechangelogRecord {
        this.md5sum = value
        return this
    }

    override fun value8(value: String?): DatabasechangelogRecord {
        this.description = value
        return this
    }

    override fun value9(value: String?): DatabasechangelogRecord {
        this.comments = value
        return this
    }

    override fun value10(value: String?): DatabasechangelogRecord {
        this.tag = value
        return this
    }

    override fun value11(value: String?): DatabasechangelogRecord {
        this.liquibase = value
        return this
    }

    override fun value12(value: String?): DatabasechangelogRecord {
        this.contexts = value
        return this
    }

    override fun value13(value: String?): DatabasechangelogRecord {
        this.labels = value
        return this
    }

    override fun value14(value: String?): DatabasechangelogRecord {
        this.deploymentId = value
        return this
    }

    override fun values(value1: String?, value2: String?, value3: String?, value4: LocalDateTime?, value5: Int?, value6: String?, value7: String?, value8: String?, value9: String?, value10: String?, value11: String?, value12: String?, value13: String?, value14: String?): DatabasechangelogRecord {
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
     * Create a detached, initialised DatabasechangelogRecord
     */
    constructor(id: String? = null, author: String? = null, filename: String? = null, dateexecuted: LocalDateTime? = null, orderexecuted: Int? = null, exectype: String? = null, md5sum: String? = null, description: String? = null, comments: String? = null, tag: String? = null, liquibase: String? = null, contexts: String? = null, labels: String? = null, deploymentId: String? = null): this() {
        this.id = id
        this.author = author
        this.filename = filename
        this.dateexecuted = dateexecuted
        this.orderexecuted = orderexecuted
        this.exectype = exectype
        this.md5sum = md5sum
        this.description = description
        this.comments = comments
        this.tag = tag
        this.liquibase = liquibase
        this.contexts = contexts
        this.labels = labels
        this.deploymentId = deploymentId
    }
}