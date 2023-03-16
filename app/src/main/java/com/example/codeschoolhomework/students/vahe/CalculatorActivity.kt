package com.example.codeschoolhomework.students.vahe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.codeschoolhomework.R
import kotlinx.android.synthetic.main.activity_calculator.*
import kotlinx.android.synthetic.main.activity_calculator.view.*


class CalculatorActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)


        val numberButtons = listOf(
            number0Button,
            number1Button,
            number2Button,
            number3Button,
            number4Button,
            number5Button,
            number6Button,
            number7Button,
            number8Button,
            number9Button
        )
        val operatorButtons = listOf(
            divideButton,
            minusButton,
            multiplyButton,
            plusButton,
            percentButton,
            dotButton,
            equalsButton
        )

        numberButtons.forEachIndexed { index, button ->
            button.setOnClickListener { setText("$index") }
        }

        operatorButtons.forEach { button ->
            button.setOnClickListener { setText(button.text.toString()) }
        }
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
