import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.sleepdiary.EntryListAdapter
import com.example.sleepdiary.JournalEntry
import com.example.sleepdiary.JournalEntryDatabase
import com.example.sleepdiary.R

// This is the main page in where the whole app runs.
class MainActivity : AppCompatActivity() {
    private lateinit var entryListAdapter: EntryListAdapter
    private lateinit var database: JournalEntryDatabase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        database = JournalEntryDatabase()
        entryListAdapter = EntryListAdapter(database.getEntries())
        entry_list_recycler_view.adapter = entryListAdapter
        entry_list_recycler_view.layoutManager = LinearLayoutManager(this)
    }

    fun addEntry(entry: JournalEntry) {
        database.addEntry(entry)
        entryListAdapter.notifyDataSetChanged()
    }

    add_entry_button.setOnClickListener {
        val intent = Intent(this, AddEntryActivity::class.java)
        startActivity(intent)
    }
}




