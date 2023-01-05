package com.example.designpaternpractise.structural.adapter

interface Movable {
    // returns speed in MPH
    fun getSpeed(): Double
}

class BugattiVeyron : Movable {
    override fun getSpeed(): Double {
        return 268.0
    }
}

interface MovableAdapter {
    // returns speed in KM/H
    fun getSpeed(): Double
}

class MovableAdapterImpl(val movable: Movable) : MovableAdapter {

    override fun getSpeed(): Double {
        return getKMPH(movable.getSpeed())
    }

    private fun getKMPH(mph: Double): Double {

        return mph * 1.60934
    }

}