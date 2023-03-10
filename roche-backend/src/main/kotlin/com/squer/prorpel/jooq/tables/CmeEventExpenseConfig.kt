/*
 * This file is generated by jOOQ.
 */
package com.squer.prorpel.jooq.tables


import com.squer.prorpel.jooq.Public
import com.squer.prorpel.jooq.tables.records.CmeEventExpenseConfigRecord

import java.util.function.Function

import javax.annotation.processing.Generated

import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.Name
import org.jooq.Record
import org.jooq.Records
import org.jooq.Row8
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
open class CmeEventExpenseConfig(
    alias: Name,
    child: Table<out Record>?,
    path: ForeignKey<out Record, CmeEventExpenseConfigRecord>?,
    aliased: Table<CmeEventExpenseConfigRecord>?,
    parameters: Array<Field<*>?>?
): TableImpl<CmeEventExpenseConfigRecord>(
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
         * The reference instance of
         * <code>public.cme_event_expense_config</code>
         */
        val CME_EVENT_EXPENSE_CONFIG: CmeEventExpenseConfig = CmeEventExpenseConfig()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<CmeEventExpenseConfigRecord> = CmeEventExpenseConfigRecord::class.java

    /**
     * The column <code>public.cme_event_expense_config.job_title_id</code>.
     */
    val JOB_TITLE_ID: TableField<CmeEventExpenseConfigRecord, String?> = createField(DSL.name("job_title_id"), SQLDataType.CHAR(37), this, "")

    /**
     * The column <code>public.cme_event_expense_config.is_enabled</code>.
     */
    val IS_ENABLED: TableField<CmeEventExpenseConfigRecord, Boolean?> = createField(DSL.name("is_enabled"), SQLDataType.BOOLEAN, this, "")

    /**
     * The column <code>public.cme_event_expense_config.cme_type</code>.
     */
    val CME_TYPE: TableField<CmeEventExpenseConfigRecord, String?> = createField(DSL.name("cme_type"), SQLDataType.VARCHAR(25), this, "")

    /**
     * The column <code>public.cme_event_expense_config.expense_type_id</code>.
     */
    val EXPENSE_TYPE_ID: TableField<CmeEventExpenseConfigRecord, String?> = createField(DSL.name("expense_type_id"), SQLDataType.CHAR(37), this, "")

    /**
     * The column <code>public.cme_event_expense_config.amount</code>.
     */
    val AMOUNT: TableField<CmeEventExpenseConfigRecord, Double?> = createField(DSL.name("amount"), SQLDataType.DOUBLE, this, "")

    /**
     * The column <code>public.cme_event_expense_config.event_type_id</code>.
     */
    val EVENT_TYPE_ID: TableField<CmeEventExpenseConfigRecord, String?> = createField(DSL.name("event_type_id"), SQLDataType.CHAR(37), this, "")

    /**
     * The column <code>public.cme_event_expense_config.maximum</code>.
     */
    val MAXIMUM: TableField<CmeEventExpenseConfigRecord, Int?> = createField(DSL.name("maximum"), SQLDataType.INTEGER, this, "")

    /**
     * The column <code>public.cme_event_expense_config.minimum</code>.
     */
    val MINIMUM: TableField<CmeEventExpenseConfigRecord, Int?> = createField(DSL.name("minimum"), SQLDataType.INTEGER, this, "")

    private constructor(alias: Name, aliased: Table<CmeEventExpenseConfigRecord>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<CmeEventExpenseConfigRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>public.cme_event_expense_config</code> table
     * reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>public.cme_event_expense_config</code> table
     * reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>public.cme_event_expense_config</code> table reference
     */
    constructor(): this(DSL.name("cme_event_expense_config"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, CmeEventExpenseConfigRecord>): this(Internal.createPathAlias(child, key), child, key, CME_EVENT_EXPENSE_CONFIG, null)
    override fun getSchema(): Schema? = if (aliased()) null else Public.PUBLIC
    override fun `as`(alias: String): CmeEventExpenseConfig = CmeEventExpenseConfig(DSL.name(alias), this)
    override fun `as`(alias: Name): CmeEventExpenseConfig = CmeEventExpenseConfig(alias, this)
    override fun `as`(alias: Table<*>): CmeEventExpenseConfig = CmeEventExpenseConfig(alias.getQualifiedName(), this)

    /**
     * Rename this table
     */
    override fun rename(name: String): CmeEventExpenseConfig = CmeEventExpenseConfig(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): CmeEventExpenseConfig = CmeEventExpenseConfig(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): CmeEventExpenseConfig = CmeEventExpenseConfig(name.getQualifiedName(), null)

    // -------------------------------------------------------------------------
    // Row8 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row8<String?, Boolean?, String?, String?, Double?, String?, Int?, Int?> = super.fieldsRow() as Row8<String?, Boolean?, String?, String?, Double?, String?, Int?, Int?>

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    fun <U> mapping(from: (String?, Boolean?, String?, String?, Double?, String?, Int?, Int?) -> U): SelectField<U> = convertFrom(Records.mapping(from))

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    fun <U> mapping(toType: Class<U>, from: (String?, Boolean?, String?, String?, Double?, String?, Int?, Int?) -> U): SelectField<U> = convertFrom(toType, Records.mapping(from))
}
