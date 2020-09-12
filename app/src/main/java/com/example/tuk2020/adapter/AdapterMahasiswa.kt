package com.example.tuk2020.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.tuk2020.R
import com.example.tuk2020.model.Mahasiswa

class AdapterMahasiswa(var data:ArrayList<Mahasiswa>): RecyclerView.Adapter<AdapterMahasiswa.Holder>() {
    class Holder(view: View) : RecyclerView.ViewHolder(view){
        val tvNama = view.findViewById<TextView>(R.id.tv_nama)
        val tvNim = view.findViewById<TextView>(R.id.tv_nim)
        val imgGambar = view.findViewById<ImageView>(R.id.img_mahasiswa)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view : View = LayoutInflater.from(parent.context).inflate(R.layout.item_mahasiswa, parent, false)
        return Holder(view)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.tvNama.text = data[position].nama
        holder.tvNim.text = data[position].nim
        holder.imgGambar.setImageResource(data[position].gambar)
    }
}