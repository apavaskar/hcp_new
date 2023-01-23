/*
 * This file is generated by jOOQ.
 */
package com.squer.prorpel.jooq.tables.records


import com.squer.prorpel.jooq.tables.Searchconditionmeta

import javax.annotation.processing.Generated

import org.jooq.Field
import org.jooq.Record1
import org.jooq.Record5
import org.jooq.Row5
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
open class SearchconditionmetaRecord() : UpdatableRecordImpl<SearchconditionmetaRecord>(Searchconditionmeta.SEARCHCONDITIONMETA), Record5<Long?, Long?, String?, String?, String?> {

    open var id: Long?
        set(value): Unit = set(0, value)
        get(): Long? = get(0) as Long?

    open var searchMetaId: Long?
        set(value): Unit = set(1, value)
        get(): Long? = get(1) as Long?

    open var name: String?
        set(value): Unit = set(2, value)
        get(): String? = get(2) as String?

    open var `operator`: String?
        set(value): Unit = set(3, value)
        get(): String? = get(3) as String?

    open var formatter: String?
        set(value): Unit = set(4, value)
        get(): String? = get(4) as String?

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record1<Long?> = super.key() as Record1<Long?>

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    override fun fieldsRow(): Row5<Long?, Long?, String?, String?, String?> = super.fieldsRow() as Row5<Long?, Long?, String?, String?, String?>
    override fun valuesRow(): Row5<Long?, Long?, String?, String?, String?> = super.valuesRow() as Row5<Long?, Long?, String?, String?, String?>
    override fun field1(): Field<Long?> = Searchconditionmeta.SEARCHCONDITIONMETA.ID
    override fun field2(): Field<Long?> = Searchconditionmeta.SEARCHCONDITIONMETA.SEARCH_META_ID
    override fun field3(): Field<String?> = Searchconditionmeta.SEARCHCONDITIONMETA.NAME
    override fun field4(): Field<String?> = Searchconditionmeta.SEARCHCONDITIONMETA.OPERATOR
    override fun field5(): Field<String?> = Searchconditionmeta.SEARCHCONDITIONMETA.FORMATTER
    override fun component1(): Long? = id
    override fun component2(): Long? = searchMetaId
    override fun component3(): String? = name
    override fun component4(): String? = `operator`
    override fun component5(): String? = formatter
    override fun value1(): Long? = id
    override fun value2(): Long? = searchMetaId
    override fun value3(): String? = name
    override fun value4(): String? = `operator`
    override fun value5(): String? = formatter

    override fun value1(value: Long?): SearchconditionmetaRecord {
        this.id = value
        return this
    }

    override fun value2(value: Long?): SearchconditionmetaRecord {
        this.searchMetaId = value
        return this
    }

    override fun value3(value: String?): SearchconditionmetaRecord {
        this.name = value
        return this
    }

    override fun value4(value: String?): SearchconditionmetaRecord {
        this.`operator` = value
        return this
    }

    override fun value5(value: String?): SearchconditionmetaRecord {
        this.formatter = value
        return this
    }

    override fun values(value1: Long?, value2: Long?, value3: String?, value4: String?, value5: String?): SearchconditionmetaRecord {
        this.value1(value1)
        this.value2(value2)
        this.value3(value3)
        this.value4(value4)
        this.value5(value5)
        return this
    }

    /**
     * Create a detached, initialised SearchconditionmetaRecord
     */
    constructor(id: Long? = null, searchMetaId: Long? = null, name: String? = null, `operator`: String? = null, formatter: String? = null): this() {
        this.id = id
        this.searchMetaId = searchMetaId
        this.name = name
        this.`operator` = `operator`
        this.formatter = formatter
    }
}
