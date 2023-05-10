package com.example.sleepdiary

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

// This helps in displaying the journal entries.
class EntryListAdapter(private val entries: List<JournalEntry>) :
    RecyclerView.Adapter<EntryListAdapter.EntryViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EntryViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_journal_entry, parent, false)
        return EntryViewHolder(view)
    }

    override fun onBindViewHolder(holder: EntryViewHolder, position: Int) {
        val entry = entries[position]
        holder.bind(entry)
    }

    override fun getItemCount(): Int {
        return entries.size
    }

    inner class EntryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val titleTextView: TextView = itemView.findViewById(R.id.title_text_view)
        private val contentTextView: TextView = itemView.findViewById(R.id.content_text_view)

        fun bind(entry: JournalEntry) {
            titleTextView.text = entry.title
            contentTextView.text = entry.content
        }
    }
}
