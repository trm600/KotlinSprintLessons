package org.example.lesson_13

class PhoneDirectory1(
    val name: String,
    val phoneNumber: Long,
    val company: String?,
) {
    fun infoPrint() {
        println("Имя: $name\n" + "Номер: $phoneNumber\n" + "Компания: ${company ?: "<не указано>"}")
    }
}

fun main() {
    val subscriber = PhoneDirectory1(
        name = "Васёк",
        phoneNumber = 89996123456,
        company = null
    )
    subscriber.infoPrint()
}