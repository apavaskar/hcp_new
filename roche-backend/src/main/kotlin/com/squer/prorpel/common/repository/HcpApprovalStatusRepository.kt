package com.squer.prorpel.common.repository

import com.squer.prorpel.common.domain.EventApprovalStatus
import com.squer.prorpel.common.domain.HcpApprovalStatus
import com.squer.prorpel.jooq.tables.references.*
import com.squer.prorpel.persistence.BaseRepository
import com.squer.prorpel.persistence.SearchCriteria
import org.jooq.DSLContext
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Repository

@Repository
class HcpApprovalStatusRepository: BaseRepository<HcpApprovalStatus>() {

    @Autowired
    @Qualifier("jooqContext")
    private lateinit var dslContext: DSLContext
    
    override fun findById(id: String): HcpApprovalStatus? {
        return dslContext.select(CME_HCP_APPROVAL_STATUS.asterisk(), CME_HCP_APPROVAL_STATUS.APPROVER_ID.`as`("approver.id"), CMT_EMPLOYEE.NAME.`as`("approver.name"),
                CME_HCP_APPROVAL_STATUS.ACTION.`as`("action.id"), FMK_SYSTEM_LOV.NAME.`as`("action.name"))
                .from(CME_HCP_APPROVAL_STATUS)
                .where(CME_HCP_APPROVAL_STATUS.ID.eq(id))
                .fetchOneInto(HcpApprovalStatus::class.java)
    }

    override fun delete(id: String): String? {
        TODO("Not yet implemented")
    }

    override fun find(criteria: SearchCriteria): List<HcpApprovalStatus> {
        return dslContext.select(CME_HCP_APPROVAL_STATUS.asterisk(), CME_HCP_APPROVAL_STATUS.APPROVER_ID.`as`("approverReference.id"), CMT_EMPLOYEE.NAME.`as`("approverReference.name"),
                CME_HCP_APPROVAL_STATUS.ACTION.`as`("actionReference.id"), FMK_SYSTEM_LOV.NAME.`as`("actionReference.name"))
                .from(CME_HCP_APPROVAL_STATUS)
                .leftJoin(CMT_EMPLOYEE).on(CMT_EMPLOYEE.ID.eq(CME_HCP_APPROVAL_STATUS.APPROVER_ID))
                .leftJoin(FMK_SYSTEM_LOV).on(FMK_SYSTEM_LOV.ID.eq(CME_HCP_APPROVAL_STATUS.ACTION))
                .where(getConditions(criteria))
                .fetchInto(HcpApprovalStatus::class.java)
    }

    override fun update(entity: HcpApprovalStatus): String {
        TODO("Not yet implemented")
    }

    override fun create(entity: HcpApprovalStatus): String {
        TODO("Not yet implemented")
    }

    fun updateApprover(id: String, approverId: String){
        dslContext.update(CME_HCP_APPROVAL_STATUS)
                .set(CME_HCP_APPROVAL_STATUS.APPROVER_ID, approverId)
                .where(CME_HCP_APPROVAL_STATUS.ID.eq(id))
                .execute()
    }

     fun updateCreatedBy(oldId: String, newId: String){
         dslContext.update(CME_HCP_APPROVAL_STATUS)
                 .set(CME_HCP_APPROVAL_STATUS.CREATED_BY, newId)
                 .where(CME_HCP_APPROVAL_STATUS.CREATED_BY.eq(oldId))
                 .execute()
     }

    fun updateUpdatedBy(oldId: String, newId: String){
        dslContext.update(CME_HCP_APPROVAL_STATUS)
                .set(CME_HCP_APPROVAL_STATUS.UPDATED_BY, newId)
                .where(CME_HCP_APPROVAL_STATUS.UPDATED_BY.eq(oldId))
                .execute()
    }
}