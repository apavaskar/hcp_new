package com.squer.prorpel.utils

import java.text.SimpleDateFormat
import java.time.LocalDate
import java.time.ZoneId
import java.util.*

class DateUtils {

    companion object {
        fun getDateFromYearMonth(yearMonth: Int): Date {
            val format = SimpleDateFormat("yyyyMMdd")
            return format.parse("${yearMonth * 100 + 1}")
        }

        fun deductMonths(date: Date, numMonths: Int): Date {
            val c: Calendar = Calendar.getInstance()
            c.time = date
            c.add(Calendar.MONTH, numMonths)
            return c.time
        }

        fun getYearMonthFromDate(date: Date): Int {
            val format = SimpleDateFormat("yyyyMM")
            return format.format(date).toInt()
        }

        fun getYearMonthDayFromDate(date: Date): Int {
            val format = SimpleDateFormat("yyyyMMdd")
            return format.format(date).toInt()
        }

        fun getDisplayMonthYear(yearMonth: Int): String {
            val format = SimpleDateFormat("yyyyMMdd")
            val displayMonthYear = SimpleDateFormat("MMM-yyyy")
            return displayMonthYear.format(format.parse("${yearMonth * 100 + 1}"))
        }

        fun convertToLocalDate(date: Date?): LocalDate? {
            if (date == null)
                return null
            return date.toInstant()
                .atZone(ZoneId.of("Asia/Kolkata"))
                .toLocalDate();
        }

        fun convertToDate(localDate: LocalDate?): Date? {
            if (localDate == null) return null
            return Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant())
        }

        fun convertToDate(yearMonthDate: Int): Date? {
            val formatter = SimpleDateFormat("yyyyMMdd")
            return formatter.parse(yearMonthDate.toString())
        }

        fun getYear(date: Date?): Long? {
            if (date == null)
                return null
            return SimpleDateFormat("yyyy").format(date).toLong()
        }

        fun getYearMonth(date: Date?): Long? {
            if (date == null)
                return null
            return SimpleDateFormat("yyyyMM").format(date).toLong()
        }

        fun getYearMonthDate(date: Date?): Long? {
            if (date == null)
                return null
            return SimpleDateFormat("yyyyMMdd").format(date).toLong()
        }

        fun getFirstDateOfYearMonth(yearMonth: Long): Date? {
            return convertToDate("${yearMonth}01".toInt())
        }
    }
}
