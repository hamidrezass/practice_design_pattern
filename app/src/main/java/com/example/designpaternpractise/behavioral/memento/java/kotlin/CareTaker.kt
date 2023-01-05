package com.example.tutorialdp.behaviorals.memento.java.kotlin

class CareTaker {

    private val mementoList: ArrayList<Memento> = arrayListOf()

    fun add(memento: Memento) {
        mementoList.add(memento)
    }

    fun get(index: Int): Memento? {
        if (index < mementoList.size) {
            return mementoList[index]
        }
        return null
    }
}