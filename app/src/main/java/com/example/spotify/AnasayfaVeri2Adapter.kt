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

class AnasayfaVeri2Adapter(private val mContext:Context, private val DGAnasayfaVeri2Verileri:List<Anasayfa2CardviewVerileri>)
    :RecyclerView.Adapter<AnasayfaVeri2Adapter.CardViewNesneTutucu>(){

    inner class CardViewNesneTutucu(view:View):RecyclerView.ViewHolder(view){

        var imageViewGorsel:ImageView
        var textViewBaslik:TextView
        var textViewAltBaslik:TextView
        var satirCard2 : CardView


        init {
            imageViewGorsel = view.findViewById(R.id.imageViewGorsel)
            textViewBaslik = view.findViewById(R.id.textViewBaslik)
            textViewAltBaslik = view.findViewById(R.id.textViewAltBaslik)
            satirCard2 = view.findViewById(R.id.satirCard2)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewNesneTutucu {
        val tasarim = LayoutInflater.from(mContext).inflate(R.layout.card_tasarim_anasayfa2,parent,false)
        return CardViewNesneTutucu(tasarim)
    }

    override fun getItemCount(): Int {
        return DGAnasayfaVeri2Verileri.size
    }

    override fun onBindViewHolder(holder: CardViewNesneTutucu, position: Int) {
        val veri2 = DGAnasayfaVeri2Verileri[position]


        holder.textViewAltBaslik.text = veri2.veri2_metin
        holder.satirCard2.setOnClickListener {
            Toast.makeText(mContext,"${veri2.veri2_metin} seçildi",Toast.LENGTH_SHORT).show()
        }


    }
}