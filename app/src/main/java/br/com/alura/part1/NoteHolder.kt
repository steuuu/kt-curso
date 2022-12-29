package br.com.alura.part1

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NoteHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    fun bind(note: Note) {
        itemView.findViewById<TextView>(R.id.txTitle).text = note.title
        itemView.findViewById<TextView>(R.id.txDescription).text = note.description
        itemView.findViewById<TextView>(R.id.txDate).text = note.date
        itemView.findViewById<TextView>(R.id.txUser).text = note.user
    }
}

