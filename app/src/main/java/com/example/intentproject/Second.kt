package com.example.intentproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class Second : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val nameTextView = findViewById<TextView>(R.id.nameTextView)
        val ageTextView = findViewById<TextView>(R.id.ageTextView)
        val name=  intent.getStringExtra("keyname");
        val age = intent.getIntExtra("keyage", 0);

        // Set text using setText()
        nameTextView.setText("Name: $name")
        ageTextView.setText("Age: $age")
    }
}