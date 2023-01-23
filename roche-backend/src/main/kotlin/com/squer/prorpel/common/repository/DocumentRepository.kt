package com.squer.prorpel.common.repository

import com.squer.prorpel.common.domain.Document

import com.squer.prorpel.persistence.BaseRepository
import com.squer.prorpel.persistence.SearchCriteria
import org.jooq.DSLContext
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Repository

@Repository
class DocumentRepository: BaseRepository<Document>() {
    @Autowired
    @Qualifier("jooqContext")
    private lateinit var dslContext: DSLContext

    override fun findById(id: String): Document? {
        TODO("Not yet implemented")

//    return dslContext.select(DOCUMENT.asterisk())
//    .from(DOCUMENT)
//    .where(DOCUMENT.ID.eq(id))
//    .fetchOneInto(Document:: class.java)
    }

    override fun delete(id: String): String? {
        TODO("Not yet implemented")
    }

    override fun find(criteria: SearchCriteria): List<Document> {
        TODO("Not yet implemented")

//        return dslContext.select(DOCUMENT.asterisk(), LOVMASTER.ID.`as`("status.id"), LOVMASTER.NAME.`as`("status.name"))
//        .from(DOCUMENT)
//            .innerJoin(LOVMASTER).on(LOVMASTER.ID.eq(DOCUMENT.STATUS_ID))
//        .where(getConditions(criteria))
//        .fetchInto(Document:: class.java)
    }

    override fun update(entity: Document): String {
        TODO("Not yet implemented")

//        super.fillEntityForUpdate(entity)
//        dslContext.update(DOCUMENT)
//			.set(DOCUMENT.OWNER_ID,entity.ownerId)
//			.set(DOCUMENT.FILE_PATH,entity.filePath)
//			.set(DOCUMENT.TYPE_ID,entity.type!!.id)
//			.set(DOCUMENT.STATUS_ID,entity.status!!.id)
//			.set(DOCUMENT.UPDATED_BY,entity.updatedBy)
//			.set(DOCUMENT.UPDATED_ON,entity.updatedOn)
//			.set(DOCUMENT.STALE_ID,entity.staleId)
//			.set(DOCUMENT.NAME,entity.name)
//			.set(DOCUMENT.CI_NAME,entity.ciName)
//			.where(DOCUMENT.ID.eq(entity.id))
//			.execute()
//
//return entity.id!!
    }

    override fun create(entity: Document): String {
        TODO("Not yet implemented")

//        super.fillEntityForCreate(entity)
//        var result =  dslContext.insertInto(DOCUMENT,DOCUMENT.OWNER_ID,DOCUMENT.FILE_PATH,DOCUMENT.TYPE_ID,DOCUMENT.STATUS_ID,DOCUMENT.CREATED_BY,DOCUMENT.UPDATED_BY,DOCUMENT.CREATED_ON,DOCUMENT.UPDATED_ON,DOCUMENT.STALE_ID,DOCUMENT.NAME,DOCUMENT.CI_NAME,DOCUMENT.ID)
//.values(entity.ownerId,entity.filePath,entity.type!!.id,entity.status!!.id,entity.createdBy,entity.updatedBy,entity.createdOn,entity.updatedOn,entity.staleId,entity.name,entity.ciName,entity.id)
//.returningResult(DOCUMENT.ID)
//.fetchOne()
//
//return result!!.get(DOCUMENT.ID)!!
    }
}