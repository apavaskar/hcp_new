package com.squer.prorpel.common.service.impl

import com.squer.prorpel.common.repository.SystemLovRepository
import com.squer.prorpel.common.repository.UserLovRepository
import com.squer.prorpel.common.service.LovService
import com.squer.prorpel.persistence.NamedReference
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class LovServiceImpl : LovService{

    @Autowired
    lateinit var userLovRepository: UserLovRepository

    @Autowired
    lateinit var systemLovRepository: SystemLovRepository

    override fun findByType(table: String, type: String): List<NamedReference> {
        var types : MutableList<NamedReference> = mutableListOf()
       if(table == "user"){
           types =  userLovRepository.findByType(type)
       } else if(table == "system"){
           types = systemLovRepository.findByType(type)
       }
        return types
    }

}