package com.squer.prorpel.ui.service

import com.squer.prorpel.ui.domain.SearchMeta

interface SearchMetaService {

    fun findSearchMeta(entityName: String): SearchMeta

}
