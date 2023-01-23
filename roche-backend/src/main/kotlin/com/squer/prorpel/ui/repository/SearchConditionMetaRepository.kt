package com.squer.prorpel.ui.repository

import com.squer.prorpel.jooq.tables.references.SEARCHCONDITIONMETA
import com.squer.prorpel.persistence.BaseRepository
import com.squer.prorpel.persistence.SearchCriteria
import com.squer.prorpel.ui.domain.SearchConditionMeta
import org.jooq.Condition
import org.jooq.DSLContext
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Repository

@Repository
class SearchConditionMetaRepository: BaseRepository<SearchConditionMeta>() {
    @Autowired
    @Qualifier("jooqContext")
    private lateinit var dslContext: DSLContext

    override fun findById(id: String): SearchConditionMeta? {
        TODO("Not yet implemented")
    }

    override fun create(entity: SearchConditionMeta): String {
        TODO("Not yet implemented")
    }

    override fun update(entity: SearchConditionMeta): String {
        TODO("Not yet implemented")
    }

    override fun delete(id: String): String? {
        TODO("Not yet implemented")
    }

    override fun find(criteria: SearchCriteria): List<SearchConditionMeta> {

        val list = mutableListOf<Condition>()
        criteria.conditions.forEach {
            list.add(formCondition(it.field.getField(), it))
        }
        return dslContext.select(SEARCHCONDITIONMETA.asterisk(), SEARCHCONDITIONMETA.SEARCH_META_ID.`as`("searchMeta.id"))
            .from(SEARCHCONDITIONMETA)
            .where(list)
            .fetchInto(SearchConditionMeta::class.java)
    }
}
