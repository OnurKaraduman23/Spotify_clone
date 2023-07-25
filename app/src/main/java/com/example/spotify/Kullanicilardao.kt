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

    fun KullaniciGetir(vt:DatabaseHelper):ArrayList<Kullanicilar>{
        val db = vt.writableDatabase
        val kullaniciListe = ArrayList<Kullanicilar>()
        val c = db.rawQuery("SELECT * FROM kullanicilar WHERE kullanici_id = 1",null)

        while (c.moveToNext()){
            val kullanici = Kullanicilar(c.getInt(c.getColumnIndexOrThrow("kullanici_id"))
                ,c.getString(c.getColumnIndexOrThrow("kullanici_ad"))
                ,c.getString(c.getColumnIndexOrThrow("kullanici_sifre")))

                kullaniciListe.add(kullanici)

        }
        return kullaniciListe
    }
}