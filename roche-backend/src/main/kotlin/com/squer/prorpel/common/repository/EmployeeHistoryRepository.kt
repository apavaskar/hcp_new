package com.squer.prorpel.common.repository

import com.squer.prorpel.common.domain.EmployeeHistory
import com.squer.prorpel.jooq.tables.references.CMT_EMPLOYEE
import com.squer.prorpel.jooq.tables.references.CMT_EMPLOYEE_HISTORY
import com.squer.prorpel.persistence.BaseRepository
import com.squer.prorpel.persistence.SearchCriteria
import org.jooq.DSLContext
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Repository
import java.time.OffsetDateTime

@Repository
class EmployeeHistoryRepository: BaseRepository<EmployeeHistory>() {

    @Autowired
    @Qualifier("jooqContext")
    private lateinit var dslContext: DSLContext

    override fun findById(id: String): EmployeeHistory? {
        TODO("Not yet implemented")
    }

    override fun delete(id: String): String? {
        TODO("Not yet implemented")
    }

    override fun find(criteria: SearchCriteria): List<EmployeeHistory> {
        TODO("Not yet implemented")
    }

    override fun update(entity: EmployeeHistory): String {
        TODO("Not yet implemented")
    }

    override fun create(entity: EmployeeHistory): String {
        val result = dslContext.insertInto(CMT_EMPLOYEE_HISTORY, CMT_EMPLOYEE_HISTORY.ID, CMT_EMPLOYEE_HISTORY.EMPLOYEE_ID, CMT_EMPLOYEE_HISTORY.LOCATION_ID, CMT_EMPLOYEE_HISTORY.CREATED_DATE)
                .values(generateGUID("EMPHT"), entity.employeeId, entity.locationId, OffsetDateTime.now())
                .returningResult(CMT_EMPLOYEE_HISTORY.ID)
                .fetchOne()
        return result?.get(CMT_EMPLOYEE_HISTORY.ID)!!
    }

     fun findByLocationId(locationId : String): List<EmployeeHistory>{
        return dslContext.select(CMT_EMPLOYEE_HISTORY.asterisk())
                .from(CMT_EMPLOYEE_HISTORY)
                .where(CMT_EMPLOYEE_HISTORY.LOCATION_ID.eq(locationId))
                .orderBy(CMT_EMPLOYEE_HISTORY.CREATED_DATE.desc())
                .fetchInto(EmployeeHistory::class.java)
    }
}