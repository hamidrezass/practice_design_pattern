package com.example.designpaternpractise.structural.adapter
data class Item(val name: String)

// and we have this interface in our system
interface PrettyPrintableItem {
    fun prettyPrint(): String
}
// Adapter/Wrapper providing `PrettyPrintableItem` functionality for the `Item` object
class ItemAdapter(private val item: Item) : PrettyPrintableItem {
    override fun prettyPrint(): String {
        return "hello, my name is: ${item.name}"
    }
}

// usage
fun main() {
    // list of items returned from 3rd party lib, that we want to "pretty print"
    val list: List<Item> = listOf(
        Item("Adam"),
        Item("Not Adam"),
        Item("Adam Maybe"),
        Item("Yes"),
    )

    list.forEach {
        // adapting item
        val adapted = ItemAdapter(it)
        println(adapted.prettyPrint())
    }
}