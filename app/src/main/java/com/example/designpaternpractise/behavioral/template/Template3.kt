package com.example.designpaternpractise.behavioral.template

abstract class Pizza(
    private val makeDough: () -> Unit = {
        println("making 30cm dough")
    },
    private val applySauce: () -> Unit = {
        println("applying tomato sauce")
    },
    private val addIngredients: () -> Unit = {
        println("adding cheese")
    },
    private val bake: () -> Unit = {
        println("baking for 20 minutes")
    }
){
     fun make(){
        makeDough()
        applySauce()
        addIngredients()
        bake()
    }

    class Peperoni : Pizza(addIngredients = {
        println("ffdsfdf")
    },applySauce = {

        println("df dfdf")
    }){




    }
}