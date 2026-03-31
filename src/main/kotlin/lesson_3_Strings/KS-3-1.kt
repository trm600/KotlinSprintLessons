package org.example.lesson_3_Strings

fun main() {
    val dayHi = "Добрый день"
    val eveningHi = "Добрый вечер"
    val userName = "Порфирий"
    var helloSay = "$dayHi! $userName"
    println(helloSay)
    helloSay = "$eveningHi! $userName"
    println(helloSay)
}