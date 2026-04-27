package org.example.lesson_11

class User {
    var id: Int = 0
    var login: String = ""
    var password: String = ""
    var email: String = ""
}

fun main() {
    val sanya = User()
    val roma = User()

    sanya.id = 1
    sanya.login = "sashok123"
    sanya.password = "4krjfddF"
    sanya.email = "sashok123@mail.ru"

    roma.id = 2
    roma.login = "romancapitan"
    roma.password = "fdg43gjFGF"
    roma.email = "romannesashok@mail.ru"

    println("Пользователь ${sanya.id}: Логин: ${sanya.login} Пароль: ${sanya.password} Почта: ${sanya.email}")
    println("Пользователь ${roma.id}: Логин: ${roma.login} Пароль: ${roma.password} Почта: ${roma.email}")
}