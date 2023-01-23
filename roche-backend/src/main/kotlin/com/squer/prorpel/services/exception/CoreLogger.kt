package com.squer.prorpel.services.exception

import com.squer.prorpel.services.log.LoggerName

enum class CoreLogger(val name1: String): LoggerName {
    PERSISTENCE_LOGGER("persistence"),
    SECURITY_LOGGER("security");

    public override var logger: String = ""

}