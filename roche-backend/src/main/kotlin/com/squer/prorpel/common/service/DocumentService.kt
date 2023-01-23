package com.squer.prorpel.common.service

import com.squer.prorpel.persistence.SearchCriteria
import com.squer.prorpel.common.domain.Document

interface DocumentService {
    fun findById(id: String): Document?
    fun find(criteria: SearchCriteria): List<Document>?
    fun create(entity: Document): String
    fun update(entity: Document): String
    fun getByOwnerId(ownerId: Long): List<Document>?
}