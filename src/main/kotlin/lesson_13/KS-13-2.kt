package org.example.lesson_13

class Contact(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null,
) {
    fun printInfo() {
        println("Имя: $name\nНомер: $phoneNumber\nКомпания: ${company ?: "<не указано>"}")
    }
}

fun main() {
    val subscriber = Contact(
        name = "Васёк",
        phoneNumber = 89996123456,
    )
    subscriber.printInfo()
}