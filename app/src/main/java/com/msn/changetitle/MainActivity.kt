package com.msn.changetitle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val name = findViewById<TextView>(R.id.name)
        val input=findViewById<EditText>(R.id.input)
        val button=findViewById<Button>(R.id.button)

        val myUserinput=input.text
        button.setOnClickListener { name.text = myUserinput }
    }
}