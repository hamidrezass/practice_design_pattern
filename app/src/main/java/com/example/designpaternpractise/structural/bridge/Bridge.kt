package com.example.designpaternpractise.structural.bridge

fun main() {

    val rec = Rectangel(red())
    rec.applyColor()

    val circle = Circle(Blue())
    circle.applyColor()
}

abstract class Shape {

    //Composition - implementor
    open var color: Color? = null
    abstract fun applyColor()
}

interface Color {
    fun aplyColor();
}

class red : Color {
    override fun aplyColor() {
        print("red color")
    }

}

class Blue : Color {
    override fun aplyColor() {
        print("blue color")
    }

}

class Rectangel(override var color: Color?) : Shape() {
    override fun applyColor() {
        print("\n Triangle filled with color ")
        color?.aplyColor()
    }


}

class Circle(override var color: Color?) : Shape() {
    override fun applyColor() {
        print("\n Circle filled with color ");
        color?.aplyColor()
    }

}