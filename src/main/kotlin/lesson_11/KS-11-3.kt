package org.example.lesson_11

class Room(
    val cover: String,
    val roomTheme: String,
    val listOfParticipants: MutableList<Person> = mutableListOf(),
) {
    fun addPerson(person: Person) = listOfParticipants.add(person)

    fun updateStatus(nickname: String, newStatus: String) {
        for (person in listOfParticipants) {
            if (person.nickname == nickname) {
                person.status = newStatus
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

class Person(
    var avatar: String,
    var nickname: String,
    var status: String = "микрофон выключен",
)

fun main() {
    val rockMusicRoom = Room(
        cover = "Обложка \"Картинка пластинки\"",
        roomTheme = "Любители рок музыки",
    )
    val person1 = Person(
        avatar = "Аватар мотоцикл",
        nickname = "semenbIch",
    )
    val person2 = Person(
        avatar = "Аватар огонь",
        nickname = "devidDuhovni",
    )

    rockMusicRoom.addPerson(person1)
    rockMusicRoom.addPerson(person2)
    rockMusicRoom.updateStatus("semenbIch", "разговаривает")
    rockMusicRoom.updateStatus("devidDuhovni", "пользователь заглушен")
    rockMusicRoom.displayRoom()
    rockMusicRoom.longPress(person2)
}