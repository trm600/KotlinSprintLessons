package org.example.lesson_8

fun main() {
    val ingredientsList = arrayOf("селёдка", "лук", "картофель", "морковь", "яйцо", "свекла", "майонез")

    println("Список ингредиентов: ${formatString(ingredientsList)}")
    println("Введите название заменяемого ингредиента: ")
    val ingredient = readln().lowercase()
    if (ingredientsList.contains(ingredient)) {
        println("Введите ингредиент для замены: ")
        val newIngredient = readln().lowercase()
        ingredientsList[ingredientsList.indexOf(ingredient)] = newIngredient
        println("Готово! Вы сохранили следующий список: ${formatString(ingredientsList)}")
    } else {
        println("Такого ингредиента в рецепте нет")
    }
}

fun formatString(list: Array<String>): String {
    return "[${list.joinToString("_")}]"
}