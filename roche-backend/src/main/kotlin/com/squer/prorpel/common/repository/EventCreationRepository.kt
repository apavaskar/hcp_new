package com.squer.prorpel.common.repository

import com.squer.prorpel.common.domain.EventCreation
import com.squer.prorpel.jooq.tables.references.*
import com.squer.prorpel.persistence.BaseRepository
import com.squer.prorpel.persistence.SearchCriteria
import org.jooq.DSLContext
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Repository

@Repository
class EventCreationRepository: BaseRepository<EventCreation>() {

    @Autowired
    @Qualifier("jooqContext")
    private lateinit var dslContext: DSLContext

    override fun findById(id: String): EventCreation? {
        val fsl1 = FMK_SYSTEM_LOV.`as`("fsl1")
        val fsl2 = FMK_SYSTEM_LOV.`as`("fsl2")
        return dslContext.select(CME_EVENT_CREATION.asterisk(), CME_EVENT_CREATION.EVENT_TYPE_ID.`as`("eventType.id"), FMK_USER_LOV.NAME.`as`("eventType.name"),
                    CME_EVENT_CREATION.STATUS.`as`("status.id"), fsl1.NAME.`as`("status.name"),
                    CME_EVENT_CREATION.CURRENT_STATUS.`as`("currentStatus.id"), fsl2.NAME.`as`("currentStatus.name"),
                    CME_EVENT_CREATION.ACTION_BY.`as`("actionBy.id"), CMT_EMPLOYEE.NAME.`as`("actionBy.name"))
                .from(CME_EVENT_CREATION)
                .leftJoin(FMK_USER_LOV).on(FMK_USER_LOV.ID.eq(CME_EVENT_CREATION.EVENT_TYPE_ID))
                .leftJoin(fsl1).on(fsl1.ID.eq(CME_EVENT_CREATION.STATUS))
                .leftJoin(fsl2).on(fsl2.ID.eq(CME_EVENT_CREATION.CURRENT_STATUS))
                .leftJoin(CMT_EMPLOYEE).on(CMT_EMPLOYEE.ID.eq(CME_EVENT_CREATION.ACTION_BY))
                .where(CME_EVENT_CREATION.ID.eq(id))
                .fetchOneInto(EventCreation::class.java)
    }

    override fun delete(id: String): String? {
        TODO("Not yet implemented")
    }

    override fun find(criteria: SearchCriteria): List<EventCreation> {
        val fsl1 = FMK_SYSTEM_LOV.`as`("fsl1")
        val fsl2 = FMK_SYSTEM_LOV.`as`("fsl2")
        val e = CMT_EMPLOYEE.`as`("e")
        return dslContext.select(CME_EVENT_CREATION.asterisk(), CME_EVENT_CREATION.EVENT_TYPE_ID.`as`("eventTypeReference.id"), FMK_USER_LOV.NAME.`as`("eventTypeReference.name"),
                CME_EVENT_CREATION.STATUS.`as`("statusReference.id"), fsl1.NAME.`as`("statusReference.name"),
                CME_EVENT_CREATION.CURRENT_STATUS.`as`("currentStatusReference.id"), fsl2.NAME.`as`("currentStatusReference.name"),
                CME_EVENT_CREATION.ACTION_BY.`as`("actionByReference.id"), e.NAME.`as`("actionByReference.name"))
                .from(CME_EVENT_CREATION)
                .leftJoin(FMK_USER_LOV).on(FMK_USER_LOV.ID.eq(CME_EVENT_CREATION.EVENT_TYPE_ID))
                .leftJoin(fsl1).on(fsl1.ID.eq(CME_EVENT_CREATION.STATUS))
                .leftJoin(fsl2).on(fsl2.ID.eq(CME_EVENT_CREATION.CURRENT_STATUS))
                .leftJoin(e).on(e.ID.eq(CME_EVENT_CREATION.ACTION_BY))
                .where(getConditions(criteria))
                .fetchInto(EventCreation::class.java)
    }

    override fun update(entity: EventCreation): String {
        TODO("Not yet implemented")
    }

    override fun create(entity: EventCreation): String {
        TODO("Not yet implemented")
    }

    fun updateCreatedBy(oldId : String, newId: String){
        dslContext.update(CME_EVENT_CREATION)
                .set(CME_EVENT_CREATION.CREATED_BY, newId)
                .where(CME_EVENT_CREATION.OLD_CREATED_BY.eq(oldId))
                .execute()
    }

    fun updateUpdatedBy(oldId: String, newId: String){
        dslContext.update(CME_EVENT_CREATION)
                .set(CME_EVENT_CREATION.UPDATED_BY, newId)
                .where(CME_EVENT_CREATION.UPDATED_BY.eq(oldId))
                .execute()
    }

    fun updateActionBy(oldId: String, newId: String){
        dslContext.update(CME_EVENT_CREATION)
                .set(CME_EVENT_CREATION.ACTION_BY, newId)
                .where(CME_EVENT_CREATION.ACTION_BY.eq(oldId))
                .execute()
    }

    fun updatedOldCreatedBy(userId: String){
        dslContext.update(CME_EVENT_CREATION)
                .set(CME_EVENT_CREATION.OLD_CREATED_BY, userId)
                .where(CME_EVENT_CREATION.CREATED_BY.eq(userId))
                .execute()
    }

}