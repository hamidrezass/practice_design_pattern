package com.example.designpaternpractise.behavioral.Interpreter

class OrExpression(var expr1: Expression, var expr2: Expression) : Expression {

    override fun interpret(context: String): Boolean {
        return expr1.interpret(context) || expr2.interpret(context)
    }
}