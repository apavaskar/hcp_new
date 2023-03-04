package com.squer.prorpel.common.repository

import com.squer.prorpel.common.domain.Location
import com.squer.prorpel.jooq.tables.references.CMT_DIVISION
import com.squer.prorpel.jooq.tables.references.CMT_LOCATION
import com.squer.prorpel.jooq.tables.references.CMT_ORGANIZATION_HEIRARCHY
import com.squer.prorpel.jooq.tables.references.FMK_SYSTEM_LOV
import com.squer.prorpel.persistence.BaseRepository
import com.squer.prorpel.persistence.SearchCriteria
import org.jooq.*
import org.jooq.impl.DSL.*
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Repository
import java.time.LocalDateTime
import java.time.OffsetDateTime
import java.util.*


@Repository
class LocationRepository: BaseRepository<Location>() {
    @Autowired
    @Qualifier("jooqContext")
    private lateinit var dslContext: DSLContext

    fun findAllChildren(locationId: String): List<Location> {
        TODO("Not yet implemented")

//        val cte = getLocationJoin(LOCATION.ID.eq(locationId))
//        return dslContext.withRecursive(cte)
//            .selectFrom(cte)
//            .fetchInto(Location::class.java)
    }

    override fun findById(id: String): Location? {
        val child = CMT_LOCATION.`as`("child")
        val parent = CMT_LOCATION.`as`("parent")
        val baseSelect = dslContext.select(child.asterisk(),
                child.HEIRARCHY_ID.`as`("heirarchy.id"), CMT_ORGANIZATION_HEIRARCHY.NAME.`as`("heirarchy.name"),
                child.PARENT_ID.`as`("parent.id"), parent.NAME.`as`("parent.name"),
                child.DIVISION_ID.`as`("division.id"), CMT_DIVISION.NAME.`as`("division.name") ,
                child.STATUS_ID.`as`("status.id"))
                .from(child)
                .leftOuterJoin(parent).on(parent.ID.eq(child.PARENT_ID))
                .leftJoin(CMT_DIVISION).on(CMT_DIVISION.ID.eq(child.DIVISION_ID))
                .leftJoin(CMT_ORGANIZATION_HEIRARCHY).on(CMT_ORGANIZATION_HEIRARCHY.ID.eq(child.HEIRARCHY_ID))
                .where(child.ID.eq(id))
        return baseSelect.fetchOneInto(Location::class.java)

    }

    override fun create(entity: Location): String {
        val result = dslContext.insertInto(CMT_LOCATION, CMT_LOCATION.ID, CMT_LOCATION.NAME, CMT_LOCATION.STATUS_ID, CMT_LOCATION.PARENT_ID, CMT_LOCATION.HEIRARCHY_ID, CMT_LOCATION.DIVISION_ID,
                CMT_LOCATION.CI_NAME, CMT_LOCATION.CREATED_ON, CMT_LOCATION.CREATED_BY, CMT_LOCATION.UPDATED_ON, CMT_LOCATION.UPDATED_BY)
                .values(generateGUID("LOCAT"), entity.name!!, entity.status?.id!!, entity.parent?.id, entity.heirarchy?.id!!, entity.division?.id!!, entity.name.lowercase(),
                         OffsetDateTime.now() ,getCreator().id!!, OffsetDateTime.now() ,getCreator().id!!)
                .returningResult(CMT_LOCATION.ID)
                .fetchOne()
        return result?.get(CMT_LOCATION.ID)!!
    }

    override fun update(entity: Location): String {
         dslContext.update(CMT_LOCATION)
                .set(CMT_LOCATION.NAME, entity.name)
                .set(CMT_LOCATION.CI_NAME, lower(entity.name))
                .set(CMT_LOCATION.DIVISION_ID, entity.division?.id)
                .set(CMT_LOCATION.STATUS_ID, entity.status?.id)
                .set(CMT_LOCATION.HEIRARCHY_ID, entity.heirarchy?.id)
                 .set(CMT_LOCATION.PARENT_ID, entity.parent?.id)
                .set(CMT_LOCATION.UPDATED_ON, OffsetDateTime.now())
                .set(CMT_LOCATION.UPDATED_BY, getCreator().id!!)
                .where(CMT_LOCATION.ID.eq(entity.id))
                .execute()
         return entity.id!!
    }

    override fun delete(id: String): String? {
        TODO("Not yet implemented")
    }

