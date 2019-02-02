package com.example.andrea.lab4

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_list.*

class List : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        button1.setOnClickListener {

            val intent: Intent = Intent(this, Lab2::class.java)
            startActivity(intent)
            finish()
        }

        button2.setOnClickListener {

            val intent: Intent = Intent(this, Lab1::class.java)
            startActivity(intent)
            finish()
        }
    }
}
