package com.example.helloworldapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
          Log.d("MainActivity","${calculate(5,5)}"  )


    }


    fun calculate (num1: Int, num2: Int):String {
        when {
            num1 + num2 == 10 -> {
                return "Hello EveryOne to My App"
            }
            num1 - num2 == 1 -> {
                return "Hello world"
            }
            num1 / num2 == 4 -> {
                return "Hello, Welcome "
            }
            num1 * num2 == 25 -> {
                return "Hello Kotlin basic "
            }
        }
        return ""
    }
}