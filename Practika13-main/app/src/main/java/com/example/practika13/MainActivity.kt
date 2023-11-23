package com.example.practika13

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val editTextView1: EditText = findViewById(R.id.editTextNumber)
        editTextView1.requestFocus()
    }
    fun btnClick(view: View) {
        val editTextView1: EditText = findViewById(R.id.editTextNumber)
        val editTextView2: EditText = findViewById(R.id.editTextNumber2)
        val TextViewArea: TextView = findViewById(R.id.textView8)
        val TextViewPerimeter: TextView = findViewById(R.id.textView5)
        val TextViewHypotenuse: TextView = findViewById(R.id.textView10)
        if (editTextView1.text.toString() == "") {
            Toast.makeText(this, "Первый катет не введён!!!", Toast.LENGTH_SHORT).show()
            editTextView1.requestFocus()
        } else if (editTextView2.text.toString() == "") {
            Toast.makeText(this, "Второй катет не введён!!!", Toast.LENGTH_SHORT).show()
            editTextView2.requestFocus()
        } else{
            val cathetus1:Double = editTextView1!!.text.toString().toDouble()
            val cathetus2:Double = editTextView2!!.text.toString().toDouble()
            TextViewArea.setText((cathetus1 * cathetus2 * 0.5).toString())
            //a * b * 1/2
            TextViewPerimeter.setText((cathetus1 + cathetus2 + Math.sqrt(cathetus1 * cathetus1 + cathetus2 * cathetus2)).toString())
            //a + b + sqrt(a * a + b * b)
            TextViewHypotenuse.setText((Math.sqrt(cathetus1 * cathetus1 + cathetus2 * cathetus2)).toString())
            //sqrt(a * a + b * b)
        }
    }

}