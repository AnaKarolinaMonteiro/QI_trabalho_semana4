package com.example.teste4


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class GaleriaAdapter : RecyclerView.Adapter<GaleriaAdapter.ViewHolder>() {
    private val imagens = intArrayOf(
        R.drawable.menina1,
        R.drawable.menina10,
        R.drawable.menina11,
        R.drawable.menina12,
        R.drawable.menina13,
        R.drawable.menina14,
        R.drawable.menina15,
        R.drawable.menina16,
        R.drawable.menina17,
        R.drawable.menina18,
        R.drawable.menina2,
        R.drawable.menina20,
        R.drawable.menina3,
        R.drawable.menina4,
        R.drawable.menina8

    ) // Adicione suas imagens aqui

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.imageView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_image, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.imageView.setImageResource(imagens[position])
    }

    override fun getItemCount(): Int {
        return imagens.size
    }
}
