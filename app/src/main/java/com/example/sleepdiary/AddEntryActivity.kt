package com.example.sleepdiary

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

// This creates new entries to the journal
class AddEntryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_entry)

        save_button.setOnClickListener {
            val title = title_edit_text.text.toString()
            val content = content_edit_text.text.toString()
            val entry = JournalEntry(database.getEntries().size + 1, title, content)
            (applicationContext as MainActivity).addEntry(entry)
            finish()
        }
    }
}