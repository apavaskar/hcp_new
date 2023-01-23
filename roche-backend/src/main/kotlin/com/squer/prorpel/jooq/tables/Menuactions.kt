/*
 * This file is generated by jOOQ.
 */
package com.squer.prorpel.jooq.tables


import com.squer.prorpel.jooq.Public
import com.squer.prorpel.jooq.keys.MENUACTIONS_CI_NAME_KEY
import com.squer.prorpel.jooq.keys.MENUACTIONS_PKEY
import com.squer.prorpel.jooq.tables.records.MenuactionsRecord

import java.util.function.Function

import javax.annotation.processing.Generated

import kotlin.collections.List

import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.Identity
import org.jooq.Name
import org.jooq.Record
import org.jooq.Records
import org.jooq.Row8
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
open class Menuactions(
    alias: Name,
    child: Table<out Record>?,
    path: ForeignKey<out Record, MenuactionsRecord>?,
    aliased: Table<MenuactionsRecord>?,
    parameters: Array<Field<*>?>?
): TableImpl<MenuactionsRecord>(
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
         * The reference instance of <code>public.menuActions</code>
         */
        val MENUACTIONS: Menuactions = Menuactions()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<MenuactionsRecord> = MenuactionsRecord::class.java

    /**
     * The column <code>public.menuActions.id</code>.
     */
    val ID: TableField<MenuactionsRecord, Long?> = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "")

    /**
     * The column <code>public.menuActions.name</code>.
     */
    val NAME: TableField<MenuactionsRecord, String?> = createField(DSL.name("name"), SQLDataType.VARCHAR(50), this, "")

    /**
     * The column <code>public.menuActions.ci_name</code>.
     */
    val CI_NAME: TableField<MenuactionsRecord, String?> = createField(DSL.name("ci_name"), SQLDataType.VARCHAR(50).nullable(false), this, "")

    /**
     * The column <code>public.menuActions.display_order</code>.
     */
    val DISPLAY_ORDER: TableField<MenuactionsRecord, Int?> = createField(DSL.name("display_order"), SQLDataType.INTEGER, this, "")

    /**
     * The column <code>public.menuActions.path</code>.
     */
    val PATH: TableField<MenuactionsRecord, String?> = createField(DSL.name("path"), SQLDataType.VARCHAR(256), this, "")

    /**
     * The column <code>public.menuActions.parent_id</code>.
     */
    val PARENT_ID: TableField<MenuactionsRecord, Long?> = createField(DSL.name("parent_id"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>public.menuActions.ui_interface</code>.
     */
    val UI_INTERFACE: TableField<MenuactionsRecord, String?> = createField(DSL.name("ui_interface"), SQLDataType.VARCHAR(10), this, "")

    /**
     * The column <code>public.menuActions.privilege_id</code>.
     */
    val PRIVILEGE_ID: TableField<MenuactionsRecord, Long?> = createField(DSL.name("privilege_id"), SQLDataType.BIGINT, this, "")

    private constructor(alias: Name, aliased: Table<MenuactionsRecord>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<MenuactionsRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>public.menuActions</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>public.menuActions</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>public.menuActions</code> table reference
     */
    constructor(): this(DSL.name("menuActions"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, MenuactionsRecord>): this(Internal.createPathAlias(child, key), child, key, MENUACTIONS, null)
    override fun getSchema(): Schema? = if (aliased()) null else Public.PUBLIC
    override fun getIdentity(): Identity<MenuactionsRecord, Long?> = super.getIdentity() as Identity<MenuactionsRecord, Long?>
    override fun getPrimaryKey(): UniqueKey<MenuactionsRecord> = MENUACTIONS_PKEY
    override fun getUniqueKeys(): List<UniqueKey<MenuactionsRecord>> = listOf(MENUACTIONS_CI_NAME_KEY)
    override fun `as`(alias: String): Menuactions = Menuactions(DSL.name(alias), this)
    override fun `as`(alias: Name): Menuactions = Menuactions(alias, this)
    override fun `as`(alias: Table<*>): Menuactions = Menuactions(alias.getQualifiedName(), this)

    /**
     * Rename this table
     */
    override fun rename(name: String): Menuactions = Menuactions(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): Menuactions = Menuactions(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): Menuactions = Menuactions(name.getQualifiedName(), null)

    // -------------------------------------------------------------------------
    // Row8 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row8<Long?, String?, String?, Int?, String?, Long?, String?, Long?> = super.fieldsRow() as Row8<Long?, String?, String?, Int?, String?, Long?, String?, Long?>

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    fun <U> mapping(from: (Long?, String?, String?, Int?, String?, Long?, String?, Long?) -> U): SelectField<U> = convertFrom(Records.mapping(from))

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    fun <U> mapping(toType: Class<U>, from: (Long?, String?, String?, Int?, String?, Long?, String?, Long?) -> U): SelectField<U> = convertFrom(toType, Records.mapping(from))
}
