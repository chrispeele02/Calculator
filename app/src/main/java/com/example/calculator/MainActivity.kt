package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.textView)
        val button0 = findViewById<Button>(R.id.b0)
        val button1 = findViewById<Button>(R.id.b1)
        val button2 = findViewById<Button>(R.id.b2)
        val button3 = findViewById<Button>(R.id.b3)
        val button4 = findViewById<Button>(R.id.b4)
        val button5 = findViewById<Button>(R.id.b5)
        val button6 = findViewById<Button>(R.id.b6)
        val button7 = findViewById<Button>(R.id.b7)
        val button8 = findViewById<Button>(R.id.b8)
        val button9 = findViewById<Button>(R.id.b9)

        button0.setOnClickListener {
            textView.text = "0"
        }


    }
}