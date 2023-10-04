package com.example.project1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnbs : Button = findViewById(R.id.bis_button)

        btnbs.setOnClickListener {
            val intenbus = Intent(this, BusActivity::class.java)
            startActivity(intenbus)
        }
    }
}