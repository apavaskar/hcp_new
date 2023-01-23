package com.squer.prorpel.persistence

import java.time.LocalDateTime
import java.util.*

interface AuditableInterface {
    var createdBy: String?
    var updatedBy: String?
    var createdOn: LocalDateTime?
    var updatedOn: LocalDateTime?
    var staleId: Long?
}