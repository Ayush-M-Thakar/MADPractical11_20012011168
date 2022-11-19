package com.example.madpractical11_20012011168

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.provider.ContactsContract

class MyReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context?, intent: Intent?) {
        if (intent != null && context != null) {
            val note = Note()
            note.id = intent.getIntExtra(Note.NOTE_ID_KEY, -1)
            note.title = intent.getStringExtra(Note.NOTE_TITLE_KEY)!!
            note.subTitIe = intent.getStringExtra(Note.NOTE_SUBTITLE_KEY)!!
            note.Description = intent.getStringExtra(Note.NOTE_DESCRIPITION_KEY)!!
            note.modifiedTime = intent.getStringExtra(Note.NOTE_MODIFIED_TIME_KEY)!!
            note.remindertime = intent.getLongExtra(Note.NOTE_REMINDER_TIME_KEY, O)
            note.isReminder = true
            Log.i(TAG, msg: "onReceive: Note: $note")
            notificationDia10g(
                context,
                NoteView::class.java,
                note.title,
                note.Description,
                note
            )
        }
    }
}