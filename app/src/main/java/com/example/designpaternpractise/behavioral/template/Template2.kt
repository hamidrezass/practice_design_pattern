package com.example.designpaternpractise


open class Pizza {

    fun make() {
        makeDough()
        applySauce()
        addIngredients()
        bake()
    }

    open fun bake() {
        println("baking for 20 minutes")
    }

    open fun addIngredients() {
        println("adding cheese")
    }

    open fun applySauce() {
        println("applying tomato sauce")
    }

    open fun makeDough() {
        println("making 30cm dough")
    }

}

class Peperoni : Pizza() {

    override fun addIngredients() {

        println("adding salami")
        println("adding onion")
        println("adding cheese")
    }




}
fun main() {
    Peperoni().make()
   // Pizza.Peperoni().addIngredients()
}


