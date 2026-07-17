package org.example.lesson_18

class Circle {

    val name = "Круг"

}

class Square {

    val name = "Квадрат"

}

class Point {

    val name = "Точка"

}

class Screen {

    fun draw(x: Int, y: Int, figureType: Circle) =
        "Нарисована фигура \"${figureType.name}\" в координатах x:y = $x:$y"

    fun draw(x: Float, y: Float, figureType: Circle) =
        "Нарисована фигура \"${figureType.name}\" в координатах x:y = $x:$y"

    fun draw(x: Int, y: Int, figureType: Square) =
        "Нарисована фигура \"${figureType.name}\" в координатах x:y = $x:$y"

    fun draw(x: Float, y: Float, figureType: Square) =
        "Нарисована фигура \"${figureType.name}\" в координатах x:y = $x:$y"

    fun draw(x: Int, y: Int, figureType: Point) =
        "Нарисована фигура \"${figureType.name}\" в координатах x:y = $x:$y"

    fun draw(x: Float, y: Float, figureType: Point) =
        "Нарисована фигура \"${figureType.name}\" в координатах x:y = $x:$y"

}

fun main() {

    val screen = Screen()
    val point = Point()
    val circle = Circle()
    val square = Square()

    println(screen.draw(50, 50, circle))
    println(screen.draw(5.7f, 5.9f, square))
    println(screen.draw(5, 20, point))

}