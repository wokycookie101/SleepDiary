package com.example.sleepdiary

// This is the database in where each entry is stored locally.
class JournalEntryDatabase {
    private val entries = ArrayList<JournalEntry>()

    fun addEntry(entry: JournalEntry) {
        entries.add(entry)
    }

    fun getEntries(): List<JournalEntry> {
        return entries
    }
}