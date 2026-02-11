package com.example.dailynotes

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val title = findViewById<TextView>(R.id.titleText)
        val content= findViewById<TextView>(R.id.contentText)
        val date= findViewById<TextView>(R.id.dateText)


        val note = Note(
            title = "First Note",
            content = "Learning Kotlin and Android",
            date = "2024-06-01"
        )

        title.text = note.title
        content.text= note.content
        date.text= note.date
    }

}
