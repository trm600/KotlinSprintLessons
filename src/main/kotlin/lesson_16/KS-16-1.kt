package org.example.lesson_16

const val SIDES = 6

class Dice {
    private val roll: Int = (1..SIDES).random()

    fun checkRoll() {
        println("Выпало число: $roll")
    }
}

fun main() {
    val d = Dice()
    d.checkRoll()
}