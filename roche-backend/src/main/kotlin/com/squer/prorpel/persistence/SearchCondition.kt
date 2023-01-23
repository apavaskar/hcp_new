package com.squer.prorpel.persistence

data class SearchCondition(val field: SearchField, val operator: SearchOperator, val value: Any)
