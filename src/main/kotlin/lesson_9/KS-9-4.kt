package org.example.lesson_9

fun main() {
    println("Введите 5 ингредиентов через \", \"(запятая с пробелом)")
    val ingredientsList = readln().split(", ")
    println("Отсортированный список: ${ingredientsList.sorted()}")
}