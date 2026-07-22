package org.example.lesson_20

class Robot {

    val phrases = listOf(
        "Раз два раз два, настройка звука",
        "Любишь кататься, люби себе дальше",
        "Один в сексе не воин",
        "Чёткая фраза",
        "На посошок и на горшок"
    )
    var modify: ((String) -> String) = { it }

    fun setModifier(modifier: (String) -> String) {
        modify = modifier
    }

    fun say() {
        println(modify(phrases.random()))
    }

}

fun main() {

    val robot1 = Robot()

    robot1.say()
    robot1.setModifier { phrase -> phrase.reversed().lowercase().replaceFirstChar { it.uppercase() } }
    robot1.say()

}