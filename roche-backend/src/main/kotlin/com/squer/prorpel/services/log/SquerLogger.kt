package com.squer.prorpel.services.log

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.ui.context.Theme

class SquerLogger {
    private var logger: Logger ?= null

    companion object {
        private var logs: HashMap<String, SquerLogger>?= hashMapOf()

        public fun getLogger(loggerEntry: LoggerName): SquerLogger? {
            if(logs!!.containsKey(loggerEntry.logger)){
                return logs?.get(loggerEntry.logger)
            }
            return SquerLogger(loggerEntry)
        }
    }

    constructor(name: LoggerName){
        val logger = LoggerFactory.getLogger(name.logger)
        logs?.set(name.logger.toString(), this)
    }

    public fun debug(s: String){
        logger?.debug(s)
    }

    public fun error(s: String){
        logger?.error(s)
    }

    public fun error(t: Throwable){
        logger?.error("Error Thrown!!!!!!", t)
    }

    public fun info(s: String){
        logger?.info(s)
    }

    public fun warn(s: String){
        logger?.warn(s)
    }

    public fun warn(t: Throwable){
        logger?.warn("Warning Thrown!!!!!", t)
    }
}