package org.example.lesson_7

const val PASSWORD_SIZE = 6

fun main() {
    var pass = ""

    for (i in 1..PASSWORD_SIZE) {
        pass += if (i % 2 == 0) {
            ('a'..'z').random()
        } else {
            (0..9).random()
        }
    }
    println(pass)
}