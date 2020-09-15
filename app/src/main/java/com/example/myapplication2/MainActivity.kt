package com.example.myapplication2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var editText = findViewById<EditText>(R.id.edt)
        var editText1=findViewById<EditText>(R.id.edt2)
        var editText2=findViewById<EditText>(R.id.edt3)

      //  var data : String = editText.text.toString()
        //var value: Int = data.toInt()
        button.setOnClickListener {
            var data=editText.text.toString().toInt()
            Log.d("value", "onCreate:"+data)
            if (editText.text.toString().toInt() > editText1.text.toString().toInt() && editText.text.toString().toInt() > editText2.text.toString().toInt()) {
                    Toast.makeText(this, "Number 1 is Greater", Toast.LENGTH_LONG).show()

            } else if(editText1.text.toString().toInt() > editText2.text.toString().toInt()) {
                Toast.makeText(this, "Number 2 is Greater", Toast.LENGTH_LONG).show()
            }
//            else if(editText.text.toString().toInt().equals((editText1.text.toString().toInt())).equals(editText2.text.toString().toInt()) && editText1.text.toString().toInt().equals((editText2.text.toString().toInt())))
//            {
//                Toast.makeText(this,"All numbers Are Equals",Toast.LENGTH_LONG).show()
//            }
            else
            {
                Toast.makeText(this, "Number 3 is Greater", Toast.LENGTH_LONG).show()
            }
        }
    }
}