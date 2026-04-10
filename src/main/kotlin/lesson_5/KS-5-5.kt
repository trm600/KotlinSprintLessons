package org.example.lesson_5

const val NUMBER_OF_WINNING_NUMBERS = 3
const val MIN = 0
const val MAX = 42

fun main() {
    val winningNumbers: MutableList<Int> = mutableListOf()
    val guessedNumbers: MutableList<Int> = mutableListOf()
    var counter = 0
    val numberOfMatches: Int

    while (counter != NUMBER_OF_WINNING_NUMBERS) {
        val number = (MIN..MAX).random()
        if (!winningNumbers.contains(number)) {
            winningNumbers.add(number)
            ++counter
        }
    }
    counter = 0
    while (counter != NUMBER_OF_WINNING_NUMBERS) {
        print("Введите число № ${counter + 1}: ")
        val number = readln().toInt()
        if (!guessedNumbers.contains(number)) {
            guessedNumbers.add(number)
            ++counter
        }
        else {
            println("Это число уже было введено, введите другое число.")
        }
    }
    numberOfMatches = guessedNumbers.intersect(winningNumbers.toSet()).size
    println(when (numberOfMatches) {
        3 -> "Вы угадали все числа и выиграли джекпот!"
        2 -> "Вы угадали два числа и получаете крупный приз!"
        1 -> "Вы угадали одно число и получате утешительный приз!"
        else -> "Вы не угадали ни одного числа."
    })
    println("Выигрышные числа: $winningNumbers")
}