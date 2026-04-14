package com.example.myfirstapplication

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button1)

        button.setOnClickListener {
            showMessage()
        }
    }

    private fun showMessage() {
        val editText = findViewById<EditText>(R.id.editText1)
        val textView = findViewById<TextView>(R.id.textView1)

        val message = editText.text.toString()

        Log.d("MainActivity", message)

        textView.text = message
    }
}