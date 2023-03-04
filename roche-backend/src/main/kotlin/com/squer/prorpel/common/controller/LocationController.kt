package com.squer.prorpel.common.controller

import com.squer.prorpel.common.controller.dto.LocationDTO
import com.squer.prorpel.common.domain.Location
import com.squer.prorpel.common.domain.enums.EmployeeSearchField
import com.squer.prorpel.common.domain.enums.LocationSearchField
import com.squer.prorpel.common.domain.enums.LocationTypeSearchField
import com.squer.prorpel.common.service.EmployeeHistoryService
import com.squer.prorpel.common.service.EmployeeService
import com.squer.prorpel.common.service.LocationService
import com.squer.prorpel.persistence.SearchCriteria
import com.squer.prorpel.persistence.SearchField
import com.squer.prorpel.persistence.SearchOperator
import com.squer.prorpel.security.service.impl.UserServiceImpl
import com.squer.prorpel.ui.controller.FormUtils
import com.squer.prorpel.ui.domain.SelectPOJO
import lombok.extern.slf4j.Slf4j
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.time.LocalDateTime

@Slf4j
open class LocationController @Autowired constructor(
    private val locationService: LocationService,
    private val userService: UserServiceImpl,
    private val employeeService: EmployeeService,
    private val employeeHistoryService: EmployeeHistoryService,
    private val formUtils: FormUtils
) {

    companion object{
        val conditionsMap = LocationSearchField.values().associateBy({it.getFieldName()},{it})
    }

    @PostMapping("/search")
    fun search(@RequestBody conditions: Map<String, Any>): ResponseEntity<*> {

        var criteria = SearchCriteria()
        conditions.keys.forEach{
            criteria.addCondition(conditionsMap[it] as SearchField , SearchOperator.LIKE , "%" + conditions[it].toString().trim().lowercase() + "%")
        }
        //        formUtils.formSearchCondition(2, conditions, criteria)
        return ResponseEntity.ok(locationService.searchLocations(criteria))
    }

    @GetMapping("/all")
    fun findAll(): ResponseEntity<*> {

        val criteria = SearchCriteria()
        criteria.addCondition(LocationSearchField.STATUS, "SYSLV50000000000000000000000000000001")
        return ResponseEntity.ok(locationService.searchLocations(criteria))
    }

    @GetMapping("/allWithType")
    fun findAllWithType(): ResponseEntity<*>{
        val criteria = SearchCriteria()
        criteria.addCondition(LocationSearchField.STATUS, "SYSLV50000000000000000000000000000001")
        var locations = locationService.searchLocations(criteria)
        for(location in locations){
            var criteria = SearchCriteria()
            criteria.addCondition(EmployeeSearchField.LOCATION_ID, location.id!!)
            val employeeList = employeeService.find(criteria)
            if(location.heirarchy?.id.equals("ORGHY00000000000000000000000000000005") || location.heirarchy?.id.equals("ORGHY00000000000000000000000000000006") || location.heirarchy?.id.equals("ORGHY00000000000000000000000000000007")){
                location.name = location.name + '-' + location.heirarchy?.name + '-'
            }else {
                val employeeList = employeeService.find(criteria)
                if (employeeList.isEmpty()) {
                    val locationHistoryList = employeeHistoryService.findByLocationId(location.id!!)
                    if (locationHistoryList.size > 0) {
                        val locationEmployee = employeeService.findById(locationHistoryList.get(0).employeeId!!)
                        location.name = location.name + '-' + location.heirarchy?.name + locationEmployee?.name + "- Vacant"
                    } else {
                        location.name = location.name + '-' + location.heirarchy?.name + "- Vacant"
                    }
                }else{
                    location.name = location.name + '-' + location.heirarchy?.name + '-' + employeeList.get(0).name
                }
            }
        }
        return ResponseEntity.ok(locations)
    }

    @GetMapping("/vacant")
    fun vacantLocation(@RequestParam id: String?): ResponseEntity<*>{
        val criteria = SearchCriteria()
        criteria.addCondition(LocationSearchField.STATUS, "SYSLV50000000000000000000000000000001")
        var locations = locationService.searchLocations(criteria)
        var locationList = mutableListOf<Location>()
        for(location in locations){
            var criteria = SearchCriteria()
            criteria.addCondition(EmployeeSearchField.LOCATION_ID, location.id!!)
            val employeeList = employeeService.find(criteria)
            if(employeeList.isEmpty()) {
                val locationHistoryList = employeeHistoryService.findByLocationId(location.id!!)
                if (locationHistoryList.size > 0) {
                    val locationEmployee = employeeService.findById(locationHistoryList.get(0).employeeId!!)
                    location.name = location.name + '-' + location.heirarchy?.name + '-' + locationEmployee?.name + "- Vacant"
                } else {
                    location.name = location.name + '-' + location.heirarchy?.name + "- Vacant"
                }
                locationList.add(location)
            }
        }

        var locationMap = locationList.groupBy { t -> t.id }

        var hoLocations = locationService.hoLocations()
            for(location in hoLocations) {
                if(!locationMap.contains(location.id)){
                    location.name = location.name + '-' + location.heirarchy?.name
                    locationList.add(location)
                }
            }


        if(id !== null) {
            val employee = employeeService.findById(id)
            val locationForId = locationService.findById(employee?.location?.id!!)
            if(locationForId !== null) {
                locationForId?.name = locationForId?.name + '-' + locationForId?.heirarchy?.name
                locationList.add(locationForId!!)
            }else{
                var location =Location()
                location.id = ""
                location.name = "-"
                locationList.add(location)
            }
        }
        return ResponseEntity.ok(locationList)
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
        val location =locationService.createLocation(data)
        if(location == "Same Name is not allowed!"){
            val errorMap: MutableMap<String, String> = HashMap()
            errorMap["message"] = "Same Name is not allowed!"
            errorMap["error"] = "true"
            return ResponseEntity(errorMap, HttpStatus.BAD_REQUEST)
        }else{
            return ResponseEntity.ok<Any>(location)
        }
    }

    @PutMapping("/save")
    fun saveLocation(@RequestBody data: Location): ResponseEntity<*>{
        val location =locationService.saveLocation(data)
        if(location == "Same Name is not allowed!"){
            val errorMap: MutableMap<String, String> = HashMap()
            errorMap["message"] = "Same Name is not allowed!"
            errorMap["error"] = "true"
            return ResponseEntity(errorMap, HttpStatus.BAD_REQUEST)
        }else{
            return ResponseEntity.ok<Any>(location)
        }
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
