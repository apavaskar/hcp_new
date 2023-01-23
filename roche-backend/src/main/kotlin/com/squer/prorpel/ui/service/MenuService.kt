package com.squer.prorpel.ui.service

import com.squer.prorpel.persistence.SearchCriteria
import com.squer.prorpel.ui.domain.MenuAction

interface MenuService {
    fun findMenusForUser(id: String, uiInterface: String): List<MenuAction>?

    fun findMenus(criteria: SearchCriteria): List<MenuAction>?
}
