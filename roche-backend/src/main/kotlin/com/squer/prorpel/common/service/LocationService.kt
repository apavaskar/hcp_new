package com.squer.prorpel.common.service

import com.squer.prorpel.common.controller.dto.LocationDTO
import com.squer.prorpel.common.domain.Location
import com.squer.prorpel.persistence.SearchCriteria

interface LocationService {

    fun searchLocations(searchCriteria: SearchCriteria): List<Location>

    fun findById(id: String): Location?

    fun findAllChildrenForLocation(id: String): List<Location>

    fun saveLocation(entity: Location): String

    fun createLocation(entity: LocationDTO): String
}
