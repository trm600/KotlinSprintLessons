package org.example.lesson_21

fun String.vowelCount(): Int {
    val vowels = "аеёиоуыэюяАЕЁИОУЫЭЮЯaeiouAEIOU"
    return count { it in vowels }
}

fun main() {
    println("hello".vowelCount())
}