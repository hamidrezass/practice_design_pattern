package com.example.designpaternpractise.creational.prototype

abstract class MyShape() {
    var x: Int = 0
    var y: Int = 0
    var color: String = ""

    constructor(myShape: MyShape) : this() {
        this.x = myShape.x
        this.y = myShape.y
        this.color = myShape.color
    }
    abstract fun clone(): MyShape
}

class MyCircle : MyShape {
    var radius: Int = 0

    constructor() : super()
    constructor(target: MyCircle) : super(target) {
        this.radius = target.radius
    }

    override fun clone(): MyShape {
        return MyCircle(this)
    }

    override fun equals(object2: Any?): Boolean {
        if (object2 !is MyCircle || super.equals(object2)) return false
        return object2.radius === radius
    }

}

class MyRectangle : MyShape {
    var width: Int = 0
    var height: Int = 0

    constructor() : super()
    constructor(target: MyRectangle) : super(target) {
        this.width=target.width
        this.height=target.height
    }

    override fun clone(): MyShape {
     return MyRectangle(this)
    }

    //todo
//    override fun equals(object2: Any?): Boolean {
//        if (object2 !is MyRectangle || super.equals(object2)) return false
//        val shape2: MyRectangle = object2 as MyRectangle
//        return shape2.width == width && shape2.height == height
//    }
}