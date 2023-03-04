package com.squer.prorpel.common.service.impl

import com.squer.prorpel.common.domain.Division
import com.squer.prorpel.common.repository.DivisionRepository
import com.squer.prorpel.common.service.DivisionService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class DivisionServiceImpl: DivisionService{

    @Autowired
    lateinit var divisionRepository: DivisionRepository

    override fun requiredAllDivision(): List<Division> {
            return divisionRepository.reuiredFindAll()
    }
}