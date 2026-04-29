package org.example.lesson_11

class Room {
    var cover: String = "пикча"
    var roomTheme: String = ""
    val listOfParticipants: MutableList<Person> = mutableListOf()

    fun addPerson(person: Person) = listOfParticipants.add(person)

    fun updateStatus(nickname: String, newStatus: String) {
        if (listOfParticipants.isNotEmpty()) {
            for (person in listOfParticipants) {
                if (person.nickname == nickname) {
                    person.status = newStatus
                }
            }

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
    rockMusicRoom.updateStatus("semenbIch", "разговаривает")
    rockMusicRoom.updateStatus("devidDuhovni", "пользователь заглушен")
    rockMusicRoom.displayRoom()
    rockMusicRoom.longPress(person2)
}