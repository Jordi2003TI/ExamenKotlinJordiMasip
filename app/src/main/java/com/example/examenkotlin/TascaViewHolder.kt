package com.example.examenkotlin

import android.view.View
import android.widget.TextView
import androidx.lifecycle.findViewTreeViewModelStoreOwner
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.Text

class TascaViewHolder(
    itemView: View
): RecyclerView.ViewHolder(itemView) {
    private var tvNom: TextView =itemView.findViewById(R.id.tvNom)
    private var tvCategoria: TextView = itemView.findViewById(R.id.tvCategoria)
    private var tvData: TextView = itemView.findViewById(R.id.tvData)
    private var tvEstat: TextView = itemView.findViewById(R.id.tvEstat)

    fun bind(item: Tasca{

    }


}