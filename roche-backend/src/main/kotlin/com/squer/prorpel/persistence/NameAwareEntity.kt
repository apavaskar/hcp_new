package com.squer.prorpel.persistence

abstract class NameAwareEntity: SquerEntity(), NameAwareInterface {
    override var name: String = ""
        get() = field
        set(value) {field =value}
    override var ciName: String  = ""
        get() = field
        set(value) {field =value}
}
