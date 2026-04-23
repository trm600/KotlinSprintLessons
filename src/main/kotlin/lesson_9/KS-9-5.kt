package org.example.lesson_9

const val INGREDIENTS_QUANTITY = 5

fun main() {
    println(
        """
         ________________________
        | Введите $INGREDIENTS_QUANTITY ингредиентов:|
        |________________________|
    """.trimIndent()
    )
    val ingredientsList = List(INGREDIENTS_QUANTITY) {
        print("Введите ${it + 1} ингредиент: ")
        readln().lowercase()
    }

    val ingredientsSet = ingredientsList
        .sorted()
        .toSet()
    println(
        "Итоговый список: ${
            ingredientsSet
                .joinToString(", ", postfix = ".")
                .replaceFirstChar { it.uppercase() }
        }"
    )
}