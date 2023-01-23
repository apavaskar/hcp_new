package com.squer.prorpel.security.service.impl

import com.squer.prorpel.persistence.SearchCriteria
import com.squer.prorpel.security.domain.JobRole
import com.squer.prorpel.security.repository.JobRoleRepository
import com.squer.prorpel.security.service.JobRoleService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class JobRoleServiceImpl: JobRoleService {
    @Autowired
    lateinit var roleRepository: JobRoleRepository

    override fun getAll(): List<JobRole> {
        return roleRepository.find(SearchCriteria())
    }
}
