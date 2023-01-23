package com.squer.prorpel.security.domain.enums

import jdk.incubator.foreign.SymbolLookup

enum class CoreSystemLovs(val id: String,val name1: String, val type: String, val displayOrder: Int, val display: Boolean) {
    ACTIVE_STATUS("SYSLV00000000000000000000000000000001", "Active", "STATUS", 1, true),
    INACTIVE_STATUS("SYSLV00000000000000000000000000000002", "In Active", "STATUS", 2, true);


}