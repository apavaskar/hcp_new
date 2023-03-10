/*
 * This file is generated by jOOQ.
 */
package com.squer.prorpel.jooq.tables


import com.squer.prorpel.jooq.Public
import com.squer.prorpel.jooq.keys.SEARCHMETA_PKEY
import com.squer.prorpel.jooq.tables.records.SearchmetaRecord

import java.util.function.Function

import javax.annotation.processing.Generated

import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.Identity
import org.jooq.Name
import org.jooq.Record
import org.jooq.Records
import org.jooq.Row2
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
open class Searchmeta(
    alias: Name,
    child: Table<out Record>?,
    path: ForeignKey<out Record, SearchmetaRecord>?,
    aliased: Table<SearchmetaRecord>?,
    parameters: Array<Field<*>?>?
): TableImpl<SearchmetaRecord>(
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
         * The reference instance of <code>public.searchMeta</code>
         */
        val SEARCHMETA: Searchmeta = Searchmeta()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<SearchmetaRecord> = SearchmetaRecord::class.java

    /**
     * The column <code>public.searchMeta.id</code>.
     */
    val ID: TableField<SearchmetaRecord, Long?> = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "")

    /**
     * The column <code>public.searchMeta.entity_name</code>.
     */
    val ENTITY_NAME: TableField<SearchmetaRecord, String?> = createField(DSL.name("entity_name"), SQLDataType.VARCHAR(100), this, "")

    private constructor(alias: Name, aliased: Table<SearchmetaRecord>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<SearchmetaRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>public.searchMeta</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>public.searchMeta</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>public.searchMeta</code> table reference
     */
    constructor(): this(DSL.name("searchMeta"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, SearchmetaRecord>): this(Internal.createPathAlias(child, key), child, key, SEARCHMETA, null)
    override fun getSchema(): Schema? = if (aliased()) null else Public.PUBLIC
    override fun getIdentity(): Identity<SearchmetaRecord, Long?> = super.getIdentity() as Identity<SearchmetaRecord, Long?>
    override fun getPrimaryKey(): UniqueKey<SearchmetaRecord> = SEARCHMETA_PKEY
    override fun `as`(alias: String): Searchmeta = Searchmeta(DSL.name(alias), this)
    override fun `as`(alias: Name): Searchmeta = Searchmeta(alias, this)
    override fun `as`(alias: Table<*>): Searchmeta = Searchmeta(alias.getQualifiedName(), this)

    /**
     * Rename this table
     */
    override fun rename(name: String): Searchmeta = Searchmeta(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): Searchmeta = Searchmeta(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): Searchmeta = Searchmeta(name.getQualifiedName(), null)

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row2<Long?, String?> = super.fieldsRow() as Row2<Long?, String?>

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    fun <U> mapping(from: (Long?, String?) -> U): SelectField<U> = convertFrom(Records.mapping(from))

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    fun <U> mapping(toType: Class<U>, from: (Long?, String?) -> U): SelectField<U> = convertFrom(toType, Records.mapping(from))
}
