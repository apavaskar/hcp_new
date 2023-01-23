package com.squer.prorpel.ui.controller.dto

import com.fasterxml.jackson.annotation.JsonIgnore
import com.squer.prorpel.ui.domain.MenuAction

class MenuDTO {
    constructor(menuAction: MenuAction) {
        key = menuAction.id!!
        label = menuAction.name!!
        title =menuAction.name!!
        path = menuAction.path
        parentId = menuAction.parentId
    }
    var key: String? = null
    lateinit var label: String
    lateinit var title: String
    var path: String? = null
    @JsonIgnore
    var parentId: String? = null
    var children: List<MenuDTO>? = null

}
