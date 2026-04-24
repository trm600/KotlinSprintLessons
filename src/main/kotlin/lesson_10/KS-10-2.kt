package org.example.lesson_10

fun main() {
    println("Введите желаемый логин (мин.4 символа): ")
    val userLogin = readln()
    println("Введите желаемый пароль (мин.4 символа): ")
    val userPassword = readln()
    val isValid = checkCredentialLength(userLogin, userPassword)
    if (isValid) {
        println("Регистрация прошла успешно!")
    } else {
        println("Логин или пароль недостаточно длинные!")
    }
}

fun checkCredentialLength(login: String, password: String): Boolean {
    return login.length >= 4 && password.length >= 4
}