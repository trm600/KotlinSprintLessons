package org.example.lesson_9

fun main() {
    var ingredientsList: List<String>

    do {
        println("Введите 5 ингредиентов через \", \"(запятая с пробелом)")
        ingredientsList = readln().split(", ")
    } while (ingredientsList.size != 5)
        println("Отсортированный список: ${ingredientsList.sorted().joinToString(", ")}")
}