package com.squer.prorpel.common.service

import com.squer.prorpel.common.controller.dto.DoctorMasterDTO

interface DoctorMasterService {

    fun doctorMasterList(name: String, specialization: String, location: String, status: String): List<DoctorMasterDTO>
}