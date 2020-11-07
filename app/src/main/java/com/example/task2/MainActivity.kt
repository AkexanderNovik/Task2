package com.example.task2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_1?.setOnClickListener {
            textView.text = "1"
        }

        button_2?.setOnClickListener {
            textView.text = "2"
        }

        button_3?.setOnClickListener {
            textView.text = "3"
        }
        button_4?.setOnClickListener {
            textView.text = "4"
        }

        nextActivityButton?.setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java))
        }
    }
}