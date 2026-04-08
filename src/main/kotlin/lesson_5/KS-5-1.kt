package org.example.lesson_5

const val CORRECT_ANSWER = 4

fun main() {

    print("Докажи, что не бот, - 2 + 2 = ")
    val answer = readln().toIntOrNull()
    if (answer == CORRECT_ANSWER) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен.")
    }
}