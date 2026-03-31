package org.example.lesson_3_Strings

const val DAY_HI = "Добрый день! "
const val EVENING_HI = "Добрый вечер! "
fun main() {
    val userName = "Порфирий"
    var helloSay = DAY_HI + userName
    println(helloSay)
    helloSay = EVENING_HI + userName
    println(helloSay)
}