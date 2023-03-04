package com.squer.prorpel.common.service.impl

import com.squer.prorpel.common.controller.dto.LocationDTO
import com.squer.prorpel.common.domain.Location
import com.squer.prorpel.common.domain.enums.EmployeeSearchField
import com.squer.prorpel.common.domain.enums.LocationSearchField
import com.squer.prorpel.common.repository.LocationRepository
import com.squer.prorpel.common.repository.LocationTypeRepository
import com.squer.prorpel.common.service.EmployeeService
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

    @Autowired
    lateinit var employeeService: EmployeeService

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
        var searchCriteria = SearchCriteria()
        searchCriteria.addCondition(LocationSearchField.CI_NAME, entity.name?.lowercase()!!)
        searchCriteria.addCondition(LocationSearchField.HEIRARCHY_ID, entity.heirarchy?.id!!)
        val sameLocation = locationRepository.find(searchCriteria)
        if(sameLocation.size >0) {
            if(!sameLocation.get(0).id.equals(entity.id)) {
                return "Same Name is not allowed!"
            }
        }
//        var location = Location()
//        location.id = entity.id
//        location.name = entity.name.toString()
//        location.heirarchy = NamedReference(entity.heirarchy.toString(), "")
//        location.status = NamedReference(entity.status.toString(),"")
        var oldLocation = locationRepository.findById(entity.id!!)
        val id = locationRepository.update(entity)
        if(!oldLocation?.parent?.id.equals(entity.parent?.id)){
            var childCriteria = SearchCriteria()
            childCriteria.addCondition(EmployeeSearchField.LOCATION_ID, entity.id!!)
            var childEmployee = employeeService.find(childCriteria)
            if(childEmployee.size > 0){
                var parentCriteria = SearchCriteria()
                parentCriteria.addCondition(EmployeeSearchField.LOCATION_ID, entity.parent?.id!!)
                var parentEmployee = employeeService.find(parentCriteria)
                if(parentEmployee.size > 0){
                    childEmployee.get(0).manager = NamedReference(parentEmployee.get(0).id!!, "")
                    employeeService.saveEmployee(childEmployee.get(0))
                }
            }
        }
        return id
    }

    override fun createLocation(entity: LocationDTO): String {
        var searchCriteria = SearchCriteria()
        searchCriteria.addCondition(LocationSearchField.CI_NAME, entity.name?.lowercase()!!)
        searchCriteria.addCondition(LocationSearchField.HEIRARCHY_ID, entity.heirarchy!!)
        val sameLocation = locationRepository.find(searchCriteria)
        if(sameLocation.size >0) {
            return "Same Name is not allowed!"
        }
        var location = Location()
        location.name = entity.name.toString()
        location.heirarchy = NamedReference(entity.heirarchy.toString(), "")
        location.status = NamedReference(entity.status.toString(),"")
        if(entity.parent === null){
            location.parent = NamedReference(null, "")
        }else {
            location.parent = NamedReference(entity.parent.toString(), "")
        }
        location.division = NamedReference(entity.division.toString(), "")
        return locationRepository.create(location)
    }

    override fun hoLocations(): List<Location>{
        return locationRepository.hoLocations()
    }

//    override fun findAllParentsForLocation(locationId: String): List<Location>{
//        val criteria = SearchCriteria()
//        //criteria.addCondition("status","ACTIVE")
//        criteria.addCondition(LocationSearchField.STATUS, "ACTIVE")
//        val locations = locationRepository.find(criteria)
//        val locationMap = locations.associateBy ({it.id}, {it})
//        var heirarchy = mutableListOf<Location>()
//        var parentLocationId = locationMap[locationId]?.parent?.id
//        while (parentLocationId != null) {
//            heirarchy.add(locationMap[parentLocationId]!!)
//            parentLocationId = locationMap[parentLocationId]!!.parent?.id
//        }
//        return heirarchy.toList()
//   }
}
