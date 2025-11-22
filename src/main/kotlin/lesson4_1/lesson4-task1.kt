package org.example.lesson4_1

const val allTables = 13

fun main() {
    val bookedToday = 13
    val bookedTomorrow = 9

    println("""Доступность столиков сегодня: ${bookedToday<allTables}
Доступность столиков завтра: ${bookedTomorrow < allTables}""".trimMargin())

}