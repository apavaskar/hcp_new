package com.squer.prorpel.common.repository

import com.squer.prorpel.common.controller.dto.DoctorDetailDTO
import com.squer.prorpel.common.domain.Doctor
import com.squer.prorpel.jooq.tables.references.*
import com.squer.prorpel.persistence.BaseRepository
import com.squer.prorpel.persistence.SearchCriteria
import org.jooq.DSLContext
import org.jooq.Field
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Repository
import java.util.StringJoiner

@Repository
class DoctorRepository : BaseRepository<Doctor>(){

    @Autowired
    @Qualifier("jooqContext")
    private lateinit var dslContext: DSLContext
    override fun findById(id: String): Doctor? {
        TODO("Not yet implemented")
    }

    override fun delete(id: String): String? {
        TODO("Not yet implemented")
    }

    override fun find(criteria: SearchCriteria): List<Doctor> {
        TODO("Not yet implemented")
    }

    override fun update(entity: Doctor): String {
        TODO("Not yet implemented")
    }

    override fun create(entity: Doctor): String {
        TODO("Not yet implemented")
    }

    fun doctorDetailSelect(): List<DoctorDetailDTO>{
        val cd = CMT_DOCTOR.`as`("cd")
        val e = CMT_EMPLOYEE.`as`("e")
        val u = FMK_SECURITY_USER.`as`("u")
        val l = CMT_LOCATION.`as`("l")
        val dm = CME_DOCTOR_MASTER.`as`("dm")
        val e1 = CMT_EMPLOYEE.`as`("e1")
        val fd = CME_FMV_DETAIL.`as`("fd")
        val bd = CME_BANK_DETAIL.`as`("bd")
        val ul = FMK_USER_LOV.`as`("ul")
        val tul = FMK_USER_LOV.`as`("tsl")
        val sul = FMK_SYSTEM_LOV.`as`("sul")
        val baseSelect  = dslContext.select(l.NAME.`as`("LOCATION"), e.NAME.`as`("EMPLOYEE"), cd.NAME.`as`("DOCTOR"),cd.ACCOUNT_ID.`as`("CODE"),
                            e1.NAME.`as`("LAST_APPROVED_BY"), dm.CREATED_ON.`as`("CREATION_DATE"), dm.UPDATED_ON.`as`("LAST_APPROVE_DATE"), dm.PHONE.`as`("PHONE"),
                            dm.EMAIL.`as`("EMAIL"), dm.PANCARD_NO.`as`("PANCARD"), dm.GST.`as`("GST"), ul.NAME.`as`("SPECIALIZATION"), bd.BANK_NAME.`as`("BANK_NAME"),
                            bd.BRANCH_NAME.`as`("BRANCH_NAME"), bd.BENEFICIARY_NAME.`as`("BENEFICIARY"), bd.IFSC_CODE.`as`("IFSC_CODE"), bd.ACCOUNT_NO.`as`("ACCOUNT_NO"),
                            bd.SERVICE_PROVIDER_NO.`as`("SERVICE_PROVIDER_NO"), bd.ADDRESS.`as`("ADDRESS"), fd.PLACE.`as`("PLACE"), fd.EXPERIENCE.`as`("EXPERIENCE"),
                            tul.NAME.`as`("TIER"), fd.HOURLY_RATE.`as`("HOURLY_RATE"), sul.NAME.`as`("STATUS"))
                .from(cd)
                .innerJoin(e).on(e.LOCATION_ID.eq(cd.LOCATION_ID))
                .innerJoin(u).on(u.OWNER_ID.eq(e.ID))
                .innerJoin(l).on(l.ID.eq(cd.LOCATION_ID))
                .leftJoin(dm).on(dm.CREATED_BY.eq(u.ID)).and(dm.NAME.eq(cd.NAME))
                .leftJoin(e1).on(e1.ID.eq(dm.ACTION_BY))
                .leftJoin(fd).on(fd.CMDOC_ID.eq(dm.ID))
                .leftJoin(bd).on(bd.CMDOC_ID.eq(dm.ID))
                .leftJoin(ul).on(ul.ID.eq(fd.HCP_SPECIALITY))
                .leftJoin(tul).on(tul.ID.eq(fd.TIER))
                .leftJoin(sul).on(sul.ID.eq(dm.STATUS))
                .where(cd.STATUS_ID.eq("SYSLVDOCSTA00000000000000000000000001"))
        return baseSelect.fetchInto(DoctorDetailDTO::class.java)
    }
}