package com.squer.prorpel.ui.service.impl

import com.squer.prorpel.persistence.SearchCriteria
import com.squer.prorpel.ui.domain.SearchColumnMeta
import com.squer.prorpel.ui.domain.SearchMeta
import com.squer.prorpel.ui.repository.SearchColumnMetaRepository
import com.squer.prorpel.ui.repository.SearchConditionMetaRepository
import com.squer.prorpel.ui.repository.SearchMetaRepository
import com.squer.prorpel.ui.repository.enums.SearchColumnSearchField
import com.squer.prorpel.ui.repository.enums.SearchConditionSearchField
import com.squer.prorpel.ui.repository.enums.SearchMetaSearchField
import com.squer.prorpel.ui.service.LabelMetaService
import com.squer.prorpel.ui.service.SearchMetaService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class SearchMetaServiceImpl: SearchMetaService {

    @Autowired
    lateinit var searchMetaRepository: SearchMetaRepository

    @Autowired
    lateinit var searchConditionMetaRepository: SearchConditionMetaRepository

    @Autowired
    lateinit var searchColumnMetaRepository: SearchColumnMetaRepository

    @Autowired
    lateinit var labelMetaService: LabelMetaService

    override fun findSearchMeta(entityName: String): SearchMeta {

        val metaCriteria = SearchCriteria()
        metaCriteria.addCondition(SearchMetaSearchField.ENTITY_NAME, entityName)
        val metas = searchMetaRepository.find(metaCriteria)
        val meta = metas[0]
        val conditionsCriteria = SearchCriteria()
        conditionsCriteria.addCondition(SearchConditionSearchField.SEARCH_META_ID, meta.id!!)
        val conditions = searchConditionMetaRepository.find(conditionsCriteria)
        meta.conditions = conditions

        val columnsCriteria = SearchCriteria()
        columnsCriteria.addCondition(SearchColumnSearchField.SEARCH_META_ID, meta.id!!)
        meta.result = searchColumnMetaRepository.find(columnsCriteria).map {
            transform(it)
        }.sortedBy { it.displayOrder }
        return meta
    }

    private fun transform(meta: SearchColumnMeta): SearchColumnMeta {
        if (meta.title.isEmpty()) return  meta
        meta.title = labelMetaService.getLabel(meta.title.substring(1)).label ?: meta.title
        return meta
    }
}
