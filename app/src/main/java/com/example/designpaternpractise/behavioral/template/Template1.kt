package com.example.designpaternpractise.behavioral.template

abstract class AbstractClass {
    fun templateMethod() {
        println("start")
        primitiveOperation1()
        primitiveOperation2()
        primitiveOperation3() }
    abstract fun primitiveOperation1()
    abstract fun primitiveOperation2()
    private fun primitiveOperation3() {
        println("3333333")
    }

    class ConcreteClassA : AbstractClass() {
        override fun primitiveOperation1() {
            TODO("Not yet implemented")
        }
        override fun primitiveOperation2() {
            TODO("Not yet implemented")
        }


    }
}