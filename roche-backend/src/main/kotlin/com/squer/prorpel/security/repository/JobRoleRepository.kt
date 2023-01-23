package com.squer.prorpel.security.repository
import com.squer.prorpel.jooq.tables.references.CMT_JOB_TITLE
import com.squer.prorpel.persistence.BaseRepository
import com.squer.prorpel.persistence.SearchCriteria
import com.squer.prorpel.security.domain.JobRole
import org.jooq.DSLContext
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Repository

@Repository
class JobRoleRepository: BaseRepository<JobRole>() {

    @Autowired
    @Qualifier("jooqContext")
    private lateinit var dslContext: DSLContext


    override fun create(entity: JobRole): String {
        TODO("Not yet implemented")
    }

    override fun update(entity: JobRole): String {
        TODO("Not yet implemented")
    }

    override fun delete(id: String): String? {
        TODO("Not yet implemented")
    }

    override fun findById(id: String): JobRole? {
        TODO("Not yet implemented")
    }

    override fun find(criteria: SearchCriteria): List<JobRole> {
        return dslContext.select()
                .from(CMT_JOB_TITLE)
                .where(getConditions(criteria))
                .fetchInto(JobRole::class.java)
    }
}
