package com.squer.prorpel.ui.repository

import com.squer.prorpel.jooq.tables.references.SEARCHCOLUMNMETA
import com.squer.prorpel.persistence.BaseRepository
import com.squer.prorpel.persistence.SearchCriteria
import com.squer.prorpel.ui.domain.SearchColumnMeta
import org.jooq.Condition
import org.jooq.DSLContext
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Repository

@Repository
class SearchColumnMetaRepository: BaseRepository<SearchColumnMeta>() {

    @Autowired
    @Qualifier("jooqContext")
    private lateinit var dslContext: DSLContext

    override fun findById(id: String): SearchColumnMeta? {
        TODO("Not yet implemented")
    }

    override fun create(entity: SearchColumnMeta): String {
        TODO("Not yet implemented")
    }

    override fun update(entity: SearchColumnMeta): String {
        TODO("Not yet implemented")
    }

    override fun delete(id: String): String? {
        TODO("Not yet implemented")
    }

    override fun find(criteria: SearchCriteria): List<SearchColumnMeta> {

        val list = mutableListOf<Condition>()
        criteria.conditions.forEach {
            list.add(formCondition(it.field.getField(), it))
        }
        return dslContext.select(SEARCHCOLUMNMETA.asterisk(),
            SEARCHCOLUMNMETA.SEARCH_META_ID.`as`("searchMeta.id"))
            .from(SEARCHCOLUMNMETA)
            .where(list)
            .fetchInto(SearchColumnMeta::class.java)
    }
}
