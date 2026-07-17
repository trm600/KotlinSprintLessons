package org.example.lesson_18

abstract class Parcel {

    abstract fun surfaceArea(): Double

}

class RectangularParcel(val length: Double, val width: Double, val height: Double): Parcel() {

    override fun surfaceArea() = 2 * (length * width + length * height + width * height)

}

class CubeParcel(val edge: Double) : Parcel() {

    override fun surfaceArea(): Double = 6 * (edge * edge)

}

