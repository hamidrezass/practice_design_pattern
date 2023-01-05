package com.example.designpaternpractise.structural.flyWeight

import java.util.*
import kotlin.collections.HashMap

interface Shape {
    fun draw()
}
class Circle(private val color: String) : Shape {
    var x = 0
    var y = 0
    var radius = 0
    override fun draw() {
        println("Circle: Draw() [Color : $color, x : $x, y :$y, radius :$radius")
    }
}

class ShapeFactory {
    companion object {
        private val circleMap: HashMap<String, Circle> = HashMap()
    }

    fun getCricle(color: String): Shape {
        var circle = circleMap[color]
        if (circle == null) {
            circle = Circle(color)
            circleMap[color] = circle
            println("Creating circle of color : $color");
        }
        return circle
    }
}


fun main() {
    val colors = arrayOf("Red", "Green", "Blue", "White", "Black")
    for (i in 1..20) {
        val circle: Circle = ShapeFactory().getCricle(getRandomColor(colors)) as Circle
        circle.x = getRandomX()
        circle.y = getRandomY()
        circle.radius = 100
        circle.draw();
    }
}
fun getRandomColor(colors:Array<String>): String {
    return colors[(Math.random() * colors.size).toInt()]
}

fun getRandomY(): Int {
    return Random().nextInt(100)
}

fun getRandomX(): Int {
    return Random().nextInt(100)
}



