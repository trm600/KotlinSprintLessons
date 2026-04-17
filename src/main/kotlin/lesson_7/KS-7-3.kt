package org.example.lesson_7

fun main() {
    println("Введите число: ")
    val userNumber = readln().toInt()
    for (i in 2..userNumber step 2) {
        print("$i ")
    }
}