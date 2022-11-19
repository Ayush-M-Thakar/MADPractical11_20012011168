package com.example.madpractical11_20012011168

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

class Notes(var title: String, var subTit1e:String, var Description:String,var modifiedTime:String,var isReminder: Boolean= false) {
    var remindertime: Long = System.currentTimeMillis()
    var id = noteIdGeneration()

    constructor(note: Notes) :
            this(note.title, note.subTit1e, note.Description, note.modifiedTime, note.isReminder) {
        remindertime = note.remindertime
    }

    companion object {
        var idNote = 0
        fun noteIdGeneration():Int {
            idNote++
            return idNote
        }

        var notesArray: List<Notes> = ArrayList()
    }
}