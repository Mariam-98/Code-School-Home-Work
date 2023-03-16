package com.example.codeschoolhomework.students.vahe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
//import android.widget.Button
//import android.widget.TextView
import com.example.codeschoolhomework.R
import kotlinx.android.synthetic.main.activity_calculator.*


class CalculatorActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)

        number1Button.setOnClickListener { setText("1")}
        number2Button.setOnClickListener { setText("2") }
        number3Button.setOnClickListener { setText("3") }
        number4Button.setOnClickListener { setText("4") }
        number5Button.setOnClickListener { setText("5") }
        number6Button.setOnClickListener { setText("6") }
        number7Button.setOnClickListener { setText("7") }
        number8Button.setOnClickListener { setText("8") }
        number9Button.setOnClickListener { setText("9") }
        number0Button.setOnClickListener { setText("0") }
        equalsButton.setOnClickListener { setText("=") }
        divideButton.setOnClickListener { setText("/") }
        minusButton.setOnClickListener { setText("-") }
        multiplyButton.setOnClickListener { setText("*") }
        plusButton.setOnClickListener { setText("+") }
        percentButton.setOnClickListener { setText("%") }
        dotButton.setOnClickListener { setText(".") }
        deleteButton.setOnClickListener {
            val str = resultTextView.text.toString()
            if (str.isNotEmpty())
                resultTextView.text = str.subSequence(0,str.length-1)
        }
    }


    fun setText(str: String) {
        resultTextView.append(str)
    }


}
