package org.example.lesson_13

class Contact2(
    val name: String,
    val phoneNumber: Long,
    val company: String?,
)

fun main() {
    var phoneInput: Long

    println("Введите номер телефона: ")
    try {
        phoneInput = readln().toLong()
    } catch (e: Exception) {
        println("Ошибка: ${e::class.simpleName}")
        return
    }
    val contact = Contact2(
        name = "Захарыч",
        company = "Google",
        phoneNumber = phoneInput,
    )
}