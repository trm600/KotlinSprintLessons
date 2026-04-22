package org.example.lesson_9

const val INGREDIENTS_QUANTITY = 5

fun main() {
    val ingredientsList = mutableListOf<String>()
    var counter = 1

    println(
        """
         ________________________
        | Введите 5 ингредиентов:|
        |________________________|
    """.trimIndent()
    )
    do {
        print("Введите $counter ингредиент: ")
        val input = readln().lowercase()
        if (input in ingredientsList) {
            println("Такой ингредиент уже был, введите другой.")
            continue
        } else {
            ingredientsList += input
            counter++
        }
    } while (counter <= INGREDIENTS_QUANTITY)
    ingredientsList.sort()
    println("Итоговый список: ${ingredientsList.joinToString(", ", postfix = ".").replaceFirstChar { it.uppercase() }}")
}