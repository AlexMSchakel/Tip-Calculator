package com.example.tip_calculator

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        infoTextView.visibility = View.INVISIBLE

        calculateButton.setOnClickListener {
            val bill = billEditText.text.toString().toDouble()
            val tip = tipEditText.text.toString().toDouble() / 100
            val tipTotal = bill * tip
            val total = bill + tipTotal

            infoTextView.visibility = View.VISIBLE

            infoTextView.text = "Tip: ${doubleToDollar(tipTotal)} Total: ${doubleToDollar(total)}"
        }
    }

    fun doubleToDollar(number : Double) : String {
        return "$" + String.format("%.2f", number)
    }
}
