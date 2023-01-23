package com.squer.prorpel.common.service.impl

import com.squer.prorpel.common.controller.dto.LocationDTO
import com.squer.prorpel.common.domain.Location
import com.squer.prorpel.common.domain.enums.LocationTypeSearchField
import com.squer.prorpel.common.repository.LocationRepository
import com.squer.prorpel.common.repository.LocationTypeRepository
import com.squer.prorpel.common.service.LocationService
import com.squer.prorpel.persistence.NamedReference
import com.squer.prorpel.persistence.SearchCriteria
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class LocationServiceImpl: LocationService {

    @Autowired
    lateinit var locationRepository: LocationRepository

    @Autowired
    lateinit var locationTypeRepository: LocationTypeRepository

    override fun searchLocations(searchCriteria: SearchCriteria): List<Location> {
        return locationRepository.find(searchCriteria)
    }

    override fun findById(id: String): Location? {
        return locationRepository.findById(id)
    }

    override fun findAllChildrenForLocation(id: String): List<Location> {
        TODO("Not yet implemented")

//        val criteria = SearchCriteria()
//        criteria.addCondition(LocationTypeSearchField.STATUS, "ACTIVE")
//        val types = locationTypeRepository.find(criteria).associateBy({it.id},{it})
//        return locationRepository.findAllChildren(id).map {it ->
//            it.type.name = types[it.type.id]?.name
//            it
//        }
    }

    override fun saveLocation(entity: Location): String {
//        var location = Location()
//        location.id = entity.id
//        location.name = entity.name.toString()
//        location.heirarchy = NamedReference(entity.heirarchy.toString(), "")
//        location.status = NamedReference(entity.status.toString(),"")
        return locationRepository.update(entity)
    }

    override fun createLocation(entity: LocationDTO): String {
        var location = Location()
        location.name = entity.name.toString()
        location.heirarchy = NamedReference(entity.heirarchy.toString(), "")
        location.status = NamedReference(entity.status.toString(),"")
        return locationRepository.create(location)
    }
}
