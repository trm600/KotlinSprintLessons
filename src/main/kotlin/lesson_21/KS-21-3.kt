package org.example.lesson_21

class Player(val name: String, var currentHealth: Int, val maxHealth: Int)

fun Player.isHealthy() : Boolean = currentHealth == maxHealth

fun main() {

    val player1 = Player(name = "Alice", currentHealth = 20, maxHealth = 100)
    val player2 = Player(name = "Frimen", currentHealth = 100, maxHealth = 100)

    println(player1.isHealthy())
    println(player2.isHealthy())

}