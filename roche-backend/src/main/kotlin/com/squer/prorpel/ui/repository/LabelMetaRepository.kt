package com.squer.prorpel.ui.repository

import com.squer.prorpel.jooq.tables.references.LABELMETA
import com.squer.prorpel.persistence.BaseRepository
import com.squer.prorpel.persistence.SearchCriteria
import com.squer.prorpel.ui.domain.LabelMeta
import org.jooq.Condition
import org.jooq.DSLContext
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Repository

@Repository
class LabelMetaRepository: BaseRepository<LabelMeta>() {

    @Autowired
    @Qualifier("jooqContext")
    private lateinit var dslContext: DSLContext


    override fun findById(id: String): LabelMeta? {
        TODO("Not yet implemented")
    }

    override fun create(entity: LabelMeta): String {
        TODO("Not yet implemented")

//        val result = dslContext.insertInto(LABELMETA, LABELMETA.CODE, LABELMETA.LABEL, LABELMETA.IS_DEFAULT)
//            .values(entity.code, entity.label, entity.isDefault)
//            .returningResult(LABELMETA.ID)
//            .fetchOne()
//        return result!!.get(LABELMETA.ID)!!
    }

    override fun update(entity: LabelMeta): String {
        TODO("Not yet implemented")
    }

    override fun delete(id: String): String? {
        TODO("Not yet implemented")
    }

    override fun find(criteria: SearchCriteria): List<LabelMeta> {

        val list = mutableListOf<Condition>()
        criteria.conditions.forEach {
            list.add(formCondition(it.field.getField(), it))
        }
        return dslContext.select()
            .from(LABELMETA)
            .where(getConditions(criteria))
            .fetchInto(LabelMeta::class.java)
    }
}
