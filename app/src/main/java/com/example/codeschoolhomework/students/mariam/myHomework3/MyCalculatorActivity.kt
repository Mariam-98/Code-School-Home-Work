package com.example.codeschoolhomework.students.mariam.myHomework3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.example.codeschoolhomework.R

class MyCalculatorActivity : AppCompatActivity() {

    private lateinit var calculatorTextView: TextView
    private lateinit var deleteButton: Button
    private lateinit var equalButton: Button
    private lateinit var oneButton: Button
    private lateinit var twoButton: Button
    private lateinit var threeButton: Button
    private lateinit var divisionButton: Button
    private lateinit var fourButton: Button
    private lateinit var fiveButton: Button
    private lateinit var sixButton: Button
    private lateinit var subtractionButton: Button
    private lateinit var sevenButton: Button
    private lateinit var eightButton: Button
    private lateinit var nineButton: Button
    private lateinit var multiplicationButton: Button
    private lateinit var dotButton: Button
    private lateinit var zeroButton: Button
    private lateinit var percentButton: Button
    private lateinit var additionButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_calculator)

        calculatorTextView = findViewById(R.id.calculatorTextView)
        deleteButton = findViewById(R.id.deleteButton)
        equalButton = findViewById(R.id.equalButton)
        oneButton = findViewById(R.id.oneButton)
        twoButton = findViewById(R.id.twoButton)
        threeButton = findViewById(R.id.threeButton)
        divisionButton = findViewById(R.id.divisionButton)
        fourButton = findViewById(R.id.fourButton)
        fiveButton = findViewById(R.id.fiveButton)
        sixButton = findViewById(R.id.sixButton)
        subtractionButton = findViewById(R.id.subtractionButton)
        sevenButton = findViewById(R.id.sevenButton)
        eightButton = findViewById(R.id.eightButton)
        nineButton = findViewById(R.id.nineButton)
        multiplicationButton = findViewById(R.id.multiplicationButton)
        dotButton = findViewById(R.id.dotButton)
        zeroButton = findViewById(R.id.zeroButton)
        percentButton = findViewById(R.id.percentButton)
        additionButton = findViewById(R.id.additionButton)


        oneButton.setOnClickListener {
            setTextTOTextView(calculatorTextView.text.toString() + "1")
        }

        twoButton.setOnClickListener {
            setTextTOTextView(calculatorTextView.text.toString() + "2")
        }

        threeButton.setOnClickListener {
            setTextTOTextView(calculatorTextView.text.toString() + "3")
        }

        fourButton.setOnClickListener {
            setTextTOTextView(calculatorTextView.text.toString() + "4")
        }

        fiveButton.setOnClickListener {
            setTextTOTextView(calculatorTextView.text.toString() + "5")
        }

        sixButton.setOnClickListener {
            setTextTOTextView(calculatorTextView.text.toString() + "6")
        }

        sevenButton.setOnClickListener {
            setTextTOTextView(calculatorTextView.text.toString() + "7")
        }

        eightButton.setOnClickListener {
            setTextTOTextView(calculatorTextView.text.toString() + "8")
        }

        nineButton.setOnClickListener {
            setTextTOTextView(calculatorTextView.text.toString() + "9")
        }

        zeroButton.setOnClickListener {
            if (calculatorTextView.text.toString().isNotEmpty())
                setTextTOTextView(calculatorTextView.text.toString() + "0")
        }

        deleteButton.setOnClickListener {
            if ((calculatorTextView.text.isNotEmpty()))
                setTextTOTextView(calculatorTextView.text.substring(0, calculatorTextView.text.length - 1))
        }

        divisionButton.setOnClickListener {
            if (calculatorTextView.text.toString().endsWith('/') || calculatorTextView.text.toString().endsWith('-') || calculatorTextView.text.toString()
                    .endsWith('x') || calculatorTextView.text.toString().endsWith('+') || calculatorTextView.text.toString().endsWith('%')
                || calculatorTextView.text.toString().endsWith('.')
            ) {
                setTextTOTextView(calculatorTextView.text.toString().dropLast(1) + "/")
            } else if (calculatorTextView.text.toString().isEmpty()) {
                setTextTOTextView(calculatorTextView.text.toString())
            } else {
                setTextTOTextView(calculatorTextView.text.toString() + "/")
            }
        }

        subtractionButton.setOnClickListener {
            if (calculatorTextView.text.toString().endsWith('/') || calculatorTextView.text.toString().endsWith('-') || calculatorTextView.text.toString()
                    .endsWith('x') || calculatorTextView.text.toString().endsWith('+') || calculatorTextView.text.toString().endsWith('%')
                || calculatorTextView.text.toString().endsWith('.')
            ) {
                setTextTOTextView(calculatorTextView.text.toString().dropLast(1) + "-")
            } else if (calculatorTextView.text.toString().isEmpty()) {
                setTextTOTextView(calculatorTextView.text.toString())
            } else {
                setTextTOTextView(calculatorTextView.text.toString() + "-")
            }
        }

        multiplicationButton.setOnClickListener {
            if (calculatorTextView.text.toString().endsWith('/') || calculatorTextView.text.toString().endsWith('-') || calculatorTextView.text.toString()
                    .endsWith('x') || calculatorTextView.text.toString().endsWith('+') || calculatorTextView.text.toString().endsWith('%')
                || calculatorTextView.text.toString().endsWith('.')
            ) {
                setTextTOTextView(calculatorTextView.text.toString().dropLast(1) + "x")
            } else if (calculatorTextView.text.toString().isEmpty()) {
                setTextTOTextView(calculatorTextView.text.toString())
            } else {
                setTextTOTextView(calculatorTextView.text.toString() + "x")
            }
        }

        additionButton.setOnClickListener {
            if (calculatorTextView.text.toString().endsWith('/') || calculatorTextView.text.toString().endsWith('-') || calculatorTextView.text.toString()
                    .endsWith('x') || calculatorTextView.text.toString().endsWith('+') || calculatorTextView.text.toString().endsWith('%')
                || calculatorTextView.text.toString().endsWith('.')
            ) {
                setTextTOTextView(calculatorTextView.text.toString().dropLast(1) + "+")
            } else if (calculatorTextView.text.toString().isEmpty()) {
                setTextTOTextView(calculatorTextView.text.toString())
            } else {
                setTextTOTextView(calculatorTextView.text.toString() + "+")
            }
        }

        equalButton.setOnClickListener {

        }

    }

//    override fun onClick(view: View?) {
//        view ?: return
//
//        when(view.id) {
//            R.id.oneButton -> setTextTOTextView("1")
//        }
//    }



    private fun setTextTOTextView(str: String) {
        calculatorTextView.text = str
    }


}