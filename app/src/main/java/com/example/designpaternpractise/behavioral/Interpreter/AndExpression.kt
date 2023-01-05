package com.example.designpaternpractise.behavioral.Interpreter

class AndExpression(var exp1:Expression,var exp2:Expression) : Expression {



    override fun interpret(context: String): Boolean {

        return exp1.interpret(context) && exp2.interpret(context)
    }
}