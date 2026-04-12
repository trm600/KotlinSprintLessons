package org.example.lesson_6

const val MINIMUM_NUMBER = 1
const val MAXIMUM_NUMBER = 9
const val NUMBER_OF_ATTEMPTS = 5

fun main() {
    var counter = 1
    val bingo = (MINIMUM_NUMBER..MAXIMUM_NUMBER).random()

    do {
        println("Введи число от $MINIMUM_NUMBER до $MAXIMUM_NUMBER: ")
        val userNumber = readln().toInt()
        when {
            userNumber == bingo -> {
                println("Угадал! Это была великолепная игра!")
                return
            }

            else -> {
                println("Фиг вам, попыток осталось: ${NUMBER_OF_ATTEMPTS - counter}")
                if (counter == NUMBER_OF_ATTEMPTS) {
                    println("Было загадано число $bingo")
                }
            }
        }
        counter++
    } while (counter <= NUMBER_OF_ATTEMPTS)
}