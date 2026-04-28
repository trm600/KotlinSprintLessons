package org.example.lesson_11

class Room {
    var cover: String = "пикча"
    var roomTheme: String = ""
    val listOfParticipants: MutableList<Person> = mutableListOf()

    fun addPerson(person: Person) = listOfParticipants.add(person)

    fun updateStatus(person: Person, newStatus: String) {
        val userIndex = listOfParticipants.indexOf(person)
        if (userIndex != -1) {
            listOfParticipants[userIndex].status = newStatus
        }
    }

    fun displayRoom() {
        println("$cover : $roomTheme")
        for (person in listOfParticipants) {
            println("${person.avatar} : ${person.status}")
        }
    }

    fun longPress(person: Person) {
        println("Длинное нажатие на аватар участника: ${person.avatar}")
        val answer: String = readln().lowercase()
        if (answer == "да") {
            println(person.nickname)
        }
    }
}

class Person {
    var avatar: String = "аватарка"
    var nickname: String = ""
    var status: String = "микрофон выключен"
}

fun main() {
    val rockMusicRoom = Room()
    val person1 = Person()
    val person2 = Person()

    rockMusicRoom.cover = "Обложка \"Картинка пластинки\""
    rockMusicRoom.roomTheme = "Любители рок музыки"
    person1.avatar = "Аватар мотоцикл"
    person1.nickname = "semenbIch"
    person2.avatar = "Аватар огонь"
    person2.nickname = "devidDuhovni"
    rockMusicRoom.addPerson(person1)
    rockMusicRoom.addPerson(person2)
    rockMusicRoom.updateStatus(person1, "разговаривает")
    rockMusicRoom.updateStatus(person2, "пользователь заглушен")
    rockMusicRoom.displayRoom()
    rockMusicRoom.longPress(person2)
}