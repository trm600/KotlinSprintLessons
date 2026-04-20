package org.example.lesson_9

fun main() {
    val listOfIngredients = mutableListOf("Селёдка", "Лук", "Картофель")

    println("В рецепте есть базовые ингредиенты: ${getString(listOfIngredients)}")
    println("Желаете добавить ещё?")
    val userResponse = readln()
    if (userResponse.equals("да", ignoreCase = true) ) {
        println("Какой ингредиент вы хотите добавить?")
        listOfIngredients.add(readln().replaceFirstChar { it.uppercase() })
        println("Теперь в рецепте есть следующие ингредиенты: ${getString(listOfIngredients)}")
    } else {
        return
    }
}

fun getString(list: List<String>) = list.joinToString(", ")