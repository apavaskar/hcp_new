/*
 * This file is generated by jOOQ.
 */
package com.squer.prorpel.jooq.tables


import com.squer.prorpel.jooq.Public
import com.squer.prorpel.jooq.keys.CME_FMV_DETAIL_PKEY
import com.squer.prorpel.jooq.tables.records.CmeFmvDetailRecord

import java.time.OffsetDateTime
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
open class CmeFmvDetail(
    alias: Name,
    child: Table<out Record>?,
    path: ForeignKey<out Record, CmeFmvDetailRecord>?,
    aliased: Table<CmeFmvDetailRecord>?,
    parameters: Array<Field<*>?>?
): TableImpl<CmeFmvDetailRecord>(
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
         * The reference instance of <code>public.cme_fmv_detail</code>
         */
        val CME_FMV_DETAIL: CmeFmvDetail = CmeFmvDetail()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<CmeFmvDetailRecord> = CmeFmvDetailRecord::class.java

    /**
     * The column <code>public.cme_fmv_detail.hcp_speciality</code>.
     */
    val HCP_SPECIALITY: TableField<CmeFmvDetailRecord, String?> = createField(DSL.name("hcp_speciality"), SQLDataType.VARCHAR(100), this, "")

    /**
     * The column <code>public.cme_fmv_detail.id</code>.
     */
    val ID: TableField<CmeFmvDetailRecord, String?> = createField(DSL.name("id"), SQLDataType.CHAR(37).nullable(false), this, "")

    /**
     * The column <code>public.cme_fmv_detail.place</code>.
     */
    val PLACE: TableField<CmeFmvDetailRecord, String?> = createField(DSL.name("place"), SQLDataType.VARCHAR(100), this, "")

    /**
     * The column <code>public.cme_fmv_detail.created_by</code>.
     */
    val CREATED_BY: TableField<CmeFmvDetailRecord, String?> = createField(DSL.name("created_by"), SQLDataType.CHAR(37), this, "")

    /**
     * The column <code>public.cme_fmv_detail.hourly_rate</code>.
     */
    val HOURLY_RATE: TableField<CmeFmvDetailRecord, Double?> = createField(DSL.name("hourly_rate"), SQLDataType.DOUBLE, this, "")

    /**
     * The column <code>public.cme_fmv_detail.qualification</code>.
     */
    val QUALIFICATION: TableField<CmeFmvDetailRecord, String?> = createField(DSL.name("qualification"), SQLDataType.VARCHAR(100), this, "")

    /**
     * The column <code>public.cme_fmv_detail.is_current</code>.
     */
    val IS_CURRENT: TableField<CmeFmvDetailRecord, Boolean?> = createField(DSL.name("is_current"), SQLDataType.BOOLEAN, this, "")

    /**
     * The column <code>public.cme_fmv_detail.tier</code>.
     */
    val TIER: TableField<CmeFmvDetailRecord, String?> = createField(DSL.name("tier"), SQLDataType.VARCHAR(100), this, "")

    /**
     * The column <code>public.cme_fmv_detail.stale_id</code>.
     */
    val STALE_ID: TableField<CmeFmvDetailRecord, String?> = createField(DSL.name("stale_id"), SQLDataType.VARCHAR(255), this, "")

    /**
     * The column <code>public.cme_fmv_detail.updated_by</code>.
     */
    val UPDATED_BY: TableField<CmeFmvDetailRecord, String?> = createField(DSL.name("updated_by"), SQLDataType.CHAR(37), this, "")

    /**
     * The column <code>public.cme_fmv_detail.experience</code>.
     */
    val EXPERIENCE: TableField<CmeFmvDetailRecord, Double?> = createField(DSL.name("experience"), SQLDataType.DOUBLE, this, "")

    /**
     * The column <code>public.cme_fmv_detail.cmdoc_id</code>.
     */
    val CMDOC_ID: TableField<CmeFmvDetailRecord, String?> = createField(DSL.name("cmdoc_id"), SQLDataType.CHAR(37), this, "")

    /**
     * The column <code>public.cme_fmv_detail.updated_on</code>.
     */
    val UPDATED_ON: TableField<CmeFmvDetailRecord, OffsetDateTime?> = createField(DSL.name("updated_on"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "")

    /**
     * The column <code>public.cme_fmv_detail.comments</code>.
     */
    val COMMENTS: TableField<CmeFmvDetailRecord, String?> = createField(DSL.name("comments"), SQLDataType.VARCHAR(255), this, "")

    /**
     * The column <code>public.cme_fmv_detail.created_on</code>.
     */
    val CREATED_ON: TableField<CmeFmvDetailRecord, OffsetDateTime?> = createField(DSL.name("created_on"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "")

    private constructor(alias: Name, aliased: Table<CmeFmvDetailRecord>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<CmeFmvDetailRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>public.cme_fmv_detail</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>public.cme_fmv_detail</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>public.cme_fmv_detail</code> table reference
     */
    constructor(): this(DSL.name("cme_fmv_detail"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, CmeFmvDetailRecord>): this(Internal.createPathAlias(child, key), child, key, CME_FMV_DETAIL, null)
    override fun getSchema(): Schema? = if (aliased()) null else Public.PUBLIC
    override fun getPrimaryKey(): UniqueKey<CmeFmvDetailRecord> = CME_FMV_DETAIL_PKEY
    override fun `as`(alias: String): CmeFmvDetail = CmeFmvDetail(DSL.name(alias), this)
    override fun `as`(alias: Name): CmeFmvDetail = CmeFmvDetail(alias, this)
    override fun `as`(alias: Table<*>): CmeFmvDetail = CmeFmvDetail(alias.getQualifiedName(), this)

    /**
     * Rename this table
     */
    override fun rename(name: String): CmeFmvDetail = CmeFmvDetail(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): CmeFmvDetail = CmeFmvDetail(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): CmeFmvDetail = CmeFmvDetail(name.getQualifiedName(), null)

    // -------------------------------------------------------------------------
    // Row15 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row15<String?, String?, String?, String?, Double?, String?, Boolean?, String?, String?, String?, Double?, String?, OffsetDateTime?, String?, OffsetDateTime?> = super.fieldsRow() as Row15<String?, String?, String?, String?, Double?, String?, Boolean?, String?, String?, String?, Double?, String?, OffsetDateTime?, String?, OffsetDateTime?>

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    fun <U> mapping(from: (String?, String?, String?, String?, Double?, String?, Boolean?, String?, String?, String?, Double?, String?, OffsetDateTime?, String?, OffsetDateTime?) -> U): SelectField<U> = convertFrom(Records.mapping(from))

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    fun <U> mapping(toType: Class<U>, from: (String?, String?, String?, String?, Double?, String?, Boolean?, String?, String?, String?, Double?, String?, OffsetDateTime?, String?, OffsetDateTime?) -> U): SelectField<U> = convertFrom(toType, Records.mapping(from))
}
