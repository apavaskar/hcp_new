/*
 * This file is generated by jOOQ.
 */
package com.squer.prorpel.jooq.tables


import com.squer.prorpel.jooq.Public
import com.squer.prorpel.jooq.tables.records.SecurityroleprivilegeRecord

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
open class Securityroleprivilege(
    alias: Name,
    child: Table<out Record>?,
    path: ForeignKey<out Record, SecurityroleprivilegeRecord>?,
    aliased: Table<SecurityroleprivilegeRecord>?,
    parameters: Array<Field<*>?>?
): TableImpl<SecurityroleprivilegeRecord>(
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
         * The reference instance of <code>public.securityRolePrivilege</code>
         */
        val SECURITYROLEPRIVILEGE: Securityroleprivilege = Securityroleprivilege()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<SecurityroleprivilegeRecord> = SecurityroleprivilegeRecord::class.java

    /**
     * The column <code>public.securityRolePrivilege.role_id</code>.
     */
    val ROLE_ID: TableField<SecurityroleprivilegeRecord, Long?> = createField(DSL.name("role_id"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>public.securityRolePrivilege.privilege_id</code>.
     */
    val PRIVILEGE_ID: TableField<SecurityroleprivilegeRecord, Long?> = createField(DSL.name("privilege_id"), SQLDataType.BIGINT.nullable(false), this, "")

    private constructor(alias: Name, aliased: Table<SecurityroleprivilegeRecord>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<SecurityroleprivilegeRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>public.securityRolePrivilege</code> table
     * reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>public.securityRolePrivilege</code> table
     * reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>public.securityRolePrivilege</code> table reference
     */
    constructor(): this(DSL.name("securityRolePrivilege"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, SecurityroleprivilegeRecord>): this(Internal.createPathAlias(child, key), child, key, SECURITYROLEPRIVILEGE, null)
    override fun getSchema(): Schema? = if (aliased()) null else Public.PUBLIC
    override fun `as`(alias: String): Securityroleprivilege = Securityroleprivilege(DSL.name(alias), this)
    override fun `as`(alias: Name): Securityroleprivilege = Securityroleprivilege(alias, this)
    override fun `as`(alias: Table<*>): Securityroleprivilege = Securityroleprivilege(alias.getQualifiedName(), this)

    /**
     * Rename this table
     */
    override fun rename(name: String): Securityroleprivilege = Securityroleprivilege(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): Securityroleprivilege = Securityroleprivilege(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): Securityroleprivilege = Securityroleprivilege(name.getQualifiedName(), null)

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row2<Long?, Long?> = super.fieldsRow() as Row2<Long?, Long?>

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    fun <U> mapping(from: (Long?, Long?) -> U): SelectField<U> = convertFrom(Records.mapping(from))

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    fun <U> mapping(toType: Class<U>, from: (Long?, Long?) -> U): SelectField<U> = convertFrom(toType, Records.mapping(from))
}
