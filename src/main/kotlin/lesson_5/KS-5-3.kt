package org.example.lesson_5

fun main() {

    val winningNumber1 = 5
    val winningNumber2 = 13

    println("Введите первое число от 0 до 42:")
    val guessedNumber1 = readln().toInt()
    println("Введите второе число от 0 до 42:")
    val guessedNumber2 = readln().toInt()

    if ((guessedNumber1 == winningNumber1 && guessedNumber2 == winningNumber2) ||
        (guessedNumber1 == winningNumber2 && guessedNumber2 == winningNumber1)
    ) {
        println("Поздравляем! Вы выиграли главный приз!")
    } else if (guessedNumber1 == winningNumber1 || guessedNumber1 == winningNumber2 ||
        guessedNumber2 == winningNumber1 || guessedNumber2 == winningNumber2
    ) {
        println("Вы выиграли утешительный приз!")
    } else {
        println("Неудача!")
    }
    println("Выигрышная комбинация чисел: $winningNumber1 и $winningNumber2")
}