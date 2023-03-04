package com.squer.prorpel.common.service

import com.squer.prorpel.common.controller.dto.DoctorMasterDTO
import com.squer.prorpel.common.domain.DoctorMaster
import com.squer.prorpel.persistence.SearchCriteria

interface DoctorMasterService {

    fun find(criteria: SearchCriteria): List<DoctorMaster>
    fun doctorMasterList(name: String, specialization: String, location: String, status: String): List<DoctorMasterDTO>
    fun updateCreatedBy(oldId: String, newId: String)
    fun updateUpdatedBy(oldId: String, newId: String)

    fun updateActionBy(oldId: String, newId: String)
    fun updateOldCreatedBy(userId: String)
}