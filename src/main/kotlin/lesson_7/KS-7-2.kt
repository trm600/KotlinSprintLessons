package org.example.lesson_7

fun main() {
    do {
        val autorizationCode = (1000..9999).random()
        println("Ваш код авторизации: $autorizationCode")
        println("Введите ваш код авторизации: ")
        val enteredCode = readln().toInt()
    } while (enteredCode != autorizationCode)
    println("Авторизация успешна! Приветствуем!")



}