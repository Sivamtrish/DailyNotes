package com.example.dailynotes

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val etNote = findViewById<EditText>(R.id.etNote)
        val btnSave = findViewById<Button>(R.id.btnSave)
        val rvNote = findViewById<RecyclerView>(R.id.rvNote)

        val noteList = mutableListOf<Note>()
        val noteAdapter = NoteAdapter(noteList)
        rvNote.adapter = noteAdapter
        rvNote.layoutManager = LinearLayoutManager(this)


        btnSave.setOnClickListener { view ->
            val enteredNote = etNote.text.toString().trim()
            if (enteredNote.isNotEmpty()) {
                noteList.add(Note(enteredNote))
                noteAdapter.notifyItemInserted(noteList.size-1 )
                etNote.setText("")
            }
        }

        }

    }


