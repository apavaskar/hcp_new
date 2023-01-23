package com.squer.prorpel.common.service.impl

import com.squer.prorpel.common.controller.dto.DoctorMasterDTO
import com.squer.prorpel.common.domain.DoctorMaster
import com.squer.prorpel.common.domain.enums.DoctorMasterSearchField
import com.squer.prorpel.common.domain.enums.DoctorSearchField
import com.squer.prorpel.common.domain.enums.HcpApprovalStatusSearchField
import com.squer.prorpel.common.repository.DoctorMasterRepository
import com.squer.prorpel.common.repository.EmployeeRepository
import com.squer.prorpel.common.service.DoctorMasterService
import com.squer.prorpel.persistence.SearchCriteria
import com.squer.prorpel.persistence.SearchOperator
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.time.temporal.ChronoField

@Service
class DoctorMasterServiceImpl: DoctorMasterService {

    @Autowired
    private lateinit var doctorMasterRepository: DoctorMasterRepository

    @Autowired
    private lateinit var employeeRepository: EmployeeRepository


    override fun doctorMasterList(name: String, specialization: String, location: String, status: String): MutableList<DoctorMasterDTO> {
        var doctormasterDtos : MutableList<DoctorMasterDTO> = mutableListOf()
        var searchCriteria = SearchCriteria()
        if(!name.isNullOrEmpty()){
            searchCriteria.addCondition(DoctorMasterSearchField.NAME, SearchOperator.LIKE, "%"+name.lowercase()+"%")
        }
        if(!specialization.isNullOrEmpty()){
            searchCriteria.addCondition(DoctorMasterSearchField.SPECIALIZATION, specialization)
        }
        if(!location.isNullOrEmpty()){
            searchCriteria.addCondition(DoctorSearchField.LOCATIION_ID, location)
        }
        if(!status.isNullOrEmpty()){
            searchCriteria.addCondition(HcpApprovalStatusSearchField.ACTION, status)
        }
        var cmeDoctors: List<DoctorMaster> = doctorMasterRepository.getDoctorMasterList(searchCriteria)
        cmeDoctors.forEach{
            var doctorMasterDTO = DoctorMasterDTO()
            doctormasterDtos.add(getCmeDoctor(it, doctorMasterDTO))
        }
        return doctormasterDtos

    }

    fun getCmeDoctor(cmeDoctor: DoctorMaster, doctorMasterDTO: DoctorMasterDTO): DoctorMasterDTO{
        doctorMasterDTO.id = cmeDoctor.id
        doctorMasterDTO.name = cmeDoctor.name
        doctorMasterDTO.email = cmeDoctor.email
        doctorMasterDTO.doctor = cmeDoctor.doctor
        doctorMasterDTO.phone = cmeDoctor.phone
        doctorMasterDTO.sfdcNumber = cmeDoctor.sfdcNumber
        doctorMasterDTO.gst = cmeDoctor.gst
        doctorMasterDTO.pancardNo = cmeDoctor.pancardNo
        doctorMasterDTO.actionBy = cmeDoctor.actionBy
        doctorMasterDTO.status = cmeDoctor.status
        doctorMasterDTO.specialization = cmeDoctor.specialization
        //doctorMasterDTO.location = cme
        doctorMasterDTO.approvalId = cmeDoctor.approvalId
        doctorMasterDTO.actionDate = cmeDoctor.updatedOn?.getLong(ChronoField.DAY_OF_YEAR)
        doctorMasterDTO.initiatedDate = cmeDoctor.createdOn?.getLong(ChronoField.DAY_OF_YEAR)
        doctorMasterDTO.initiatedBy = employeeRepository.getEmployeeReference(cmeDoctor.createdBy!!)
        doctorMasterDTO.groupId = cmeDoctor.groupId
        doctorMasterDTO.approvalComment = cmeDoctor.approvalComment
        if (cmeDoctor.status?.id.equals("SYSLVCMEDCTRFLSTS00000000000000000003")) {
            doctorMasterDTO.isRejected = true
        }
        doctorMasterDTO.currentStatus = cmeDoctor.currentStatus
        return doctorMasterDTO
    }


}