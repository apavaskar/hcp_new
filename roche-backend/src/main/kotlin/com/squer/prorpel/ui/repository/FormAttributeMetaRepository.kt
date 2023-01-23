package com.squer.prorpel.ui.repository

import com.squer.prorpel.jooq.tables.references.FORMATTRIBUTEMETA
import com.squer.prorpel.persistence.BaseRepository
import com.squer.prorpel.persistence.SearchCriteria
import com.squer.prorpel.ui.domain.FormAttributeMeta

import org.jooq.Condition
import org.jooq.DSLContext
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Repository

@Repository
class FormAttributeMetaRepository: BaseRepository<FormAttributeMeta>() {

    @Autowired
    @Qualifier("jooqContext")
    private lateinit var dslContext: DSLContext

    override fun findById(id: String): FormAttributeMeta? {
        TODO("Not yet implemented")
    }

    override fun create(entity: FormAttributeMeta): String {
        TODO("Not yet implemented")
    }

    override fun update(entity: FormAttributeMeta): String {
        TODO("Not yet implemented")
    }

    override fun delete(id: String): String? {
        TODO("Not yet implemented")
    }

    override fun find(criteria: SearchCriteria): List<FormAttributeMeta> {

        val list = mutableListOf<Condition>()
        criteria.conditions.forEach {
            list.add(formCondition(it.field.getField(), it)!!)
        }
        return dslContext.select(FORMATTRIBUTEMETA.asterisk(), FORMATTRIBUTEMETA.FORM_ID.`as`("form.id"))
            .from(FORMATTRIBUTEMETA)
            .where(list)
            .fetchInto(FormAttributeMeta::class.java)
    }
}
