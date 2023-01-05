package com.example.tutorialdp.behaviorals.memento.java.kotlin

import java.sql.DriverManager.println

fun main() {

    val originator = Originator()
    val careTaker = CareTaker()

    originator.state = "state1"
    originator.state = "state2"

    careTaker.add(originator.CreateMemento())


    println("&${careTaker.get(0)}")

    println(originator.state)
}