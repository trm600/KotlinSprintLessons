package org.example.lesson_6

fun main() {
    print("Введите желаемый логин: ")
    val login = readln()
    print("Введите желаемый пароль: ")
    val password = readln()

    do {
        println("Введите ваш логин: ")
        val inputLogin = readln()
        println("Введите ваш пароль: ")
        val inputPassword = readln()
    } while (inputLogin != login || inputPassword != password)
    println("Авторизация прошла успешно!")
}