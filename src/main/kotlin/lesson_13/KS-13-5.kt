package org.example.lesson_13

class Contact2(
    val name: String,
    val phoneNumber: Long,
    val company: String?,
)

fun main() {


    println("Введите номер телефона: ")
    val phoneInput: Long = try {
        readln().toLong()
    } catch (e: NumberFormatException) {
        println("Ошибка: ${e::class.simpleName}")
        return
    }
    val contact = Contact2(
        name = "Захарыч",
        company = "Google",
        phoneNumber = phoneInput,
    )
}