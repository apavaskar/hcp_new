/*
 * This file is generated by jOOQ.
 */
package com.squer.prorpel.jooq.tables


import com.squer.prorpel.jooq.Public
import com.squer.prorpel.jooq.tables.records.TmpProductMappingUploadOldRecord

import java.util.function.Function

import javax.annotation.processing.Generated

import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.Name
import org.jooq.Record
import org.jooq.Records
import org.jooq.Row10
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
open class TmpProductMappingUploadOld(
    alias: Name,
    child: Table<out Record>?,
    path: ForeignKey<out Record, TmpProductMappingUploadOldRecord>?,
    aliased: Table<TmpProductMappingUploadOldRecord>?,
    parameters: Array<Field<*>?>?
): TableImpl<TmpProductMappingUploadOldRecord>(
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
         * <code>public.tmp_product_mapping_upload_old</code>
         */
        val TMP_PRODUCT_MAPPING_UPLOAD_OLD: TmpProductMappingUploadOld = TmpProductMappingUploadOld()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<TmpProductMappingUploadOldRecord> = TmpProductMappingUploadOldRecord::class.java

    /**
     * The column <code>public.tmp_product_mapping_upload_old.payer</code>.
     */
    val PAYER: TableField<TmpProductMappingUploadOldRecord, String?> = createField(DSL.name("payer"), SQLDataType.VARCHAR(100), this, "")

    /**
     * The column
     * <code>public.tmp_product_mapping_upload_old.payer_sap_code</code>.
     */
    val PAYER_SAP_CODE: TableField<TmpProductMappingUploadOldRecord, String?> = createField(DSL.name("payer_sap_code"), SQLDataType.VARCHAR(100), this, "")

    /**
     * The column <code>public.tmp_product_mapping_upload_old.payer_name</code>.
     */
    val PAYER_NAME: TableField<TmpProductMappingUploadOldRecord, String?> = createField(DSL.name("payer_name"), SQLDataType.VARCHAR(255), this, "")

    /**
     * The column
     * <code>public.tmp_product_mapping_upload_old.product_code</code>.
     */
    val PRODUCT_CODE: TableField<TmpProductMappingUploadOldRecord, String?> = createField(DSL.name("product_code"), SQLDataType.VARCHAR(100), this, "")

    /**
     * The column
     * <code>public.tmp_product_mapping_upload_old.product_name</code>.
     */
    val PRODUCT_NAME: TableField<TmpProductMappingUploadOldRecord, String?> = createField(DSL.name("product_name"), SQLDataType.VARCHAR(255), this, "")

    /**
     * The column <code>public.tmp_product_mapping_upload_old.se_name</code>.
     */
    val SE_NAME: TableField<TmpProductMappingUploadOldRecord, String?> = createField(DSL.name("se_name"), SQLDataType.VARCHAR(255), this, "")

    /**
     * The column <code>public.tmp_product_mapping_upload_old.am_name</code>.
     */
    val AM_NAME: TableField<TmpProductMappingUploadOldRecord, String?> = createField(DSL.name("am_name"), SQLDataType.VARCHAR(255), this, "")

    /**
     * The column <code>public.tmp_product_mapping_upload_old.rm_name</code>.
     */
    val RM_NAME: TableField<TmpProductMappingUploadOldRecord, String?> = createField(DSL.name("rm_name"), SQLDataType.VARCHAR(255), this, "")

    /**
     * The column <code>public.tmp_product_mapping_upload_old.div_name</code>.
     */
    val DIV_NAME: TableField<TmpProductMappingUploadOldRecord, String?> = createField(DSL.name("div_name"), SQLDataType.VARCHAR(255), this, "")

    /**
     * The column
     * <code>public.tmp_product_mapping_upload_old.job_execution_id</code>.
     */
    val JOB_EXECUTION_ID: TableField<TmpProductMappingUploadOldRecord, Long?> = createField(DSL.name("job_execution_id"), SQLDataType.BIGINT, this, "")

    private constructor(alias: Name, aliased: Table<TmpProductMappingUploadOldRecord>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<TmpProductMappingUploadOldRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>public.tmp_product_mapping_upload_old</code>
     * table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>public.tmp_product_mapping_upload_old</code>
     * table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>public.tmp_product_mapping_upload_old</code> table
     * reference
     */
    constructor(): this(DSL.name("tmp_product_mapping_upload_old"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, TmpProductMappingUploadOldRecord>): this(Internal.createPathAlias(child, key), child, key, TMP_PRODUCT_MAPPING_UPLOAD_OLD, null)
    override fun getSchema(): Schema? = if (aliased()) null else Public.PUBLIC
    override fun `as`(alias: String): TmpProductMappingUploadOld = TmpProductMappingUploadOld(DSL.name(alias), this)
    override fun `as`(alias: Name): TmpProductMappingUploadOld = TmpProductMappingUploadOld(alias, this)
    override fun `as`(alias: Table<*>): TmpProductMappingUploadOld = TmpProductMappingUploadOld(alias.getQualifiedName(), this)

    /**
     * Rename this table
     */
    override fun rename(name: String): TmpProductMappingUploadOld = TmpProductMappingUploadOld(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): TmpProductMappingUploadOld = TmpProductMappingUploadOld(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): TmpProductMappingUploadOld = TmpProductMappingUploadOld(name.getQualifiedName(), null)

    // -------------------------------------------------------------------------
    // Row10 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row10<String?, String?, String?, String?, String?, String?, String?, String?, String?, Long?> = super.fieldsRow() as Row10<String?, String?, String?, String?, String?, String?, String?, String?, String?, Long?>

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    fun <U> mapping(from: (String?, String?, String?, String?, String?, String?, String?, String?, String?, Long?) -> U): SelectField<U> = convertFrom(Records.mapping(from))

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    fun <U> mapping(toType: Class<U>, from: (String?, String?, String?, String?, String?, String?, String?, String?, String?, Long?) -> U): SelectField<U> = convertFrom(toType, Records.mapping(from))
}