package com.example.designpaternpractise.behavioral.chain.Leave

data class Leave( var numberOFDay: Int, var empTier: Int, var reason: ReasonType)


enum class ReasonType {
    REGULAR, CRITICAL, SPECIAL
}