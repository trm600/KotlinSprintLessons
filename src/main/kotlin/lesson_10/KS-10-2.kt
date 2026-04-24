package org.example.lesson_10

fun main() {
    println("Введите желаемый логин: ")
    val userLogin = readln()
    println("Введите желаемый пароль: ")
    val userPassword = readln()
    val isValid = checkCredentialLength(userLogin, userPassword)
    if (!isValid) {
        println("Логин или пароль недостаточно длинные")
    }
}

fun checkCredentialLength(login: String, password: String): Boolean {
    return login.length >= 4 && password.length >= 4
}