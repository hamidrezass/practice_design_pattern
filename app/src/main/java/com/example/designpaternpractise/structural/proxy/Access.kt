package com.example.designpaternpractise.structural.proxy

interface Internet {
    fun connectTo(serverhost: String)
}

class RealInternet : Internet {
    override fun connectTo(serverhost: String) {
        println("Connecting to $serverhost")
    }
}

class ProxyInternet : Internet {
    private val internet: Internet = RealInternet()
    private val bannedSites= listOf("abc.com","abc.com")

    override fun connectTo(serverhost: String) {
        if (bannedSites.contains(serverhost.toLowerCase())) {
            throw Exception("Access Denied")
        }
        internet.connectTo(serverhost)
    }
}

fun main() {
    val internet: Internet = ProxyInternet()
    try {
        internet.connectTo("geeksforgeeks.org")
        internet.connectTo("abc.com")
    } catch (e: java.lang.Exception) {
        println(e.message)
    }

}