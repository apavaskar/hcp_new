package com.squer.prorpel.ui.service

import com.squer.prorpel.ui.service.impl.FormMetaPOJO

interface FormMetaService {

    fun findFormMeta(code: String): FormMetaPOJO

}
