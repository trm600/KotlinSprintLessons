package org.example.lesson_19

enum class Fish(val type: String) {

    GUPPY("Гуппи"),
    ANGELFISH("Скалярия"),
    GOLDFISH("Золотая рыбка"),
    SIAMESE_FIGHTING_FISH("Петушок")

}

fun main() {

    println(
        "Можно добавить в аквариум следующих рыб: " +
                Fish.entries.joinToString(", ", postfix = ".") { it.type }
    )

}