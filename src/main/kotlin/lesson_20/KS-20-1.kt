package org.example.lesson_20

fun main() {

    val hello: (String) -> String = {username -> "С наступающим Новым Годом, $username!"}

    println(hello("Руслан"))

}