/*
 * This file is generated by jOOQ.
 */
package com.squer.prorpel.jooq.tables


import com.squer.prorpel.jooq.Public
import com.squer.prorpel.jooq.keys.DSH_ACTIVITY_ATTENDEE_PKEY
import com.squer.prorpel.jooq.tables.records.DshActivityAttendeeRecord

import java.time.OffsetDateTime
import java.util.function.Function

import javax.annotation.processing.Generated

import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.Name
import org.jooq.Record
import org.jooq.Records
import org.jooq.Row9
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
open class DshActivityAttendee(
    alias: Name,
    child: Table<out Record>?,
    path: ForeignKey<out Record, DshActivityAttendeeRecord>?,
    aliased: Table<DshActivityAttendeeRecord>?,
    parameters: Array<Field<*>?>?
): TableImpl<DshActivityAttendeeRecord>(
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
         * The reference instance of <code>public.dsh_activity_attendee</code>
         */
        val DSH_ACTIVITY_ATTENDEE: DshActivityAttendee = DshActivityAttendee()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<DshActivityAttendeeRecord> = DshActivityAttendeeRecord::class.java

    /**
     * The column <code>public.dsh_activity_attendee.id</code>.
     */
    val ID: TableField<DshActivityAttendeeRecord, String?> = createField(DSL.name("id"), SQLDataType.CHAR(37).nullable(false), this, "")

    /**
     * The column <code>public.dsh_activity_attendee.activity_id</code>.
     */
    val ACTIVITY_ID: TableField<DshActivityAttendeeRecord, String?> = createField(DSL.name("activity_id"), SQLDataType.CHAR(37), this, "")

    /**
     * The column <code>public.dsh_activity_attendee.updated_by</code>.
     */
    val UPDATED_BY: TableField<DshActivityAttendeeRecord, String?> = createField(DSL.name("updated_by"), SQLDataType.CHAR(37), this, "")

    /**
     * The column <code>public.dsh_activity_attendee.created_by</code>.
     */
    val CREATED_BY: TableField<DshActivityAttendeeRecord, String?> = createField(DSL.name("created_by"), SQLDataType.CHAR(37), this, "")

    /**
     * The column <code>public.dsh_activity_attendee.attendee_id</code>.
     */
    val ATTENDEE_ID: TableField<DshActivityAttendeeRecord, String?> = createField(DSL.name("attendee_id"), SQLDataType.CHAR(37), this, "")

    /**
     * The column <code>public.dsh_activity_attendee.role_id</code>.
     */
    val ROLE_ID: TableField<DshActivityAttendeeRecord, String?> = createField(DSL.name("role_id"), SQLDataType.CHAR(37), this, "")

    /**
     * The column <code>public.dsh_activity_attendee.updated_on</code>.
     */
    val UPDATED_ON: TableField<DshActivityAttendeeRecord, OffsetDateTime?> = createField(DSL.name("updated_on"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "")

    /**
     * The column <code>public.dsh_activity_attendee.created_on</code>.
     */
    val CREATED_ON: TableField<DshActivityAttendeeRecord, OffsetDateTime?> = createField(DSL.name("created_on"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "")

    /**
     * The column <code>public.dsh_activity_attendee.stale_id</code>.
     */
    val STALE_ID: TableField<DshActivityAttendeeRecord, String?> = createField(DSL.name("stale_id"), SQLDataType.VARCHAR(255), this, "")

    private constructor(alias: Name, aliased: Table<DshActivityAttendeeRecord>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<DshActivityAttendeeRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>public.dsh_activity_attendee</code> table
     * reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>public.dsh_activity_attendee</code> table
     * reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>public.dsh_activity_attendee</code> table reference
     */
    constructor(): this(DSL.name("dsh_activity_attendee"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, DshActivityAttendeeRecord>): this(Internal.createPathAlias(child, key), child, key, DSH_ACTIVITY_ATTENDEE, null)
    override fun getSchema(): Schema? = if (aliased()) null else Public.PUBLIC
    override fun getPrimaryKey(): UniqueKey<DshActivityAttendeeRecord> = DSH_ACTIVITY_ATTENDEE_PKEY
    override fun `as`(alias: String): DshActivityAttendee = DshActivityAttendee(DSL.name(alias), this)
    override fun `as`(alias: Name): DshActivityAttendee = DshActivityAttendee(alias, this)
    override fun `as`(alias: Table<*>): DshActivityAttendee = DshActivityAttendee(alias.getQualifiedName(), this)

    /**
     * Rename this table
     */
    override fun rename(name: String): DshActivityAttendee = DshActivityAttendee(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): DshActivityAttendee = DshActivityAttendee(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): DshActivityAttendee = DshActivityAttendee(name.getQualifiedName(), null)

    // -------------------------------------------------------------------------
    // Row9 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row9<String?, String?, String?, String?, String?, String?, OffsetDateTime?, OffsetDateTime?, String?> = super.fieldsRow() as Row9<String?, String?, String?, String?, String?, String?, OffsetDateTime?, OffsetDateTime?, String?>

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    fun <U> mapping(from: (String?, String?, String?, String?, String?, String?, OffsetDateTime?, OffsetDateTime?, String?) -> U): SelectField<U> = convertFrom(Records.mapping(from))

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    fun <U> mapping(toType: Class<U>, from: (String?, String?, String?, String?, String?, String?, OffsetDateTime?, OffsetDateTime?, String?) -> U): SelectField<U> = convertFrom(toType, Records.mapping(from))
}
