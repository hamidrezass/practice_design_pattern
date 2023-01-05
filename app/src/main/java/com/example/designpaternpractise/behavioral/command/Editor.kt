package com.example.tutorialdp.behaviorals.command

import android.widget.EditText
import com.example.designpaternpractise.behavioral.command.Command

class Editor {

    lateinit var editText: EditText
    var clipBoard: String = ""


    private val commandHistory = CommandHistory()


    fun executeCommand(command: Command) {

        if (command.execute()) {
            commandHistory.push(command)
        }
    }


    fun undo() {
        if (commandHistory.isEmpty()) return
        val command = commandHistory.pop()
        command.undo()
    }
}