package com.example.designpaternpractise.structural.decorator
interface MYComponent {
    fun sayHello(): String
}
class ConcreteComponent1 : MYComponent {
    override fun sayHello() = "hello from ${javaClass.simpleName}"
}
// delegating the `Component` interface behavior to the `component` instance passed in constructor
open class MYDecorator(protected val component: MYComponent): MYComponent by component

class Decorator1(component: MYComponent) : MYDecorator(component) {
    // component method overridden by decorator, extending the message
    override fun sayHello() = "${component.sayHello()} and from ${javaClass.simpleName}"
}
// no need to override `sayHello()` every time
// it was "delegated" to the `component` instance from constructor
class Decorator2(component: MYComponent) : MYDecorator(component)

fun main() {
    val first: MYComponent = ConcreteComponent1()
    val decOne: MYComponent = Decorator1(first)
    val decTwo: MYComponent = Decorator2(decOne)
    println(first.sayHello())  // hello from ConcreteComponent1
    println(decOne.sayHello()) // hello from ConcreteComponent1 and from Decorator1
    println(decTwo.sayHello()) // hello from ConcreteComponent1 and from Decorator1 and from Decorator2
}