package com.example.codeschoolhomework

import android.app.ActionBar.LayoutParams
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.codeschoolhomework.students.mariam.myHomework4.BusinessCardView
import com.example.codeschoolhomework.students.mariam.myHomework4.BusinessCardViewTextStyleEnum

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val view = LayoutInflater.from(this).inflate(R.layout.activity_main, null, false)

        val businessCardView = BusinessCardView(this)

        val params = LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT)

        (view as ViewGroup).addView(businessCardView, params)
        setContentView(view)

        businessCardView.setTitle("World")
        businessCardView.setTitleTextStyle(BusinessCardViewTextStyleEnum.ITALIC)
        businessCardView.setTitleTextSize(25f)
        businessCardView.setOnActionClickListener { TODO("Not yet implemented") }


//        val calculatorButton = findViewById<Button>(R.id.calculatorButton)
//        val otherButton = findViewById<Button>(R.id.otherButton)
//        calculatorButton.setOnClickListener(this)
//        otherButton.setOnClickListener(this)

        val bc = findViewById<BusinessCardView>(R.id.fff)
        bc.setTitle("hello")
        bc.setTitleTextStyle(BusinessCardViewTextStyleEnum.BOLD)
    }


//    override fun onClick(view: View?) {
//        view ?: return
//        when (view.id) {
//            R.id.calculatorButton -> openCalculatorActivity()
//            R.id.otherButton -> {
//                Toast.makeText(this,"other button was clicked",Toast.LENGTH_SHORT).show()
//            }
//        }
//    }
////
//    private fun openCalculatorActivity(){
//        val intent = Intent(this, MyCalculatorActivity::class.java)
//        startActivity(intent)
//    }
}