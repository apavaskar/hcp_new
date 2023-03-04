package com.squer.prorpel.common.repository

import com.squer.prorpel.common.domain.Employee
import com.squer.prorpel.common.domain.Location
import com.squer.prorpel.jooq.tables.references.CMT_EMPLOYEE
import com.squer.prorpel.jooq.tables.references.CMT_JOB_TITLE
import com.squer.prorpel.jooq.tables.references.CMT_LOCATION
import com.squer.prorpel.jooq.tables.references.FMK_SYSTEM_LOV
import com.squer.prorpel.persistence.BaseRepository
import com.squer.prorpel.persistence.NamedReference
import com.squer.prorpel.persistence.SearchCriteria
import org.jooq.DSLContext
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Repository
import java.time.OffsetDateTime
import kotlin.math.expm1

@Repository
class EmployeeRepository: BaseRepository<Employee>() {

    @Autowired
    @Qualifier("jooqContext")
    private lateinit var dslContext: DSLContext

    override fun findById(id: String): Employee? {
        val e = CMT_EMPLOYEE.`as`("e")
        val e1 = CMT_EMPLOYEE.`as`("e1")
       val employee = dslContext.select(e.asterisk(),e.LOCATION_ID.`as`("location.id"), CMT_LOCATION.NAME.`as`("location.name"),
               e.JOB_TITLE_ID.`as`("jobTitle.id"), CMT_JOB_TITLE.NAME.`as`("jobTitle.name"),
               e.STATUS_ID.`as`("status.id"), FMK_SYSTEM_LOV.NAME.`as`("status.name"),
               e.MANAGER_ID.`as`("manager.id"), e1.NAME.`as`("manager.name"))
               .from(e)
               .leftJoin(CMT_LOCATION).on(CMT_LOCATION.ID.eq(e.LOCATION_ID))
               .leftJoin(CMT_JOB_TITLE).on(CMT_JOB_TITLE.ID.eq(e.JOB_TITLE_ID))
               .leftJoin(FMK_SYSTEM_LOV).on(FMK_SYSTEM_LOV.ID.eq(e.STATUS_ID))
               .leftOuterJoin(e1).on(e1.ID.eq(e.MANAGER_ID))
               .where(e.ID.eq(id))
               .orderBy(e.NAME.asc())
        return employee.fetchOneInto(Employee::class.java)
    }

    override fun delete(id: String): String? {
        TODO("Not yet implemented")
    }

    override fun find(criteria: SearchCriteria): List<Employee> {
        val baseSelect = dslContext.select(CMT_EMPLOYEE.asterisk(),
                CMT_EMPLOYEE.MANAGER_ID.`as`("manager.id"), CMT_EMPLOYEE.LOCATION_ID.`as`("location.id"), CMT_LOCATION.NAME.`as`("location.name"),
                CMT_EMPLOYEE.STATUS_ID.`as`("status.id"), FMK_SYSTEM_LOV.NAME.`as`("status.name"), CMT_EMPLOYEE.JOB_TITLE_ID.`as`("jobTitle.id"), CMT_JOB_TITLE.NAME.`as`("jobTitle.name"))
                .from(CMT_EMPLOYEE)
                .leftJoin(CMT_LOCATION).on(CMT_LOCATION.ID.eq(CMT_EMPLOYEE.LOCATION_ID))
                .leftJoin(FMK_SYSTEM_LOV).on(FMK_SYSTEM_LOV.ID.eq(CMT_EMPLOYEE.STATUS_ID))
                .leftJoin(CMT_JOB_TITLE).on(CMT_JOB_TITLE.ID.eq(CMT_EMPLOYEE.JOB_TITLE_ID))
                .where(getConditions(criteria))
                .orderBy(CMT_EMPLOYEE.NAME.asc())
        return baseSelect.fetchInto(Employee::class.java)
    }

    override fun update(entity: Employee): String {
        dslContext.update(CMT_EMPLOYEE)
                .set(CMT_EMPLOYEE.NAME, entity.name)
                .set(CMT_EMPLOYEE.CI_NAME, entity.name.lowercase())
                .set(CMT_EMPLOYEE.STATUS_ID, entity.status?.id)
                .set(CMT_EMPLOYEE.MANAGER_ID, entity.manager?.id)
                .set(CMT_EMPLOYEE.LOCATION_ID, entity.location?.id)
                .set(CMT_EMPLOYEE.EMAIL_ID,entity.emailId)
                .set(CMT_EMPLOYEE.JOB_TITLE_ID,entity.jobTitle?.id)
                .set(CMT_EMPLOYEE.UPDATED_BY, getCreator().id!!)
                .set(CMT_EMPLOYEE.UPDATED_ON, OffsetDateTime.now())
                .where(CMT_EMPLOYEE.ID.eq(entity.id))
                .execute()
        return entity.id!!
    }

    override fun create(entity: Employee): String {
        val result = dslContext.insertInto(CMT_EMPLOYEE, CMT_EMPLOYEE.ID, CMT_EMPLOYEE.NAME, CMT_EMPLOYEE.JOB_TITLE_ID, CMT_EMPLOYEE.LOCATION_ID, CMT_EMPLOYEE.STATUS_ID, CMT_EMPLOYEE.MANAGER_ID, CMT_EMPLOYEE.CODE, CMT_EMPLOYEE.EMAIL_ID,
        CMT_EMPLOYEE.STALE_ID, CMT_EMPLOYEE.EXTERNAL_ID, CMT_EMPLOYEE.CREATED_BY, CMT_EMPLOYEE.CREATED_ON, CMT_EMPLOYEE.UPDATED_BY, CMT_EMPLOYEE.UPDATED_ON, CMT_EMPLOYEE.CI_NAME)
                .values(generateGUID("EMPLY"), entity.name, entity.jobTitle?.id!!, entity.location?.id!!, entity.status?.id!!, entity.manager?.id, entity.code, entity.emailId,
                1, null, getCreator().id!!, OffsetDateTime.now(), getCreator().id!!, OffsetDateTime.now(), entity.name.lowercase())
                .returningResult(CMT_EMPLOYEE.ID)
                .fetchOne()
        return result?.get(CMT_EMPLOYEE.ID)!!
    }

    fun getEmployeeReference(id: String): NamedReference{
        return dslContext.select(CMT_EMPLOYEE.ID.`as`("id"), CMT_EMPLOYEE.NAME.`as`("name"))
                .from(CMT_EMPLOYEE)
                .where(CMT_EMPLOYEE.ID.eq(id))
                .fetchOneInto(NamedReference::class.java)!!
    }

}