package org.example.lesson_6

fun main() {
    print("Введите количество секунд таймера: ")
    val numberOfSeconds = readln().toLong()
    Thread.sleep(numberOfSeconds * 1000)
    println("Прошло $numberOfSeconds секунд.")
}