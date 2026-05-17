package org.example.lesson_13

class PhoneDirectory2(
    val name: String,
    val phoneNumber: Long,
    val company: String?,
)

fun main() {
    val phoneBook: List<PhoneDirectory2> = listOf(
        PhoneDirectory2("Серёга", 89467362374, null),
        PhoneDirectory2("Викторыч", 89457662374, "ООО \"Блат хата\""),
        PhoneDirectory2("Семёныч", 89984783873, "null"),
        PhoneDirectory2("Акимыч", 89564839394, null),
        PhoneDirectory2("Поздняк", 89456784297, "ООО \"Сервелат интернешнал\""),
    )
    println("Список компаний:")
    println(phoneBook.mapNotNull { it.company }.joinToString(", ",postfix = "."))
}