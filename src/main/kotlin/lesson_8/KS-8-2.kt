package org.example.lesson_8

fun main() {
    val ingredientsList = arrayOf("Селёдка", "Лук", "Картофель", "Морковь", "Яйцо", "Свекла", "Майонез")

    println("Введите название искомого ингредиента: ")
    val ingredient = readln()
    for (item in ingredientsList) {
        if (item.lowercase() == ingredient.lowercase()) {
            println("Ингредиент $item в рецепте есть")
            return
        }
    }
    println("Такого ингредиента в рецепте нет")
}