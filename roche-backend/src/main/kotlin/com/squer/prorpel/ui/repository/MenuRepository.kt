package com.squer.prorpel.ui.repository

import com.squer.prorpel.jooq.tables.references.MENUACTIONS
import com.squer.prorpel.jooq.tables.references.SECURITYPRIVILEGE
import com.squer.prorpel.jooq.tables.references.SECURITYROLEPRIVILEGE
import com.squer.prorpel.jooq.tables.references.USERSECURITYROLE
import com.squer.prorpel.persistence.BaseRepository
import com.squer.prorpel.persistence.SearchCriteria
import com.squer.prorpel.ui.domain.MenuAction
import com.squer.prorpel.ui.repository.enums.MenuActionSearchField
import org.jooq.Condition
import org.jooq.DSLContext
import org.jooq.Field
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Repository

@Repository
class MenuRepository: BaseRepository<MenuAction>() {
    @Autowired
    @Qualifier("jooqContext")
    private lateinit var dslContext: DSLContext

    override fun create(entity: MenuAction): String {
        TODO("Not yet implemented")
    }

    override fun update(entity: MenuAction): String {
        TODO("Not yet implemented")
    }

    override fun findById(id: String): MenuAction? {
        TODO("Not yet implemented")
    }

    override fun delete(id: String): String? {
        TODO("Not yet implemented")
    }

    override fun find(criteria: SearchCriteria) : List<MenuAction> {
        val mapOfConditions = criteria.getConditionsMap()
        val baseSelect = dslContext.select(MENUACTIONS.asterisk())
            .from(MENUACTIONS)
        val list = mutableListOf<Condition>()
        if (mapOfConditions.containsKey(MenuActionSearchField.USER_ID.getFieldName())) {
            baseSelect.innerJoin(SECURITYPRIVILEGE)
                .on(SECURITYPRIVILEGE.ID.eq(MENUACTIONS.PRIVILEGE_ID))
                .innerJoin(SECURITYROLEPRIVILEGE)
                .on(SECURITYROLEPRIVILEGE.PRIVILEGE_ID.eq(MENUACTIONS.PRIVILEGE_ID))
                .innerJoin(USERSECURITYROLE)
                .on(USERSECURITYROLE.ROLE_ID.eq(SECURITYROLEPRIVILEGE.ROLE_ID))
            list.add(formCondition(USERSECURITYROLE.USER_ID as Field<Any>, mapOfConditions[MenuActionSearchField.USER_ID.getFieldName()]!!)!!)
        }
        if (mapOfConditions.containsKey(MenuActionSearchField.PARENT_ID.getFieldName())) {
            list.add(formCondition(MENUACTIONS.PARENT_ID as Field<Any>,
                mapOfConditions[MenuActionSearchField.PARENT_ID.getFieldName()]!!)!!)
        }
        return baseSelect.where(list).fetchInto(MenuAction::class.java)
    }
}
