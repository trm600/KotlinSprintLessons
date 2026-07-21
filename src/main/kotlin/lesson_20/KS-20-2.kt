package org.example.lesson_20

class Character(val name: String, var currentHealth: Int, val maxHealth: Int)

val pickUpHealingPotion: (Character) -> Unit = { character ->
    println("${character.name} захавал хилку!")
    character.currentHealth = character.maxHealth }

fun main() {

    val character1 = Character(name = "Alice", currentHealth = 20, maxHealth = 100)

    println("Текущее здоровье: ${character1.currentHealth}")
    pickUpHealingPotion(character1)
    println("Текущее здоровье: ${character1.currentHealth}")

}