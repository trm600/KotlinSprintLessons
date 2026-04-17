package org.example.lesson_7

const val MINIMUM_PASSWORD_LENGTH = 6

fun main() {
    val lowercase = 'a'..'z'
    val uppercase = 'A'..'Z'
    val numbers = '0'..'9'
    val allChars = lowercase + numbers + uppercase
    val password = mutableListOf<Char>()
    var passwordLen: Int

    do {
        println("Введите длину пароля, пароль не может быть меньше $MINIMUM_PASSWORD_LENGTH символов: ")
        passwordLen = readln().toInt()
    } while (passwordLen < MINIMUM_PASSWORD_LENGTH)
    password.add(lowercase.random())
    password.add(uppercase.random())
    password.add(numbers.random())

    for (i in passwordLen downTo 4) {
        password.add(allChars.random())
    }

    password.shuffle()
    val finalPassword = password.joinToString("")
    println(finalPassword)
}
