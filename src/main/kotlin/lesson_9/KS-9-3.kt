package org.example.lesson_9

fun main() {
    val productsPerServing = listOf(2, 50, 15)

    println("Введите нужное количество порций: ")
    val numberOfServings = readln().toIntOrNull()
    if (numberOfServings != null) {
        val newServingList = productsPerServing.map { it * numberOfServings }
        println(
            "На $numberOfServings порций вам понадобится: Яиц – ${newServingList[0]} шт., " +
                    "молока – ${newServingList[1]} мл., " +
                    "сливочного масла – ${newServingList[2]} гр."
        )
    } else {
        println("Ошибка, вводите целое число.")
    }
}