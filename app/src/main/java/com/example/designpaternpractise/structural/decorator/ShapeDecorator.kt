package com.example.designpaternpractise.structural.decorator

fun main() {
    val circle = Circle()
    val redCircle = RedShapeDecorator(Circle())
    val redRectanle = RedShapeDecorator(Rectanle())

    println("///////")
    circle.draw()
    println("///////")
    redCircle.draw()
    println("///////")
    redRectanle.draw()

}

interface Shape {
    fun draw()
}

class Circle : Shape {
    override fun draw() {
        println("in circle draw")
    }
}

class Rectanle : Shape {
    override fun draw() {
        println("in rectangle draw")
    }
}
open class ShapeDecorator(var shape: Shape) : Shape {
    override fun draw() {
        shape.draw()
    }
}

class RedShapeDecorator(shape: Shape) : ShapeDecorator(shape) {
    override fun draw() {
        super.draw()
        setRedBorder(shape)
    }

    fun setRedBorder(shape: Shape) {
        println("Border Color: Red");
    }
}