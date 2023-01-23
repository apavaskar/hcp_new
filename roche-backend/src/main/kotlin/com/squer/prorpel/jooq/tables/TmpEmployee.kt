/*
 * This file is generated by jOOQ.
 */
package com.squer.prorpel.jooq.tables


import com.squer.prorpel.jooq.Public
import com.squer.prorpel.jooq.tables.records.TmpEmployeeRecord

import java.time.OffsetDateTime
import java.util.function.Function

import javax.annotation.processing.Generated

import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.Name
import org.jooq.Record
import org.jooq.Records
import org.jooq.Row14
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
open class TmpEmployee(
    alias: Name,
    child: Table<out Record>?,
    path: ForeignKey<out Record, TmpEmployeeRecord>?,
    aliased: Table<TmpEmployeeRecord>?,
    parameters: Array<Field<*>?>?
): TableImpl<TmpEmployeeRecord>(
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
         * The reference instance of <code>public.tmp_employee</code>
         */
        val TMP_EMPLOYEE: TmpEmployee = TmpEmployee()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<TmpEmployeeRecord> = TmpEmployeeRecord::class.java

    /**
     * The column <code>public.tmp_employee.updated_on</code>.
     */
    val UPDATED_ON: TableField<TmpEmployeeRecord, OffsetDateTime?> = createField(DSL.name("updated_on"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "")

    /**
     * The column <code>public.tmp_employee.job_title_id</code>.
     */
    val JOB_TITLE_ID: TableField<TmpEmployeeRecord, String?> = createField(DSL.name("job_title_id"), SQLDataType.CHAR(37), this, "")

    /**
     * The column <code>public.tmp_employee.ci_name</code>.
     */
    val CI_NAME: TableField<TmpEmployeeRecord, String?> = createField(DSL.name("ci_name"), SQLDataType.VARCHAR(255), this, "")

    /**
     * The column <code>public.tmp_employee.created_on</code>.
     */
    val CREATED_ON: TableField<TmpEmployeeRecord, OffsetDateTime?> = createField(DSL.name("created_on"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "")

    /**
     * The column <code>public.tmp_employee.manager_id</code>.
     */
    val MANAGER_ID: TableField<TmpEmployeeRecord, String?> = createField(DSL.name("manager_id"), SQLDataType.CHAR(37), this, "")

    /**
     * The column <code>public.tmp_employee.external_id</code>.
     */
    val EXTERNAL_ID: TableField<TmpEmployeeRecord, String?> = createField(DSL.name("external_id"), SQLDataType.VARCHAR(100), this, "")

    /**
     * The column <code>public.tmp_employee.updated_by</code>.
     */
    val UPDATED_BY: TableField<TmpEmployeeRecord, String?> = createField(DSL.name("updated_by"), SQLDataType.CHAR(37), this, "")

    /**
     * The column <code>public.tmp_employee.code</code>.
     */
    val CODE: TableField<TmpEmployeeRecord, String?> = createField(DSL.name("code"), SQLDataType.VARCHAR(25), this, "")

    /**
     * The column <code>public.tmp_employee.name</code>.
     */
    val NAME: TableField<TmpEmployeeRecord, String?> = createField(DSL.name("name"), SQLDataType.VARCHAR(255), this, "")

    /**
     * The column <code>public.tmp_employee.stale_id</code>.
     */
    val STALE_ID: TableField<TmpEmployeeRecord, Long?> = createField(DSL.name("stale_id"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>public.tmp_employee.id</code>.
     */
    val ID: TableField<TmpEmployeeRecord, String?> = createField(DSL.name("id"), SQLDataType.CHAR(37), this, "")

    /**
     * The column <code>public.tmp_employee.location_id</code>.
     */
    val LOCATION_ID: TableField<TmpEmployeeRecord, String?> = createField(DSL.name("location_id"), SQLDataType.CHAR(37), this, "")

    /**
     * The column <code>public.tmp_employee.status_id</code>.
     */
    val STATUS_ID: TableField<TmpEmployeeRecord, String?> = createField(DSL.name("status_id"), SQLDataType.CHAR(37), this, "")

    /**
     * The column <code>public.tmp_employee.created_by</code>.
     */
    val CREATED_BY: TableField<TmpEmployeeRecord, String?> = createField(DSL.name("created_by"), SQLDataType.CHAR(37), this, "")

    private constructor(alias: Name, aliased: Table<TmpEmployeeRecord>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<TmpEmployeeRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>public.tmp_employee</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>public.tmp_employee</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>public.tmp_employee</code> table reference
     */
    constructor(): this(DSL.name("tmp_employee"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, TmpEmployeeRecord>): this(Internal.createPathAlias(child, key), child, key, TMP_EMPLOYEE, null)
    override fun getSchema(): Schema? = if (aliased()) null else Public.PUBLIC
    override fun `as`(alias: String): TmpEmployee = TmpEmployee(DSL.name(alias), this)
    override fun `as`(alias: Name): TmpEmployee = TmpEmployee(alias, this)
    override fun `as`(alias: Table<*>): TmpEmployee = TmpEmployee(alias.getQualifiedName(), this)

    /**
     * Rename this table
     */
    override fun rename(name: String): TmpEmployee = TmpEmployee(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): TmpEmployee = TmpEmployee(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): TmpEmployee = TmpEmployee(name.getQualifiedName(), null)

    // -------------------------------------------------------------------------
    // Row14 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row14<OffsetDateTime?, String?, String?, OffsetDateTime?, String?, String?, String?, String?, String?, Long?, String?, String?, String?, String?> = super.fieldsRow() as Row14<OffsetDateTime?, String?, String?, OffsetDateTime?, String?, String?, String?, String?, String?, Long?, String?, String?, String?, String?>

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    fun <U> mapping(from: (OffsetDateTime?, String?, String?, OffsetDateTime?, String?, String?, String?, String?, String?, Long?, String?, String?, String?, String?) -> U): SelectField<U> = convertFrom(Records.mapping(from))

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    fun <U> mapping(toType: Class<U>, from: (OffsetDateTime?, String?, String?, OffsetDateTime?, String?, String?, String?, String?, String?, Long?, String?, String?, String?, String?) -> U): SelectField<U> = convertFrom(toType, Records.mapping(from))
}