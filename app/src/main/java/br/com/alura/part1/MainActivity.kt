package br.com.alura.part1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    val list = ArrayList<Note>()
    val adapter = NoteAdapter()

    lateinit var title: EditText
    lateinit var description: EditText
    lateinit var date: EditText
    lateinit var user: EditText
    lateinit var save: Button
    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = findViewById(R.id.etNoteTitle)
        description = findViewById(R.id.etNoteDescription)
        date = findViewById(R.id.etNoteDate)
        user = findViewById(R.id.etNoteUser)
        save = findViewById(R.id.btSave)
        recyclerView = findViewById(R.id.recyclerView)
        setupList()
        save.setOnClickListener {
            saveNote()
        }
    }

    fun setupList() {
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter
    }

    fun saveNote() {
        val criado = Note(
            title = title.text.toString(),
            description = description.text.toString(),
            date = date.text.toString(),
            user = user.text.toString()
        )
        list.add(criado)
        showToast("Sucesso! nota adicionada")
        title.setText("")
        description.setText("")
        date.setText("")
        user.setText((""))
        adapter.addList(list)
    }

    fun showToast(msg: String) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
    }
}

    /*fun getNote(): String {
    val note = findViewById<EditText>(R.id.etNote)
    return note.text.toString()
}
 */

    /*fun showAlert(msg: String) {
        val alert = AlertDialog.Builder(this)
        alert.setMessage(msg)
        alert.show()
    }
     */




