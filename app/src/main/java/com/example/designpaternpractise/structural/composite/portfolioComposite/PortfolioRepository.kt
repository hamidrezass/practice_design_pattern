package com.example.designpaternpractise.structural.composite.portfolioComposite

interface PortfolioRepository {

   suspend fun getUserPortfolio(userId: String): PortfolioComponent  

}