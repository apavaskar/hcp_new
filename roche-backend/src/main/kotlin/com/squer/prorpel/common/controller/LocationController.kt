package com.squer.prorpel.common.controller

import com.squer.prorpel.common.controller.dto.LocationDTO
import com.squer.prorpel.common.domain.Location
import com.squer.prorpel.common.domain.enums.LocationSearchField
import com.squer.prorpel.common.domain.enums.LocationTypeSearchField
import com.squer.prorpel.common.service.LocationService
import com.squer.prorpel.persistence.SearchCriteria
import com.squer.prorpel.persistence.SearchField
import com.squer.prorpel.security.service.impl.UserServiceImpl
import com.squer.prorpel.ui.domain.SelectPOJO
import lombok.extern.slf4j.Slf4j
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@Slf4j
open class LocationController @Autowired constructor(
    private val locationService: LocationService,
    private val userService: UserServiceImpl
) {

    companion object{
        val conditionsMap = LocationSearchField.values().associateBy({it.getFieldName()},{it})
    }

    @PostMapping("/search")
    fun search(@RequestBody conditions: Map<String, Any>): ResponseEntity<*> {

        var criteria = SearchCriteria()
        conditions.keys.forEach{
            criteria.addCondition(conditionsMap[it] as SearchField ,conditions[it] as Any)
        }
        return ResponseEntity.ok(locationService.searchLocations(criteria))
    }

    @GetMapping("/all")
    fun findAll(): ResponseEntity<*> {

        val criteria = SearchCriteria()
        criteria.addCondition(LocationSearchField.STATUS, "SYSLV50000000000000000000000000000001")
        return ResponseEntity.ok(locationService.searchLocations(criteria))
    }

    @GetMapping("/status")
    fun findStatus(): ResponseEntity<*> {
        val statuses = arrayListOf<SelectPOJO>(
            SelectPOJO(name = "ACTIVE", id="SYSLV50000000000000000000000000000001"),
            SelectPOJO(name = "INACTIVE", id="SYSLV50000000000000000000000000000002")
        )
        return ResponseEntity.ok(statuses)
    }

    @GetMapping("/find/{id}")
    fun findById(@PathVariable("id") id: String): ResponseEntity<*> {
        return ResponseEntity.ok<Any>(locationService.findById(id))
    }

    @PostMapping("/create")
    fun createLocation(@RequestBody data: LocationDTO) :ResponseEntity<*>{
        return ResponseEntity.ok<Any>(locationService.createLocation(data))
    }

    @PutMapping("/save")
    fun saveLocation(@RequestBody data: Location): ResponseEntity<*>{
        return ResponseEntity.ok<Any>(locationService.saveLocation(data))
    }


    @GetMapping("/find-territory/{userId}")
    fun findNonTerritory(@PathVariable("userId") userId: Long): ResponseEntity<*> {
        TODO("Not yet implemented")

//        val nonTerritories = mutableListOf<Location>()
//        val userLocations = userService.findLocationsForUser(userId)
//        val poolCriteria = SearchCriteria()
//        poolCriteria.addCondition(LocationSearchField.STATUS, "ACTIVE")
//        poolCriteria.addCondition(LocationSearchField.TYPE_ID, 6L)
//        val allPoolTerritories = locationService.searchLocations(poolCriteria).associateBy ({it.id!!},{it} )
//        val pools = mutableListOf<Long>()
//        userLocations.forEach {
//            val isTerritory = it.type.id == 5L
//            val criteria = SearchCriteria()
//            criteria.addCondition(LocationSearchField.STATUS, "ACTIVE")
//            val allChildLocations = locationService.findAllChildrenForLocation(it.id!!)
//            allChildLocations.forEach {
////                if (it.poolLocation != null && pools.indexOf(it.poolLocation!!.id)<0 && allPoolTerritories[it.poolLocation!!.id]!= null && isTerritory == false){
////                    pools.add(it.poolLocation!!.id)
////                    val pool = allPoolTerritories[it.poolLocation!!.id]
////                    nonTerritories.add(pool!!)
////                }
//                nonTerritories.add(it)
//            }
//        }
//        return ResponseEntity.ok<Any>(nonTerritories)
    }

}
