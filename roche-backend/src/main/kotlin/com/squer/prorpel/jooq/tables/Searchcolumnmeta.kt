/*
 * This file is generated by jOOQ.
 */
package com.squer.prorpel.jooq.tables


import com.squer.prorpel.jooq.Public
import com.squer.prorpel.jooq.keys.SEARCHCOLUMNMETA_PKEY
import com.squer.prorpel.jooq.tables.records.SearchcolumnmetaRecord

import java.util.function.Function

import javax.annotation.processing.Generated

import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.Identity
import org.jooq.Name
import org.jooq.Record
import org.jooq.Records
import org.jooq.Row7
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
open class Searchcolumnmeta(
    alias: Name,
    child: Table<out Record>?,
    path: ForeignKey<out Record, SearchcolumnmetaRecord>?,
    aliased: Table<SearchcolumnmetaRecord>?,
    parameters: Array<Field<*>?>?
): TableImpl<SearchcolumnmetaRecord>(
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
         * The reference instance of <code>public.searchColumnMeta</code>
         */
        val SEARCHCOLUMNMETA: Searchcolumnmeta = Searchcolumnmeta()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<SearchcolumnmetaRecord> = SearchcolumnmetaRecord::class.java

    /**
     * The column <code>public.searchColumnMeta.id</code>.
     */
    val ID: TableField<SearchcolumnmetaRecord, Long?> = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "")

    /**
     * The column <code>public.searchColumnMeta.search_meta_id</code>.
     */
    val SEARCH_META_ID: TableField<SearchcolumnmetaRecord, Long?> = createField(DSL.name("search_meta_id"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>public.searchColumnMeta.title</code>.
     */
    val TITLE: TableField<SearchcolumnmetaRecord, String?> = createField(DSL.name("title"), SQLDataType.VARCHAR(50), this, "")

    /**
     * The column <code>public.searchColumnMeta.data_index</code>.
     */
    val DATA_INDEX: TableField<SearchcolumnmetaRecord, String?> = createField(DSL.name("data_index"), SQLDataType.VARCHAR(50), this, "")

    /**
     * The column <code>public.searchColumnMeta.key</code>.
     */
    val KEY: TableField<SearchcolumnmetaRecord, String?> = createField(DSL.name("key"), SQLDataType.VARCHAR(50), this, "")

    /**
     * The column <code>public.searchColumnMeta.render</code>.
     */
    val RENDER: TableField<SearchcolumnmetaRecord, String?> = createField(DSL.name("render"), SQLDataType.CLOB, this, "")

    /**
     * The column <code>public.searchColumnMeta.display_order</code>.
     */
    val DISPLAY_ORDER: TableField<SearchcolumnmetaRecord, Int?> = createField(DSL.name("display_order"), SQLDataType.INTEGER, this, "")

    private constructor(alias: Name, aliased: Table<SearchcolumnmetaRecord>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<SearchcolumnmetaRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>public.searchColumnMeta</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>public.searchColumnMeta</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>public.searchColumnMeta</code> table reference
     */
    constructor(): this(DSL.name("searchColumnMeta"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, SearchcolumnmetaRecord>): this(Internal.createPathAlias(child, key), child, key, SEARCHCOLUMNMETA, null)
    override fun getSchema(): Schema? = if (aliased()) null else Public.PUBLIC
    override fun getIdentity(): Identity<SearchcolumnmetaRecord, Long?> = super.getIdentity() as Identity<SearchcolumnmetaRecord, Long?>
    override fun getPrimaryKey(): UniqueKey<SearchcolumnmetaRecord> = SEARCHCOLUMNMETA_PKEY
    override fun `as`(alias: String): Searchcolumnmeta = Searchcolumnmeta(DSL.name(alias), this)
    override fun `as`(alias: Name): Searchcolumnmeta = Searchcolumnmeta(alias, this)
    override fun `as`(alias: Table<*>): Searchcolumnmeta = Searchcolumnmeta(alias.getQualifiedName(), this)

    /**
     * Rename this table
     */
    override fun rename(name: String): Searchcolumnmeta = Searchcolumnmeta(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): Searchcolumnmeta = Searchcolumnmeta(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): Searchcolumnmeta = Searchcolumnmeta(name.getQualifiedName(), null)

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row7<Long?, Long?, String?, String?, String?, String?, Int?> = super.fieldsRow() as Row7<Long?, Long?, String?, String?, String?, String?, Int?>

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    fun <U> mapping(from: (Long?, Long?, String?, String?, String?, String?, Int?) -> U): SelectField<U> = convertFrom(Records.mapping(from))

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    fun <U> mapping(toType: Class<U>, from: (Long?, Long?, String?, String?, String?, String?, Int?) -> U): SelectField<U> = convertFrom(toType, Records.mapping(from))
}
