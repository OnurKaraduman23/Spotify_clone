package com.example.spotify

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.spotify.databinding.FragmentAnasayfaBinding

private lateinit var tasarim:FragmentAnasayfaBinding
class AnasayfaFragment : Fragment(AppCompatActivity.MODE_PRIVATE) {


    private lateinit var cardViewVerileri : ArrayList<AnasayfaCardviewVeriler>
    private lateinit var adapter1: AdapterAnasayfa
    private lateinit var adapter2: AnasayfaVeri2Adapter
    private lateinit var vt:DatabaseHelper
    private lateinit var veri1Liste:ArrayList<AnasayfaVeri1>
    private lateinit var veri2Liste:ArrayList<Anasayfa2CardviewVerileri>
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        tasarim = FragmentAnasayfaBinding.inflate(layoutInflater)

/*
        // first run must be Open
        vt = DatabaseHelper(requireContext())
        AnasayfaVeri1dao().veri1Ekle(vt,"Playlist1","music.png")
        AnasayfaVeri1dao().veri1Ekle(vt,"Playlist2","music.png")
        AnasayfaVeri1dao().veri1Ekle(vt,"Playlist3","music.png")
        AnasayfaVeri1dao().veri1Ekle(vt,"Playlist4","music.png")

*/

        tasarim.toolbar.setTitle("İyi Akşamlar")

        tasarim.rv.setHasFixedSize(true)
        tasarim.rv2.setHasFixedSize(true)
//        tasarim.rv.layoutManager = LinearLayoutManager(requireContext())
        tasarim.rv.layoutManager = StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.HORIZONTAL)
        tasarim.rv2.layoutManager = StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.HORIZONTAL)

        vt = DatabaseHelper(requireContext())

        val v2_1 = Anasayfa2CardviewVerileri(1,"Pop","Artist1,Artist2,Artist3\nArtist4","gorsel")
        val v2_2 = Anasayfa2CardviewVerileri(2,"Pop","Artist5,Artist6,Artist7\nArtist8","gorsel")
        val v2_3 = Anasayfa2CardviewVerileri(3,"Pop","Artist9,Artist10,Artist11\nArtist12","gorsel")
        val v2_4 = Anasayfa2CardviewVerileri(4,"Pop","Artist13,Artist14,Artist15\nArtist16","gorsel")
        val v2_5 = Anasayfa2CardviewVerileri(5,"Pop","Artist7,Artist18,Artist19\nArtist20","gorsel")

        veri2Liste = ArrayList<Anasayfa2CardviewVerileri>()

        veri2Liste.add(v2_1)
        veri2Liste.add(v2_2)
        veri2Liste.add(v2_3)
        veri2Liste.add(v2_4)
        veri2Liste.add(v2_5)


        veri1Liste = AnasayfaVeri1dao().veri1TumVeriler(vt)
//        val c1 = AnasayfaCardviewVeriler(1,"Beğenilen\nŞarkılar","music.png")
//        val c2 = AnasayfaCardviewVeriler(2,"Beğenilen\nŞarkılar","music.png")
//        val c3 = AnasayfaCardviewVeriler(3,"Beğenilen\nŞarkılar","music.png")
//        val c4 = AnasayfaCardviewVeriler(4,"Beğenilen\nŞarkılar","music.png")
//
//        cardViewVerileri = ArrayList<AnasayfaCardviewVeriler>()
//        cardViewVerileri.add(c1)
//        cardViewVerileri.add(c2)
//        cardViewVerileri.add(c3)
//        cardViewVerileri.add(c4)


        Log.e("Dante ","Buradayım")
        adapter1 = AdapterAnasayfa(requireContext(),veri1Liste)
        adapter2 = AnasayfaVeri2Adapter(requireContext(),veri2Liste)



        tasarim.rv.adapter = adapter1
        tasarim.rv2.adapter = adapter2

        return tasarim.root


    }




}