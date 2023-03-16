package com.example.codeschoolhomework

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.Toast
import com.example.codeschoolhomework.homework3.CalculatorActivity
import com.example.codeschoolhomework.students.mariam.myHomework3.MyCalculatorActivity

class MainActivity : AppCompatActivity(), OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val calculatorButton = findViewById<Button>(R.id.calculatorButton)
        val otherButton = findViewById<Button>(R.id.otherButton)
        calculatorButton.setOnClickListener(this)
        otherButton.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        view ?: return
        when (view.id) {
            R.id.calculatorButton -> openCalculatorActivity()
            R.id.otherButton -> {
                Toast.makeText(this,"other button was clicked",Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun openCalculatorActivity(){
        val intent = Intent(this, MyCalculatorActivity::class.java)
        startActivity(intent)
    }
}