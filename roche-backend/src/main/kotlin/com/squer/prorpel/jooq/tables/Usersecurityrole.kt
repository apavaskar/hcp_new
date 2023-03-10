/*
 * This file is generated by jOOQ.
 */
package com.squer.prorpel.jooq.tables


import com.squer.prorpel.jooq.Public
import com.squer.prorpel.jooq.tables.records.UsersecurityroleRecord

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
open class Usersecurityrole(
    alias: Name,
    child: Table<out Record>?,
    path: ForeignKey<out Record, UsersecurityroleRecord>?,
    aliased: Table<UsersecurityroleRecord>?,
    parameters: Array<Field<*>?>?
): TableImpl<UsersecurityroleRecord>(
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
         * The reference instance of <code>public.userSecurityRole</code>
         */
        val USERSECURITYROLE: Usersecurityrole = Usersecurityrole()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<UsersecurityroleRecord> = UsersecurityroleRecord::class.java

    /**
     * The column <code>public.userSecurityRole.user_id</code>.
     */
    val USER_ID: TableField<UsersecurityroleRecord, String?> = createField(DSL.name("user_id"), SQLDataType.VARCHAR(37), this, "")

    /**
     * The column <code>public.userSecurityRole.role_id</code>.
     */
    val ROLE_ID: TableField<UsersecurityroleRecord, Long?> = createField(DSL.name("role_id"), SQLDataType.BIGINT, this, "")

    private constructor(alias: Name, aliased: Table<UsersecurityroleRecord>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<UsersecurityroleRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>public.userSecurityRole</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>public.userSecurityRole</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>public.userSecurityRole</code> table reference
     */
    constructor(): this(DSL.name("userSecurityRole"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, UsersecurityroleRecord>): this(Internal.createPathAlias(child, key), child, key, USERSECURITYROLE, null)
    override fun getSchema(): Schema? = if (aliased()) null else Public.PUBLIC
    override fun `as`(alias: String): Usersecurityrole = Usersecurityrole(DSL.name(alias), this)
    override fun `as`(alias: Name): Usersecurityrole = Usersecurityrole(alias, this)
    override fun `as`(alias: Table<*>): Usersecurityrole = Usersecurityrole(alias.getQualifiedName(), this)

    /**
     * Rename this table
     */
    override fun rename(name: String): Usersecurityrole = Usersecurityrole(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): Usersecurityrole = Usersecurityrole(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): Usersecurityrole = Usersecurityrole(name.getQualifiedName(), null)

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row2<String?, Long?> = super.fieldsRow() as Row2<String?, Long?>

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    fun <U> mapping(from: (String?, Long?) -> U): SelectField<U> = convertFrom(Records.mapping(from))

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    fun <U> mapping(toType: Class<U>, from: (String?, Long?) -> U): SelectField<U> = convertFrom(toType, Records.mapping(from))
}
