package com.squer.prorpel.ui.service.impl

import com.squer.prorpel.persistence.SearchCriteria
import com.squer.prorpel.persistence.SearchOperator
import com.squer.prorpel.ui.domain.MenuAction
import com.squer.prorpel.ui.repository.MenuRepository
import com.squer.prorpel.ui.repository.enums.MenuActionSearchField
import com.squer.prorpel.ui.service.MenuService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class MenuServiceImpl: MenuService {
    @Autowired
    lateinit var menuRepository: MenuRepository

    override fun findMenusForUser(id: String, uiInterface: String): List<MenuAction>? {

        val criteria = SearchCriteria()
        criteria.addCondition(MenuActionSearchField.USER_ID, id)
        criteria.addCondition(MenuActionSearchField.UI_INTERFACE, uiInterface)
        criteria.addCondition(MenuActionSearchField.PARENT_ID, SearchOperator.ISNOT, true)
        return findMenus(criteria)
    }

    override fun findMenus(criteria: SearchCriteria): List<MenuAction>? {
        return menuRepository.find(criteria)
    }
}
