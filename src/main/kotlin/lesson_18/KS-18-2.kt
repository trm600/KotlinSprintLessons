package org.example.lesson_18

open class Dice(private val numberOfFaces: Int) {

    open fun rollDice() {
        println("The number dropped: ${(1..numberOfFaces).random()}")
    }

}

class DiceFour : Dice(4)

class DiceSix : Dice(6)

class DiceEight : Dice(8)

fun main() {

    val dices = listOf<Dice>(DiceSix(), DiceFour(), DiceEight(), DiceEight(), DiceFour(), DiceEight(), DiceSix())

    dices.forEach { it.rollDice() }

}