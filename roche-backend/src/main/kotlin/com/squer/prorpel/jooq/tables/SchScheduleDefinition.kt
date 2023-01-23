/*
 * This file is generated by jOOQ.
 */
package com.squer.prorpel.jooq.tables


import com.squer.prorpel.jooq.Public
import com.squer.prorpel.jooq.keys.SCH_SCHEDULE_DEFINITION_PKEY
import com.squer.prorpel.jooq.tables.records.SchScheduleDefinitionRecord

import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.function.Function

import javax.annotation.processing.Generated

import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.Name
import org.jooq.Record
import org.jooq.Records
import org.jooq.Row14
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
open class SchScheduleDefinition(
    alias: Name,
    child: Table<out Record>?,
    path: ForeignKey<out Record, SchScheduleDefinitionRecord>?,
    aliased: Table<SchScheduleDefinitionRecord>?,
    parameters: Array<Field<*>?>?
): TableImpl<SchScheduleDefinitionRecord>(
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
         * The reference instance of <code>public.sch_schedule_definition</code>
         */
        val SCH_SCHEDULE_DEFINITION: SchScheduleDefinition = SchScheduleDefinition()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<SchScheduleDefinitionRecord> = SchScheduleDefinitionRecord::class.java

    /**
     * The column <code>public.sch_schedule_definition.group_name</code>.
     */
    val GROUP_NAME: TableField<SchScheduleDefinitionRecord, String?> = createField(DSL.name("group_name"), SQLDataType.VARCHAR(100), this, "")

    /**
     * The column <code>public.sch_schedule_definition.id</code>.
     */
    val ID: TableField<SchScheduleDefinitionRecord, String?> = createField(DSL.name("id"), SQLDataType.CHAR(37).nullable(false), this, "")

    /**
     * The column <code>public.sch_schedule_definition.created_by</code>.
     */
    val CREATED_BY: TableField<SchScheduleDefinitionRecord, String?> = createField(DSL.name("created_by"), SQLDataType.CHAR(37), this, "")

    /**
     * The column <code>public.sch_schedule_definition.start_time</code>.
     */
    val START_TIME: TableField<SchScheduleDefinitionRecord, String?> = createField(DSL.name("start_time"), SQLDataType.VARCHAR(25), this, "")

    /**
     * The column <code>public.sch_schedule_definition.start_date</code>.
     */
    val START_DATE: TableField<SchScheduleDefinitionRecord, LocalDate?> = createField(DSL.name("start_date"), SQLDataType.LOCALDATE, this, "")

    /**
     * The column <code>public.sch_schedule_definition.stale_id</code>.
     */
    val STALE_ID: TableField<SchScheduleDefinitionRecord, String?> = createField(DSL.name("stale_id"), SQLDataType.VARCHAR(255), this, "")

    /**
     * The column <code>public.sch_schedule_definition.status</code>.
     */
    val STATUS: TableField<SchScheduleDefinitionRecord, String?> = createField(DSL.name("status"), SQLDataType.VARCHAR(100), this, "")

    /**
     * The column <code>public.sch_schedule_definition.job_id</code>.
     */
    val JOB_ID: TableField<SchScheduleDefinitionRecord, String?> = createField(DSL.name("job_id"), SQLDataType.CHAR(37), this, "")

    /**
     * The column <code>public.sch_schedule_definition.updated_by</code>.
     */
    val UPDATED_BY: TableField<SchScheduleDefinitionRecord, String?> = createField(DSL.name("updated_by"), SQLDataType.CHAR(37), this, "")

    /**
     * The column <code>public.sch_schedule_definition.frequency_unit</code>.
     */
    val FREQUENCY_UNIT: TableField<SchScheduleDefinitionRecord, String?> = createField(DSL.name("frequency_unit"), SQLDataType.VARCHAR(25), this, "")

    /**
     * The column <code>public.sch_schedule_definition.end_date</code>.
     */
    val END_DATE: TableField<SchScheduleDefinitionRecord, LocalDate?> = createField(DSL.name("end_date"), SQLDataType.LOCALDATE, this, "")

    /**
     * The column <code>public.sch_schedule_definition.updated_on</code>.
     */
    val UPDATED_ON: TableField<SchScheduleDefinitionRecord, OffsetDateTime?> = createField(DSL.name("updated_on"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "")

    /**
     * The column <code>public.sch_schedule_definition.created_on</code>.
     */
    val CREATED_ON: TableField<SchScheduleDefinitionRecord, OffsetDateTime?> = createField(DSL.name("created_on"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "")

    /**
     * The column
     * <code>public.sch_schedule_definition.schedule_frequency</code>.
     */
    val SCHEDULE_FREQUENCY: TableField<SchScheduleDefinitionRecord, Long?> = createField(DSL.name("schedule_frequency"), SQLDataType.BIGINT, this, "")

    private constructor(alias: Name, aliased: Table<SchScheduleDefinitionRecord>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<SchScheduleDefinitionRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>public.sch_schedule_definition</code> table
     * reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>public.sch_schedule_definition</code> table
     * reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>public.sch_schedule_definition</code> table reference
     */
    constructor(): this(DSL.name("sch_schedule_definition"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, SchScheduleDefinitionRecord>): this(Internal.createPathAlias(child, key), child, key, SCH_SCHEDULE_DEFINITION, null)
    override fun getSchema(): Schema? = if (aliased()) null else Public.PUBLIC
    override fun getPrimaryKey(): UniqueKey<SchScheduleDefinitionRecord> = SCH_SCHEDULE_DEFINITION_PKEY
    override fun `as`(alias: String): SchScheduleDefinition = SchScheduleDefinition(DSL.name(alias), this)
    override fun `as`(alias: Name): SchScheduleDefinition = SchScheduleDefinition(alias, this)
    override fun `as`(alias: Table<*>): SchScheduleDefinition = SchScheduleDefinition(alias.getQualifiedName(), this)

    /**
     * Rename this table
     */
    override fun rename(name: String): SchScheduleDefinition = SchScheduleDefinition(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): SchScheduleDefinition = SchScheduleDefinition(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): SchScheduleDefinition = SchScheduleDefinition(name.getQualifiedName(), null)

    // -------------------------------------------------------------------------
    // Row14 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row14<String?, String?, String?, String?, LocalDate?, String?, String?, String?, String?, String?, LocalDate?, OffsetDateTime?, OffsetDateTime?, Long?> = super.fieldsRow() as Row14<String?, String?, String?, String?, LocalDate?, String?, String?, String?, String?, String?, LocalDate?, OffsetDateTime?, OffsetDateTime?, Long?>

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    fun <U> mapping(from: (String?, String?, String?, String?, LocalDate?, String?, String?, String?, String?, String?, LocalDate?, OffsetDateTime?, OffsetDateTime?, Long?) -> U): SelectField<U> = convertFrom(Records.mapping(from))

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    fun <U> mapping(toType: Class<U>, from: (String?, String?, String?, String?, LocalDate?, String?, String?, String?, String?, String?, LocalDate?, OffsetDateTime?, OffsetDateTime?, Long?) -> U): SelectField<U> = convertFrom(toType, Records.mapping(from))
}
