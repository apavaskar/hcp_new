package com.squer.prorpel.common.repository

import com.squer.prorpel.common.domain.EventCreation
import com.squer.prorpel.common.domain.EventReport
import com.squer.prorpel.jooq.tables.references.CME_EVENT_REPORT
import com.squer.prorpel.jooq.tables.references.CMT_EMPLOYEE
import com.squer.prorpel.jooq.tables.references.FMK_SYSTEM_LOV
import com.squer.prorpel.jooq.tables.references.FMK_USER_LOV
import com.squer.prorpel.persistence.BaseRepository
import com.squer.prorpel.persistence.SearchCriteria
import org.jooq.DSLContext
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Repository

@Repository
class EventReportRepository: BaseRepository<EventReport>() {

    @Autowired
    @Qualifier("jooqContext")
    private lateinit var dslContext: DSLContext

    override fun findById(id: String): EventReport? {
        val fsl1 = FMK_SYSTEM_LOV.`as`("fsl1")
        val fsl2 = FMK_SYSTEM_LOV.`as`("fsl2")
        val e = CMT_EMPLOYEE.`as`("e")
        return dslContext.select(CME_EVENT_REPORT.asterisk(), CME_EVENT_REPORT.STATUS.`as`("status.id"), fsl1.NAME.`as`("status.name"),
                CME_EVENT_REPORT.CURRENT_STATUS.`as`("currentStatus.id"), fsl2.NAME.`as`("currentStatus.name"),
                CME_EVENT_REPORT.ACTION_BY.`as`("actionBy.id"), e.NAME.`as`("actionBy.name"))
                .from(CME_EVENT_REPORT)
                .leftJoin(fsl1).on(fsl1.ID.eq(CME_EVENT_REPORT.STATUS))
                .leftJoin(fsl2).on(fsl2.ID.eq(CME_EVENT_REPORT.CURRENT_STATUS))
                .leftJoin(e).on(e.ID.eq(CME_EVENT_REPORT.ACTION_BY))
                .where(CME_EVENT_REPORT.ID.eq(id))
                .fetchOneInto(EventReport::class.java)
    }

    override fun delete(id: String): String? {
        TODO("Not yet implemented")
    }

    override fun find(criteria: SearchCriteria): List<EventReport> {
        val fsl1 = FMK_SYSTEM_LOV.`as`("fsl1")
        val fsl2 = FMK_SYSTEM_LOV.`as`("fsl2")
        val e = CMT_EMPLOYEE.`as`("e")
        return dslContext.select(CME_EVENT_REPORT.asterisk(), CME_EVENT_REPORT.STATUS.`as`("statusReference.id"), fsl1.NAME.`as`("statusReference.name"),
                CME_EVENT_REPORT.CURRENT_STATUS.`as`("currentStatusReference.id"), fsl2.NAME.`as`("currentStatusReference.name"),
                CME_EVENT_REPORT.ACTION_BY.`as`("actionByReference.id"), e.NAME.`as`("actionByReference.name"))
                .from(CME_EVENT_REPORT)
                .leftJoin(fsl1).on(fsl1.ID.eq(CME_EVENT_REPORT.STATUS))
                .leftJoin(fsl2).on(fsl2.ID.eq(CME_EVENT_REPORT.CURRENT_STATUS))
                .leftJoin(e).on(e.ID.eq(CME_EVENT_REPORT.ACTION_BY))
                .where(getConditions(criteria))
                .fetchInto(EventReport::class.java)
    }

    override fun update(entity: EventReport): String {
        TODO("Not yet implemented")
    }

    override fun create(entity: EventReport): String {
        TODO("Not yet implemented")
    }

    fun updateCreatedBy(oldId: String, newId: String){
        dslContext.update(CME_EVENT_REPORT)
                .set(CME_EVENT_REPORT.CREATED_BY, newId)
                .where(CME_EVENT_REPORT.OLD_CREATED_BY.eq(oldId))
                .execute()
    }

    fun updateUpdatedBy(oldId: String, newId: String){
        dslContext.update(CME_EVENT_REPORT)
                .set(CME_EVENT_REPORT.UPDATED_BY, newId)
                .where(CME_EVENT_REPORT.UPDATED_BY.eq(oldId))
                .execute()
    }

    fun updateActionBy(oldId: String, newId: String){
        dslContext.update(CME_EVENT_REPORT)
                .set(CME_EVENT_REPORT.ACTION_BY, newId)
                .where(CME_EVENT_REPORT.ACTION_BY.eq(oldId))
                .execute()
    }

    fun updateOldCreatedBy(userId: String){
        dslContext.update(CME_EVENT_REPORT)
                .set(CME_EVENT_REPORT.OLD_CREATED_BY, userId)
                .where(CME_EVENT_REPORT.CREATED_BY.eq(userId))
                .execute()
    }
}