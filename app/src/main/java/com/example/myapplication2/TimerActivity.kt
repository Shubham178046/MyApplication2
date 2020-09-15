package com.example.myapplication2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_timer.*
import java.util.*

class TimerActivity : AppCompatActivity()  {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_timer)
       // Toast.makeText(this, "Timer Completed",Toast.LENGTH_LONG).show()
        val timer=MyCounter(10000,1000)
        button2.setOnClickListener()
        {
            timer.start()
        }
        button3.setOnClickListener()
        {
            timer.cancel()
        }



    }


    inner class MyCounter(milisinfuture:Long,timeinterval:Long):CountDownTimer(milisinfuture,timeinterval)
    {
        override fun onFinish() {

          //  TODO("Not yet implemented")
            textView.text="Timer Completed"

        }

        override fun onTick(millisUntilFinished: Long) {
          //  TODO("Not yet implemented")
            textView.textSize=25f
            textView.text=(millisUntilFinished/1000).toString()+""
            println("Timer"+millisUntilFinished/1000)
        }



    }
}