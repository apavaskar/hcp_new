package com.squer.prorpel.ui.service

import com.squer.prorpel.ui.domain.LabelMeta

interface LabelMetaService {
    fun getLabel(code: String): LabelMeta
}
