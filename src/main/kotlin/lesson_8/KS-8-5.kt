package org.example.lesson_8

fun main() {
    println("Укажите планируемое количество ингредиентов: ")
    val numberOfIngredients = readln().toInt()
    println("Введите названия ингредиентов: ")
    val arrayOfIngredients = Array(numberOfIngredients) {
        print("Ингредиент № ${it + 1}: ")
        readln().lowercase() }
    println("Список ингредиентов: ${arrayOfIngredients.joinToString(", ")}")
}