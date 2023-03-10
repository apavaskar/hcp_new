/*
 * This file is generated by jOOQ.
 */
package com.squer.prorpel.jooq.tables.records


import com.squer.prorpel.jooq.tables.CmtFtmLocationMapping

import javax.annotation.processing.Generated

import org.jooq.Field
import org.jooq.Record2
import org.jooq.Row2
import org.jooq.impl.TableRecordImpl


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
open class CmtFtmLocationMappingRecord() : TableRecordImpl<CmtFtmLocationMappingRecord>(CmtFtmLocationMapping.CMT_FTM_LOCATION_MAPPING), Record2<String?, String?> {

    open var employeeLocation: String?
        set(value): Unit = set(0, value)
        get(): String? = get(0) as String?

    open var childLocation: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    override fun fieldsRow(): Row2<String?, String?> = super.fieldsRow() as Row2<String?, String?>
    override fun valuesRow(): Row2<String?, String?> = super.valuesRow() as Row2<String?, String?>
    override fun field1(): Field<String?> = CmtFtmLocationMapping.CMT_FTM_LOCATION_MAPPING.EMPLOYEE_LOCATION
    override fun field2(): Field<String?> = CmtFtmLocationMapping.CMT_FTM_LOCATION_MAPPING.CHILD_LOCATION
    override fun component1(): String? = employeeLocation
    override fun component2(): String? = childLocation
    override fun value1(): String? = employeeLocation
    override fun value2(): String? = childLocation

    override fun value1(value: String?): CmtFtmLocationMappingRecord {
        this.employeeLocation = value
        return this
    }

    override fun value2(value: String?): CmtFtmLocationMappingRecord {
        this.childLocation = value
        return this
    }

    override fun values(value1: String?, value2: String?): CmtFtmLocationMappingRecord {
        this.value1(value1)
        this.value2(value2)
        return this
    }

    /**
     * Create a detached, initialised CmtFtmLocationMappingRecord
     */
    constructor(employeeLocation: String? = null, childLocation: String? = null): this() {
        this.employeeLocation = employeeLocation
        this.childLocation = childLocation
    }
}
