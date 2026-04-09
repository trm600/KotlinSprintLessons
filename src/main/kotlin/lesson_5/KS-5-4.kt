package org.example.lesson_5

const val REGISTERED_USER = "Zaphod"
const val REGISTERED_USER_PASS = "PanGalactic"

fun main() {
    print("Введите имя пользователя: ")
    val userName = readln()
    when (userName) {
        REGISTERED_USER -> {
            print("Введите пароль: ")
            val password = readln()
            println(
                when (password) {
                    REGISTERED_USER_PASS -> "Пользователь \"$userName\", вам разрешено " +
                            "входить на борт корабля \"Heart of Gold\""

                    else -> "Пароль неверен. Доступ запрещен."
                }
            )
        }

        else -> println("Пожалуйста зарегистрируйтесь")
    }
}