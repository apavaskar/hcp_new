package com.squer.prorpel.common.service.impl

import com.squer.prorpel.common.domain.LocationType
import com.squer.prorpel.common.repository.LocationTypeRepository
import com.squer.prorpel.common.service.LocationTypeService
import com.squer.prorpel.persistence.SearchCriteria
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class LocationTypeServiceImpl: LocationTypeService {

    @Autowired
    lateinit var locationTypeRepository: LocationTypeRepository

    override fun searchLocationTypes(searchCriteria: SearchCriteria): List<LocationType> {
        return locationTypeRepository.find(searchCriteria)
    }

    override fun findById(id: String): LocationType? {
        return locationTypeRepository.findById(id)
    }
}
