package com.example.designpaternpractise.behavioral.Interpreter

fun main() {



    val robert : Expression  =TerminalExpression("Robert")
    val john: Expression  =TerminalExpression("John")
    val orExpression=OrExpression(john, robert)

    val julie: Expression = TerminalExpression("Julie")
    val married: Expression = TerminalExpression("Married")
    val andExpression=AndExpression(julie, married)

    val isMale: Expression = orExpression
    val isMarriedWoman: Expression = andExpression

    println("John is male? " + isMale.interpret("John"));

    println("Julie is a married women? "
            + isMarriedWoman.interpret("Married Julie"));
}