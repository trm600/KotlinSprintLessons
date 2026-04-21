package org.example.lesson_9

fun main() {
    val productsPerServing = mutableListOf(2, 50, 15)

    println("Введите нужное количество порций: ")
    val numberOfServings = readln().toIntOrNull()
    if (numberOfServings != null) {
        for (index in productsPerServing.indices) {
            productsPerServing[index] *= numberOfServings
        }
        println(
            "На $numberOfServings порций вам понадобится: Яиц – ${productsPerServing[0]}шт., " +
                    "молока – ${productsPerServing[1]}мл., " +
                    "сливочного масла – ${productsPerServing[2]}гр."
        )
    } else {
        println("Ошибка, введите целое число.")
    }
}