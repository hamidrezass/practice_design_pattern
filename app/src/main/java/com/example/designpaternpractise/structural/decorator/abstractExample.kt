package com.example.designpaternpractise.structural.decorator

interface Component {
    fun methodA()
    fun methodB()
}
class ConcreteComponent : Component {
    override fun methodA() {}
    override fun methodB() {}
}
// Decorator `is-a` Component and `has-a` Component
// field `component` is `protected` which makes it available to inheriting classes
abstract class Decorator(protected val component: Component) : Component

// concrete `Decorator` implementation with forced constructor
// requiring the `Component` instance
class ConcreteDecorator1(component: Component) : Decorator(component) {
    override fun methodA() = component.methodA()
    override fun methodB() = component.methodB()
}

class ConcreteDecorator2(component: Component) : Decorator(component) {
    override fun methodA(){
        throw Exception("you can't do this")
    }
    override fun methodB(){
        println("running methodB")
        component.methodB()
    }
}

fun main(){
    val component: Component = ConcreteComponent()
    val dec1: Component = ConcreteDecorator1(component)
    val dec2: Component = ConcreteDecorator2(dec1)
}
