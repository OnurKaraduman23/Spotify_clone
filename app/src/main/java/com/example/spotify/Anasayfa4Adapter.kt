package com.example.spotify

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class Anasayfa4Adapter(private val mContext:Context, private val DGCarviewVeileriListesi:List<Anasayfa4CardViewVerileri>)
    :RecyclerView.Adapter<Anasayfa4Adapter.CardViewNesneTutucu>(){

    inner class CardViewNesneTutucu(view:View):RecyclerView.ViewHolder(view){
        var imageViewGorsel4: ImageView
        var textViewBaslik4: TextView
        var textViewAltBaslik4: TextView
        var satirCard4: CardView

        init {
            imageViewGorsel4 = view.findViewById(R.id.imageViewGorsel4)
            textViewBaslik4 = view.findViewById(R.id.textViewBaslik4)
            textViewAltBaslik4 = view.findViewById(R.id.textViewAltBaslik4)
            satirCard4 = view.findViewById(R.id.satirCard4)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewNesneTutucu {
        val tasarim = LayoutInflater.from(mContext).inflate(R.layout.card_tasarim_anasayfa4,parent,false)
        return CardViewNesneTutucu(tasarim)
    }

    override fun getItemCount(): Int {
        return DGCarviewVeileriListesi.size
    }

    override fun onBindViewHolder(holder: CardViewNesneTutucu, position: Int) {

        val veri4 = DGCarviewVeileriListesi[position]

        holder.textViewAltBaslik4.text = veri4.veri4_metin

        holder.satirCard4.setOnClickListener {

            Toast.makeText(mContext,"${veri4.veri4_metin}",Toast.LENGTH_SHORT).show()

        }
    }
}