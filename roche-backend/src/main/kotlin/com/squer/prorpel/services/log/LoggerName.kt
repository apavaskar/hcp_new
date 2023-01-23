package com.squer.prorpel.services.log

interface LoggerName {
    var logger: String

    enum class PlateformLogger(name: String) : LoggerName{
        CacheLogger("Cache"),
        EVENT_SERVICE_LOGGER("EventService");

        override var logger: String
            get() = TODO("Not yet implemented")
            set(value) {}
    }
}