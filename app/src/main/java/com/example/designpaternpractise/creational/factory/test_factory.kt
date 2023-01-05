package com.example.designpaternpractise.creational.factory

interface Shape {
    fun draw()
}

class Circle : Shape {
    override fun draw() {
        println("Inside Circle::draw() method.");
    }
}

class Square : Shape {
    override fun draw() {
        println("Inside Rectangle::draw() method.");
    }
}


abstract class BaseShapeFactory {
    abstract fun getShape(): Shape

    fun someOtherWork() {
        var shape = getShape()
        shape.draw()
        //some other work
    }
}

class SquareFactory : BaseShapeFactory() {
    override fun getShape(): Shape {
        return Square()
    }
}

class CircleFactory : BaseShapeFactory() {

    override fun getShape(): Shape {
        return Circle()
    }
}

fun main() {
    val shapeFactory: BaseShapeFactory
    shapeFactory = CircleFactory()
    shapeFactory.someOtherWork()
}