package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val backgroundView: ConstraintLayout = findViewById(R.id.backgroundView)
        val editTextElement: EditText = findViewById(R.id.plainTextInput)
        val textViewString: TextView = findViewById(R.id.textView)
        val changeTextStringBtn: Button = findViewById(R.id.changeTextButton)
        val changeBackgroundColorBtn: Button = findViewById(R.id.changeBackgroundColorButton)
        val changeTextColorBtn: Button = findViewById(R.id.changeTextColorButton)
        val androidIsAwesomeBtn: Button = findViewById(R.id.androidIsAwesomeButton)

        changeTextStringBtn.setOnClickListener {
            if (editTextElement.text.toString() == "") {
                textViewString.text = resources.getString(R.string.helloFromBola)
            }
            else {
                textViewString.text = editTextElement.text.toString()
            }
        }

        changeBackgroundColorBtn.setOnClickListener {
            backgroundView.setBackgroundColor(resources.getColor(R.color.darkGreenBackground))
        }

        changeTextColorBtn.setOnClickListener {
            textViewString.setTextColor(resources.getColor(R.color.red))
        }

        androidIsAwesomeBtn.setOnClickListener {
            textViewString.text = resources.getString(R.string.androidIsAwesome)
        }

        backgroundView.setOnClickListener {
            textViewString.text = resources.getString(R.string.helloFromBola)
            backgroundView.setBackgroundColor(resources.getColor(R.color.darkBlueBackground))
            textViewString.setTextColor(resources.getColor(R.color.white))
            editTextElement.setText("")
        }
    }
}