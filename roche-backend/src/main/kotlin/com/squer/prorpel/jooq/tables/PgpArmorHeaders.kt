/*
 * This file is generated by jOOQ.
 */
package com.squer.prorpel.jooq.tables


import com.squer.prorpel.jooq.Public
import com.squer.prorpel.jooq.tables.records.PgpArmorHeadersRecord

import java.util.function.Function

import javax.annotation.processing.Generated

import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.Name
import org.jooq.Record
import org.jooq.Records
import org.jooq.Row2
import org.jooq.Schema
import org.jooq.SelectField
import org.jooq.Table
import org.jooq.TableField
import org.jooq.TableOptions
import org.jooq.impl.DSL
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
open class PgpArmorHeaders(
    alias: Name,
    child: Table<out Record>?,
    path: ForeignKey<out Record, PgpArmorHeadersRecord>?,
    aliased: Table<PgpArmorHeadersRecord>?,
    parameters: Array<Field<*>?>?
): TableImpl<PgpArmorHeadersRecord>(
    alias,
    Public.PUBLIC,
    child,
    path,
    aliased,
    parameters,
    DSL.comment(""),
    TableOptions.function()
) {
    companion object {

        /**
         * The reference instance of <code>public.pgp_armor_headers</code>
         */
        val PGP_ARMOR_HEADERS: PgpArmorHeaders = PgpArmorHeaders()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<PgpArmorHeadersRecord> = PgpArmorHeadersRecord::class.java

    /**
     * The column <code>public.pgp_armor_headers.key</code>.
     */
    val KEY: TableField<PgpArmorHeadersRecord, String?> = createField(DSL.name("key"), SQLDataType.CLOB, this, "")

    /**
     * The column <code>public.pgp_armor_headers.value</code>.
     */
    val VALUE: TableField<PgpArmorHeadersRecord, String?> = createField(DSL.name("value"), SQLDataType.CLOB, this, "")

    private constructor(alias: Name, aliased: Table<PgpArmorHeadersRecord>?): this(alias, null, null, aliased, arrayOf(
        DSL.value(null, SQLDataType.CLOB)
    ))
    private constructor(alias: Name, aliased: Table<PgpArmorHeadersRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>public.pgp_armor_headers</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>public.pgp_armor_headers</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>public.pgp_armor_headers</code> table reference
     */
    constructor(): this(DSL.name("pgp_armor_headers"), null)
    override fun getSchema(): Schema? = if (aliased()) null else Public.PUBLIC
    override fun `as`(alias: String): PgpArmorHeaders = PgpArmorHeaders(DSL.name(alias), this, parameters)
    override fun `as`(alias: Name): PgpArmorHeaders = PgpArmorHeaders(alias, this, parameters)
    override fun `as`(alias: Table<*>): PgpArmorHeaders = PgpArmorHeaders(alias.getQualifiedName(), this, parameters)

    /**
     * Rename this table
     */
    override fun rename(name: String): PgpArmorHeaders = PgpArmorHeaders(DSL.name(name), null, parameters)

    /**
     * Rename this table
     */
    override fun rename(name: Name): PgpArmorHeaders = PgpArmorHeaders(name, null, parameters)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): PgpArmorHeaders = PgpArmorHeaders(name.getQualifiedName(), null, parameters)

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row2<String?, String?> = super.fieldsRow() as Row2<String?, String?>

    /**
     * Call this table-valued function
     */
    fun call(
          __1: String?
    ): PgpArmorHeaders = PgpArmorHeaders(DSL.name("pgp_armor_headers"), null, arrayOf(
        DSL.value(__1, SQLDataType.CLOB)
    )).let { if (aliased()) it.`as`(unqualifiedName) else it }

    /**
     * Call this table-valued function
     */
    fun call(
          __1: Field<String?>
    ): PgpArmorHeaders = PgpArmorHeaders(DSL.name("pgp_armor_headers"), null, arrayOf(
        __1
    )).let { if (aliased()) it.`as`(unqualifiedName) else it }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    fun <U> mapping(from: (String?, String?) -> U): SelectField<U> = convertFrom(Records.mapping(from))

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    fun <U> mapping(toType: Class<U>, from: (String?, String?) -> U): SelectField<U> = convertFrom(toType, Records.mapping(from))
}
