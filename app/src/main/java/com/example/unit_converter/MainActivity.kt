package com.example.unit_converter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var edt : TextView = findViewById(R.id.inputValue)
        var btn : Button = findViewById(R.id.convertButton)
        var resultText : TextView = findViewById(R.id.resultTextView)

        btn.setOnClickListener(){
            var kg = edt.text.toString().toDouble()

            resultText.setText(""+convertToPounds(kg)+"\n Pounds")
        }
    }

    fun convertToPounds(kg: Double): Double{
         var pounds = kg * 2.20462

        return pounds
    }
}