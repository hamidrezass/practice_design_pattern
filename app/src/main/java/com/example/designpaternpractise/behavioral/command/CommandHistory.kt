package com.example.tutorialdp.behaviorals.command

import com.example.designpaternpractise.behavioral.command.Command
import java.util.*

class CommandHistory {

    private var history: Stack<Command> = Stack()

    fun push(command: Command) {
        history.push(command)
    }

    fun pop(): Command {
        return history.pop()
    }

    fun isEmpty(): Boolean {
        return history.isEmpty()
    }


}