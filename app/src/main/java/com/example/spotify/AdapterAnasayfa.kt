package com.example.spotify

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class AdapterAnasayfa(private val mContext:Context, private val DGCarviewVeileriListesi:List<AnasayfaVeri1>)
    : RecyclerView.Adapter<AdapterAnasayfa.CardViewObjectHolder>() {

    inner class CardViewObjectHolder(holder: View):RecyclerView.ViewHolder(holder){

        var cardView : CardView
        var imageView : ImageView
        var textViewMetin : TextView

        init {
            cardView = holder.findViewById(R.id.CardView)
            imageView = holder.findViewById(R.id.imageView)
            textViewMetin = holder.findViewById(R.id.textViewMetin)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewObjectHolder {
        val tasarim = LayoutInflater.from(mContext).inflate(R.layout.card_tasarim_anasayfa,parent,false)
        return CardViewObjectHolder(tasarim)
    }

    override fun getItemCount(): Int {
        return DGCarviewVeileriListesi.size
    }

    override fun onBindViewHolder(holder: CardViewObjectHolder, position: Int) {
        val cardNesnesi = DGCarviewVeileriListesi[position]
        holder.textViewMetin.text = cardNesnesi.veri_metin

        //dinamik olarak resimleri gösterme
        holder.imageView.setImageResource(mContext.resources.getIdentifier(cardNesnesi.veri_gorsel,"drawable",mContext.packageName))

        holder.cardView.setOnClickListener {
            Toast.makeText(mContext,"Seçilen : ${cardNesnesi.veri_metin}",Toast.LENGTH_SHORT).show()
        }
    }
}