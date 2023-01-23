package com.squer.prorpel.security.repository
import com.squer.prorpel.persistence.BaseRepository
import com.squer.prorpel.persistence.SearchCriteria
import com.squer.prorpel.security.domain.SecurityRole
import org.jooq.DSLContext
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Repository

@Repository
class SecurityRoleRepository: BaseRepository<SecurityRole>() {
    @Autowired
    @Qualifier("jooqContext")
    private lateinit var dslContext: DSLContext


    override fun create(entity: SecurityRole): String {
        TODO("Not yet implemented")
    }

    override fun update(entity: SecurityRole): String {
        TODO("Not yet implemented")
    }

    override fun delete(id: String): String? {
        TODO("Not yet implemented")
    }

    override fun findById(id: String): SecurityRole? {
        TODO("Not yet implemented")
    }

    override fun find(criteria: SearchCriteria): List<SecurityRole> {
        TODO("Not yet implemented")
    }
}
