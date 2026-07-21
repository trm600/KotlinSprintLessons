package org.example.lesson_19

enum class Gender(val rusName: String) {

    MALE("мужской"),
    FEMALE("женский");

}

class Human private constructor(val name: String, val gender: Gender) {

    companion object {

        fun addPerson(peopleName: String, peopleGender: String): Human {

            require(peopleName.isNotBlank()) { "Имя не может быть пустым! Повторите ввод!\n" }
            require(peopleGender.isNotBlank()) { "Пол не может быть пустым! Повторите ввод!\n" }
            require(peopleGender == "муж" || peopleGender == "жен") {
                "Введен некорректный пол!" +
                        "Повторите ввод!\n"
            }

            fun checkGender(): Gender {
                return if (peopleGender == "муж") {
                    Gender.MALE
                } else {
                    Gender.FEMALE
                }
            }

            return Human(name = peopleName, gender = checkGender())

        }
    }

}

fun main() {

    val cardIndex = mutableListOf<Human>()
    println("Доступны мужской и женский пол. Пол вводить в формате:\nмуж - мужской\nжен - женский\n")

    while (cardIndex.size < 5) {
        println("Введите имя человека: ")
        val name = readln().replaceFirstChar { it.uppercase() }.trim()
        println("Введите пол человека: ")
        val gender = readln().lowercase().trim()
        println()

        try {
            cardIndex.add(Human.addPerson(name, gender))
        } catch (e: IllegalArgumentException) {
            println(e.message)
        }

    }

    cardIndex.forEach { people ->
        println("${people.name} пол ${people.gender.rusName}.")
    }

}