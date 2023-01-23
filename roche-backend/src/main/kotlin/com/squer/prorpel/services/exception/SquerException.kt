package com.squer.prorpel.services.exception

class SquerException: Exception {
    private var meta: ExceptionMeta ?= null

    constructor(meta: ExceptionMeta){
        this.meta = meta
    }

    constructor(e: Exception){
        this.meta = CoreExceptionEnum.UNKNOWN_EXCEPTION;
        initCause(e);
    }

    public fun getSeverity(): String{
        return meta!!.severity
    }

    public fun getMeta(): ExceptionMeta?{
        return meta;
    }
}