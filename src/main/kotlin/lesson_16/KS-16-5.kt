package org.example.lesson_16

class Player private constructor(val name: String, private var health: Int, var impactForce: Int) {
    private var isDeath = false
    var fullHealth = health
        private set

    companion object {
        fun createCharacter(name: String, health: Int, impactForce: Int): Player {
            require(name.isNotBlank()) { "Имя не должно быть пустым" }
            require(health > 0) { "Здоровье должно быть больше нуля" }
            require(impactForce > 0) { "Сила удара должна быть больше нуля" }
            return Player(name.trim(), health, impactForce)
        }
    }

    fun damage(damageForce: Int) {
        if (isDeath) {
            println("Персонаж $name мёртв! Харе месить мертвое тело!")
            return
        }

        health -= damageForce

        if (health <= 0) {
            isDeath = true
            dead()
            println("Персонаж $name погиб!")
        } else {
            println("Персонаж $name получил урон, HP осталось $health")
        }
    }

    fun treat(healAmount: Int) {
        if (isDeath) {
            println("Персонаж $name мёртв! Лечением горю не помочь!")
            return
        }
        if (health < fullHealth) {
            if (health + healAmount <= fullHealth) {
                health += healAmount
            } else {
                health = fullHealth
            }
            println("Персонаж $name сходил к лепиле, HP осталось $health")
        } else {
            println("Персонаж $name в тонусе! Ему не нужно лечение.")
        }
    }

    private fun dead() {
        health = 0
        impactForce = 0
    }
}

fun main() {
    val player = Player.createCharacter("Сабзеро", 120, 25)

    player.treat(10)
    player.damage(15)
    player.damage(25)
    player.treat(5)
    player.damage(20)
    player.damage(20)
    player.treat(30)
    player.damage(30)
    player.damage(50)
    player.damage(40)
    player.damage(20)
    player.damage(10)
    player.damage(32)
    player.treat(30)
    player.treat(2)
}