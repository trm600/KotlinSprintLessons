package org.example.lesson_5

const val USER = "Zaphod"
const val PASS = "PanGalactic"

fun main() {

    print("Введите имя пользователя: ")
    val userName = readln()
    when (userName) {
        USER -> {
            print("Введите пароль: ")
            val password = readln()
            when (password) {
               PASS -> println("Пользователь \"$userName\", вам разрешено " +
                       "входить на борт корабля \"Heart of Gold\"")
            }
        }
        else -> println("Пожалуйста зарегистрируйтесь")
    }
}