package com.example.designpaternpractise.behavioral.command

import com.example.tutorialdp.behaviorals.command.Editor

abstract class Command(var editor: Editor) {

    private var backUp: String = ""


    fun backUp() {
        backUp = editor.editText.text.toString()
    }

    fun undo() {
        editor.editText.setText(backUp)
    }

     abstract fun execute(): Boolean

}