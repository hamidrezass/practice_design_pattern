package com.example.designpaternpractise.behavioral.strategy

data class Item(val name:String,val price :Double)

enum class Promotion{
    NoPromotion,SpecialPromotion,ChristmasPromotion
}

class Bill{
    private val items= mutableListOf<Item>()

    fun addItem(item: Item):Bill{
        items.add(item)
        return this
    }

    fun calculateFinalPrice(promotion: Promotion):Double{
        val initialSum= items.sumOf { it.price }

      return  when(promotion){

          Promotion.NoPromotion -> initialSum

          Promotion.SpecialPromotion ->when {

              initialSum > 20 -> initialSum * 0.95
              initialSum > 30 -> initialSum * 0.85
              initialSum > 40 -> initialSum * 0.75

              else -> initialSum
          }

          Promotion.ChristmasPromotion -> initialSum * 0.80
        }
    }
}

