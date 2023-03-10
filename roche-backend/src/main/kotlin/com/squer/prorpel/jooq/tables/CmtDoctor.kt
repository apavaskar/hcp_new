/*
 * This file is generated by jOOQ.
 */
package com.squer.prorpel.jooq.tables


import com.squer.prorpel.jooq.Public
import com.squer.prorpel.jooq.keys.CMT_DOCTOR_PKEY
import com.squer.prorpel.jooq.tables.records.CmtDoctorRecord

import java.time.OffsetDateTime
import java.util.function.Function

import javax.annotation.processing.Generated

import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.Name
import org.jooq.Record
import org.jooq.Records
import org.jooq.Row17
import org.jooq.Schema
import org.jooq.SelectField
import org.jooq.Table
import org.jooq.TableField
import org.jooq.TableOptions
import org.jooq.UniqueKey
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
open class CmtDoctor(
    alias: Name,
    child: Table<out Record>?,
    path: ForeignKey<out Record, CmtDoctorRecord>?,
    aliased: Table<CmtDoctorRecord>?,
    parameters: Array<Field<*>?>?
): TableImpl<CmtDoctorRecord>(
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
         * The reference instance of <code>public.cmt_doctor</code>
         */
        val CMT_DOCTOR: CmtDoctor = CmtDoctor()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<CmtDoctorRecord> = CmtDoctorRecord::class.java

    /**
     * The column <code>public.cmt_doctor.name</code>.
     */
    val NAME: TableField<CmtDoctorRecord, String?> = createField(DSL.name("name"), SQLDataType.VARCHAR(255), this, "")

    /**
     * The column <code>public.cmt_doctor.status_id</code>.
     */
    val STATUS_ID: TableField<CmtDoctorRecord, String?> = createField(DSL.name("status_id"), SQLDataType.CHAR(37), this, "")

    /**
     * The column <code>public.cmt_doctor.updated_on</code>.
     */
    val UPDATED_ON: TableField<CmtDoctorRecord, OffsetDateTime?> = createField(DSL.name("updated_on"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "")

    /**
     * The column <code>public.cmt_doctor.classification_id</code>.
     */
    val CLASSIFICATION_ID: TableField<CmtDoctorRecord, String?> = createField(DSL.name("classification_id"), SQLDataType.CHAR(37), this, "")

    /**
     * The column <code>public.cmt_doctor.stale_id</code>.
     */
    val STALE_ID: TableField<CmtDoctorRecord, Long?> = createField(DSL.name("stale_id"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>public.cmt_doctor.ci_name</code>.
     */
    val CI_NAME: TableField<CmtDoctorRecord, String?> = createField(DSL.name("ci_name"), SQLDataType.VARCHAR(255), this, "")

    /**
     * The column <code>public.cmt_doctor.created_on</code>.
     */
    val CREATED_ON: TableField<CmtDoctorRecord, OffsetDateTime?> = createField(DSL.name("created_on"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "")

    /**
     * The column <code>public.cmt_doctor.location_id</code>.
     */
    val LOCATION_ID: TableField<CmtDoctorRecord, String?> = createField(DSL.name("location_id"), SQLDataType.CHAR(37), this, "")

    /**
     * The column <code>public.cmt_doctor.id</code>.
     */
    val ID: TableField<CmtDoctorRecord, String?> = createField(DSL.name("id"), SQLDataType.CHAR(37).nullable(false), this, "")

    /**
     * The column <code>public.cmt_doctor.updated_by</code>.
     */
    val UPDATED_BY: TableField<CmtDoctorRecord, String?> = createField(DSL.name("updated_by"), SQLDataType.CHAR(37), this, "")

    /**
     * The column <code>public.cmt_doctor.code</code>.
     */
    val CODE: TableField<CmtDoctorRecord, String?> = createField(DSL.name("code"), SQLDataType.VARCHAR(25), this, "")

    /**
     * The column <code>public.cmt_doctor.created_by</code>.
     */
    val CREATED_BY: TableField<CmtDoctorRecord, String?> = createField(DSL.name("created_by"), SQLDataType.CHAR(37), this, "")

    /**
     * The column <code>public.cmt_doctor.external_id</code>.
     */
    val EXTERNAL_ID: TableField<CmtDoctorRecord, String?> = createField(DSL.name("external_id"), SQLDataType.VARCHAR(50), this, "")

    /**
     * The column <code>public.cmt_doctor.account_id</code>.
     */
    val ACCOUNT_ID: TableField<CmtDoctorRecord, String?> = createField(DSL.name("account_id"), SQLDataType.VARCHAR(50), this, "")

    /**
     * The column <code>public.cmt_doctor.required_frequency</code>.
     */
    val REQUIRED_FREQUENCY: TableField<CmtDoctorRecord, Int?> = createField(DSL.name("required_frequency"), SQLDataType.INTEGER, this, "")

    /**
     * The column <code>public.cmt_doctor.phone</code>.
     */
    val PHONE: TableField<CmtDoctorRecord, String?> = createField(DSL.name("phone"), SQLDataType.VARCHAR(100), this, "")

    /**
     * The column <code>public.cmt_doctor.email</code>.
     */
    val EMAIL: TableField<CmtDoctorRecord, String?> = createField(DSL.name("email"), SQLDataType.VARCHAR(100), this, "")

    private constructor(alias: Name, aliased: Table<CmtDoctorRecord>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<CmtDoctorRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>public.cmt_doctor</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>public.cmt_doctor</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>public.cmt_doctor</code> table reference
     */
    constructor(): this(DSL.name("cmt_doctor"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, CmtDoctorRecord>): this(Internal.createPathAlias(child, key), child, key, CMT_DOCTOR, null)
    override fun getSchema(): Schema? = if (aliased()) null else Public.PUBLIC
    override fun getPrimaryKey(): UniqueKey<CmtDoctorRecord> = CMT_DOCTOR_PKEY
    override fun `as`(alias: String): CmtDoctor = CmtDoctor(DSL.name(alias), this)
    override fun `as`(alias: Name): CmtDoctor = CmtDoctor(alias, this)
    override fun `as`(alias: Table<*>): CmtDoctor = CmtDoctor(alias.getQualifiedName(), this)

    /**
     * Rename this table
     */
    override fun rename(name: String): CmtDoctor = CmtDoctor(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): CmtDoctor = CmtDoctor(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): CmtDoctor = CmtDoctor(name.getQualifiedName(), null)

    // -------------------------------------------------------------------------
    // Row17 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row17<String?, String?, OffsetDateTime?, String?, Long?, String?, OffsetDateTime?, String?, String?, String?, String?, String?, String?, String?, Int?, String?, String?> = super.fieldsRow() as Row17<String?, String?, OffsetDateTime?, String?, Long?, String?, OffsetDateTime?, String?, String?, String?, String?, String?, String?, String?, Int?, String?, String?>

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    fun <U> mapping(from: (String?, String?, OffsetDateTime?, String?, Long?, String?, OffsetDateTime?, String?, String?, String?, String?, String?, String?, String?, Int?, String?, String?) -> U): SelectField<U> = convertFrom(Records.mapping(from))

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    fun <U> mapping(toType: Class<U>, from: (String?, String?, OffsetDateTime?, String?, Long?, String?, OffsetDateTime?, String?, String?, String?, String?, String?, String?, String?, Int?, String?, String?) -> U): SelectField<U> = convertFrom(toType, Records.mapping(from))
}
