package com.squer.prorpel.common.service.impl

import com.squer.prorpel.persistence.SearchCriteria
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import com.squer.prorpel.common.domain.Document
import com.squer.prorpel.common.repository.DocumentRepository
import com.squer.prorpel.common.service.DocumentService

@Service
class DocumentServiceImpl: DocumentService {

@Autowired
lateinit var entityRepository: DocumentRepository

    override fun findById(id: String): Document? {
        TODO("Not yet implemented")
    }

    override fun find(criteria: SearchCriteria): List<Document>? {
        return entityRepository.find(criteria)
    }

    override fun create(entity: Document): String {
        return entityRepository.create(entity)
    }

    override fun update(entity: Document): String {
        return entityRepository.update(entity)
    }

    override fun getByOwnerId(ownerId: Long): List<Document>? {
        TODO("Not yet implemented")
    }

}