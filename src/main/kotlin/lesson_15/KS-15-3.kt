package org.example.lesson_15

abstract class ForumMember(val name: String) {
    abstract fun readMessage()

    abstract fun writeMessage()
}

interface Moderation {
    fun deleteMessage()

    fun deleteUser()
}

class User(name: String) : ForumMember(name) {
    override fun readMessage() {
        println("Пользователь $name читает сообщение")
    }

    override fun writeMessage() {
        println("Пользователь $name пишет сообщение")
    }
}

class Administrator(name: String) : ForumMember(name), Moderation {
    override fun readMessage() {
        println("Администратор $name читает сообщение")
    }

    override fun writeMessage() {
        println("Администратор $name пишет сообщение")
    }

    override fun deleteMessage() {
        println("Администратор $name удалил сообщение")
    }

    override fun deleteUser() {
        println("Администратор $name удалил пользователя")
    }
}

fun main() {
    val user = User("Dimon")
    val admin = Administrator("Serega")

    user.readMessage()
    user.writeMessage()
    admin.readMessage()
    admin.writeMessage()
    admin.deleteMessage()
    admin.deleteUser()
}