package com.squer.prorpel.common.controller

import lombok.extern.slf4j.Slf4j
import com.squer.prorpel.persistence.SearchCriteria
import com.squer.prorpel.persistence.SearchField
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.http.ResponseEntity
import com.squer.prorpel.common.domain.Document
import com.squer.prorpel.common.domain.enums.DocumentSearchField
import com.squer.prorpel.common.service.DocumentService

@Slf4j
open class DocumentController @Autowired constructor(private val entityService: DocumentService) {

    companion object{
        val conditionsMap = DocumentSearchField.values().associateBy({it.getFieldName()},{it})
    }

    @PostMapping("/search")
    fun search(@RequestBody conditions: Map<String, Any>): ResponseEntity<*> {
        var criteria = SearchCriteria()
        conditions.keys.forEach{
           criteria.addCondition(conditionsMap[it] as SearchField,conditions[it] as Any)
        }
        return ResponseEntity.ok(entityService.find(criteria))
    }

    @GetMapping("/find/{id}")
    fun findById(@PathVariable("id") id: String): ResponseEntity<*> {
        return ResponseEntity.ok<Any>(entityService.findById(id))
    }

    @PutMapping("/update")
    fun update(@RequestBody entity: Document): ResponseEntity<*> {
        var id = entityService.update(entity)
        return findById(id)
    }

    @PostMapping("/create")
    fun create(@RequestBody entity: Document): ResponseEntity<*> {
        var id = entityService.create(entity)
        return findById(id)
    }
}