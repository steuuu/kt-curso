package br.com.alura.part1

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class NoteAdapter : RecyclerView.Adapter<NoteHolder>() {

    var list = ArrayList<Note>()

    fun addList(notes: ArrayList<Note>) {
        list = notes
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoteHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.note_adapter, parent, false)
        val holder = NoteHolder(view)
        return holder
    }

    override fun onBindViewHolder(holder: NoteHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int {
        return list.count()
    }
}

