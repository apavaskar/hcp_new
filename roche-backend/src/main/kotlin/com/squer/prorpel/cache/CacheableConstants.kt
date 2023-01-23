package com.squer.prorpel.cache

import org.redisson.codec.TypedJsonJacksonCodec


interface CacheableConstants {
    fun getCacheName(): String

    fun getCodec(): TypedJsonJacksonCodec
}
