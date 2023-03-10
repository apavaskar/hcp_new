/*
 * This file is generated by jOOQ.
 */
package com.squer.prorpel.jooq.tables.records


import com.squer.prorpel.jooq.tables.Formattributemeta

import javax.annotation.processing.Generated

import org.jooq.Record1
import org.jooq.impl.UpdatableRecordImpl


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
open class FormattributemetaRecord() : UpdatableRecordImpl<FormattributemetaRecord>(Formattributemeta.FORMATTRIBUTEMETA) {

    open var id: Long?
        set(value): Unit = set(0, value)
        get(): Long? = get(0) as Long?

    open var name: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

    open var formId: Long?
        set(value): Unit = set(2, value)
        get(): Long? = get(2) as Long?

    open var type: String?
        set(value): Unit = set(3, value)
        get(): String? = get(3) as String?

    open var span: Int?
        set(value): Unit = set(4, value)
        get(): Int? = get(4) as Int?

    open var offset: Int?
        set(value): Unit = set(5, value)
        get(): Int? = get(5) as Int?

    open var displayOrder: Int?
        set(value): Unit = set(6, value)
        get(): Int? = get(6) as Int?

    open var label: String?
        set(value): Unit = set(7, value)
        get(): String? = get(7) as String?

    open var placeholder: String?
        set(value): Unit = set(8, value)
        get(): String? = get(8) as String?

    open var action: String?
        set(value): Unit = set(9, value)
        get(): String? = get(9) as String?

    open var onSelect: String?
        set(value): Unit = set(10, value)
        get(): String? = get(10) as String?

    open var onSearch: String?
        set(value): Unit = set(11, value)
        get(): String? = get(11) as String?

    open var onChange: String?
        set(value): Unit = set(12, value)
        get(): String? = get(12) as String?

    open var defaultValue: String?
        set(value): Unit = set(13, value)
        get(): String? = get(13) as String?

    open var dataType: String?
        set(value): Unit = set(14, value)
        get(): String? = get(14) as String?

    @Suppress("INAPPLICABLE_JVM_NAME")
    @set:JvmName("setIsRequired")
    open var isRequired: Boolean?
        set(value): Unit = set(15, value)
        get(): Boolean? = get(15) as Boolean?

    @Suppress("INAPPLICABLE_JVM_NAME")
    @set:JvmName("setIsEnabled")
    open var isEnabled: Boolean?
        set(value): Unit = set(16, value)
        get(): Boolean? = get(16) as Boolean?

    open var minValue: String?
        set(value): Unit = set(17, value)
        get(): String? = get(17) as String?

    open var maxValue: String?
        set(value): Unit = set(18, value)
        get(): String? = get(18) as String?

    open var minLength: Int?
        set(value): Unit = set(19, value)
        get(): Int? = get(19) as Int?

    open var maxLength: Int?
        set(value): Unit = set(20, value)
        get(): Int? = get(20) as Int?

    open var pattern: String?
        set(value): Unit = set(21, value)
        get(): String? = get(21) as String?

    open var message: String?
        set(value): Unit = set(22, value)
        get(): String? = get(22) as String?

    open var reference: String?
        set(value): Unit = set(23, value)
        get(): String? = get(23) as String?

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record1<Long?> = super.key() as Record1<Long?>

    /**
     * Create a detached, initialised FormattributemetaRecord
     */
    constructor(id: Long? = null, name: String? = null, formId: Long? = null, type: String? = null, span: Int? = null, offset: Int? = null, displayOrder: Int? = null, label: String? = null, placeholder: String? = null, action: String? = null, onSelect: String? = null, onSearch: String? = null, onChange: String? = null, defaultValue: String? = null, dataType: String? = null, isRequired: Boolean? = null, isEnabled: Boolean? = null, minValue: String? = null, maxValue: String? = null, minLength: Int? = null, maxLength: Int? = null, pattern: String? = null, message: String? = null, reference: String? = null): this() {
        this.id = id
        this.name = name
        this.formId = formId
        this.type = type
        this.span = span
        this.offset = offset
        this.displayOrder = displayOrder
        this.label = label
        this.placeholder = placeholder
        this.action = action
        this.onSelect = onSelect
        this.onSearch = onSearch
        this.onChange = onChange
        this.defaultValue = defaultValue
        this.dataType = dataType
        this.isRequired = isRequired
        this.isEnabled = isEnabled
        this.minValue = minValue
        this.maxValue = maxValue
        this.minLength = minLength
        this.maxLength = maxLength
        this.pattern = pattern
        this.message = message
        this.reference = reference
    }
}
