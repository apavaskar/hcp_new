package com.squer.prorpel.services.exception

enum class CoreExceptionEnum(code: String, message: String, severity: String): ExceptionMeta{
    UNKNOWN_EXCEPTION("500", "An unknown error has occurred. Please contact your system administrator/support", "ERROR"),
    INVALID_CREDENTIALS("500", "Invalid login Credentials", "INFO"),
    INVALID_REFERENCE("500", "Invalid reference password", "ERROR");

    override var severity: String
        get() = TODO("Not yet implemented")
        set(value) {}
    override var message: String
        get() = TODO("Not yet implemented")
        set(value) {}
    override var code: String
        get() = TODO("Not yet implemented")
        set(value) {}
}