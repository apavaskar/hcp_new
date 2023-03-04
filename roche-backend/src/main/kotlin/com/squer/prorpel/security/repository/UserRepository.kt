package com.squer.prorpel.security.repository

import com.squer.prorpel.common.domain.Location
import com.squer.prorpel.jooq.tables.references.*
import com.squer.prorpel.persistence.BaseRepository
import com.squer.prorpel.persistence.SearchCriteria
import com.squer.prorpel.security.domain.SecurityRole
import com.squer.prorpel.security.domain.User
import com.squer.prorpel.security.dto.UserProfileDTO
import org.jooq.DSLContext
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Repository
import java.time.LocalDateTime
import java.time.OffsetDateTime

@Repository
class UserRepository: BaseRepository<User>() {

    @Autowired
    @Qualifier("jooqContext")
    private lateinit var dslContext: DSLContext

    override fun create(entity: User): String {
        val result = dslContext.insertInto(FMK_SECURITY_USER, FMK_SECURITY_USER.ID,FMK_SECURITY_USER.USER_PASSWORD,FMK_SECURITY_USER.STATUS_ID,FMK_SECURITY_USER.USER_NAME, FMK_SECURITY_USER.OWNER_ID, FMK_SECURITY_USER.CREATED_BY, FMK_SECURITY_USER.CREATED_ON, FMK_SECURITY_USER.UPDATED_BY, FMK_SECURITY_USER.UPDATED_ON)
                .values(generateGUID("USERS"),entity.password,entity.status?.id!!,entity.userName, entity.owner?.id!!, getCreator().id!!, OffsetDateTime.now(), getCreator().id!!, OffsetDateTime.now() )
                .returningResult(FMK_SECURITY_USER.ID)
                .fetchOne()
        return result?.get(FMK_SECURITY_USER.ID)!!
    }

    override fun delete(id: String): String? {
        TODO("Not yet implemented")
    }

    override fun find(criteria: SearchCriteria): List<User> {
        return dslContext.select(FMK_SECURITY_USER.asterisk(), FMK_SECURITY_USER.USER_PASSWORD.`as`("password"), FMK_SECURITY_USER.OWNER_ID.`as`("owner.id"), FMK_SECURITY_USER.STATUS_ID.`as`("status.id"))
                .from(FMK_SECURITY_USER)
                .where(getConditions(criteria))
                .fetchInto(User::class.java)
    }

    override fun findById(userId: String): User? {
        return dslContext.select(FMK_SECURITY_USER.asterisk(), FMK_SECURITY_USER.USER_PASSWORD.`as`("password"), FMK_SECURITY_USER.OWNER_ID.`as`("owner.id"), FMK_SECURITY_USER.STATUS_ID.`as`("status.id"))
                .from(FMK_SECURITY_USER)
                .where(FMK_SECURITY_USER.ID.eq(userId))
                .fetchOneInto(User::class.java)

    }

    fun findByUserName(username: String): User? {
            val user = dslContext.select(FMK_SECURITY_USER.asterisk())
                    .from(FMK_SECURITY_USER)
                .where(FMK_SECURITY_USER.USER_NAME.eq(username))
                    .fetchOneInto(User::class.java)
            return user
    }

    fun getUserProfile(userId: String): UserProfileDTO? {

        return dslContext.select(
            FMK_SECURITY_USER.ID.`as`("id"), CMT_EMPLOYEE.NAME.`as`("fullName"), CMT_EMPLOYEE.EMAIL_ID.`as`("email"),
            CMT_JOB_TITLE.ID.`as`("jobRole.id"), CMT_JOB_TITLE.NAME.`as`("jobRole.name"),
            CMT_LOCATION.ID.`as`("location.id"), CMT_LOCATION.NAME.`as`("location.name"))
            .from(FMK_SECURITY_USER)
                .innerJoin(CMT_EMPLOYEE).on(CMT_EMPLOYEE.ID.eq(FMK_SECURITY_USER.OWNER_ID))
            .innerJoin(CMT_JOB_TITLE).on(CMT_JOB_TITLE.ID.eq(CMT_EMPLOYEE.JOB_TITLE_ID))
            .innerJoin(CMT_LOCATION).on(CMT_LOCATION.ID.eq(CMT_EMPLOYEE.LOCATION_ID))
            .where(FMK_SECURITY_USER.ID.eq(userId))
            .fetchOneInto(UserProfileDTO::class.java)
    }

    override fun update(entity: User): String {
        dslContext.update(FMK_SECURITY_USER)
            .set(FMK_SECURITY_USER.USER_NAME, entity.userName)
            .set(FMK_SECURITY_USER.STATUS_ID, entity.status?.id)
            .set(FMK_SECURITY_USER.UPDATED_BY, getCreator().id)
            .set(FMK_SECURITY_USER.UPDATED_ON, OffsetDateTime.now())
            .where(FMK_SECURITY_USER.ID.eq(entity.id))
            .execute()
        return entity.id!!
    }

    fun findLocationsForUser(id: Long) : List<Location> {
        TODO("Not yet implemented")

//        return dslContext.select(LOCATION.asterisk(), LOCATIONTYPE.NAME.`as`("type.name"), LOCATIONTYPE.ID.`as`("type.id"))
//            .from(LOCATION)
//            .innerJoin(LOCATIONTYPE).on(LOCATIONTYPE.ID.eq(LOCATION.TYPE_ID))
//            .innerJoin(USERLOCATION).on(USERLOCATION.LOCATION_ID.eq(LOCATION.ID))
//            .where(USERLOCATION.USER_ID.eq(id))
//            .fetchInto(Location::class.java)
    }

    private fun findSecurityRolesForUser(id: Long): List<SecurityRole> {
        TODO("Not yet implemented")

//        return dslContext.select()
//            .from(USERSECURITYROLE)
//            .innerJoin(SECURITYROLE)
//                .on(USERSECURITYROLE.ROLE_ID.eq(SECURITYROLE.ID))
//            .where(USERSECURITYROLE.USER_ID.eq(id))
//            .fetchInto(SecurityRole::class.java)
    }
}
