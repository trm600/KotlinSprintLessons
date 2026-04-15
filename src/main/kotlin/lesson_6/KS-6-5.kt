package org.example.lesson_6

const val NUMBER_OF_ATTEMPTS1 = 3

fun main() {
    for (i in NUMBER_OF_ATTEMPTS1 downTo 1) {
        val term1 = (1..9).random()
        val term2 = (1..9).random()
        val sum = term1 + term2

        println("Докажи, что не бот, какова сумма чисел: $term1 и $term2 ?")
        val answer = readln().toInt()
        if (answer != sum) {
            continue
        } else {
            println("Добро пожаловать!")
            return
        }
    }
    println("Доступ запрещен")
}