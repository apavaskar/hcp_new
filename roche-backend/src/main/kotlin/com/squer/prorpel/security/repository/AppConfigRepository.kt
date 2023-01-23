package com.squer.prorpel.security.repository

import com.squer.prorpel.jooq.tables.references.FMK_APP_CONFIG
import com.squer.prorpel.persistence.BaseRepository
import com.squer.prorpel.persistence.SearchCriteria
import com.squer.prorpel.security.domain.AppConfig
import org.jooq.DSLContext
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Repository

@Repository
class AppConfigRepository: BaseRepository<AppConfig>() {
    @Autowired
    @Qualifier("jooqContext")
    private lateinit var dslContext: DSLContext
    override fun findById(id: String): AppConfig? {
        TODO("Not yet implemented")
    }

    override fun delete(id: String): String? {
        TODO("Not yet implemented")
    }

    override fun find(criteria: SearchCriteria): List<AppConfig> {
        TODO("Not yet implemented")
    }

    override fun update(entity: AppConfig): String {
        TODO("Not yet implemented")
    }

    override fun create(entity: AppConfig): String {
        TODO("Not yet implemented")
    }

    fun findAll(): List<AppConfig>{
        return dslContext.select()
                .from(FMK_APP_CONFIG)
                .fetchInto(AppConfig::class.java)
    }
}