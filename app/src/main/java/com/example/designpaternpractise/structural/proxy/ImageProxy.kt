package com.example.designpaternpractise.structural.proxy

interface Image {
    fun display()
}

class RealImage(private val fileName: String) : Image {
    init {
        loadFromDisk(fileName)
    }

    override fun display() {
        println("Displaying $fileName")
    }

    private fun loadFromDisk(fileName: String) {
        println("Loading $fileName")
    }

}

class ProxyImage(private val fileName: String) : Image {
    private var realImage: RealImage? = null
    override fun display() {
        if (realImage == null) {
            realImage = RealImage(fileName)
        }
        realImage!!.display()
    }
}

fun main(args: Array<String>) {
    val image: Image = ProxyImage("test_10mb.jpg")
    //image will be loaded from disk
    image.display()
    println("")
    //image will not be loaded from disk
    image.display()
}

