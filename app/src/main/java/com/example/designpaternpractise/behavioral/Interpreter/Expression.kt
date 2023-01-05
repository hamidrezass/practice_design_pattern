package com.example.designpaternpractise.behavioral.Interpreter

interface Expression {
    fun interpret(context: String): Boolean
}