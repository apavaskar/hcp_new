/*
 * This file is generated by jOOQ.
 */
package com.squer.prorpel.jooq.tables


import com.squer.prorpel.jooq.Public
import com.squer.prorpel.jooq.tables.records.CmtEmployeeHistoryRecord

import java.time.OffsetDateTime
import java.util.function.Function

import javax.annotation.processing.Generated

import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.Name
import org.jooq.Record
import org.jooq.Records
import org.jooq.Row4
import org.jooq.Schema
import org.jooq.SelectField
import org.jooq.Table
import org.jooq.TableField
import org.jooq.TableOptions
import org.jooq.impl.DSL
import org.jooq.impl.Internal
import org.jooq.impl.SQLDataType
import org.jooq.impl.TableImpl


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
open class CmtEmployeeHistory(
    alias: Name,
    child: Table<out Record>?,
    path: ForeignKey<out Record, CmtEmployeeHistoryRecord>?,
    aliased: Table<CmtEmployeeHistoryRecord>?,
    parameters: Array<Field<*>?>?
): TableImpl<CmtEmployeeHistoryRecord>(
    alias,
    Public.PUBLIC,
    child,
    path,
    aliased,
    parameters,
    DSL.comment(""),
    TableOptions.table()
) {
    companion object {

        /**
         * The reference instance of <code>public.cmt_employee_history</code>
         */
        val CMT_EMPLOYEE_HISTORY: CmtEmployeeHistory = CmtEmployeeHistory()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<CmtEmployeeHistoryRecord> = CmtEmployeeHistoryRecord::class.java

    /**
     * The column <code>public.cmt_employee_history.employee_id</code>.
     */
    val EMPLOYEE_ID: TableField<CmtEmployeeHistoryRecord, String?> = createField(DSL.name("employee_id"), SQLDataType.VARCHAR(37), this, "")

    /**
     * The column <code>public.cmt_employee_history.location_id</code>.
     */
    val LOCATION_ID: TableField<CmtEmployeeHistoryRecord, String?> = createField(DSL.name("location_id"), SQLDataType.VARCHAR(37), this, "")

    /**
     * The column <code>public.cmt_employee_history.created_date</code>.
     */
    val CREATED_DATE: TableField<CmtEmployeeHistoryRecord, OffsetDateTime?> = createField(DSL.name("created_date"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "")

    /**
     * The column <code>public.cmt_employee_history.id</code>.
     */
    val ID: TableField<CmtEmployeeHistoryRecord, String?> = createField(DSL.name("id"), SQLDataType.VARCHAR(37), this, "")

    private constructor(alias: Name, aliased: Table<CmtEmployeeHistoryRecord>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<CmtEmployeeHistoryRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>public.cmt_employee_history</code> table
     * reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>public.cmt_employee_history</code> table
     * reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>public.cmt_employee_history</code> table reference
     */
    constructor(): this(DSL.name("cmt_employee_history"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, CmtEmployeeHistoryRecord>): this(Internal.createPathAlias(child, key), child, key, CMT_EMPLOYEE_HISTORY, null)
    override fun getSchema(): Schema? = if (aliased()) null else Public.PUBLIC
    override fun `as`(alias: String): CmtEmployeeHistory = CmtEmployeeHistory(DSL.name(alias), this)
    override fun `as`(alias: Name): CmtEmployeeHistory = CmtEmployeeHistory(alias, this)
    override fun `as`(alias: Table<*>): CmtEmployeeHistory = CmtEmployeeHistory(alias.getQualifiedName(), this)

    /**
     * Rename this table
     */
    override fun rename(name: String): CmtEmployeeHistory = CmtEmployeeHistory(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): CmtEmployeeHistory = CmtEmployeeHistory(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): CmtEmployeeHistory = CmtEmployeeHistory(name.getQualifiedName(), null)

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row4<String?, String?, OffsetDateTime?, String?> = super.fieldsRow() as Row4<String?, String?, OffsetDateTime?, String?>

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    fun <U> mapping(from: (String?, String?, OffsetDateTime?, String?) -> U): SelectField<U> = convertFrom(Records.mapping(from))

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    fun <U> mapping(toType: Class<U>, from: (String?, String?, OffsetDateTime?, String?) -> U): SelectField<U> = convertFrom(toType, Records.mapping(from))
}