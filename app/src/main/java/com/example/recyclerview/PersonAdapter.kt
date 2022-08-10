package com.example.recyclerview

import android.view.View
import androidx.recyclerview.widget.RecyclerView

class PersonAdapter: RecyclerView.Adapter<PersonAdapter.PersonHolder> {
    class PersonHolder(item: View):RecyclerView.ViewHolder(item) {
    fun bind(person: Person)
    }
}