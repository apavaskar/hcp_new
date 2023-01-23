package com.squer.prorpel.common.repository

import com.squer.prorpel.common.domain.Doctor
import com.squer.prorpel.persistence.BaseRepository
import com.squer.prorpel.persistence.SearchCriteria
import org.jooq.DSLContext
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Repository

@Repository
class DoctorRepository : BaseRepository<Doctor>(){

    @Autowired
    @Qualifier("jooqContext")
    private lateinit var dslContext: DSLContext
    override fun findById(id: String): Doctor? {
        TODO("Not yet implemented")
    }

    override fun delete(id: String): String? {
        TODO("Not yet implemented")
    }

    override fun find(criteria: SearchCriteria): List<Doctor> {
        TODO("Not yet implemented")
    }

    override fun update(entity: Doctor): String {
        TODO("Not yet implemented")
    }

    override fun create(entity: Doctor): String {
        TODO("Not yet implemented")
    }


}