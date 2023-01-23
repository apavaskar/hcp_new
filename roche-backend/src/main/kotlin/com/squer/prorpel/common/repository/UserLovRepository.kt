package com.squer.prorpel.common.repository

import com.squer.prorpel.common.domain.UserLov
import com.squer.prorpel.jooq.tables.references.FMK_USER_LOV
import com.squer.prorpel.persistence.BaseRepository
import com.squer.prorpel.persistence.NamedReference
import com.squer.prorpel.persistence.SearchCriteria
import org.jooq.DSLContext
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Repository

@Repository
class UserLovRepository: BaseRepository<UserLov>() {

    @Autowired
    @Qualifier("jooqContext")
    private lateinit var dslContext: DSLContext

    override fun findById(id: String): UserLov? {
        TODO("Not yet implemented")
    }

    override fun create(entity: UserLov): String {
        TODO("Not yet implemented")
    }

    override fun update(entity: UserLov): String {
        TODO("Not yet implemented")
    }

    override fun delete(id: String): String? {
        TODO("Not yet implemented")
    }

    override fun find(criteria: SearchCriteria): List<UserLov> {
        TODO("Not yet implemented")
    }

    fun findByType(type: String): MutableList<NamedReference>{
        return dslContext.select(FMK_USER_LOV.ID.`as`("id"), FMK_USER_LOV.NAME.`as`("name"))
                .from(FMK_USER_LOV)
                .where(FMK_USER_LOV.LOV_TYPE.eq(type))
                .fetchInto(NamedReference::class.java)
    }
}