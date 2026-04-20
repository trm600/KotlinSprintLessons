package org.example.lesson_8

fun main() {
    val ingredientsList = arrayOf("селёдка", "лук", "картофель", "морковь", "яйцо", "свекла", "майонез")

    println("Список ингредиентов: ${formatString(ingredientsList)}")
    println("Введите название заменяемого ингредиента: ")
    val ingredient = readln().lowercase()
    val ingredientIndex = ingredientsList.indexOf(ingredient)
    if (ingredientIndex >= 0) {
        println("Введите ингредиент для замены: ")
        ingredientsList[ingredientIndex] = readln().lowercase()
        println("Готово! Вы сохранили следующий список: ${formatString(ingredientsList)}")
    } else {
        println("Такого ингредиента в рецепте нет")
    }
}

fun formatString(list: Array<String>): String {
    return "[${list.joinToString("_")}]"
}