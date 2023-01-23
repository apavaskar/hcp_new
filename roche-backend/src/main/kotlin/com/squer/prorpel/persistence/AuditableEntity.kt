package com.squer.prorpel.persistence

import java.time.LocalDateTime

abstract class AuditableEntity: SquerEntity(), AuditableInterface {
    override var createdBy: String ?= ""
    override var updatedBy: String ?= ""
    override var createdOn: LocalDateTime ?= LocalDateTime.now()
    override var updatedOn: LocalDateTime ?= LocalDateTime.now()
    override var staleId: Long ?= 1
}