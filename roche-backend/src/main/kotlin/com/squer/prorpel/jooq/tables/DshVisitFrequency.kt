/*
 * This file is generated by jOOQ.
 */
package com.squer.prorpel.jooq.tables


import com.squer.prorpel.jooq.Public
import com.squer.prorpel.jooq.tables.records.DshVisitFrequencyRecord

import java.util.function.Function

import javax.annotation.processing.Generated

import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.Name
import org.jooq.Record
import org.jooq.Records
import org.jooq.Row5
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
open class DshVisitFrequency(
    alias: Name,
    child: Table<out Record>?,
    path: ForeignKey<out Record, DshVisitFrequencyRecord>?,
    aliased: Table<DshVisitFrequencyRecord>?,
    parameters: Array<Field<*>?>?
): TableImpl<DshVisitFrequencyRecord>(
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
         * The reference instance of <code>public.dsh_visit_frequency</code>
         */
        val DSH_VISIT_FREQUENCY: DshVisitFrequency = DshVisitFrequency()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<DshVisitFrequencyRecord> = DshVisitFrequencyRecord::class.java

    /**
     * The column <code>public.dsh_visit_frequency.month</code>.
     */
    val MONTH: TableField<DshVisitFrequencyRecord, Int?> = createField(DSL.name("month"), SQLDataType.INTEGER, this, "")

    /**
     * The column <code>public.dsh_visit_frequency.year</code>.
     */
    val YEAR: TableField<DshVisitFrequencyRecord, Int?> = createField(DSL.name("year"), SQLDataType.INTEGER, this, "")

    /**
     * The column <code>public.dsh_visit_frequency.employee_id</code>.
     */
    val EMPLOYEE_ID: TableField<DshVisitFrequencyRecord, String?> = createField(DSL.name("employee_id"), SQLDataType.CHAR(37), this, "")

    /**
     * The column <code>public.dsh_visit_frequency.doctor_id</code>.
     */
    val DOCTOR_ID: TableField<DshVisitFrequencyRecord, String?> = createField(DSL.name("doctor_id"), SQLDataType.CHAR(37), this, "")

    /**
     * The column <code>public.dsh_visit_frequency.visit_cout</code>.
     */
    val VISIT_COUT: TableField<DshVisitFrequencyRecord, Int?> = createField(DSL.name("visit_cout"), SQLDataType.INTEGER, this, "")

    private constructor(alias: Name, aliased: Table<DshVisitFrequencyRecord>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<DshVisitFrequencyRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>public.dsh_visit_frequency</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>public.dsh_visit_frequency</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>public.dsh_visit_frequency</code> table reference
     */
    constructor(): this(DSL.name("dsh_visit_frequency"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, DshVisitFrequencyRecord>): this(Internal.createPathAlias(child, key), child, key, DSH_VISIT_FREQUENCY, null)
    override fun getSchema(): Schema? = if (aliased()) null else Public.PUBLIC
    override fun `as`(alias: String): DshVisitFrequency = DshVisitFrequency(DSL.name(alias), this)
    override fun `as`(alias: Name): DshVisitFrequency = DshVisitFrequency(alias, this)
    override fun `as`(alias: Table<*>): DshVisitFrequency = DshVisitFrequency(alias.getQualifiedName(), this)

    /**
     * Rename this table
     */
    override fun rename(name: String): DshVisitFrequency = DshVisitFrequency(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): DshVisitFrequency = DshVisitFrequency(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): DshVisitFrequency = DshVisitFrequency(name.getQualifiedName(), null)

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row5<Int?, Int?, String?, String?, Int?> = super.fieldsRow() as Row5<Int?, Int?, String?, String?, Int?>

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    fun <U> mapping(from: (Int?, Int?, String?, String?, Int?) -> U): SelectField<U> = convertFrom(Records.mapping(from))

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    fun <U> mapping(toType: Class<U>, from: (Int?, Int?, String?, String?, Int?) -> U): SelectField<U> = convertFrom(toType, Records.mapping(from))
}