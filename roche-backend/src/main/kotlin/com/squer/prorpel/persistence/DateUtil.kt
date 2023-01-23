package com.squer.prorpel.persistence

import java.text.SimpleDateFormat
import java.time.LocalDate
import java.time.ZoneId
import java.util.*

class DateUtil {

    companion object {
        fun toLocalDate(date: Date): LocalDate {
            return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        }

        fun toYearMonth(date: Date): Int {
            val simpleDateFormat = SimpleDateFormat("yyyyMM")
            return simpleDateFormat.format(date).toInt()
        }

        fun toYearMonthDay(date: Date): Int {
            val simpleDateFormat = SimpleDateFormat("yyyyMMdd")
            return simpleDateFormat.format(date).toInt()
        }
    }
}
