package org.example.lesson_8

fun main() {
    val ingredientsList = arrayOf("селёдка", "лук", "картофель", "морковь", "яйцо", "свекла", "майонез")

    println("Введите название искомого ингредиента: ")
    val ingredient = readln().lowercase()
    if (ingredientsList.contains(ingredient)) {
        println("Ингредиент $ingredient в рецепте есть")
    } else {
        println("Такого ингредиента в рецепте нет")
    }
}