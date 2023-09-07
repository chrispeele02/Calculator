package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var inputText = ""
        var previousNum = ""
        var numbersInputted = ""

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
        val buttonDot = findViewById<Button>(R.id.bDot)

        val buttonPlus = findViewById<Button>(R.id.bPlus)
        val buttonMinus = findViewById<Button>(R.id.bMinus)
        val buttonX = findViewById<Button>(R.id.bX)
        val buttonDivision = findViewById<Button>(R.id.bDivison)
        val buttonPercent = findViewById<Button>(R.id.bPercent)

        val buttonC = findViewById<Button>(R.id.bC)
        val buttonEqual = findViewById<Button>(R.id.bE)
        val buttonPlusMinus = findViewById<Button>(R.id.bPlusMinus)

        button0.setOnClickListener {
            inputText += "0"
            numbersInputted += "0"
            textView.text = inputText
        }
        button1.setOnClickListener {
            inputText += "1"
            numbersInputted += "1"
            textView.text = inputText
        }
        button2.setOnClickListener {
            inputText += "2"
            numbersInputted += "2"
            textView.text = inputText
        }
        button3.setOnClickListener {
            inputText += "3"
            numbersInputted += "3"
            textView.text = inputText
        }
        button4.setOnClickListener {
            inputText += "4"
            numbersInputted += "4"
            textView.text = inputText
        }
        button5.setOnClickListener {
            inputText += "5"
            numbersInputted += "5"
            textView.text = inputText
        }
        button6.setOnClickListener {
            inputText += "6"
            numbersInputted += "6"
            textView.text = inputText
        }
        button7.setOnClickListener {
            inputText += "7"
            numbersInputted += "7"
            textView.text = inputText
        }
        button8.setOnClickListener {
            inputText += "8"
            numbersInputted += "8"
            textView.text = inputText
        }
        button9.setOnClickListener {
            inputText += "9"
            numbersInputted += "9"
            textView.text = inputText
        }
        buttonDot.setOnClickListener {
            inputText += "."
            numbersInputted += "."
            textView.text = inputText
        }


        buttonC.setOnClickListener {
            inputText = ""
            numbersInputted = ""
            textView.text = inputText
        }

        buttonPlus.setOnClickListener{
            previousNum = inputText
            numbersInputted += "+"
            inputText = ""
            textView.text = inputText
        }

        buttonMinus.setOnClickListener {
            previousNum = inputText
            numbersInputted += "-"
            inputText = ""
            textView.text = inputText
        }

        buttonX.setOnClickListener {
            previousNum = inputText
            numbersInputted += "*"
            inputText = ""
            textView.text = inputText
        }

        buttonDivision.setOnClickListener {
            previousNum = inputText
            numbersInputted += "/"
            inputText = ""
            textView.text = inputText
        }

        buttonPlusMinus.setOnClickListener {
            var prevNum = 0
            previousNum = inputText
            prevNum = previousNum.toInt()
            prevNum = prevNum * -1
            textView.text = prevNum.toString()
            inputText = previousNum.toString()
        }

        buttonPercent.setOnClickListener {

        }

        buttonEqual.setOnClickListener{
            var firstNumber = ""
            var firstNumberInt = 0
            var operation = ""
            var secondNumber = ""
            var secondNumberInt = 0
            var result = 0
            for (char in numbersInputted) {
                println(char)
                if (char == '+') {
                    firstNumberInt = firstNumber.toInt()
                    operation = "+"
                    firstNumber = ""
                } else if (char == '-') {
                    firstNumberInt = firstNumber.toInt()
                    operation = "-"
                    firstNumber = ""
                } else if (char == '*') {
                    firstNumberInt = firstNumber.toInt()
                    operation = "*"
                    firstNumber = ""
                } else if (char == '/'){
                    firstNumberInt = firstNumber.toInt()
                    operation = "/"
                    firstNumber = ""
                }
                firstNumber += char
            }

            when(operation) {
                "+" -> secondNumber = firstNumber.replace("+","")
                "-" -> secondNumber = firstNumber.replace("-","")
                "*" -> secondNumber = firstNumber.replace("*","")
                "/" -> secondNumber = firstNumber.replace("/","")
            }

            secondNumberInt = secondNumber.toInt()

            when(operation) {
                "+" -> result = firstNumberInt + secondNumberInt
                "-" -> result = firstNumberInt - secondNumberInt
                "*" -> result = firstNumberInt * secondNumberInt
                "/" -> result = firstNumberInt / secondNumberInt
            }
            textView.text = result.toString()
        }

    }
}