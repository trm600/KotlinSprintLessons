package org.example.lesson_17

class User(login: String, password: String) {
    var password = password
        set(value) {
            println("Вы не можете изменить пароль")
        }
        get() {
            return "*".repeat(field.length)
        }

    var login = login
        set(value) {
            field = value
            println("Логин успешно изменён на $value")
        }
}

fun main() {
    val admin = User("root", "6zvezd")
    admin.login = "noob"
    admin.password = "bezzvezd"
    println(admin.password)
}