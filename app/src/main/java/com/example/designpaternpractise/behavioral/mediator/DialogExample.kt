package com.example.designpaternpractise.behavioral.mediator

import kotlin.properties.Delegates

class DialogExample {

    interface uiDirector{
        fun notify(sender : UiElement, event:String)
    }

    abstract class UiElement(val uiDirector: uiDirector)


    class Button(uiDirector: uiDirector):UiElement(uiDirector){
        fun onclick(){
            uiDirector.notify(this,"click")
        }
    }

    class TextBox(uiDirector: uiDirector):UiElement(uiDirector){

        val text:String by Delegates.observable("")
        {property, oldValue, newValue ->

            uiDirector.notify(this,"text_changed")

        }
    }

    class fancyDialog() : uiDirector{


        private val okButton = Button(this)
        private val cancelButton = Button(this)
        private val input = TextBox(this)

        private var inputText = ""
        override fun notify(sender: UiElement, event: String) {
           when(sender){


             // is TextBox ->
           }
        }

    }
}