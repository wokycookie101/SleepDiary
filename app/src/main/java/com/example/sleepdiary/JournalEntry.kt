package com.example.sleepdiary

// This is the setup for each individual journal entry.
data class JournalEntry (
    val id: Int,
    val title: String,
    val content: String
)