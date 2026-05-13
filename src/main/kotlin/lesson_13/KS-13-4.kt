package org.example.lesson_13

class PhoneDirectory4(
    val name: String,
    val phoneNumber: Long,
    val company: String?,
) {
    fun printInfo(index: Int) {
        println(
            """
            |Контакт ${index + 1}:
            |______________________________
            |Имя: ${name}
            |Телефон: ${phoneNumber}
            |Компания: ${company ?: "<Не заполнена>"}
            |
            """.trimMargin()
        )
    }
}

fun main() {
    val phoneBook: MutableList<PhoneDirectory4> = mutableListOf()
    var answer = 1

    while (answer == 1) {
        println("Введите данные контакта №${phoneBook.size + 1}:")
        print("Введите имя: ")
        val name = readln().replaceFirstChar { it.uppercase() }

        print("Введите номер телефона: ")
        val phoneNumber = readln().toLongOrNull()
        val isNullPhone = phoneNumber == null
        if (isNullPhone) {
            println("\nВведен некорректный номер телефона, запись не будет добавлена\n")
            continue
        }

        print("Введите название компании: ")
        val companyInput = readln()
        val company = if (companyInput.isEmpty()) {
            null
        } else {
            companyInput.replaceFirstChar { it.uppercase() }
        }

        phoneBook.add(
            PhoneDirectory4(
                name = name,
                phoneNumber = phoneNumber,
                company = company,
            )
        )

        println("\nДобавить ещё запись? 1 - да")
        if (readln().toIntOrNull() != 1) {
            answer = 0
        }
    }

    phoneBook.forEachIndexed { index, contact ->
        contact.printInfo(index)
    }
}