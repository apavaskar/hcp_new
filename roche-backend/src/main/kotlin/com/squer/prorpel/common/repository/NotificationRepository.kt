package com.squer.prorpel.common.repository

import com.squer.prorpel.common.domain.Notification
import com.squer.prorpel.persistence.BaseRepository
import com.squer.prorpel.persistence.SearchCriteria
import org.jooq.DSLContext
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Repository

@Repository
class NotificationRepository: BaseRepository<Notification>() {

    @Autowired
    @Qualifier("jooqContext")
    private lateinit var dslContext: DSLContext


    override fun findById(id: String): Notification? {
        TODO("Not yet implemented")
    }

    override fun create(entity: Notification): String {
        TODO("Not yet implemented")
    }

    override fun update(entity: Notification): String {
        TODO("Not yet implemented")
    }

    override fun delete(id: String): String? {
        TODO("Not yet implemented")
    }

    override fun find(criteria: SearchCriteria): List<Notification> {
//        return dslContext.select()
//            .from(NOTIFICATION)
//            .where(getConditions(criteria))
//            .fetchInto(Notification::class.java)
        TODO("Not yet implemented")

    }
}
