package org.example.lesson_7

fun main() {
    println("Введите количество секунд: ")
    val numberOfSeconds = readln().toInt()
    for (i in numberOfSeconds downTo 1) {
        println("Времени осталось $i сек.")
        Thread.sleep(1000)
    }
    println("Время вышло.")
}