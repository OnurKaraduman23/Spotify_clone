package com.example.spotify

import android.content.ContentValues

class Kullanicilardao {

    fun kullanicEkle(dh:DatabaseHelper,kullanici_ad:String,kullanici_sifre:String){

        val db = dh.writableDatabase

        val values = ContentValues()
        values.put("kullanici_ad",kullanici_ad)
        values.put("kullanici_sifre",kullanici_sifre)

        db.insertOrThrow("kullanicilar", null,values)
        db.close()

    }
}