package com.example.designpaternpractise.creational.abstractfactory

interface IButton {
    fun paint()
}

interface ICheckbox {
    fun paint()
}

class WindowButton : IButton {
    override fun paint() {
        println("window draw button")
    }
}
class MacButton : IButton {
    override fun paint() { println("mac draw button") }
}
class WindowCheckBox : ICheckbox {
    override fun paint() { println("windows draw checkbox") }

}

class MacCheckBox : ICheckbox {
    override fun paint() {
        println("mac draw checkbox")
    }
}

interface GuiFactory {
    fun createButton(): IButton
    fun createCheckBox(): ICheckbox
}
class WindowFactory : GuiFactory {
    override fun createButton(): IButton {
        return WindowButton() }
    override fun createCheckBox(): ICheckbox {
        return WindowCheckBox()
    }
}
class MacFactory : GuiFactory {
    override fun createButton(): IButton {
        return MacButton()
    }
    override fun createCheckBox(): ICheckbox = MacCheckBox()

}

class MyApplication(private val guiFactory: GuiFactory) {
    private val button: IButton = guiFactory.createButton()
    private val checkBox: ICheckbox = guiFactory.createCheckBox()

    fun paint() {
        button.paint()
        checkBox.paint()
    }
}

fun main() {
    var os = "win"
    if (os == "win") {
        MyApplication(WindowFactory()).paint()
    } else {
        MyApplication(MacFactory()).paint()
    }

}