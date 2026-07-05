package org.example.lesson_16

class Order(private val orderNumber: Long) {
    var orderStatus = "Принят в работу"
        private set

    private fun changeStatus(newStatus: String) {
        orderStatus = newStatus
    }

    fun manager(setStatus: String) {
        changeStatus(setStatus)
    }
}

fun main() {
    val order = Order(12345678)

    println("Статус: ${order.orderStatus}")
    order.manager("В пути")
    println("Статус: ${order.orderStatus}")
}