package com.example.designpaternpractise.behavioral.Observer

interface Subject {

    //attach
    fun subscribe( observer: Observer)
    //detach
    fun unSubscribe(observer: Observer)
    //update
    fun notify1(message:String)
}

interface Observer {
    fun notify111(message: String)
}

class Publisher : Subject {
    private val list = arrayListOf<Observer>()

    override fun subscribe(observer: Observer) {
        list.add(observer)
    }
    override fun unSubscribe(observer: Observer) {
        list.remove(observer)
    }
    override fun notify1(message: String) {
        list.forEach { it.notify111(message) }
    }

}


//subscriber
class TestListener1 : Observer {
    override fun notify111(message: String) {

        println("test 2 notify $message")
    }
}


class TestListener2 : Observer {
    override fun notify111(message: String) {
        println("test 1 notify $message")
    }
}

class TestListener3 : Observer {
    override fun notify111(message: String) {
        println("test 3 notify $message")
    }
}

fun main() {

    val publisher=Publisher()

    val t1=TestListener1()
    val t2=TestListener2()
    val t3=TestListener3()
    publisher.subscribe(t1)
    publisher.subscribe(t2)
    publisher.notify1(" step1111 **** nofity ****")

    publisher.subscribe(t3)
    publisher.notify1(" step2222 **** nofity ****")
    publisher.unSubscribe(t1)

    publisher.notify1("step3333 **** nofity ****")


}