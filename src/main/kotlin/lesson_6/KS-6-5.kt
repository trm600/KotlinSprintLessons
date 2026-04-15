package org.example.lesson_6

const val HOW_MANY_ATTEMPTS = 3

fun main() {
    var attempts = HOW_MANY_ATTEMPTS

    do {
        val term1 = (1..9).random()
        val term2 = (1..9).random()

        println("Докажи, что не бот, какова сумма чисел: $term1 и $term2 ?")
        val answer = readln().toInt()
        if (answer == term1 + term2) {
            println("Добро пожаловать!")
            return
        }
        --attempts
    } while (attempts > 0)
    println("Доступ запрещен")
}