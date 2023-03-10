package com.squer.prorpel

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.transaction.annotation.EnableTransactionManagement

@SpringBootApplication
@EnableTransactionManagement
class RocheBackend

fun main(args: Array<String>) {
	runApplication<RocheBackend>(*args)
}
