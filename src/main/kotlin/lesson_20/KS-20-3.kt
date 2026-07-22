package org.example.lesson_20

class Gamer(val haveKey: Boolean)

val checkKey: (Gamer) -> String = { gamer ->
    if (gamer.haveKey) "Игрок открыл дверь" else "Дверь заперта"
}

fun main() {

    val gamer1 = Gamer(false)
    val gamer2 = Gamer(true)

    println(checkKey(gamer1))
    println(checkKey(gamer2))

}

