package org.example.lesson_6

fun main() {
    print("Введите количество секунд таймера: ")
    var numberOfSeconds = readln().toInt()
    while (numberOfSeconds > 0) {
        println("Осталось секунд: ${numberOfSeconds--}")
        Thread.sleep(1000)
    }
    println("Время вышло.")
}