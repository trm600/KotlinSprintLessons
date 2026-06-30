package org.example.lesson_16

class User(val name: String, private val password: String) {
    fun checkPassword(verifiablePass: String) = password == verifiablePass
}

fun main() {
    val user = User("Alice", "Password")

    println("Введен верный пароль? - ${user.checkPassword("Password")}")
}