package com.squer.prorpel.ui.controller

import com.squer.prorpel.persistence.SearchCriteria
import com.squer.prorpel.persistence.SearchOperator
import com.squer.prorpel.ui.controller.dto.MenuDTO
import com.squer.prorpel.ui.repository.enums.MenuActionSearchField
import com.squer.prorpel.ui.service.MenuService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestParam

open class MenuController @Autowired constructor(
    private val menuService: MenuService
)  {

    @GetMapping("/for-user/{id}")
    fun getMenusForUser(@PathVariable("id") id: String, @RequestParam(defaultValue = "WEB") uiInterface: String): ResponseEntity<*> {
        val parentMenusCriteria = SearchCriteria()
        parentMenusCriteria.addCondition(MenuActionSearchField.PARENT_ID, SearchOperator.IS,true)
        val parentMenus = menuService.findMenus(parentMenusCriteria)
        val allChildMenus = menuService.findMenusForUser(id, uiInterface)?.map{
            MenuDTO(it)
        }?.groupBy({it.parentId})
        val menus = mutableListOf<MenuDTO>()
        parentMenus?.forEach {
            val parent  = MenuDTO(it)
            parent.children = allChildMenus?.get(parent.key) ?: mutableListOf<MenuDTO>()
            menus.add(parent)
        }
        return ResponseEntity.ok<Any>(menus)
    }
}
