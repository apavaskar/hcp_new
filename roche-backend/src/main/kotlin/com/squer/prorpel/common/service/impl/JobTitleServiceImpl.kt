package com.squer.prorpel.common.service.impl

import com.squer.prorpel.common.domain.JobTitle
import com.squer.prorpel.common.repository.JobTitleRepository
import com.squer.prorpel.common.service.JobTitleService
import com.squer.prorpel.persistence.SearchCriteria
import lombok.extern.slf4j.Slf4j
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class JobTitleServiceImpl : JobTitleService{

    @Autowired
    private lateinit var jobTitleRepository: JobTitleRepository

    override fun searchJob(): List<JobTitle> {
        return jobTitleRepository.findAll()
    }

    override fun requiredJobTitleSearch(): List<JobTitle> {
        return jobTitleRepository.requiredFindAll()
    }

}