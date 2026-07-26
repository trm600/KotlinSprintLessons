package org.example.lesson_21

fun Map<String, Int>.maxCategory() : String {

    val maxPoints = maxByOrNull { it.value }
    return maxPoints?.key ?: ""

}

fun main() {

    val scores = mapOf(
        "Cила" to 85,
        "Ловкость" to 92,
        "Скрытность" to 78,
        "Выносливость" to 95,
        "Красноречие" to 95,

    )

    println(scores.maxCategory())

}
