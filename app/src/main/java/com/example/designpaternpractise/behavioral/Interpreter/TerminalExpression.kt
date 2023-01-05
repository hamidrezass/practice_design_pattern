package com.example.designpaternpractise.behavioral.Interpreter

class TerminalExpression(var data: String) : Expression {


    override fun interpret(context: String): Boolean {
        return context.contains(data)
    }
}