package com.example.designpaternpractise.structural.composite.portfolioComposite

interface PortfolioComponent {

    fun getName(): String

    fun getOwners(): List<Owner>

    fun getAssets(): List<Asset>

    fun getValue(): Double
}