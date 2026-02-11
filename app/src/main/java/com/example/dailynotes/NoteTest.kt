package com.example.dailynotes

fun main() {
    //creating an instance of the Note class
    //I just created an object of the Note class and assigned it to a variable called note1 and note2
    val note1 = Note(
        title = "First Note",
        content = "Learning Kotlin and Android",
        date = "2024-06-01"
    )
    val note2 = Note(
        title = "Second Note",
        content = "I will build real Apps with Kotlin",
        date = "2026-01-10"
    )

    //creating the list
    val notelist= listOf(note1, note2)

    //looping through the list and printing the title of each note
    for(note in notelist){
        println(note.title)
    }

}