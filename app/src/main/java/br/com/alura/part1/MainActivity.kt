package br.com.alura.part1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    val list = ArrayList<String>()
    val adapter = NoteAdapter()

    lateinit var note: EditText
    lateinit var save: Button
    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        note = findViewById(R.id.etNote)
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
        list.add(note.text.toString())
        showToast("Sucesso! nota adicionada")
        note.setText("")
        adapter.addList(list)
    }

    fun getNote(): String {
        val note = findViewById<EditText>(R.id.etNote)
        return note.text.toString()
    }

    fun showToast(msg: String) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
    }

    fun showAlert(msg: String) {
        val alert = AlertDialog.Builder(this)
        alert.setMessage(msg)
        alert.show()
    }
}



