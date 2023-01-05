package com.example.designpaternpractise.behavioral.mediator

fun main() {
    val concreateMediator = AbstractImplementation.ConcreateMediator()
    val componentA = AbstractImplementation.ComponentA(concreateMediator)
    val componentB = AbstractImplementation.ComponentB(concreateMediator)
    val componentC = AbstractImplementation.ComponentC(concreateMediator)
    componentA.operator()
    componentB.operator()
    componentC.operator()


}

abstract class AbstractImplementation {
    interface Mediator {
        fun method(sender: Any, args: Any?=null)
    }
    class ComponentA(private val Mediator: Mediator) {

        fun operator() {
            Mediator.method(this, "arg a")
        }
    }

    class ComponentB(private val Mediator: Mediator) {

        fun operator() {
            Mediator.method(this, 10.34F )
        }
    }

    class ComponentC(private val Mediator: Mediator) {
        fun operator() {
            Mediator.method(this, println("sdf"))
        }
    }


    class ConcreateMediator() : Mediator {

        override fun method(sender: Any, args: Any?) {

            when (sender) {
                is ComponentA -> println("args from a is $args")
                is ComponentB -> println("args from b is ${args as Float * 3}")
                is ComponentC -> (args as () -> Any? ).invoke()
               // is ComponentC ->  args?.run
            }
        }

    }

}

