package com.squer.prorpel.persistence

class SearchCriteria {
    var conditions = mutableListOf<SearchCondition>()

    var orderBy = mutableListOf<String>()

    fun addCondition(field: SearchField, value: Any) {
        conditions.add(SearchCondition(field, SearchOperator.EQ, value))
    }

    fun addCondition(field: SearchField, operator: SearchOperator, value: Any) {
        conditions.add(SearchCondition(field, operator, value))
    }

    fun getConditionsMap(): Map<String, SearchCondition> {
        return conditions.associateBy({it.field.getFieldName()},{it})
    }
}
