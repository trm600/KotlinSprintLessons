package org.example.lesson_10

fun main() {
    println("Введите желаемую длину пароля: ")
    val passwordLength = readln().toInt()
    println(generatePassword(passwordLength))
}

fun generatePassword(length: Int): String {
    val numbers = ('0'..'9')
    val symbols = "!\"#\$%&'()*+,-./ "

    return (1..length).map {
        if (it % 2 == 0) {
            symbols.random()
        } else {
            numbers.random()
        }
    }.joinToString("")
}