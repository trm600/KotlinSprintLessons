package org.example.lesson_4_comparison_operators

fun main() {
    val trainingDay = 5
    val isEven = trainingDay % 2 == 0

    println(
        """
        Упражнения для рук: ${!isEven}
        Упражнения для ног: ${isEven}
        Упражнения для спины: ${isEven}
        Упражнения для пресса: ${!isEven}
        """.trimIndent()
    )
}
