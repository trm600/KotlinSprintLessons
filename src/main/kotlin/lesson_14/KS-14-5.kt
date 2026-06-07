package org.example.lesson_14

class Chat() {
    var id: Long = 0
    val messages = mutableListOf<Message>()

    fun addMessage(text: String, author: String) {
        messages.add(Message(message = text, author = author, id = ++id))
    }

    fun addThreadMessage(text: String, author: String, parentMessageId: Long) {
        messages.add(ChildMessage(message = text, author = author, id = ++id, parentMessageId = parentMessageId))
    }
}

open class Message(
    val message: String,
    val author: String,
    val id: Long,
)

class ChildMessage(
    message: String,
    author: String,
    id: Long,
    val parentMessageId: Long,
) : Message(message, author, id)

fun printChat(chat: Chat) {
    val groups = chat.messages.groupBy { message ->
        if (message is ChildMessage) {
            message.parentMessageId
        } else {
            message.id
        }
    }

    for ((id, messages) in groups) {
        val parent = messages.first { it.id == id && it !is ChildMessage }
        val children = messages.filterIsInstance<ChildMessage>()

        println("${parent.author} написал:")
        println(parent.message)
        println("---------------------------")

        for (child in children) {
            println("\t${child.author} ответил:")
            println("\t${child.message}")
            println("\t---------------------------")
        }
    }
}

fun main() {
    val chat = Chat()

    chat.addMessage("Ололошка", "Dimon")
    chat.addMessage("ololoshka2", "Masha")
    chat.addMessage("test3", "Stepan")
    chat.addMessage("test4", "Martine")
    chat.addMessage("test5", "Mateful")
    chat.addThreadMessage("ответ -test6", "Mateful", 2)
    chat.addThreadMessage("ответ - test7", "Henry", 2)
    chat.addMessage("dsfsdf", "Masha")
    chat.addThreadMessage("привет ответ", "Masha", 4)
    printChat(chat)
}
