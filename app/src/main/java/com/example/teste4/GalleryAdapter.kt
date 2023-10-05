package com.example.teste4


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class GaleriaAdapter : RecyclerView.Adapter<GaleriaAdapter.ViewHolder>() {
    private val imagens = intArrayOf(
        R.drawable.menina1,
        R.drawable.menina2,
        R.drawable.menina3,
        R.drawable.menina4,
        R.drawable.menina5,
        R.drawable.menina6,
        R.drawable.menina7,
        R.drawable.menina8,
        R.drawable.menina9

    )

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.imageView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_image, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val layoutParams = holder.imageView.layoutParams
        layoutParams.height = layoutParams.width // Define a altura igual à largura
        holder.imageView.layoutParams = layoutParams

        holder.imageView.setImageResource(imagens[position])
    }

    override fun getItemCount(): Int {
        return imagens.size
    }
}
