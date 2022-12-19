package br.com.alura.part1

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NoteHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    fun bind(note: String) {
        itemView.findViewById<TextView>(R.id.txNote).text = note
    }
}