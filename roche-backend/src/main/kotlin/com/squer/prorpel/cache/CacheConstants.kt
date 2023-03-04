package com.squer.prorpel.cache

import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.squer.prorpel.ui.service.impl.FormMetaPOJO
import org.redisson.codec.TypedJsonJacksonCodec

enum class CacheConstants: CacheableConstants{
    FORM_META {
        override fun getCacheName(): String {
            return "FORM_META"
        }

        override fun getCodec(): TypedJsonJacksonCodec {
            return TypedJsonJacksonCodec(String::class.java, FormMetaPOJO::class.java, jacksonObjectMapper())
        }
    },
    SEARCH_CONDITION_META {
        override fun getCacheName(): String {
            return "SEARCH_CONDITION_META"
        }

        override fun getCodec(): TypedJsonJacksonCodec {
            return TypedJsonJacksonCodec(String::class.java, FormMetaPOJO::class.java, jacksonObjectMapper())
        }
    }
}
