package org.example.lesson_7

const val PASSWORD_SIZE = 6

fun main() {
    var pass = ""
    val rangeOfNumbers = (0..9)
    val rangeOfLetters = ('a'..'z')

    for (i in 1..PASSWORD_SIZE) {
        pass += if (i % 2 == 0) {
            rangeOfLetters.random()
        } else {
            rangeOfNumbers.random()
        }
    }
    println(pass)
}