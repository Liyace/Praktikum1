package com.example.praktikum1

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Latihan1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_latihan1)

        val textView1 = findViewById<TextView>(R.id.textView1)
        textView1.text = getString(R.string.hello_world)
    }
}