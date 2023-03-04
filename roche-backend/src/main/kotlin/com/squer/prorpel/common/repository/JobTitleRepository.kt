package com.squer.prorpel.common.repository

import com.squer.prorpel.common.domain.JobTitle
import com.squer.prorpel.jooq.tables.references.CMT_JOB_TITLE
import com.squer.prorpel.persistence.BaseRepository
import com.squer.prorpel.persistence.SearchCondition
import com.squer.prorpel.persistence.SearchCriteria
import org.jooq.DSLContext
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Repository

@Repository
class JobTitleRepository : BaseRepository<JobTitle>() {

    @Autowired
    @Qualifier("jooqContext")
    private lateinit var dslContext: DSLContext

    override fun findById(id: String): JobTitle? {
        TODO("Not yet implemented")
    }

    override fun delete(id: String): String? {
        TODO("Not yet implemented")
    }

    override fun find(criteria: SearchCriteria): List<JobTitle> {
        return dslContext.select(CMT_JOB_TITLE.asterisk())
                .from(CMT_JOB_TITLE)
                .where(getConditions(criteria))
                .fetchInto(JobTitle::class.java)
    }

    override fun update(entity: JobTitle): String {
        TODO("Not yet implemented")
    }

    override fun create(entity: JobTitle): String {
        TODO("Not yet implemented")
    }

    fun findAll(): List<JobTitle>{
        return dslContext.select(CMT_JOB_TITLE.asterisk())
                .from(CMT_JOB_TITLE)
                .fetchInto(JobTitle::class.java)
    }

    fun requiredFindAll(): List<JobTitle>{
        var jobList = listOf("JOBTT20210000000000000000000000000001","JOBTT20210000000000000000000000000003","JOBTT20210000000000000000000000000002","JOBTT202100000000000000000000000000fa","JOBTT20210000000000000000000000000zsm","JOBTT12500000000000000000000000000125","JOBTT202200000000000000000000000000ft","JOBTT00000000000000000000002023010901","JOBTT000000000000000000000000000ADMIN","JOBTT5768c3f4f8e89392557adaf02b6fc657")
        return dslContext.select(CMT_JOB_TITLE.asterisk())
                .from(CMT_JOB_TITLE)
                .where(CMT_JOB_TITLE.ID.`in`(jobList))
                .fetchInto(JobTitle::class.java)
    }
}