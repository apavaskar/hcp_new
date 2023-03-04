package com.squer.prorpel.persistence

import org.jooq.Condition
import org.jooq.Field

class SearchCriteria {
    var conditions = mutableListOf<SearchCondition>()

    var orderBy = mutableListOf<String>()

    fun addCondition(field: SearchField, value: Any) {
        conditions.add(SearchCondition(field, SearchOperator.EQ, value))
    }

    fun addCondition(field: SearchField, operator: SearchOperator, value: Any) {
        conditions.add(SearchCondition(field, operator, value))
    }

    fun addCondition(condition: SearchCondition) {
        conditions.add(condition)
    }

    fun getConditionsMap(): Map<String, SearchCondition> {
        return conditions.associateBy({it.field.getFieldName()},{it})
    }

    fun getConditionsList(): List<Condition>{
        var list = mutableListOf<Condition>()
        conditions.forEach {
            list.add(formCondition(it.field.getField(), it)!!)
        }
        return list
    }

    fun containsKey(field: SearchField): Boolean {
        return conditions.filter { it.field.getFieldName() == field.getFieldName() }.isNotEmpty()
    }

    private fun formCondition(field: Field<Any>, condition: SearchCondition): Condition? {
        when(condition.operator) {
            SearchOperator.EQ -> return (field.eq(condition.value))
            SearchOperator.IS -> return (field.isNull)
            SearchOperator.ISNOT -> return field.isNotNull
            SearchOperator.LIKE -> return  field.like(condition.value as String)
            else -> return null
        }
    }
}