package org.example.lesson_3_Strings

fun main() {
    val factor = readln().toByte()

    if (factor <= 9) {
        for (i in 1..9) {
            println("$factor x $i = ${factor * i}")
        }

    }
}