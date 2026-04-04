package org.example.lesson_4_comparison_operators

fun main() {
    var tranningDay = 6

    println(
        """
        Упражнения для рук: ${tranningDay % 2 == 1}
        Упражнения для ног: ${tranningDay % 2 == 0}
        Упражнения для спины: ${tranningDay % 2 == 0}
        Упражнения для пресса: ${tranningDay % 2 == 1}
        """.trimIndent()
    )
}