    override fun find(criteria: SearchCriteria): List<Location> {
        val location = CMT_LOCATION.`as`("child")
        val parent = CMT_ORGANIZATION_HEIRARCHY.`as`("parent")
        val parent1 = CMT_LOCATION.`as`("parent1")
        val status = FMK_SYSTEM_LOV.`as`("status")
       // val pool = CMT_LOCATION.`as`("pool")
        val baseSelect = dslContext.select(location.asterisk(),
            location.HEIRARCHY_ID.`as`("heirarchy.id"), parent.NAME.`as`("heirarchy.name"),
                location.STATUS_ID.`as`("status.id"), FMK_SYSTEM_LOV.NAME.`as`("status.name"),
                location.PARENT_ID.`as`("parent.id"), parent1.NAME.`as`("parent.name"),
                location.DIVISION_ID.`as`("division.id"), CMT_DIVISION.NAME.`as`("division.name"))
            .from(location)
            .leftJoin(FMK_SYSTEM_LOV).on(FMK_SYSTEM_LOV.ID.eq(location.STATUS_ID))
            //.innerJoin(CMT_ORGANIZATION_HEIRARCHY).on(CMT_ORGANIZATION_HEIRARCHY.ID.eq(location.HEIRARCHY_ID))
            .leftJoin(parent).on(parent.ID.eq(location.HEIRARCHY_ID))
                .leftJoin(parent1).on(parent1.ID.eq(location.PARENT_ID))
                .leftJoin(CMT_DIVISION).on(CMT_DIVISION.ID.eq(location.DIVISION_ID))
            .where(getConditions(criteria))
                .orderBy(location.NAME.asc())
        return baseSelect.fetchInto(Location::class.java)
    }

     fun hoLocations(): List<Location> {
         var listOfHo = listOf("ORGHY00000000000000000000000000000005", "ORGHY00000000000000000000000000000006", "ORGHY00000000000000000000000000000007")
        val location = CMT_LOCATION.`as`("child")
        val parent = CMT_ORGANIZATION_HEIRARCHY.`as`("parent")
        val parent1 = CMT_LOCATION.`as`("parent1")
        val status = FMK_SYSTEM_LOV.`as`("status")
        // val pool = CMT_LOCATION.`as`("pool")
        val baseSelect = dslContext.select(location.asterisk(),
                location.HEIRARCHY_ID.`as`("heirarchy.id"), parent.NAME.`as`("heirarchy.name"),
                location.STATUS_ID.`as`("status.id"), FMK_SYSTEM_LOV.NAME.`as`("status.name"),
                location.PARENT_ID.`as`("parent.id"), parent1.NAME.`as`("parent.name"),
                location.DIVISION_ID.`as`("division.id"), CMT_DIVISION.NAME.`as`("division.name"))
                .from(location)
                .leftJoin(FMK_SYSTEM_LOV).on(FMK_SYSTEM_LOV.ID.eq(location.STATUS_ID))
                //.innerJoin(CMT_ORGANIZATION_HEIRARCHY).on(CMT_ORGANIZATION_HEIRARCHY.ID.eq(location.HEIRARCHY_ID))
                .leftJoin(parent).on(parent.ID.eq(location.HEIRARCHY_ID))
                .leftJoin(parent1).on(parent1.ID.eq(location.PARENT_ID))
                .leftJoin(CMT_DIVISION).on(CMT_DIVISION.ID.eq(location.DIVISION_ID))
                .where(location.HEIRARCHY_ID.`in`(listOfHo))
                .orderBy(location.NAME.asc())
        return baseSelect.fetchInto(Location::class.java)
    }

    fun getLocationJoin(condition: Condition): CommonTableExpression<*> {
        TODO("Not yet implemented")

//        return name("t").fields(
//            "id",
//            "name",
//            "ci_name",
//            "type.id",
//            "parent.id",
//            "poolLocation.id",
//            "status"
//        ).`as`(
//            select(
//                LOCATION.ID,
//                LOCATION.NAME,
//                LOCATION.CI_NAME,
//                LOCATION.TYPE_ID.`as`("type.id"),
//                LOCATION.PARENT_ID.`as`("parent.id"),
//                LOCATION.POOL_LOCATION_ID.`as`("poolLocation.id"),
//                LOCATION.STATUS
//            )
//                .from(LOCATION)
//                .where(condition)
//                .unionAll(
//                    select(
//                        LOCATION.ID,
//                        LOCATION.NAME,
//                        LOCATION.CI_NAME,
//                        LOCATION.TYPE_ID.`as`("type.id"),
//                        LOCATION.PARENT_ID.`as`("parent.id"),
//                        LOCATION.POOL_LOCATION_ID.`as`("poolLocation.id"),
//                        LOCATION.STATUS
//                    )
//                        .from(table(name("t")))
//                        .join(LOCATION)
//                        .on(
//                            field(name("t", "id"))
//                                .eq(LOCATION.PARENT_ID)
//                        )
//                )
//        )
    }
}
