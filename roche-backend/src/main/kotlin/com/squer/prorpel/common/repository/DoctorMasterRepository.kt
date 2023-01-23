package com.squer.prorpel.common.repository

import com.squer.prorpel.common.controller.dto.DoctorMasterDTO
import com.squer.prorpel.common.domain.DoctorMaster
import com.squer.prorpel.jooq.tables.references.*
import com.squer.prorpel.persistence.BaseRepository
import com.squer.prorpel.persistence.SearchCriteria
import org.jooq.DSLContext
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Repository

@Repository
class DoctorMasterRepository: BaseRepository<DoctorMaster>() {

    @Autowired
    @Qualifier("jooqContext")
    private lateinit var dslContext: DSLContext
    override fun findById(id: String): DoctorMaster? {
        TODO("Not yet implemented")
    }

    override fun delete(id: String): String? {
        TODO("Not yet implemented")
    }

    override fun find(criteria: SearchCriteria): List<DoctorMaster> {
        TODO("Not yet implemented")
    }

    override fun update(entity: DoctorMaster): String {
        TODO("Not yet implemented")
    }

    override fun create(entity: DoctorMaster): String {
        TODO("Not yet implemented")
    }

    fun getDoctorMasterList(criteria: SearchCriteria): MutableList<DoctorMaster>{
        val cdm = CME_DOCTOR_MASTER.`as`("cdm")
        val cd = CMT_DOCTOR.`as`("cd")
        val chas = CME_HCP_APPROVAL_STATUS.`as`("chas")
        val ful = FMK_USER_LOV.`as`("ful")
        val fsu1 = FMK_SECURITY_USER.`as`("fsu1")
        val fsu2 = FMK_SECURITY_USER.`as`("fsu2")
        val ce1 = CMT_EMPLOYEE.`as`("ce1")
        val ce2 = CMT_EMPLOYEE.`as`("ce2")
        val ce3 = CMT_EMPLOYEE.`as`("ce3")
        val fsl1 = FMK_SYSTEM_LOV.`as`("fsl1")
        val fsl2 = FMK_SYSTEM_LOV.`as`("fsl2")
        val doctorList = dslContext.select(cdm.asterisk(), cdm.SPECIALIZATION.`as`("specialization.id"), ful.NAME.`as`("specialization.name"),
        cdm.ACTION_BY.`as`("actionBy.id"), ce3.NAME.`as`("actionBy.name"), cdm.STATUS.`as`("status.id"), fsl1.NAME.`as`("status.name"),
                cdm.CURRENT_STATUS.`as`("currentStatus.id"), fsl2.NAME.`as`("currentStatus.name"),
                cdm.DOCTOR_ID.`as`("doctor.id"), cd.NAME.`as`("doctor.name"), chas.ID.`as`("approvalId"))
                .from(cdm)
                .leftJoin(ful).on(ful.ID.eq(cdm.SPECIALIZATION))
                .leftJoin(ce3).on(ce3.ID.eq(cdm.ACTION_BY))
                .join(cd).on(cd.ID.eq(cdm.DOCTOR_ID))
                .leftJoin(chas).on(chas.CMDOC_ID.eq(cdm.ID))
                .leftJoin(fsl1).on(fsl1.ID.eq(cdm.STATUS))
                .leftJoin(fsl2).on(fsl2.ID.eq(cdm.CURRENT_STATUS))
                .where(getConditions(criteria))
                .fetchInto(DoctorMaster::class.java)
        return doctorList
    }

}