package org.example.lesson_10

const val USER_LOGIN = "root"
const val USER_PASS = "5zvezd"
const val TOKEN_SIZE = 32

fun main() {
    println("Введите логин: ")
    val userLogin = readln()
    println("Введите пароль: ")
    val userPass = readln()
    val token = logIn(userLogin, userPass)
    println(
        if (token == null) {
            "Авторизация неудачна!"
        } else {
            "Список товаров: ${getCart(token).joinToString(", ", postfix = ".")}"
        }
    )
}

fun logIn(login: String, password: String): String? {
    val characterSet = ('a'..'z') + ('0'..'9') + ('A'..'Z')
    return if (login == USER_LOGIN && password == USER_PASS) {
        List(TOKEN_SIZE) {
            characterSet.random()
        }.joinToString("")
    } else {
        null
    }
}

fun getCart(token: String) = listOf("Картошка", "Капуста", "Морковь", "Лук")