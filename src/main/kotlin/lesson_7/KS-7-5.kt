package org.example.lesson_7

fun main() {
    val lowercase = 'a'..'z'
    val uppercase = 'A'..'Z'
    val numbers = '0'..'9'
    val options = mutableListOf(1, 2, 3)
    var password = ""
    var passwordLen: Int

    do {
        println("Введите длину пароля, пароль не может быть меньше 6 символов: ")
        passwordLen = readln().toInt()
    } while (passwordLen < 6)

    for (i in passwordLen downTo 1) {
        if (options.isEmpty()) {
            options.addAll(listOf(1, 2, 3))
        }
        val option = options[options.indices.random()]
        options.removeAt(options.indexOf(option))
        password += when (option) {
            1 -> lowercase.random()
            2 -> uppercase.random()
            3 -> numbers.random()
            else -> return
        }
    }
    println(password)
}
