package com.squer.prorpel.security.service

import com.squer.prorpel.security.domain.JobRole


interface JobRoleService {
    fun getAll(): List<JobRole>
}
