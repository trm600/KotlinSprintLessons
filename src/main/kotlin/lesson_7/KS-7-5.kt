package org.example.lesson_7

const val MINIMUM_PASSWORD_LENGTH = 6

fun main() {
    val lowercase = 'a'..'z'
    val uppercase = 'A'..'Z'
    val numbers = '0'..'9'
    val options = mutableListOf(1, 2, 3)
    val password = mutableListOf<Char>()
    var finalPassword = ""
    var passwordLen: Int

    do {
        println("Введите длину пароля, пароль не может быть меньше $MINIMUM_PASSWORD_LENGTH символов: ")
        passwordLen = readln().toInt()
    } while (passwordLen < MINIMUM_PASSWORD_LENGTH)
    password.add(lowercase.random())
    password.add(uppercase.random())
    password.add(numbers.random())

    for (i in passwordLen downTo 4) {
        val option = options[options.indices.random()]
        password.add(
            when (option) {
                1 -> lowercase.random()
                2 -> uppercase.random()
                3 -> numbers.random()
                else -> return
            }
        )
    }

    do {
        val index = password.indices.random()
        finalPassword += password[index]
        password.removeAt(index)
    } while (password.isNotEmpty())

    println(finalPassword)
}
