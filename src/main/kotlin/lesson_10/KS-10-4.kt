package org.example.lesson_10

const val SIDES_DICE = 12

fun main() {
    var humanVictories = 0
    var response: String

    do {
        if (makeThrow(sidesDice = SIDES_DICE))
            humanVictories++
        println("Хотите бросить кости еще раз? Введите Да или Нет")
        response = readln().lowercase()
    } while (response != "нет")
    println("Кожаный выиграл $humanVictories партий.")
}

fun rollDice(sides: Int = 6) = (1..sides).random()

fun makeThrow(sidesDice: Int): Boolean {
    val rollPc = rollDice(sides = sidesDice)
    println("Бросок компа, выпало: $rollPc")
    val rollHuman = rollDice(sides = sidesDice)
    println("Бросок кожаного, выпало: $rollHuman")
    return when {
        rollPc > rollHuman -> {
            println("Терминатор победил!")
            false
        }

        rollPc < rollHuman -> {
            println("Сопротивление победило =)!")
            true
        }

        rollPc == rollHuman -> {
            println("Силы равны!")
            false
        }

        else -> {
            false
        }
    }
}
