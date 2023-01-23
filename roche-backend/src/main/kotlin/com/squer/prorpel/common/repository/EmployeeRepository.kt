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

@Repository
class EmployeeRepository: BaseRepository<Employee>() {

    @Autowired
    @Qualifier("jooqContext")
    private lateinit var dslContext: DSLContext

    override fun findById(id: String): Employee? {
       val employee = dslContext.select(CMT_EMPLOYEE.asterisk(),CMT_EMPLOYEE.LOCATION_ID.`as`("location.id"), CMT_LOCATION.NAME.`as`("location.name"),
               CMT_EMPLOYEE.JOB_TITLE_ID.`as`("jobTitle.id"), CMT_JOB_TITLE.NAME.`as`("jobTitle.name"),
               CMT_EMPLOYEE.STATUS_ID.`as`("status.id"), FMK_SYSTEM_LOV.NAME.`as`("status.name"))
               .from(CMT_EMPLOYEE)
               .innerJoin(CMT_LOCATION).on(CMT_LOCATION.ID.eq(CMT_EMPLOYEE.LOCATION_ID))
               .innerJoin(CMT_JOB_TITLE).on(CMT_JOB_TITLE.ID.eq(CMT_EMPLOYEE.JOB_TITLE_ID))
               .innerJoin(FMK_SYSTEM_LOV).on(FMK_SYSTEM_LOV.ID.eq(CMT_EMPLOYEE.STATUS_ID))
               .where(CMT_EMPLOYEE.ID.eq(id))
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
                .innerJoin(CMT_LOCATION).on(CMT_LOCATION.ID.eq(CMT_EMPLOYEE.LOCATION_ID))
                .innerJoin(FMK_SYSTEM_LOV).on(FMK_SYSTEM_LOV.ID.eq(CMT_EMPLOYEE.STATUS_ID))
                .innerJoin(CMT_JOB_TITLE).on(CMT_JOB_TITLE.ID.eq(CMT_EMPLOYEE.JOB_TITLE_ID))
                .where(getConditions(criteria))
        return baseSelect.fetchInto(Employee::class.java)
    }

    override fun update(entity: Employee): String {
        TODO("Not yet implemented")
    }

    override fun create(entity: Employee): String {
        TODO("Not yet implemented")
    }

    fun getEmployeeReference(id: String): NamedReference{
        return dslContext.select(CMT_EMPLOYEE.ID.`as`("id"), CMT_EMPLOYEE.NAME.`as`("name"))
                .from(CMT_EMPLOYEE)
                .where(CMT_EMPLOYEE.ID.eq(id))
                .fetchOneInto(NamedReference::class.java)!!
    }

}