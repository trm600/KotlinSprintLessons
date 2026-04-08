package org.example.lesson_5

fun main() {

    val term1 = (0..10).random()
    val term2 = (0..10).random()
    val sum = term1 + term2

    print("Докажи, что не бот, сколько будет: $term1 + $term2 = ")
    val answer = readln().toIntOrNull()
    if (answer == sum) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен.")
    }
}