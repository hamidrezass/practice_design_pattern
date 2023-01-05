package com.example.designpaternpractise.behavioral.strategy

interface Promotion1 {

    fun calculate(sum: Double): Double
    val name: String

}

object noPromotion : Promotion1 {
    override fun calculate(sum: Double): Double {
        return sum
    }

    override val name = "No Promotion"

}

object ChristmasPromotion : Promotion1 {
    override fun calculate(sum: Double): Double {
        return sum * 0.8
    }

    override val name = "Christmas Promotion"

}

object SpecialPromotion : Promotion1 {
    override val name = "Special Promotion"
    override fun calculate(sum: Double): Double {
        return when {
            sum > 20 -> sum * 0.95
            sum > 30 -> sum * 0.85
            sum > 40 -> sum * 0.75
            else -> sum
        }

    }
}

class Bill2 {

    // strategies can be passed in the constructor, or in the method that uses them
    fun calculateFinalPrice(promotion: Promotion1): Double {

   val ss=    promotion.calculate(5.2)

        return ss
    }
}