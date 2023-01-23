package com.squer.prorpel.common.service

import com.squer.prorpel.common.domain.LocationType
import com.squer.prorpel.persistence.SearchCriteria

interface LocationTypeService {

    fun searchLocationTypes(searchCriteria: SearchCriteria): List<LocationType>

    fun findById(id: String): LocationType?
}
