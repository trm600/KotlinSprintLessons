package org.example.lesson_11

class Forum {
    private val participants: MutableList<ForumParticipant> = mutableListOf()
    private val messages: MutableList<ForumMessage> = mutableListOf()
    private var id = 1

    fun createNewUser(userName: String): ForumParticipant {
        val newUser = ForumParticipant(id++, userName)
        participants.add(newUser)
        return newUser
    }

    fun createNewMessage(userId: Int, message: String): ForumMessage? {
        for (person in participants) {
            if (person.userId == userId) {
                val post = ForumMessage(userId, message)
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
    forum.createNewUser("Семёныч")
    forum.createNewUser("Викторыч")
    forum.createNewMessage(1, message = "test message1 Семёныча")
    forum.createNewMessage(1, message = "test message2 Семёныча")
    forum.createNewMessage(2, message = "test message1 Викторыча")
    forum.createNewMessage(2, message = "test message2 Викторыча")
    forum.printThread()
}