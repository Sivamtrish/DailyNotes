package com.example.dailynotes

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val etNote = findViewById<TextView>(R.id.etNote)
        val btnSave = findViewById<Button>(R.id.btnSave)
        val tvNote = findViewById<TextView>(R.id.tvNote)


        btnSave.setOnClickListener { view ->
            val noteContent = etNote.text.toString()
            tvNote.text = noteContent
        }
    }

}
