package com.squer.prorpel.common.service

import com.squer.prorpel.common.domain.Division

interface DivisionService {

    fun requiredAllDivision(): List<Division>
}