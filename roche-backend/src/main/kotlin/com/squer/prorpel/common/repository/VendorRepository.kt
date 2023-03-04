package com.squer.prorpel.common.repository

import com.squer.prorpel.common.domain.Vendor
import com.squer.prorpel.jooq.tables.references.CME_VENDOR_EVENT_REPORT
import com.squer.prorpel.jooq.tables.references.CME_VENDOR_MASTER
import com.squer.prorpel.persistence.BaseRepository
import com.squer.prorpel.persistence.SearchCriteria
import org.jooq.DSLContext
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Repository

@Repository
class VendorRepository: BaseRepository<Vendor>() {

    @Autowired
    @Qualifier("jooqContext")
    private lateinit var dslContext: DSLContext

    override fun findById(id: String): Vendor? {
        TODO("Not yet implemented")
    }

    override fun delete(id: String): String? {
        TODO("Not yet implemented")
    }

    override fun find(criteria: SearchCriteria): List<Vendor> {
        TODO("Not yet implemented")
    }

    override fun update(entity: Vendor): String {
        TODO("Not yet implemented")
    }

    override fun create(entity: Vendor): String {
        TODO("Not yet implemented")
    }

    fun updateCreatedBy(oldId: String, newId: String){
        dslContext.update(CME_VENDOR_MASTER)
                .set(CME_VENDOR_MASTER.CREATED_BY, newId)
                .where(CME_VENDOR_MASTER.OLD_CREATED_BY.eq(oldId))
                .execute()
    }

    fun updateUpdatedBy(oldId: String, newId: String){
        dslContext.update(CME_VENDOR_MASTER)
                .set(CME_VENDOR_MASTER.UPDATED_BY, newId)
                .where(CME_VENDOR_MASTER.UPDATED_BY.eq(oldId))
                .execute()
    }

    fun updateActionBy(oldId: String, newId: String){
        dslContext.update(CME_VENDOR_MASTER)
                .set(CME_VENDOR_MASTER.ACTION_BY, newId)
                .where(CME_VENDOR_MASTER.ACTION_BY.eq(oldId))
                .execute()
    }

    fun updateOldCreatedBy(userId: String){
        dslContext.update(CME_VENDOR_MASTER)
                .set(CME_VENDOR_MASTER.OLD_CREATED_BY, userId)
                .where(CME_VENDOR_MASTER.CREATED_BY.eq(userId))
                .execute()
    }

}