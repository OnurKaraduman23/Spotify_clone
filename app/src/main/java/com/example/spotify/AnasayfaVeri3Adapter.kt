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

class AnasayfaVeri3Adapter(private val mContext:Context,private val DGCarviewVeileriListesi:List<Anasayfa3CardViewVerileri> )
    :RecyclerView.Adapter<AnasayfaVeri3Adapter.CardViewNesneTutucu>() {

    inner class CardViewNesneTutucu(view: View): RecyclerView.ViewHolder(view) {
        var imageViewGorsel3: ImageView
        var textViewBaslik3: TextView
        var textViewAltBaslik3: TextView
        var satirCard3: CardView


        init {
            imageViewGorsel3 = view.findViewById(R.id.imageViewGorsel3)
            textViewBaslik3 = view.findViewById(R.id.textViewBaslik3)
            textViewAltBaslik3 = view.findViewById(R.id.textViewAltBaslik3)
            satirCard3 = view.findViewById(R.id.satirCard3)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewNesneTutucu {
        val tasarim = LayoutInflater.from(mContext).inflate(R.layout.card_tasarim_anasayfa3,parent,false)
        return CardViewNesneTutucu(tasarim)
    }

    override fun getItemCount(): Int {
        return DGCarviewVeileriListesi.size
    }

    override fun onBindViewHolder(holder: CardViewNesneTutucu, position: Int) {
        val veri3 = DGCarviewVeileriListesi[position]

        holder.textViewAltBaslik3.text = veri3.veri3_metin

        holder.satirCard3.setOnClickListener {

            Toast.makeText(mContext,"${veri3.veri3_metin} seçildi",Toast.LENGTH_SHORT).show()
        }
    }
}