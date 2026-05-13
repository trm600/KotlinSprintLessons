package org.example.lesson_13

class PhoneDirectory1(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null,
) {
    fun printInfo() {
        println("Имя: $name\nНомер: $phoneNumber\nКомпания: ${company ?: "<не указано>"}")
    }
}

fun main() {
    val subscriber = PhoneDirectory1(
        name = "Васёк",
        phoneNumber = 89996123456,
    )
    subscriber.printInfo()
}