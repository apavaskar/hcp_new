package com.squer.prorpel.ui.controller

import com.squer.prorpel.cache.CacheConstants
import com.squer.prorpel.persistence.SearchCondition
import com.squer.prorpel.persistence.SearchCriteria
import com.squer.prorpel.persistence.SearchField
import com.squer.prorpel.persistence.SearchOperator
import com.squer.prorpel.ui.domain.SearchMeta
import org.redisson.api.RMapCache
import org.redisson.api.RedissonClient
import org.reflections.Reflections
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class FormUtils {

    @Autowired
    lateinit var redissonClient: RedissonClient


    companion object {
        private val mapOfSearchFields = mutableMapOf<String, SearchField>()
    }

    fun formSearchCondition(searchMetaId: Long, conditions: Map<String, Any>, criteria: SearchCriteria) {
        val searchMetaCache: RMapCache<String, SearchMeta> =
                redissonClient.getMapCache(
                        CacheConstants.SEARCH_CONDITION_META.getCacheName(),
                        CacheConstants.SEARCH_CONDITION_META.getCodec()
                )
        val searchMeta = searchMetaCache[searchMetaId.toString()]!!
        conditions.forEach {
            criteria.addCondition(formSearchCondition(searchMeta, it.key, it.value))
        }
    }

    fun formSearchCondition(searchMetaId: Long, fieldName: String, value: Any) : SearchCondition {
        val searchMetaCache: RMapCache<String, SearchMeta> =
                redissonClient.getMapCache(
                        CacheConstants.SEARCH_CONDITION_META.getCacheName(),
                        CacheConstants.SEARCH_CONDITION_META.getCodec()
                )
        val searchMeta = searchMetaCache[searchMetaId.toString()]!!
        return formSearchCondition(searchMeta, fieldName, value)
    }

    fun formSearchCondition(searchMeta: SearchMeta, fieldName: String, value: Any) : SearchCondition {
        if (mapOfSearchFields[fieldName] == null ){
            val reflections = Reflections("com.squer.application")
            val classes: Set<Class<out SearchField?>> = reflections.getSubTypesOf(SearchField::class.java)
            for(clazz in classes) {
                if (clazz.name.indexOf('$')<0){
                    val name = clazz.simpleName
                    val splits = fieldName.split(".")
                    if (name == splits[0]) {
                        mapOfSearchFields[fieldName] = clazz.getDeclaredField(splits[1]).get(null) as SearchField
                    }
                }
            }
        }
        val searchField = mapOfSearchFields[fieldName]!!
        val searchCondition = searchMeta.conditions!!.filter { it.name.lowercase() == searchField.getFieldName().lowercase() }[0]
        return SearchCondition(searchField, SearchOperator.valueOf(searchCondition.operator), getFormattedValue(searchCondition.formatter, value))
    }

    private fun getFormattedValue(formatter: String, value: Any) : Any {
        if (formatter == "LOWER_LIKE"){
            return  (value as String).trim().lowercase() +  "%"
        } else if (formatter == "LOWER_EQ") {
            return (value as String).trim().lowercase()
        }
        return value
    }
}