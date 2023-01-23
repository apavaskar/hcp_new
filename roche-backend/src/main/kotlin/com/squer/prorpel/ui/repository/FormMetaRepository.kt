package com.squer.prorpel.ui.repository

import com.squer.prorpel.jooq.tables.references.FORMMETA
import com.squer.prorpel.persistence.BaseRepository
import com.squer.prorpel.persistence.SearchCriteria
import com.squer.prorpel.ui.domain.FormMeta
import org.jooq.Condition
import org.jooq.DSLContext
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Repository

@Repository
class FormMetaRepository: BaseRepository<FormMeta>() {

    @Autowired
    @Qualifier("jooqContext")
    private lateinit var dslContext: DSLContext

    override fun findById(id: String): FormMeta? {
        TODO("Not yet implemented")
    }

    override fun create(entity: FormMeta): String {
        TODO("Not yet implemented")
    }

    override fun update(entity: FormMeta): String {
        TODO("Not yet implemented")
    }

    override fun delete(id: String): String? {
        TODO("Not yet implemented")
    }

    override fun find(criteria: SearchCriteria): List<FormMeta> {

        val list = mutableListOf<Condition>()
        criteria.conditions.forEach {
            list.add(formCondition(it.field.getField(), it))
        }
        return dslContext.select()
            .from(FORMMETA)
            .where(list)
            .fetchInto(FormMeta::class.java)
    }
}
