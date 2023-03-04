package com.squer.prorpel.common.service.impl

import com.squer.prorpel.common.controller.dto.EmployeeDTO
import com.squer.prorpel.common.domain.Employee
import com.squer.prorpel.common.domain.EventApprovalStatus
import com.squer.prorpel.common.domain.Location
import com.squer.prorpel.common.domain.enums.*
import com.squer.prorpel.persistence.NamedReference
import com.squer.prorpel.persistence.SearchCriteria
import com.squer.prorpel.persistence.SquerReference
import com.squer.prorpel.security.domain.User
import com.squer.prorpel.security.domain.UserSearchField
import com.squer.prorpel.common.repository.*
import com.squer.prorpel.common.service.*
import com.squer.prorpel.security.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class EmployeeServiceImpl: EmployeeService {

    @Autowired
    lateinit var employeeRepository: EmployeeRepository

    @Autowired
    lateinit var userRepository: UserRepository

    @Autowired
    lateinit var eventCreationRepository: EventCreationRepository

    @Autowired
    lateinit var eventApprovalStatusRepository: EventApprovalStatusRepository

    @Autowired
    lateinit var eventReportRepository: EventReportRepository

    @Autowired
    lateinit var vendorEventCreationRepository: VendorEventCreationRepository

    @Autowired
    lateinit var vendorEventReportRepository: VendorEventReportRepository

    @Autowired
    lateinit var locationRepository: LocationRepository

    @Autowired
    lateinit var doctorMasterRepository: DoctorMasterRepository

    @Autowired
    lateinit var hcpApprovalStatusRepository: HcpApprovalStatusRepository

    @Autowired
    lateinit var employeeHistoryService: EmployeeHistoryService

    @Autowired
    lateinit var doctorMasterService: DoctorMasterService

    @Autowired
    lateinit var hcpApprovalStatusService: HcpApprovalStatusService

    @Autowired
    lateinit var eventCreationService: EventCreationService

    @Autowired
    lateinit var eventReportService: EventReportService

    @Autowired
    lateinit var eventApprovalStatusService: EventApprovalStatusService

    @Autowired
    lateinit var vendorEventCreationService: VendorEventCreationService

    @Autowired
    lateinit var vendorEventReportService: VendorEventReportService

    @Autowired
    lateinit var vendorService: VendorService


    override fun findById(id: String): Employee? {
        return employeeRepository.findById(id)
    }


    override fun getEmployeeReference(id: String): NamedReference{
        return employeeRepository.getEmployeeReference(id)
    }

    override fun searchEmployee(searchCriteria: SearchCriteria): List<Employee> {
        return employeeRepository.find(searchCriteria)
    }

    override fun find(criteria: SearchCriteria): List<Employee> {
        return employeeRepository.find(criteria)
    }

    override fun createEmployee(data: EmployeeDTO): String {
        try {
            var criteriaCheckCode = SearchCriteria()
            criteriaCheckCode.addCondition(EmployeeSearchField.CODE, data.code!!)
            criteriaCheckCode.addCondition(EmployeeSearchField.STATUS, StatusEnum.EMPLOYEE_STATUS_ACTIVE.id)
            val checkCodeForEmployee = employeeRepository.find(criteriaCheckCode)
            if (checkCodeForEmployee.size > 0) {
                return "Duplicate Code";
            }
            var criteriaCheckEmail = SearchCriteria()
            criteriaCheckEmail.addCondition(EmployeeSearchField.EMAIL_ID, data.emailId!!.lowercase())
            criteriaCheckEmail.addCondition(EmployeeSearchField.STATUS, StatusEnum.EMPLOYEE_STATUS_ACTIVE.id)
            val checkEmailForEmployee = employeeRepository.find(criteriaCheckEmail)
            if (checkEmailForEmployee.size > 0) {
                return "Duplicate Email";
            }
            var employee = Employee()
            employee.name = data.name.toString()
            employee.code = data.code
            employee.jobTitle = NamedReference(data.jobTitle.toString(), "")
            employee.location = NamedReference(data.location.toString(), "")
            employee.manager = NamedReference(null, "")
            if(!data.jobTitle.equals("JOBTT202100000000000000000000000000fa") && !data.jobTitle.equals("JOBTT202200000000000000000000000000ft")){
//                val getParentLocation = locationRepository.findById(data.location.toString())
//                if(getParentLocation?.parent !== null) {
//                    if( getParentLocation?.parent?.id != null) {
//                        var criteria = SearchCriteria()
//                        criteria.addCondition(EmployeeSearchField.LOCATION_ID, getParentLocation?.parent?.id!!)
//                        val getManager = employeeRepository.find(criteria)
//                        employee.manager = NamedReference(getManager.get(0).id!!, "")
//                    }
//                }
                val criteria = SearchCriteria()
                //criteria.addCondition("status","ACTIVE")
                criteria.addCondition(LocationSearchField.STATUS, "SYSLV50000000000000000000000000000001")
                val locations = locationRepository.find(criteria)
                val locationMap = locations.associateBy ({it.id}, {it})
                var heirarchy = mutableListOf<Location>()
                var parentLocationId = locationMap[data.location]?.parent?.id
                while (parentLocationId != null) {
                    heirarchy.add(locationMap[parentLocationId]!!)
                    parentLocationId = locationMap[parentLocationId]!!.parent?.id
                }
                val getParentLocation = heirarchy.toList()
                for(p in getParentLocation){
                    var criteria = SearchCriteria()
                    criteria.addCondition(EmployeeSearchField.LOCATION_ID, p.id!!)
                    val getManager = employeeRepository.find(criteria)
                    if(getManager.size > 0){
                        employee.manager = NamedReference(getManager.get(0).id, "")
                        break;
                    }
                }
            }
            employee.emailId = data.emailId
            employee.status = NamedReference(data.status.toString(), "")
            val eId = employeeRepository.create(employee)
            var user = User()
            user.userName = data.code
            if(data.status?.equals(StatusEnum.EMPLOYEE_STATUS_ACTIVE.id)!!){
                user.status = NamedReference(StatusEnum.USER_STATUS_ACTIVE.id, "")
            }else{
                user.status = NamedReference(StatusEnum.USER_STATUS_IN_ACTIVE.id, "")
            }

            user.password = "280d44ab1e9f79b5cce2dd4f58f5fe91f0fbacdac9f7447dffc318ceb79f2d02"
            user.owner = SquerReference(eId)
            val uId = userRepository.create(user)

            if(data.jobTitle.equals("JOBTT202100000000000000000000000000fa") || data.jobTitle.equals("JOBTT202200000000000000000000000000ft")){
                var getEmployeeCriteria = SearchCriteria()
                getEmployeeCriteria.addCondition(EmployeeSearchField.JOB_TITLE_ID, data.jobTitle!!)
                val getEmployee = employeeRepository.find(getEmployeeCriteria)
                if(getEmployee.size > 0){
                    var getApprovalDataCriteria = SearchCriteria()
                    getApprovalDataCriteria.addCondition(EventApprovalStatusSearchField.APPROVER_ID, getEmployee.get(0).id!!)
                    val getApprovalData = eventApprovalStatusRepository.find(getApprovalDataCriteria)
                    if(getApprovalData.size > 0){
                        for(data in getApprovalData){
                            var eventApprovalStatus = EventApprovalStatus()
                            eventApprovalStatus.actionReference = NamedReference(data.actionReference?.id!!, data.actionReference?.name!!)
                            eventApprovalStatus.comment =""
                            eventApprovalStatus.createdBy = data.createdBy
                            eventApprovalStatus.isCurrent = data.isCurrent
                            eventApprovalStatus.staleId = data.staleId
                            eventApprovalStatus.cmeType = data.cmeType
                            eventApprovalStatus.updatedBy = data.updatedBy
                            eventApprovalStatus.ownerId = data.ownerId
                            eventApprovalStatus.approverReference = NamedReference(eId, "")
                            eventApprovalStatus.groupId = data.groupId
                            val eventApprovalStatusId = eventApprovalStatusService.create(eventApprovalStatus)
                        }
                    }
                }
            }else {
                //check Location
                val checkLocationHistory = employeeHistoryService.findByLocationId(data.location!!)
                if (checkLocationHistory.size > 0) {
                    var getOldEmployeeCriteria = SearchCriteria()
                    getOldEmployeeCriteria.addCondition(UserSearchField.OWNER_ID, checkLocationHistory.get(0).employeeId!!)
                    val getOldEmployee = userRepository.find(getOldEmployeeCriteria)
                    changeCreatedAndUpdatedBy(getOldEmployee.get(0).id!!, uId)
                    //   changeActionBy(checkLocationHistory.get(0).employeeId!!, eId)
                }

                if (!data.jobTitle.equals("JOBTT20210000000000000000000000000001")) {
                    var childCriteria = SearchCriteria()
                    childCriteria.addCondition(LocationSearchField.PARENT_ID, data.location!!)
                    val getChildLocation = locationRepository.find(childCriteria)
                    if (getChildLocation.size > 0) {
                        for (childLocation in getChildLocation) {
                            var childEmployee = SearchCriteria()
                            childEmployee.addCondition(EmployeeSearchField.LOCATION_ID, childLocation.id!!)
                            val getChildEmployee = employeeRepository.find(childEmployee)
                            if (getChildEmployee.size > 0) {
                                for (child in getChildEmployee) {
                                    val oldManager = child.manager?.id
                                    child.manager = NamedReference(eId, "")
                                    val updatedChildId = employeeRepository.update(child)
                                    changeApprover(oldManager!!, eId, child.id!!)
                                }
                            }
                        }
                    }
                }

            }

            return eId
        }catch(e: Exception){
            return "Something went wrong!"
        }
    }

    override fun saveEmployee(data: Employee): String {
        try {
            val employee = employeeRepository.findById(data.id!!)

            if(!employee?.emailId?.lowercase().equals(data.emailId?.lowercase())){
                var criteriaCheckEmail = SearchCriteria()
                criteriaCheckEmail.addCondition(EmployeeSearchField.EMAIL_ID, data.emailId!!.lowercase())
                criteriaCheckEmail.addCondition(EmployeeSearchField.STATUS, StatusEnum.EMPLOYEE_STATUS_ACTIVE.id)
                val checkEmailForEmployee = employeeRepository.find(criteriaCheckEmail)
                if (checkEmailForEmployee.size > 0 && !checkEmailForEmployee.get(0).id!!.equals(data.id)) {
                    return "Duplicate Email";
                }
            }

            val oldLocationId = employee?.location?.id
            val oldManagerId = employee?.manager?.id
            var locationFlag = false
            var statusFlag = false

            val employeeId = employeeRepository.update(data)

            //Status Change
            if (!employee?.status?.id.equals(data.status?.id)) {
                var criteria = SearchCriteria()
                criteria.addCondition(UserSearchField.OWNER_ID, employeeId)
                var userList = userRepository.find(criteria)
                var user = userList.get(0)
                if (data.status?.id!!.equals(StatusEnum.EMPLOYEE_STATUS_ACTIVE.id)) {
                    var updatedEmployeeData = employeeRepository.findById(employeeId)
                    user.status?.id = StatusEnum.USER_STATUS_ACTIVE.id
                    if(data.location == null || data.location?.id === "" ){
                        return "Please Select Location"
                    }
                    val getParentLocation = locationRepository.findById(updatedEmployeeData?.location?.id!!)
                    if(getParentLocation?.parent !== null) {
                        if (getParentLocation?.parent?.id != null) {
                            val criteria = SearchCriteria()
                            criteria.addCondition(EmployeeSearchField.LOCATION_ID, getParentLocation?.parent?.id!!)
                            val getManager = employeeRepository.find(criteria)
                            updatedEmployeeData.manager = NamedReference(getManager.get(0).id!!, "")
                            employeeRepository.update(updatedEmployeeData!!)
                        }
                    }

                    val checkLocationHistory = employeeHistoryService.findByLocationId(updatedEmployeeData.location?.id!!)
                    if(checkLocationHistory.size > 0 ){
                        var condition = SearchCriteria()
                        condition.addCondition(UserSearchField.OWNER_ID, checkLocationHistory.get(0).employeeId!!)
                        val userDetail = userRepository.find(condition)
                        changeCreatedAndUpdatedBy(userDetail.get(0).id!!, user.id!!)
                    }

                } else if (data.status?.id.equals(StatusEnum.EMPLOYEE_STATUS_IN_ACTIVE.id)) {
                    var updatedEmployeeData = employeeRepository.findById(employeeId)
                    //Add into history table
                    val historyEmployeeId = employeeHistoryService.addEmployeeToHistory(employee?.id!!, employee.location?.id!!)

                    updateOldCreatedById(user.id!!)

                    user.status?.id = StatusEnum.USER_STATUS_IN_ACTIVE.id
                    updatedEmployeeData?.location = NamedReference(null, "")
                    updatedEmployeeData?.manager = NamedReference(null, "")
                    employeeRepository.update(updatedEmployeeData!!)

                    var childNewCriteria = SearchCriteria()
                    childNewCriteria.addCondition(LocationSearchField.PARENT_ID, employee?.location?.id!!)
                    val getNewChildLocation = locationRepository.find(childNewCriteria)
                    if(getNewChildLocation.size > 0){
                        for(childLocation in getNewChildLocation){
                            var childEmployee = SearchCriteria()
                            childEmployee.addCondition(EmployeeSearchField.LOCATION_ID, childLocation.id!!)
                            val getChildEmployee = employeeRepository.find(childEmployee)
                            if(getChildEmployee.size >0){
                                for(child in getChildEmployee){
                                    child.manager = NamedReference(employee.manager?.id!!, "")
                                    employeeRepository.update(child)
                                    changeApprover(employeeId, employee.manager?.id!!, child.id!!)
                                }
                            }
                        }
                    }
                }
                val userId = userRepository.update(user)
                return employeeId
            }

            //Designation Change
            if(!employee?.jobTitle?.id.equals(data.jobTitle?.id)){
                if(employee?.location?.id.equals(data?.location?.id)){
                    return "Please Change Location"
                }else{
                    val historyEmployeeId = employeeHistoryService.addEmployeeToHistory(employee?.id!!, employee.location?.id!!)
                    var criteria = SearchCriteria()
                    criteria.addCondition(UserSearchField.OWNER_ID, employeeId)
                    var userList = userRepository.find(criteria)
                    var user = userList.get(0)
                    updateOldCreatedById(user.id!!)
                    if(!employee.jobTitle?.id.equals("JOBTT20210000000000000000000000000001")){
                        var childNewCriteria = SearchCriteria()
                        childNewCriteria.addCondition(LocationSearchField.PARENT_ID, employee?.location?.id!!)
                        val getNewChildLocation = locationRepository.find(childNewCriteria)
                        if(getNewChildLocation.size > 0){
                            for(childLocation in getNewChildLocation){
                                var childEmployee = SearchCriteria()
                                childEmployee.addCondition(EmployeeSearchField.LOCATION_ID, childLocation.id!!)
                                val getChildEmployee = employeeRepository.find(childEmployee)
                                if(getChildEmployee.size >0){
                                    for(child in getChildEmployee){
                                        child.manager = NamedReference(employee.manager?.id!!, "")
                                        employeeRepository.update(child)
                                        changeApprover(data.id!!, employee.manager?.id!!,child.id!!)
                                    }
                                }
                            }
                        }
                    }
                    val checkLocationHistory = employeeHistoryService.findByLocationId(data.location?.id!!)
                    if(checkLocationHistory.size > 0){
                        var getNewEmployeeCriteria = SearchCriteria()
                        getNewEmployeeCriteria.addCondition(UserSearchField.OWNER_ID, data.id!!)
                        val getNewEmployee = userRepository.find(getNewEmployeeCriteria)
                        var getOldEmployeeCriteria = SearchCriteria()
                        getOldEmployeeCriteria.addCondition(UserSearchField.OWNER_ID, checkLocationHistory.get(0).employeeId!!)
                        val getOldEmployee = userRepository.find(getOldEmployeeCriteria)
                        changeCreatedAndUpdatedBy(getOldEmployee.get(0).id!!, user.id!!)
                        changeActionBy(checkLocationHistory.get(0).employeeId!!, data.id!!)
                    }
                }
            }

            // Location Change
            if (!employee?.location?.id.equals(data?.location?.id)) {
                val historyEmployeeId = employeeHistoryService.addEmployeeToHistory(employee?.id!!, employee.location?.id!!)
                var criteria = SearchCriteria()
                criteria.addCondition(UserSearchField.OWNER_ID, employeeId)
                var userList = userRepository.find(criteria)
                var user = userList.get(0)
                updateOldCreatedById(user.id!!)
                if(!employee?.jobTitle?.id.equals("JOBTT20210000000000000000000000000001")){
                    var childCriteria = SearchCriteria()
                    childCriteria.addCondition(LocationSearchField.PARENT_ID, employee?.location?.id!!)
                    val getChildLocation = locationRepository.find(childCriteria)
                    if(getChildLocation.size > 0){
                        for(childLocation in getChildLocation){
                            var childEmployee = SearchCriteria()
                            childEmployee.addCondition(EmployeeSearchField.LOCATION_ID, childLocation.id!!)
                            val getChildEmployee = employeeRepository.find(childEmployee)
                            if(getChildEmployee.size >0){
                                for(child in getChildEmployee){
                                    child.manager = NamedReference(employee.manager?.id!!, "")
                                    employeeRepository.update(child)
                                    changeApprover(employeeId, employee.manager?.id!!, child.id!!)
                                }
                            }
                        }
                    }
                }
                //update manager
                val getParentLocation = locationRepository.findById(data.location?.id!!)
                if(getParentLocation?.parent !== null) {
                    if( getParentLocation?.parent?.id != null) {
                        val criteria = SearchCriteria()
                        criteria.addCondition(EmployeeSearchField.LOCATION_ID, getParentLocation?.parent?.id!!)
                        val getManager = employeeRepository.find(criteria)
                        data?.manager = NamedReference(getManager.get(0).id!!, "")
                        employeeRepository.update(data!!)
                    }else{
                        data?.manager = NamedReference(null, "")
                        employeeRepository.update(data!!)
                    }
                }
                else{
                    data?.manager = NamedReference(null, "")
                    employeeRepository.update(data!!)
                }

                //update new child manager

                var childNewCriteria = SearchCriteria()
                childNewCriteria.addCondition(LocationSearchField.PARENT_ID, data?.location?.id!!)
                val getNewChildLocation = locationRepository.find(childNewCriteria)
                if(getNewChildLocation.size > 0){
                    for(childLocation in getNewChildLocation){
                        var childEmployee = SearchCriteria()
                        childEmployee.addCondition(EmployeeSearchField.LOCATION_ID, childLocation.id!!)
                        val getChildEmployee = employeeRepository.find(childEmployee)
                        if(getChildEmployee.size >0){
                            for(child in getChildEmployee){
                                child.manager = NamedReference(data.id!!, "")
                                employeeRepository.update(child)
                            }
                        }
                    }
                }

                var updatedEmployeeData = employeeRepository.findById(employeeId)
                if(employee?.manager !== null) {
                    if(employee?.manager?.id !==null) {
                        changeApprover(employee?.manager?.id!!, updatedEmployeeData?.manager?.id!!, employeeId)
                    }
                }
                val checkLocationHistory = employeeHistoryService.findByLocationId(data.location?.id!!)
                if(checkLocationHistory.size > 0){
                    var getNewEmployeeCriteria = SearchCriteria()
                    getNewEmployeeCriteria.addCondition(UserSearchField.OWNER_ID, data.id!!)
                    val getNewEmployee = userRepository.find(getNewEmployeeCriteria)
                    var getOldEmployeeCriteria = SearchCriteria()
                    getOldEmployeeCriteria.addCondition(UserSearchField.OWNER_ID, checkLocationHistory.get(0).employeeId!!)
                    val getOldEmployee = userRepository.find(getOldEmployeeCriteria)
                    changeCreatedAndUpdatedBy(getOldEmployee.get(0).id!!, getNewEmployee.get(0).id!!)
                    changeActionBy(checkLocationHistory.get(0).employeeId!!, data.id!!)
                }
            }

            //if Manager is changing and Location not
            if(!employee?.manager?.id.equals(data.manager?.id)!! && employee?.location?.id.equals(data.location?.id)!!){
                var updatedEmployeeData = employeeRepository.findById(employeeId)
                changeApprover(employee?.manager?.id!!, updatedEmployeeData?.manager?.id!!, employeeId)
            }


            return employeeId
        }catch(e: Exception){
            return "Something went wrong!"
        }
    }

    fun changeCreatedAndUpdatedBy(oldUserId: String, newUserId: String){
        //cme Doctor
            doctorMasterService.updateCreatedBy(oldUserId, newUserId)
            //doctorMasterService.updateUpdatedBy(oldUserId, newUserId)

        //hcp approval
            //hcpApprovalStatusService.updateCreatedBy(oldUserId, newUserId)
           // hcpApprovalStatusService.updateUpdatedBy(oldUserId,newUserId)

        //hcp event
            eventCreationService.updateCreatedBy(oldUserId, newUserId)
            //eventCreationService.updateUpdatedBy(oldUserId, newUserId)

        //hcp event report
            eventReportService.updateCreatedBy(oldUserId, newUserId)
            //eventReportService.updateUpdatedBy(oldUserId, newUserId)

        //event approval
            //eventApprovalStatusService.updateCreatedBy(oldUserId, newUserId)
            //eventApprovalStatusService.updateUpdatedBy(oldUserId, newUserId)

        //vendor
            vendorService.updateCreatedBy(oldUserId, newUserId)
            //vendorService.updateUpdatedBy(oldUserId, newUserId)

        //vendor Event
            vendorEventCreationService.updateCreatedBy(oldUserId, newUserId)
            //vendorEventCreationService.updateUpdatedBy(oldUserId, newUserId)

        //vendor event report
            vendorEventReportService.updateCreatedBy(oldUserId, newUserId)
            //vendorEventReportService.updateUpdatedBy(oldUserId, newUserId)
    }

    fun changeActionBy(oldEmployeeId: String, newEmployeeId: String){
        //doctor master
        doctorMasterService.updateActionBy(oldEmployeeId, newEmployeeId)

        //hcp Approval
        hcpApprovalStatusService.updateActionBy(oldEmployeeId, newEmployeeId)

        //hcp event
        eventCreationService.updateActionBy(oldEmployeeId, newEmployeeId)

        //hcp event report
        eventReportService.updateActionBy(oldEmployeeId, newEmployeeId)

        //event approval
        eventApprovalStatusService.updateActionBy(oldEmployeeId, newEmployeeId)

        //vendor
        vendorService.updateActionBy(oldEmployeeId, newEmployeeId)

        //vendor event
        vendorEventCreationService.updateActionBy(oldEmployeeId, newEmployeeId)

        //vendor report
        vendorEventReportService.updateActionBy(oldEmployeeId, newEmployeeId)
    }

    fun changeApprover(oldManagerId: String, newManagerId: String, employeeId: String){
        var condition = SearchCriteria()
        condition.addCondition(UserSearchField.OWNER_ID, employeeId)
        val userDetail = userRepository.find(condition)
        val userId = userDetail[0].id
        var updateEventCreationList = mutableListOf<String>()
        var updateHcpList = mutableListOf<String>()

        //HCP
        var hcpCondition = SearchCriteria()
        hcpCondition.addCondition(DoctorMasterSearchField.CREATED_BY_CDM, userId.toString())
        val hcps = doctorMasterRepository.find(hcpCondition)
        for(hcp in hcps){
            var hcpCondition2 = SearchCriteria()
            hcpCondition2.addCondition(HcpApprovalStatusSearchField.APPROVER_ID, oldManagerId.toString())
            hcpCondition2.addCondition(HcpApprovalStatusSearchField.ACTION1, "SYSLVCMEDCTRFLSTS00000000000000000001")
            hcpCondition2.addCondition(HcpApprovalStatusSearchField.OWNER_ID, hcp.id!!)
            val pendingHcpList = hcpApprovalStatusRepository.find(hcpCondition2)
            if (pendingHcpList.size > 0) {
                for (i in pendingHcpList) {
                    updateHcpList.add(i.id!!)
                }
            }
        }
        for(hcp in hcps){
            var hcpCondition2 = SearchCriteria()
            hcpCondition2.addCondition(HcpApprovalStatusSearchField.APPROVER_ID, oldManagerId.toString())
            hcpCondition2.addCondition(HcpApprovalStatusSearchField.ACTION1, "SYSLVCMEDCTRFLSTS00000000000000000003")
            hcpCondition2.addCondition(HcpApprovalStatusSearchField.OWNER_ID, hcp.id!!)
            val pendingHcpList = hcpApprovalStatusRepository.find(hcpCondition2)
            if (pendingHcpList.size > 0) {
                for (i in pendingHcpList) {
                    updateHcpList.add(i.id!!)
                }
            }
        }

        var hcpConditionForTm1 = SearchCriteria()
        hcpConditionForTm1.addCondition(HcpApprovalStatusSearchField.APPROVER_ID, oldManagerId.toString())
        hcpConditionForTm1.addCondition(HcpApprovalStatusSearchField.ACTION1, "SYSLVCMEDCTRFLSTS00000000000000000001")
        hcpConditionForTm1.addCondition(HcpApprovalStatusSearchField.CREATED_BY, userId!!)
        val pendingHcpListForTm1 = hcpApprovalStatusRepository.find(hcpConditionForTm1)
        if(pendingHcpListForTm1.size > 0){
            for(i in pendingHcpListForTm1){
                updateHcpList.add(i.id!!)
            }
        }
        var hcpConditionForTm2 = SearchCriteria()
        hcpConditionForTm2.addCondition(HcpApprovalStatusSearchField.APPROVER_ID, oldManagerId.toString())
        hcpConditionForTm2.addCondition(HcpApprovalStatusSearchField.ACTION1, "SYSLVCMEDCTRFLSTS00000000000000000003")
        hcpConditionForTm2.addCondition(HcpApprovalStatusSearchField.CREATED_BY, userId!!)
        val pendingHcpListForTm2 = hcpApprovalStatusRepository.find(hcpConditionForTm2)
        if(pendingHcpListForTm2.size > 0){
            for(i in pendingHcpListForTm2){
                updateHcpList.add(i.id!!)
            }
        }

        for (i in updateHcpList) {
            hcpApprovalStatusRepository.updateApprover(i, newManagerId)
        }


        //Event Creation
        var condition1 = SearchCriteria()
        condition1.addCondition(EventCreationSearchField.CREATED_BY1, userId.toString())
        val events = eventCreationRepository.find(condition1)
        for (event in events) {
            var condition2 = SearchCriteria()
            condition2.addCondition(EventApprovalStatusSearchField.APPROVER_ID, oldManagerId.toString())
            condition2.addCondition(EventApprovalStatusSearchField.ACTION1, "SYSLVCMEDCTRFLSTS00000000000000000001")
            condition2.addCondition(EventApprovalStatusSearchField.OWNER_ID1, event.id!!)
            val pendingEventList = eventApprovalStatusRepository.find(condition2)
            if (pendingEventList.size > 0) {
                for (i in pendingEventList) {
                    updateEventCreationList.add(i.id!!)
                }
            }
        }
        for (event in events) {
            var condition2 = SearchCriteria()
            condition2.addCondition(EventApprovalStatusSearchField.APPROVER_ID, oldManagerId.toString())
            condition2.addCondition(EventApprovalStatusSearchField.ACTION1, "SYSLVCMEDCTRFLSTS00000000000000000003")
            condition2.addCondition(EventApprovalStatusSearchField.OWNER_ID1, event.id!!)
            val pendingEventList = eventApprovalStatusRepository.find(condition2)
            if (pendingEventList.size > 0) {
                for (i in pendingEventList) {
                    updateEventCreationList.add(i.id!!)
                }
            }
        }


        //Event Report
        var condition3 = SearchCriteria()
        condition3.addCondition(EventReportSearchField.CREATED_BY, userId.toString())
        val eventReports = eventReportRepository.find(condition3)
        for (report in eventReports) {
            var condition4 = SearchCriteria()
            condition4.addCondition(EventApprovalStatusSearchField.APPROVER_ID, oldManagerId.toString())
            condition4.addCondition(EventApprovalStatusSearchField.ACTION1, "SYSLVCMEDCTRFLSTS00000000000000000001")
            condition4.addCondition(EventApprovalStatusSearchField.OWNER_ID1, report.id!!)
            val pendingEventReportList = eventApprovalStatusRepository.find(condition4)
            if (pendingEventReportList.size > 0) {
                for (i in pendingEventReportList) {
                    updateEventCreationList.add(i.id!!)
                }
            }
        }
        for (report in eventReports) {
            var condition4 = SearchCriteria()
            condition4.addCondition(EventApprovalStatusSearchField.APPROVER_ID, oldManagerId.toString())
            condition4.addCondition(EventApprovalStatusSearchField.ACTION1, "SYSLVCMEDCTRFLSTS00000000000000000003")
            condition4.addCondition(EventApprovalStatusSearchField.OWNER_ID1, report.id!!)
            val pendingEventReportList = eventApprovalStatusRepository.find(condition4)
            if (pendingEventReportList.size > 0) {
                for (i in pendingEventReportList) {
                    updateEventCreationList.add(i.id!!)
                }
            }
        }

        // Vendor Event Creation
        var condition5 = SearchCriteria()
        condition5.addCondition(VendorEventCreationSearchField.CREATED_BY1, userId.toString())
        val vendorEvents = vendorEventCreationRepository.find(condition5)
        for (event in vendorEvents) {
            var condition6 = SearchCriteria()
            condition6.addCondition(EventApprovalStatusSearchField.APPROVER_ID, oldManagerId.toString())
            condition6.addCondition(EventApprovalStatusSearchField.ACTION1, "SYSLVCMEDCTRFLSTS00000000000000000001")
            condition6.addCondition(EventApprovalStatusSearchField.OWNER_ID1, event.id!!)
            val pendingEventList = eventApprovalStatusRepository.find(condition6)
            if (pendingEventList.size > 0) {
                for (i in pendingEventList) {
                    updateEventCreationList.add(i.id!!)
                }
            }
        }
        for (event in vendorEvents) {
            var condition6 = SearchCriteria()
            condition6.addCondition(EventApprovalStatusSearchField.APPROVER_ID, oldManagerId.toString())
            condition6.addCondition(EventApprovalStatusSearchField.ACTION1, "SYSLVCMEDCTRFLSTS00000000000000000003")
            condition6.addCondition(EventApprovalStatusSearchField.OWNER_ID1, event.id!!)
            val pendingEventList = eventApprovalStatusRepository.find(condition6)
            if (pendingEventList.size > 0) {
                for (i in pendingEventList) {
                    updateEventCreationList.add(i.id!!)
                }
            }
        }


        //vendor Event Report
        var condition7 = SearchCriteria()
        condition7.addCondition(VendorEventReportSearchField.CREATED_BY, userId.toString())
        val vendorEventReports = vendorEventReportRepository.find(condition7)
        for (report in vendorEventReports) {
            var condition8 = SearchCriteria()
            condition8.addCondition(EventApprovalStatusSearchField.APPROVER_ID, oldManagerId.toString())
            condition8.addCondition(EventApprovalStatusSearchField.ACTION1, "SYSLVCMEDCTRFLSTS00000000000000000001")
            condition8.addCondition(EventApprovalStatusSearchField.OWNER_ID1, report.id!!)
            val pendingEventReportList = eventApprovalStatusRepository.find(condition8)
            if (pendingEventReportList.size > 0) {
                for (i in pendingEventReportList) {
                    updateEventCreationList.add(i.id!!)
                }
            }
        }
        for (report in vendorEventReports) {
            var condition8 = SearchCriteria()
            condition8.addCondition(EventApprovalStatusSearchField.APPROVER_ID, oldManagerId.toString())
            condition8.addCondition(EventApprovalStatusSearchField.ACTION1, "SYSLVCMEDCTRFLSTS00000000000000000003")
            condition8.addCondition(EventApprovalStatusSearchField.OWNER_ID1, report.id!!)
            val pendingEventReportList = eventApprovalStatusRepository.find(condition8)
            if (pendingEventReportList.size > 0) {
                for (i in pendingEventReportList) {
                    updateEventCreationList.add(i.id!!)
                }
            }
        }

        var eventConditionForTm1 = SearchCriteria()
        eventConditionForTm1.addCondition(EventApprovalStatusSearchField.APPROVER_ID, oldManagerId.toString())
        eventConditionForTm1.addCondition(EventApprovalStatusSearchField.ACTION1, "SYSLVCMEDCTRFLSTS00000000000000000001")
        eventConditionForTm1.addCondition(EventApprovalStatusSearchField.CREATED_BY1, userId!!)
        val pendingEventListForTM1 = eventApprovalStatusRepository.find(eventConditionForTm1)
        if(pendingEventListForTM1.size > 0){
            for(i in pendingEventListForTM1){
                updateEventCreationList.add(i.id!!)
            }
        }
        var eventConditionForTm2 = SearchCriteria()
        eventConditionForTm2.addCondition(EventApprovalStatusSearchField.APPROVER_ID, oldManagerId.toString())
        eventConditionForTm2.addCondition(EventApprovalStatusSearchField.ACTION1, "SYSLVCMEDCTRFLSTS00000000000000000003")
        eventConditionForTm2.addCondition(EventApprovalStatusSearchField.CREATED_BY1, userId!!)
        val pendingEventListForTM2 = eventApprovalStatusRepository.find(eventConditionForTm2)
        if(pendingEventListForTM2.size > 0){
            for(i in pendingEventListForTM2){
                updateEventCreationList.add(i.id!!)
            }
        }

        for (i in updateEventCreationList) {
            eventApprovalStatusRepository.updateApprover(i, newManagerId.toString())
        }
    }

    fun updateOldCreatedById(userId: String){
        doctorMasterService.updateOldCreatedBy(userId)
        eventCreationService.updateOldCreatedBy(userId)
        eventReportService.updateOldCreatedBy(userId)

        vendorService.updateOldCreatedBy(userId)
        vendorEventCreationService.updateOldCreatedBy(userId)
        vendorEventReportService.updateOldCreatedBy(userId)
    }

}