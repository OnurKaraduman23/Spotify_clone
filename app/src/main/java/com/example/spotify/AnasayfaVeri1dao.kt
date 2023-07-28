package com.example.spotify

import android.content.ContentValues

class AnasayfaVeri1dao {


    fun veri1Ekle(vt:DatabaseHelper,veri_metin:String,veri_gorsel:String){

        val db = vt.writableDatabase

        val values = ContentValues()
        values.put("veri_metin",veri_metin)
        values.put("veri_gorsel",veri_gorsel)

        db.insertOrThrow("AnasayfaVeri1",null,values)
        db.close()

    }


    fun veri1TumVeriler(vt:DatabaseHelper) : ArrayList<AnasayfaVeri1>{
        val db = vt.writableDatabase
        val veri1Liste = ArrayList<AnasayfaVeri1>()

        val c = db.rawQuery("SELECT * FROM AnasayfaVeri1",null)

        while (c.moveToNext()){
            val veri = AnasayfaVeri1(c.getInt(c.getColumnIndexOrThrow("veri_id"))
                ,c.getString(c.getColumnIndexOrThrow("veri_metin"))
                ,c.getString(c.getColumnIndexOrThrow("veri_gorsel")))
            veri1Liste.add(veri)
        }
        return veri1Liste
    }
}