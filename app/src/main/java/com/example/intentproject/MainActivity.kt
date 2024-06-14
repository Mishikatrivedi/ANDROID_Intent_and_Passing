package com.example.intentproject

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.intentproject.ui.theme.IntentProjectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main);

        val nameEditText = findViewById<EditText>(R.id.editTextName);
        val ageEditText = findViewById<EditText>(R.id.editTextAge);
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener{
            val name = nameEditText.text.toString();
            val age = ageEditText.text.toString().toIntOrNull() ?: 0 // Handle non-integer input
            val intent = Intent(this, Second::class.java);

            intent.putExtra("keyname",name);
            intent.putExtra("keyage",age);
            startActivity(intent)
            //for navigation
        }
    }
}