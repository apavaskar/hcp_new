/*
 * This file is generated by jOOQ.
 */
package com.squer.prorpel.jooq.tables


import com.squer.prorpel.jooq.Public
import com.squer.prorpel.jooq.tables.records.TempEcrRecord

import java.time.OffsetDateTime

import javax.annotation.processing.Generated

import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.Name
import org.jooq.Record
import org.jooq.Schema
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
open class TempEcr(
    alias: Name,
    child: Table<out Record>?,
    path: ForeignKey<out Record, TempEcrRecord>?,
    aliased: Table<TempEcrRecord>?,
    parameters: Array<Field<*>?>?
): TableImpl<TempEcrRecord>(
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
         * The reference instance of <code>public.temp_ecr</code>
         */
        val TEMP_ECR: TempEcr = TempEcr()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<TempEcrRecord> = TempEcrRecord::class.java

    /**
     * The column <code>public.temp_ecr.id</code>.
     */
    val ID: TableField<TempEcrRecord, String?> = createField(DSL.name("id"), SQLDataType.CHAR(37), this, "")

    /**
     * The column <code>public.temp_ecr.doctors</code>.
     */
    val DOCTORS: TableField<TempEcrRecord, Int?> = createField(DSL.name("doctors"), SQLDataType.INTEGER, this, "")

    /**
     * The column <code>public.temp_ecr.support_staff</code>.
     */
    val SUPPORT_STAFF: TableField<TempEcrRecord, Int?> = createField(DSL.name("support_staff"), SQLDataType.INTEGER, this, "")

    /**
     * The column <code>public.temp_ecr.approval_comment</code>.
     */
    val APPROVAL_COMMENT: TableField<TempEcrRecord, String?> = createField(DSL.name("approval_comment"), SQLDataType.VARCHAR(255), this, "")

    /**
     * The column <code>public.temp_ecr.created_by</code>.
     */
    val CREATED_BY: TableField<TempEcrRecord, String?> = createField(DSL.name("created_by"), SQLDataType.CHAR(37), this, "")

    /**
     * The column <code>public.temp_ecr.event_venue</code>.
     */
    val EVENT_VENUE: TableField<TempEcrRecord, String?> = createField(DSL.name("event_venue"), SQLDataType.VARCHAR(100), this, "")

    /**
     * The column <code>public.temp_ecr.no_of_doctor</code>.
     */
    val NO_OF_DOCTOR: TableField<TempEcrRecord, Int?> = createField(DSL.name("no_of_doctor"), SQLDataType.INTEGER, this, "")

    /**
     * The column <code>public.temp_ecr.event_date</code>.
     */
    val EVENT_DATE: TableField<TempEcrRecord, OffsetDateTime?> = createField(DSL.name("event_date"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "")

    /**
     * The column <code>public.temp_ecr.status</code>.
     */
    val STATUS: TableField<TempEcrRecord, String?> = createField(DSL.name("status"), SQLDataType.CHAR(37), this, "")

    /**
     * The column <code>public.temp_ecr.others</code>.
     */
    val OTHERS: TableField<TempEcrRecord, Int?> = createField(DSL.name("others"), SQLDataType.INTEGER, this, "")

    /**
     * The column <code>public.temp_ecr.stale_id</code>.
     */
    val STALE_ID: TableField<TempEcrRecord, String?> = createField(DSL.name("stale_id"), SQLDataType.VARCHAR(255), this, "")

    /**
     * The column <code>public.temp_ecr.comment</code>.
     */
    val COMMENT: TableField<TempEcrRecord, String?> = createField(DSL.name("comment"), SQLDataType.VARCHAR(255), this, "")

    /**
     * The column <code>public.temp_ecr.dne</code>.
     */
    val DNE: TableField<TempEcrRecord, Int?> = createField(DSL.name("dne"), SQLDataType.INTEGER, this, "")

    /**
     * The column <code>public.temp_ecr.group_id</code>.
     */
    val GROUP_ID: TableField<TempEcrRecord, String?> = createField(DSL.name("group_id"), SQLDataType.CHAR(37), this, "")

    /**
     * The column <code>public.temp_ecr.updated_by</code>.
     */
    val UPDATED_BY: TableField<TempEcrRecord, String?> = createField(DSL.name("updated_by"), SQLDataType.CHAR(37), this, "")

    /**
     * The column <code>public.temp_ecr.action_by</code>.
     */
    val ACTION_BY: TableField<TempEcrRecord, String?> = createField(DSL.name("action_by"), SQLDataType.CHAR(37), this, "")

    /**
     * The column <code>public.temp_ecr.current_status</code>.
     */
    val CURRENT_STATUS: TableField<TempEcrRecord, String?> = createField(DSL.name("current_status"), SQLDataType.CHAR(37), this, "")

    /**
     * The column <code>public.temp_ecr.event_topic</code>.
     */
    val EVENT_TOPIC: TableField<TempEcrRecord, String?> = createField(DSL.name("event_topic"), SQLDataType.VARCHAR(100), this, "")

    /**
     * The column <code>public.temp_ecr.updated_on</code>.
     */
    val UPDATED_ON: TableField<TempEcrRecord, OffsetDateTime?> = createField(DSL.name("updated_on"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "")

    /**
     * The column <code>public.temp_ecr.created_on</code>.
     */
    val CREATED_ON: TableField<TempEcrRecord, OffsetDateTime?> = createField(DSL.name("created_on"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "")

    /**
     * The column <code>public.temp_ecr.event_type_id</code>.
     */
    val EVENT_TYPE_ID: TableField<TempEcrRecord, String?> = createField(DSL.name("event_type_id"), SQLDataType.CHAR(37), this, "")

    /**
     * The column <code>public.temp_ecr.advanced_request</code>.
     */
    val ADVANCED_REQUEST: TableField<TempEcrRecord, Double?> = createField(DSL.name("advanced_request"), SQLDataType.DOUBLE, this, "")

    /**
     * The column <code>public.temp_ecr.event_no</code>.
     */
    val EVENT_NO: TableField<TempEcrRecord, Int?> = createField(DSL.name("event_no"), SQLDataType.INTEGER, this, "")

    /**
     * The column <code>public.temp_ecr.product</code>.
     */
    val PRODUCT: TableField<TempEcrRecord, String?> = createField(DSL.name("product"), SQLDataType.CHAR(37), this, "")

    /**
     * The column <code>public.temp_ecr.percent</code>.
     */
    val PERCENT: TableField<TempEcrRecord, Double?> = createField(DSL.name("percent"), SQLDataType.DOUBLE, this, "")

    private constructor(alias: Name, aliased: Table<TempEcrRecord>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<TempEcrRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>public.temp_ecr</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>public.temp_ecr</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>public.temp_ecr</code> table reference
     */
    constructor(): this(DSL.name("temp_ecr"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, TempEcrRecord>): this(Internal.createPathAlias(child, key), child, key, TEMP_ECR, null)
    override fun getSchema(): Schema? = if (aliased()) null else Public.PUBLIC
    override fun `as`(alias: String): TempEcr = TempEcr(DSL.name(alias), this)
    override fun `as`(alias: Name): TempEcr = TempEcr(alias, this)
    override fun `as`(alias: Table<*>): TempEcr = TempEcr(alias.getQualifiedName(), this)

    /**
     * Rename this table
     */
    override fun rename(name: String): TempEcr = TempEcr(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): TempEcr = TempEcr(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): TempEcr = TempEcr(name.getQualifiedName(), null)
}