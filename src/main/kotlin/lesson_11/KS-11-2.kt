package org.example.lesson_11

class User2 {
    var id: Int = 0
    var login: String = ""
    var password: String = ""
    var email: String = ""
    var bio: String = ""

    fun outputInformationToConsole() {
        println(
            """
    Пользователь $id:
    Логин: $login | Пароль: $password | Почта: $email |
    Биография: $bio
    """.trimIndent()
        )
    }

    fun writeBiography() {
        println("Введите информацию о себе: ")
        bio = readln()
    }

    fun changePassword() {
        println("Введите текущий пароль: ")
        if (password == readln()) {
            println("Введите новый пароль: ")
            password = readln()
            println("Пароль успешно изменён!")
        } else {
            println("Текущий пароль неверный.")
        }
    }
}

fun main() {
    val ruslan = User2()
    ruslan.id = 1
    ruslan.login = "ruslanCapitan"
    ruslan.password = "1q2w3e"
    ruslan.email = "ruslanglotov@yahoo.com"

    ruslan.writeBiography()
    ruslan.changePassword()
    ruslan.outputInformationToConsole()
}