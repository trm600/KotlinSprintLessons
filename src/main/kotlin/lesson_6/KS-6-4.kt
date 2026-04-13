package org.example.lesson_6

const val MINIMUM_NUMBER = 1
const val MAXIMUM_NUMBER = 9
const val NUMBER_OF_ATTEMPTS = 5

fun main() {
    var counter = NUMBER_OF_ATTEMPTS
    val bingo = (MINIMUM_NUMBER..MAXIMUM_NUMBER).random()

    do {
        println("Введи число от $MINIMUM_NUMBER до $MAXIMUM_NUMBER: ")
        val userNumber = readln().toInt()
        if (userNumber == bingo) {
            println("Угадал! Это была великолепная игра!")
            return
        } else {
            if (counter > 1) {
                println("Фиг вам, попыток осталось: ${counter - 1}")
            } else {
                println("Не угадал! Было загадано число $bingo")
            }
        }
        --counter
    } while (counter != 0)
}