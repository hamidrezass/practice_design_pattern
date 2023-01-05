package com.example.tutorialdp.behaviorals.memento.java.kotlin

class Originator {
    var state:String=""


    fun  CreateMemento() : Memento{
        return Memento(state)
    }

}

class Memento(var state:String) {

}