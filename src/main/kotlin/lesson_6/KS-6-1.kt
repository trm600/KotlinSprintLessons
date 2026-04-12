package org.example.lesson_6

fun main() {
    println("Введите желаемый логин: ")
    val login = readln()
    println("Введите желаемый пароль: ")
    val password = readln()
    println("Регистрация прошла успешно")

    do {
        println("Введите ваш логин: ")
        val inputLogin = readln()
        println("Введите ваш пароль: ")
        val inputPassword = readln()
        if (inputLogin != login || inputPassword != password) {
            println("Логин или пароль не верны, попробуйте снова.")
        }
    } while (inputLogin != login || inputPassword != password)
    println("Авторизация прошла успешно!")
}