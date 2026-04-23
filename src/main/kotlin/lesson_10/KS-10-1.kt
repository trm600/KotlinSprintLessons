package org.example.lesson_10

fun main() {
    val rollPc = rollTheDice()

    println("Бросок компа, выпало: $rollPc")
    val rollHuman = rollTheDice()

    println("Бросок кожаного, выпало: $rollHuman")
    println(
        when {
            rollPc > rollHuman -> "Терминатор победил!"
            rollPc < rollHuman -> "Сопротивление победило =)!"
            rollPc == rollHuman -> "Силы равны!"
            else -> return
        }
    )
}

fun rollTheDice() = (1..6).random()