/*
 * This file is generated by jOOQ.
 */
package com.squer.prorpel.jooq.tables


import com.squer.prorpel.jooq.Public
import com.squer.prorpel.jooq.tables.records.DshSalesLocationMappingRecord

import java.util.function.Function

import javax.annotation.processing.Generated

import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.Name
import org.jooq.Record
import org.jooq.Records
import org.jooq.Row3
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
open class DshSalesLocationMapping(
    alias: Name,
    child: Table<out Record>?,
    path: ForeignKey<out Record, DshSalesLocationMappingRecord>?,
    aliased: Table<DshSalesLocationMappingRecord>?,
    parameters: Array<Field<*>?>?
): TableImpl<DshSalesLocationMappingRecord>(
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
         * <code>public.dsh_sales_location_mapping</code>
         */
        val DSH_SALES_LOCATION_MAPPING: DshSalesLocationMapping = DshSalesLocationMapping()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<DshSalesLocationMappingRecord> = DshSalesLocationMappingRecord::class.java

    /**
     * The column <code>public.dsh_sales_location_mapping.key</code>.
     */
    val KEY: TableField<DshSalesLocationMappingRecord, String?> = createField(DSL.name("key"), SQLDataType.VARCHAR(50), this, "")

    /**
     * The column <code>public.dsh_sales_location_mapping.division_id</code>.
     */
    val DIVISION_ID: TableField<DshSalesLocationMappingRecord, String?> = createField(DSL.name("division_id"), SQLDataType.CHAR(37), this, "")

    /**
     * The column <code>public.dsh_sales_location_mapping.sap_code</code>.
     */
    val SAP_CODE: TableField<DshSalesLocationMappingRecord, String?> = createField(DSL.name("sap_code"), SQLDataType.VARCHAR(50), this, "")

    private constructor(alias: Name, aliased: Table<DshSalesLocationMappingRecord>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<DshSalesLocationMappingRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>public.dsh_sales_location_mapping</code> table
     * reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>public.dsh_sales_location_mapping</code> table
     * reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>public.dsh_sales_location_mapping</code> table reference
     */
    constructor(): this(DSL.name("dsh_sales_location_mapping"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, DshSalesLocationMappingRecord>): this(Internal.createPathAlias(child, key), child, key, DSH_SALES_LOCATION_MAPPING, null)
    override fun getSchema(): Schema? = if (aliased()) null else Public.PUBLIC
    override fun `as`(alias: String): DshSalesLocationMapping = DshSalesLocationMapping(DSL.name(alias), this)
    override fun `as`(alias: Name): DshSalesLocationMapping = DshSalesLocationMapping(alias, this)
    override fun `as`(alias: Table<*>): DshSalesLocationMapping = DshSalesLocationMapping(alias.getQualifiedName(), this)

    /**
     * Rename this table
     */
    override fun rename(name: String): DshSalesLocationMapping = DshSalesLocationMapping(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): DshSalesLocationMapping = DshSalesLocationMapping(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): DshSalesLocationMapping = DshSalesLocationMapping(name.getQualifiedName(), null)

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row3<String?, String?, String?> = super.fieldsRow() as Row3<String?, String?, String?>

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    fun <U> mapping(from: (String?, String?, String?) -> U): SelectField<U> = convertFrom(Records.mapping(from))

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    fun <U> mapping(toType: Class<U>, from: (String?, String?, String?) -> U): SelectField<U> = convertFrom(toType, Records.mapping(from))
}
