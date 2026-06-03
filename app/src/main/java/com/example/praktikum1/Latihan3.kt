package com.example.praktikum1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Latihan3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_latihan3)

        val bt_proses = findViewById<Button>(R.id.bt_proses)
        val et_nama = findViewById<EditText>(R.id.et_nama)

        bt_proses.setOnClickListener {
            val nama = et_nama.text.toString()
            if (nama.isNotEmpty()) {
                Toast.makeText(this, "Halo $nama", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Nama tidak boleh kosong", Toast.LENGTH_SHORT).show()
            }
        }
    }
}