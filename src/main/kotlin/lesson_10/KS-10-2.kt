package org.example.lesson_10

const val MIN_LENGTH = 4

fun main() {
    println("Введите желаемый логин (мин. $MIN_LENGTH символа): ")
    val userLogin = readln()
    println("Введите желаемый пароль (мин. $MIN_LENGTH символа): ")
    val userPassword = readln()
    val isValid = checkCredentialLength(userLogin, userPassword)
    if (isValid) {
        println("Категорически приветствую! Регистрация прошла успешно!")
    } else {
        println("Логин или пароль недостаточно длинные!")
    }
}

fun checkCredentialLength(login: String, password: String): Boolean {
    return login.length >= MIN_LENGTH && password.length >= MIN_LENGTH
}