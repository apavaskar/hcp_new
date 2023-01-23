package com.squer.prorpel.common.repository

import com.squer.prorpel.common.domain.LocationType
import com.squer.prorpel.jooq.tables.references.CMT_ORGANIZATION_HEIRARCHY
import com.squer.prorpel.persistence.BaseRepository
import com.squer.prorpel.persistence.SearchCriteria
import org.jooq.*
import org.jooq.impl.DSL.*
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Repository


@Repository
class LocationTypeRepository: BaseRepository<LocationType>() {
    @Autowired
    @Qualifier("jooqContext")
    private lateinit var dslContext: DSLContext


    fun findAllChildren(locationTypeId: String): List<LocationType> {
        TODO("Not yet implemented")

//        val cte: CommonTableExpression<*> = name("t").fields(
//            "id",
//            "name",
//            "ci_name",
//            "parent.id",
//            "status"
//        ).`as`(
//            select(
//                LOCATIONTYPE.ID,
//                LOCATIONTYPE.NAME,
//                LOCATIONTYPE.CI_NAME,
//                LOCATIONTYPE.PARENT_ID.`as`("parent.id"),
//                LOCATIONTYPE.STATUS
//            )
//                .from(LOCATIONTYPE)
//                .where(LOCATIONTYPE.ID.eq(locationTypeId))
//                .unionAll(
//                    select(
//                        LOCATIONTYPE.ID,
//                        LOCATIONTYPE.NAME,
//                        LOCATIONTYPE.CI_NAME,
//                        LOCATIONTYPE.PARENT_ID.`as`("parent.id"),
//                        LOCATIONTYPE.STATUS
//                    )
//                        .from(table(name("t")))
//                        .join(LOCATIONTYPE)
//                        .on(
//                            field(name("t", "id"))
//                                .eq(LOCATIONTYPE.PARENT_ID)
//                        )
//                )
//        )
//        return dslContext.withRecursive(cte)
//            .selectFrom(cte)
//            .fetchInto(LocationType::class.java)
    }

    override fun findById(id: String): LocationType? {
//        val child = LOCATIONTYPE.`as`("child")
//        val parent = LOCATIONTYPE.`as`("parent")
//        val baseSelect = dslContext.select(child.asterisk(),
//                child.PARENT_ID.`as`("parent.id"), parent.NAME.`as`("parent.name"))
//                .from(child)
//                .leftOuterJoin(parent).on(child.PARENT_ID.eq(parent.ID))
//                .where(child.ID.eq(id))
//        return baseSelect.fetchOneInto(LocationType::class.java)
        TODO("Not yet implemented")

    }

    override fun create(entity: LocationType): String {
        TODO("Not yet implemented")
    }

    override fun update(entity: LocationType): String {
        TODO("Not yet implemented")
    }

    override fun delete(id: String): String? {
        TODO("Not yet implemented")
    }

    override fun find(criteria: SearchCriteria): List<LocationType> {

        val child = CMT_ORGANIZATION_HEIRARCHY.`as`("child")
        val parent = CMT_ORGANIZATION_HEIRARCHY.`as`("parent")
        val baseSelect = dslContext.select(child.asterisk(),
            child.PARENT_ID.`as`("parent.id"), parent.NAME.`as`("parent.name"))
            .from(child)
            .leftOuterJoin(parent).on(child.PARENT_ID.eq(parent.ID))
        return baseSelect.fetchInto(LocationType::class.java)

    }
}
