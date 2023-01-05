package com.example.tutorialdp.behaviorals.command

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.designpaternpractise.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        var editor=Editor()

        editor.editText=findViewById(R.id.editext_main)

        findViewById<Button>(R.id.button_c).setOnClickListener{

           editor.executeCommand( CopyCommand(editor))
        }

        findViewById<Button>(R.id.button_v).setOnClickListener{
            editor.executeCommand(PasteCommand(editor))
        }

        findViewById<Button>(R.id.button_z).setOnClickListener{
            editor.undo()
        }





    }
}