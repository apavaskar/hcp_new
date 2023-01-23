package com.squer.prorpel.ui.repository

import com.squer.prorpel.jooq.tables.Searchmeta.Companion.SEARCHMETA
import com.squer.prorpel.persistence.BaseRepository
import com.squer.prorpel.persistence.SearchCriteria
import com.squer.prorpel.ui.domain.SearchMeta
import org.jooq.Condition
import org.jooq.DSLContext
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Repository

@Repository
class SearchMetaRepository: BaseRepository<SearchMeta>() {
    @Autowired
    @Qualifier("jooqContext")
    private lateinit var dslContext: DSLContext

    override fun findById(id: String): SearchMeta? {
        TODO("Not yet implemented")
    }

    override fun create(entity: SearchMeta): String {
        TODO("Not yet implemented")
    }

    override fun update(entity: SearchMeta): String {
        TODO("Not yet implemented")
    }

    override fun delete(id: String): String? {
        TODO("Not yet implemented")
    }

    override fun find(criteria: SearchCriteria): List<SearchMeta> {
        val list = mutableListOf<Condition>()
        criteria.conditions.forEach {
            list.add(formCondition(it.field.getField(), it))
        }
        return dslContext.select()
            .from(SEARCHMETA)
            .where(list)
            .fetchInto(SearchMeta::class.java)
    }
}
