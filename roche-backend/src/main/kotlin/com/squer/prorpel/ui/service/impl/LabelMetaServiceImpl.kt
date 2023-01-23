package com.squer.prorpel.ui.service.impl

import com.squer.prorpel.persistence.SearchCriteria
import com.squer.prorpel.ui.domain.LabelMeta
import com.squer.prorpel.ui.repository.LabelMetaRepository
import com.squer.prorpel.ui.service.LabelMetaService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class LabelMetaServiceImpl: LabelMetaService {

    @Autowired
    lateinit var labelMetaRepository: LabelMetaRepository

    companion object{
        var mapOfLabels = mutableMapOf<String, LabelMeta>()
    }

    override fun getLabel(code: String): LabelMeta {
        if (mapOfLabels.isEmpty()) {
            mapOfLabels = labelMetaRepository.find(SearchCriteria())
                .associateBy ( {it.code},{it} ).toMutableMap()
        }
        if (mapOfLabels.containsKey(code)){
            return mapOfLabels[code]!!
        }
        println("LABEL NOT FOUND:" + code)
        var label = LabelMeta()
        label.label = code
        label.code = code
        label.isDefault = false
        return label
    }
}
