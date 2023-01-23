/*
 * This file is generated by jOOQ.
 */
package com.squer.prorpel.jooq.tables


import com.squer.prorpel.jooq.Public
import com.squer.prorpel.jooq.tables.records.TmpVisitsUploadErrorsRecord

import java.util.function.Function

import javax.annotation.processing.Generated

import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.Name
import org.jooq.Record
import org.jooq.Records
import org.jooq.Row15
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
open class TmpVisitsUploadErrors(
    alias: Name,
    child: Table<out Record>?,
    path: ForeignKey<out Record, TmpVisitsUploadErrorsRecord>?,
    aliased: Table<TmpVisitsUploadErrorsRecord>?,
    parameters: Array<Field<*>?>?
): TableImpl<TmpVisitsUploadErrorsRecord>(
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
         * The reference instance of
         * <code>public.tmp_visits_upload_errors</code>
         */
        val TMP_VISITS_UPLOAD_ERRORS: TmpVisitsUploadErrors = TmpVisitsUploadErrors()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<TmpVisitsUploadErrorsRecord> = TmpVisitsUploadErrorsRecord::class.java

    /**
     * The column <code>public.tmp_visits_upload_errors.upload_id</code>.
     */
    val UPLOAD_ID: TableField<TmpVisitsUploadErrorsRecord, String?> = createField(DSL.name("upload_id"), SQLDataType.CHAR(37), this, "")

    /**
     * The column <code>public.tmp_visits_upload_errors.assigned_alias</code>.
     */
    val ASSIGNED_ALIAS: TableField<TmpVisitsUploadErrorsRecord, String?> = createField(DSL.name("assigned_alias"), SQLDataType.VARCHAR(50), this, "")

    /**
     * The column <code>public.tmp_visits_upload_errors.account_owner</code>.
     */
    val ACCOUNT_OWNER: TableField<TmpVisitsUploadErrorsRecord, String?> = createField(DSL.name("account_owner"), SQLDataType.VARCHAR(100), this, "")

    /**
     * The column <code>public.tmp_visits_upload_errors.account_id</code>.
     */
    val ACCOUNT_ID: TableField<TmpVisitsUploadErrorsRecord, String?> = createField(DSL.name("account_id"), SQLDataType.VARCHAR(50), this, "")

    /**
     * The column <code>public.tmp_visits_upload_errors.account_name</code>.
     */
    val ACCOUNT_NAME: TableField<TmpVisitsUploadErrorsRecord, String?> = createField(DSL.name("account_name"), SQLDataType.VARCHAR(150), this, "")

    /**
     * The column <code>public.tmp_visits_upload_errors.status</code>.
     */
    val STATUS: TableField<TmpVisitsUploadErrorsRecord, String?> = createField(DSL.name("status"), SQLDataType.VARCHAR(50), this, "")

    /**
     * The column <code>public.tmp_visits_upload_errors.date</code>.
     */
    val DATE: TableField<TmpVisitsUploadErrorsRecord, String?> = createField(DSL.name("date"), SQLDataType.VARCHAR(50), this, "")

    /**
     * The column <code>public.tmp_visits_upload_errors.due_time</code>.
     */
    val DUE_TIME: TableField<TmpVisitsUploadErrorsRecord, String?> = createField(DSL.name("due_time"), SQLDataType.VARCHAR(50), this, "")

    /**
     * The column <code>public.tmp_visits_upload_errors.end_dt</code>.
     */
    val END_DT: TableField<TmpVisitsUploadErrorsRecord, String?> = createField(DSL.name("end_dt"), SQLDataType.VARCHAR(50), this, "")

    /**
     * The column
     * <code>public.tmp_visits_upload_errors.last_modified_date</code>.
     */
    val LAST_MODIFIED_DATE: TableField<TmpVisitsUploadErrorsRecord, String?> = createField(DSL.name("last_modified_date"), SQLDataType.VARCHAR(50), this, "")

    /**
     * The column
     * <code>public.tmp_visits_upload_errors.counts_against_target</code>.
     */
    val COUNTS_AGAINST_TARGET: TableField<TmpVisitsUploadErrorsRecord, String?> = createField(DSL.name("counts_against_target"), SQLDataType.VARCHAR(50), this, "")

    /**
     * The column <code>public.tmp_visits_upload_errors.customer_id</code>.
     */
    val CUSTOMER_ID: TableField<TmpVisitsUploadErrorsRecord, String?> = createField(DSL.name("customer_id"), SQLDataType.CHAR(37), this, "")

    /**
     * The column <code>public.tmp_visits_upload_errors.employee_id</code>.
     */
    val EMPLOYEE_ID: TableField<TmpVisitsUploadErrorsRecord, String?> = createField(DSL.name("employee_id"), SQLDataType.CHAR(37), this, "")

    /**
     * The column <code>public.tmp_visits_upload_errors.upload_error</code>.
     */
    val UPLOAD_ERROR: TableField<TmpVisitsUploadErrorsRecord, Int?> = createField(DSL.name("upload_error"), SQLDataType.INTEGER.defaultValue(DSL.field("0", SQLDataType.INTEGER)), this, "")

    /**
     * The column <code>public.tmp_visits_upload_errors.upload_message</code>.
     */
    val UPLOAD_MESSAGE: TableField<TmpVisitsUploadErrorsRecord, String?> = createField(DSL.name("upload_message"), SQLDataType.CLOB, this, "")

    private constructor(alias: Name, aliased: Table<TmpVisitsUploadErrorsRecord>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<TmpVisitsUploadErrorsRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>public.tmp_visits_upload_errors</code> table
     * reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>public.tmp_visits_upload_errors</code> table
     * reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>public.tmp_visits_upload_errors</code> table reference
     */
    constructor(): this(DSL.name("tmp_visits_upload_errors"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, TmpVisitsUploadErrorsRecord>): this(Internal.createPathAlias(child, key), child, key, TMP_VISITS_UPLOAD_ERRORS, null)
    override fun getSchema(): Schema? = if (aliased()) null else Public.PUBLIC
    override fun `as`(alias: String): TmpVisitsUploadErrors = TmpVisitsUploadErrors(DSL.name(alias), this)
    override fun `as`(alias: Name): TmpVisitsUploadErrors = TmpVisitsUploadErrors(alias, this)
    override fun `as`(alias: Table<*>): TmpVisitsUploadErrors = TmpVisitsUploadErrors(alias.getQualifiedName(), this)

    /**
     * Rename this table
     */
    override fun rename(name: String): TmpVisitsUploadErrors = TmpVisitsUploadErrors(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): TmpVisitsUploadErrors = TmpVisitsUploadErrors(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): TmpVisitsUploadErrors = TmpVisitsUploadErrors(name.getQualifiedName(), null)

    // -------------------------------------------------------------------------
    // Row15 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row15<String?, String?, String?, String?, String?, String?, String?, String?, String?, String?, String?, String?, String?, Int?, String?> = super.fieldsRow() as Row15<String?, String?, String?, String?, String?, String?, String?, String?, String?, String?, String?, String?, String?, Int?, String?>

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    fun <U> mapping(from: (String?, String?, String?, String?, String?, String?, String?, String?, String?, String?, String?, String?, String?, Int?, String?) -> U): SelectField<U> = convertFrom(Records.mapping(from))

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    fun <U> mapping(toType: Class<U>, from: (String?, String?, String?, String?, String?, String?, String?, String?, String?, String?, String?, String?, String?, Int?, String?) -> U): SelectField<U> = convertFrom(toType, Records.mapping(from))
}