package org.example.lesson_5

const val AGE_OF_MAJORITY = 18

fun main() {
    val currentYear = 2026

    print("Введите ваш год рождения: ")
    val year = readln().toInt()
    if (currentYear - year >= AGE_OF_MAJORITY) {
        println("Показать экран со скрытым контентом")
    }
}