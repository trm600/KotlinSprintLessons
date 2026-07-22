package org.example.lesson_20

fun main() {

    val elements = listOf("1", "2", "3", "4", "5", "6", "7", "8", "9")
    val lambdaElements: List<() -> Unit> = elements.map { { println("Нажат элемент $it") } }

    for ((index, element) in lambdaElements.withIndex()) {
        if ((index + 1) % 2 == 0) {
            element()
        }
    }

}