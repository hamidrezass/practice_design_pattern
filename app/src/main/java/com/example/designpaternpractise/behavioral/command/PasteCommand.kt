package com.example.tutorialdp.behaviorals.command

import com.example.designpaternpractise.behavioral.command.Command

class PasteCommand(editor: Editor) : Command(editor) {

    override fun execute(): Boolean {

        if (editor.clipBoard.isEmpty()) {
            return false
        }

        backUp()
        editor.editText.setText(editor.clipBoard)
        return true
    }
}