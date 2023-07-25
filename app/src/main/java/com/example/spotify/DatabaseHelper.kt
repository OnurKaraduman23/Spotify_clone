package com.example.spotify

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DatabaseHelper(context:Context):SQLiteOpenHelper(context,"kullanicilar.sqlite",null,1) {
    override fun onCreate(db: SQLiteDatabase?) {
        db?.execSQL("CREATE TABLE kullanicilar(kullanici_id INTEGER PRIMARY KEY AUTOINCREMENT, kullanici_ad TEXT, kullanici_sifre TEXT);")
    }

    override fun onUpgrade(db: SQLiteDatabase?, p1: Int, p2: Int) {
        db?.execSQL("DROP TABLE IF EXISTS kullanicilar")
        onCreate(db)
    }
}