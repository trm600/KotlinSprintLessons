package org.example.lesson_11

class Forum(
    val participants: MutableList<ForumParticipant> = mutableListOf(),
    val messages: MutableList<ForumMessage> = mutableListOf(),
) {
    var id = 1

    fun createNewUser(userName: String): ForumParticipant {
        val newUser = ForumParticipant(id++, userName)
        participants.add(newUser)
        return newUser
    }

    fun createNewMessage(userId: Int): ForumMessage? {
        for (person in participants) {
            if (person.userId == userId) {
                println("Пользователь ${person.userName} пишет сообщение: ")
                val post = ForumMessage(userId, readln())
                messages.add(post)
                return post
            }
        }
        return null
    }

    fun printThread() {
        for (message in messages) {
            for (person in participants) {
                if (message.userId == person.userId) {
                    println("${person.userName}: ${message.message}")
                }
            }
        }
    }
}

class ForumParticipant(
    val userId: Int,
    val userName: String,
)

class ForumMessage(
    val userId: Int,
    val message: String,
)

fun main() {
    val forum = Forum()
    forum.createNewUser("test1")
    forum.createNewUser("test2")
    forum.createNewMessage(1)
    forum.createNewMessage(1)
    forum.createNewMessage(2)
    forum.createNewMessage(2)
    forum.printThread()
}