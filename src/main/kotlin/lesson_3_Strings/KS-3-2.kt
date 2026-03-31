package org.example.lesson_3_Strings

fun main() {
    var secondName = "Андреева"
    val name = "Татьяна"
    val patronymic = "Сергеевна"
    var age = 20

    println("$secondName $name $patronymic, $age")
    secondName = "Сидорова"
    age += 2
    println("$secondName $name $patronymic, $age")
}