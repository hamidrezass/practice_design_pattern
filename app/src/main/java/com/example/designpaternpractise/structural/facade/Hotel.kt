package com.example.designpaternpractise.structural.facade

open class Menus
class VegMenu : Menus()
class NonVegMenu : Menus()
class BothMenu : Menus()

fun main() {
    val keeper = HotelKeeper()
    val v = keeper.getVegMenu()
    val nv = keeper.getNonVegMenu()
    val ss = keeper.getVegNonMenu()
}
interface Hotel {
    fun getMenu(): Menus
}

class NonVegRestaurant : Hotel {

    override fun getMenu(): Menus {
        return NonVegMenu()
    }
}

class VegRestaurant : Hotel {
    override fun getMenu(): Menus {
        return VegMenu()
    }
}

class VegNonBothRestaurant : Hotel {
    override fun getMenu(): Menus {
        return BothMenu()
    }
}

class HotelKeeper {
    fun getVegMenu(): VegMenu {
        val vegRestaurant = VegRestaurant()
        return vegRestaurant.getMenu() as VegMenu
    }
    fun getNonVegMenu(): NonVegMenu? {
        val v = NonVegRestaurant()
        return v.getMenu() as NonVegMenu
    }

    fun getVegNonMenu(): BothMenu? {
        val v = VegNonBothRestaurant()
        return v.getMenu() as BothMenu
    }
}