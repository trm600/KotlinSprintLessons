package org.example.lesson_9

fun main() {
    val ingredientsList = listOf("селёдка", "лук", "картофель", "морковь", "яйцо", "свекла", "майонез")

    println("В рецепте есть следующие ингредиенты: [${ingredientsList.joinToString("_")}]")
    ingredientsList.forEach { println(it) }
}