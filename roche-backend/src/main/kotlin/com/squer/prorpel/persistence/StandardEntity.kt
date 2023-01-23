package com.squer.prorpel.persistence

import java.time.LocalDate
import java.time.LocalDateTime
import java.util.*

abstract class StandardEntity: SquerEntity(), NameAwareInterface, AuditableInterface {
    override var createdBy: String ?= ""
    override var updatedBy: String ?= ""
    override var createdOn: LocalDateTime ?= LocalDateTime.now()
    override var updatedOn: LocalDateTime ?= LocalDateTime.now()
    override var staleId: Long ?= 1
    override var name: String = ""
    override var ciName: String = ""
}