package org.example.lesson_16

class Order(private val orderNumber: Long) {
    var orderStatus = "Принят в работу"
    private set

    internal fun changeStatus(newStatus: String) {
        orderStatus = newStatus
    }
}

fun manager(order: Order, setStatus: String) {
    order.changeStatus(setStatus)
}

fun main() {
    val order = Order(12345678)

    println("Статус: ${order.orderStatus}")
    manager(order, "В пути")
    println("Статус: ${order.orderStatus}")
}