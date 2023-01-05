package com.example.tutorialdp.behaviorals.command

import com.example.designpaternpractise.behavioral.command.Command

class CopyCommand(editor: Editor) : Command(editor) {

    override fun execute(): Boolean {

        editor.clipBoard = editor.editText.text.toString()
        return false
    }
}