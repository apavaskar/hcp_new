package com.squer.prorpel.ui.service.impl

class FormMetaPOJO {
    var id: String = ""
    lateinit var code: String
    lateinit var title: String
    lateinit var subTitle: String
    var inline: Boolean = false
    var submitAction: String? = null
    var initAction: String? = null
    lateinit var attributes: List<Map<String, Any?>>
}
