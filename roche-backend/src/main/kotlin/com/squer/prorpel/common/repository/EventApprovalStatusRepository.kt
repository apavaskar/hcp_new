package com.squer.prorpel.common.repository

import com.squer.prorpel.common.domain.EventApprovalStatus
import com.squer.prorpel.jooq.tables.references.CME_EVENT_APPROVAL_STATUS
import com.squer.prorpel.jooq.tables.references.CMT_EMPLOYEE
import com.squer.prorpel.jooq.tables.references.FMK_SYSTEM_LOV
import com.squer.prorpel.persistence.BaseRepository
import com.squer.prorpel.persistence.SearchCriteria
import org.jooq.DSLContext
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Repository
import java.time.OffsetDateTime

@Repository
class EventApprovalStatusRepository: BaseRepository<EventApprovalStatus>(){

    @Autowired
    @Qualifier("jooqContext")
    private lateinit var dslContext: DSLContext

    override fun findById(id: String): EventApprovalStatus? {
        return dslContext.select(CME_EVENT_APPROVAL_STATUS.asterisk(), CME_EVENT_APPROVAL_STATUS.APPROVER_ID.`as`("approver.id"), CMT_EMPLOYEE.NAME.`as`("approver.name"),
                CME_EVENT_APPROVAL_STATUS.ACTION.`as`("action.id"), FMK_SYSTEM_LOV.NAME.`as`("action.name"))
                .from(CME_EVENT_APPROVAL_STATUS)
                .where(CME_EVENT_APPROVAL_STATUS.ID.eq(id))
                .fetchOneInto(EventApprovalStatus::class.java)
    }

    override fun delete(id: String): String? {
        TODO("Not yet implemented")
    }

    override fun find(criteria: SearchCriteria): List<EventApprovalStatus> {
        return dslContext.select(CME_EVENT_APPROVAL_STATUS.asterisk(), CME_EVENT_APPROVAL_STATUS.APPROVER_ID.`as`("approverReference.id"), CMT_EMPLOYEE.NAME.`as`("approverReference.name"),
                        CME_EVENT_APPROVAL_STATUS.ACTION.`as`("actionReference.id"), FMK_SYSTEM_LOV.NAME.`as`("actionReference.name"))
                .from(CME_EVENT_APPROVAL_STATUS)
                .leftJoin(CMT_EMPLOYEE).on(CMT_EMPLOYEE.ID.eq(CME_EVENT_APPROVAL_STATUS.APPROVER_ID))
                .leftJoin(FMK_SYSTEM_LOV).on(FMK_SYSTEM_LOV.ID.eq(CME_EVENT_APPROVAL_STATUS.ACTION))
                .where(getConditions(criteria))
                .fetchInto(EventApprovalStatus::class.java)
    }

    override fun update(entity: EventApprovalStatus): String {
        TODO("Not yet implemented")
    }

    override fun create(entity: EventApprovalStatus): String {
        val result = dslContext.insertInto(CME_EVENT_APPROVAL_STATUS,
                CME_EVENT_APPROVAL_STATUS.ID, CME_EVENT_APPROVAL_STATUS.ACTION, CME_EVENT_APPROVAL_STATUS.COMMENT,
                CME_EVENT_APPROVAL_STATUS.CREATED_BY, CME_EVENT_APPROVAL_STATUS.IS_CURRENT, CME_EVENT_APPROVAL_STATUS.STALE_ID,
                CME_EVENT_APPROVAL_STATUS.CME_TYPE, CME_EVENT_APPROVAL_STATUS.UPDATED_BY, CME_EVENT_APPROVAL_STATUS.OWNER_ID,
                CME_EVENT_APPROVAL_STATUS.APPROVER_ID, CME_EVENT_APPROVAL_STATUS.UPDATED_ON, CME_EVENT_APPROVAL_STATUS.CREATED_ON,
                CME_EVENT_APPROVAL_STATUS.GROUP_ID)
                .values(generateGUID("ETAPS"), entity.actionReference?.id, entity.comment, entity.createdBy, entity.isCurrent,
                entity.staleId.toString(), entity.cmeType, entity.updatedBy, entity.ownerId?.id, entity.approverReference?.id, OffsetDateTime.now(),
                OffsetDateTime.now(), entity.groupId)
                .returningResult(CME_EVENT_APPROVAL_STATUS.ID)
                .fetchOne()
        return result?.get(CME_EVENT_APPROVAL_STATUS.ID)!!
    }

    fun updateApprover(id: String, approverId: String){
        dslContext.update(CME_EVENT_APPROVAL_STATUS)
                .set(CME_EVENT_APPROVAL_STATUS.APPROVER_ID, approverId)
                .where(CME_EVENT_APPROVAL_STATUS.ID.eq(id))
                .execute()
    }

    fun updateCreatedBy(oldId: String, newId: String){
        dslContext.update(CME_EVENT_APPROVAL_STATUS)
                .set(CME_EVENT_APPROVAL_STATUS.CREATED_BY, newId)
                .where(CME_EVENT_APPROVAL_STATUS.CREATED_BY.eq(oldId))
                .execute()
    }

    fun updateUpdatedBy(oldId: String, newId: String){
        dslContext.update(CME_EVENT_APPROVAL_STATUS)
                .set(CME_EVENT_APPROVAL_STATUS.UPDATED_BY, newId)
                .where(CME_EVENT_APPROVAL_STATUS.UPDATED_BY.eq(oldId))
                .execute()
    }

    fun updateActionBy(oldId: String, newId: String){
        dslContext.update(CME_EVENT_APPROVAL_STATUS)
                .set(CME_EVENT_APPROVAL_STATUS.APPROVER_ID, newId)
                .where(CME_EVENT_APPROVAL_STATUS.APPROVER_ID.eq(oldId))
                .execute()
    }

}