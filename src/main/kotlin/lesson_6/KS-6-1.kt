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
        val isAuthorization = (inputLogin == login && inputPassword == password)
        if (!isAuthorization) {
            println("Логин или пароль не верны, попробуйте снова.")
        }
    } while (!isAuthorization)
    println("Авторизация прошла успешно!")
}