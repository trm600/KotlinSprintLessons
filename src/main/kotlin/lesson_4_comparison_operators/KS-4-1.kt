package org.example.lesson_4_comparison_operators

const val TOTAL_TABLES: Byte = 13

fun main() {
    val bookedToday: Byte = 13
    val bookedTomorrow: Byte = 9

    println("Доступность столиков на сегодня:${bookedToday < TOTAL_TABLES}\nДоступность столиков на завтра:${bookedTomorrow < TOTAL_TABLES}")
}