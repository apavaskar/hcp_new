package com.squer.prorpel.ui.service.impl

import com.squer.prorpel.cache.CacheConstants
import com.squer.prorpel.persistence.SearchCriteria
import com.squer.prorpel.ui.repository.enums.FormMetaSearchField
import com.squer.prorpel.ui.repository.FormAttributeMetaRepository
import com.squer.prorpel.ui.repository.FormMetaRepository
import com.squer.prorpel.ui.repository.enums.FormAttributeMetaSearchField
import com.squer.prorpel.ui.service.FormMetaService
import com.squer.prorpel.ui.service.LabelMetaService
import org.redisson.api.RMapCache
import org.redisson.api.RedissonClient
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import kotlin.reflect.full.memberProperties

@Service
class FormMetaServiceImpl @Autowired constructor(redissonClient: RedissonClient): FormMetaService {

    @Autowired
    lateinit var formMetaRepository: FormMetaRepository

    @Autowired
    lateinit var formAttributeMetaRepository: FormAttributeMetaRepository

    @Autowired
    lateinit var labelMetaService: LabelMetaService


    companion object {
        val mapOfPropToCategory = mapOf("label" to "props", "placeholder" to "props", "on_select" to "props",
                                        "on_search" to "props", "on_change" to "props", "default_value" to "props",
                                        "action" to "props", "isRequired" to "validations", "isEnabled" to "validations",
                                         "min_value" to "validations", "max_value" to "validations",
                                         "min_length" to "validations", "max_length" to "validations",
                                         "pattern" to "validations", "dataType" to "validations", "message" to "validations" )
    }

    private val formMetaCache: RMapCache<String, FormMetaPOJO> =
        redissonClient.getMapCache(
            CacheConstants.FORM_META.getCacheName(),
            CacheConstants.FORM_META.getCodec()
        )

    override fun findFormMeta(formCode: String): FormMetaPOJO {

        var cache = formMetaCache[formCode]
        if (cache != null) return cache
        val criteria = SearchCriteria()
        criteria.addCondition(FormMetaSearchField.CODE, formCode)
        val formMeta = formMetaRepository.find(criteria).first()
        val attributeCriteria = SearchCriteria()
        attributeCriteria.addCondition(FormAttributeMetaSearchField.FORM_ID, formMeta.id!!)
        val attributes = formAttributeMetaRepository.find(attributeCriteria).sortedWith(compareBy({it.displayOrder}))
        val pojo = FormMetaPOJO()
        pojo.id = formMeta.id!!
        pojo.title = getLabelValue(formMeta.title) as String
        pojo.code = formMeta.code
        pojo.subTitle = formMeta.subTitle ?: ""
        pojo.inline = formMeta.isInline
        pojo.submitAction = formMeta.submitAction
        pojo.initAction = formMeta.initAction
        val attributesMap = mutableListOf<Map<String, Any?>>()
        attributes.forEach {
            val map = mutableMapOf<String, Any?>()
            if (it.type == "FORM") {
                val metaPOJO = findFormMeta(it.reference!!)
                map["type"] = "FORM"
                map["form"] = metaPOJO
                map["span"] = it.span
                map["offset"] = it.offset
                var propsMap = mutableMapOf<String, Any?>()
                propsMap["name"] = it.name
                map["props"] = propsMap
            } else {
                it::class.memberProperties.forEach { field ->
                    if (field.getter.call(it) != null) {
                        when (mapOfPropToCategory[field.name] ?: "base") {
                            "base" ->
                                map[field.name] = field.getter.call(it)
                            "props" -> {
                                var maps = mutableMapOf<String, Any?>()
                                if (map.containsKey("props")) {
                                    maps = map["props"] as MutableMap<String, Any?>
                                }
                                maps[field.name] = getLabelValue(field.getter.call(it))
                                map["props"] = maps
                            }
                            "validations" -> {
                                var maps = mutableMapOf<String, Any?>()
                                if (map.containsKey("validations")) {
                                    maps = map["validations"] as MutableMap<String, Any?>
                                }
                                maps[field.name] = getLabelValue(field.getter.call(it))
                                map["validations"] = maps
                            }
                        }
                    }
                }
                if (!map.containsKey("props")) {
                    var props = mutableMapOf<String, Any>()
                    props["name"] = "${Math.random()}"
                    map["props"] = props
                }
            }
            attributesMap.add(map)
        }
        pojo.attributes = attributesMap
        //formMetaCache.fastPut(formCode, pojo)
        return pojo
    }

    private fun getLabelValue(label: Any?): Any? {
        println(label)
        if (label !is String) {
            return label
        }
        return if (label.startsWith("#") && !label.startsWith("##")) {
            val labelMeta = labelMetaService.getLabel(label.substring(1))
            if(labelMeta==null) return "" else return labelMeta.label
        }else if(label.startsWith("##")) {
            label.substring(1)
        } else{
            label
        }
    }
}
