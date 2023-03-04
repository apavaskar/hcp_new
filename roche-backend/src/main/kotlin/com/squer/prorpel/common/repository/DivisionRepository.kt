package com.squer.prorpel.common.repository

import com.squer.prorpel.common.domain.Division
import com.squer.prorpel.jooq.tables.references.CMT_DIVISION
import com.squer.prorpel.persistence.BaseRepository
import com.squer.prorpel.persistence.SearchCriteria
import org.jooq.DSLContext
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Repository

@Repository
class DivisionRepository: BaseRepository<Division>(){

    @Autowired
    @Qualifier("jooqContext")
    lateinit var dslContext: DSLContext

    override fun findById(id: String): Division? {
        TODO("Not yet implemented")
    }

    override fun delete(id: String): String? {
        TODO("Not yet implemented")
    }

    override fun find(criteria: SearchCriteria): List<Division> {
        TODO("Not yet implemented")
    }

    override fun update(entity: Division): String {
        TODO("Not yet implemented")
    }

    override fun create(entity: Division): String {
        TODO("Not yet implemented")
    }

    fun reuiredFindAll(): List<Division>{
        var divisionList = listOf("DIVSN00000000000000000000000000000002", "DIVSN00000000000000000000002022122801")
        return dslContext.select(CMT_DIVISION.asterisk())
                .from(CMT_DIVISION)
                .where(CMT_DIVISION.ID.`in`(divisionList))
                .fetchInto(Division::class.java)
    }

}