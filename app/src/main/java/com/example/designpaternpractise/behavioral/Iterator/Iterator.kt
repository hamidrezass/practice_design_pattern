package com.example.designpaternpractise.behavioral.Iterator

interface Iterator {

    fun hasNext(): Boolean
    fun next(): Any?
}

interface Container {

    fun getIterator(): Iterator
}

class NameRepository : Container {

    private var myList = arrayListOf<String>(
        "ali", "hamid", "reza", "hossein",
        "javad", "mahdi"
    )

    override fun getIterator(): Iterator {

        return NameIterator()
    }

    private inner class NameIterator : Iterator {
        private var position = 0

        override fun hasNext(): Boolean {
            if (position < myList.size) {
                return true
            }
            return false
        }

        override fun next(): Any? {
            if (hasNext()) {
                return myList[position++]
            }
            return null
        }

    }


}

fun main() {

    val iterator  = NameRepository().getIterator()
    while (iterator.hasNext()){
        println(iterator.next())
    }
}