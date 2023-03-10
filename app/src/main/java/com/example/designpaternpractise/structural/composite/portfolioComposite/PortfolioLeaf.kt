package com.example.designpaternpractise.structural.composite.portfolioComposite

data class PortfolioLeaf(
  private val owners: List<Owner>,
  private val name: String,
  private val assets: List<Asset>) : PortfolioComponent {

  override fun getName(): String {
      return name
  }

  override fun getOwners(): List<Owner> {
      return owners
  }

  override fun getAssets(): List<Asset> {
      return assets
  }

  override fun getValue(): Double {
      return assets.map {
          it.value
      }.sum()
    }
}