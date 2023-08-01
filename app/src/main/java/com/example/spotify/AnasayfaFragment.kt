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
    private lateinit var adapter3: AnasayfaVeri3Adapter
    private lateinit var adapter4: Anasayfa4Adapter
    private lateinit var vt:DatabaseHelper
    private lateinit var veri1Liste:ArrayList<AnasayfaVeri1>
    private lateinit var veri2Liste:ArrayList<Anasayfa2CardviewVerileri>
    private lateinit var veri3Liste:ArrayList<Anasayfa3CardViewVerileri>
    private lateinit var veri4Liste:ArrayList<Anasayfa4CardViewVerileri>
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
        tasarim.rv3.setHasFixedSize(true)
        tasarim.rv4.setHasFixedSize(true)
//        tasarim.rv.layoutManager = LinearLayoutManager(requireContext())
        tasarim.rv.layoutManager = StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.HORIZONTAL)
        tasarim.rv2.layoutManager = StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.HORIZONTAL)
        tasarim.rv3.layoutManager = StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.HORIZONTAL)
        tasarim.rv4.layoutManager = StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.HORIZONTAL)

        vt = DatabaseHelper(requireContext())

        val v2_1 = Anasayfa2CardviewVerileri(1,"Pop","v2Artist1,Artist2,Artist3\nArtist4","gorsel")
        val v2_2 = Anasayfa2CardviewVerileri(2,"Pop","v2Artist5,Artist6,Artist7\nArtist8","gorsel")
        val v2_3 = Anasayfa2CardviewVerileri(3,"Pop","v2Artist9,Artist10,Artist11\nArtist12","gorsel")
        val v2_4 = Anasayfa2CardviewVerileri(4,"Pop","v2Artist13,Artist14,Artist15\nArtist16","gorsel")
        val v2_5 = Anasayfa2CardviewVerileri(5,"Pop","v2Artist7,Artist18,Artist19\nArtist20","gorsel")


        val v3_1 = Anasayfa3CardViewVerileri(1,"Pop","v3Artist1,Artist2,Artist3\nArtist4","gorsel")
        val v3_2 = Anasayfa3CardViewVerileri(2,"Pop","v3Artist5,Artist6,Artist7\nArtist8","gorsel")
        val v3_3 = Anasayfa3CardViewVerileri(3,"Pop","v3Artist9,Artist10,Artist11\nArtist12","gorsel")
        val v3_4 = Anasayfa3CardViewVerileri(4,"Pop","v3Artist13,Artist14,Artist15\nArtist16","gorsel")
        val v3_5 = Anasayfa3CardViewVerileri(5,"Pop","v3Artist7,Artist18,Artist19\nArtist20","gorsel")

        val v4_1 = Anasayfa4CardViewVerileri(1,"Pop","v4Artist1,Artist2,Artist3\nArtist4","gorsel")
        val v4_2 = Anasayfa4CardViewVerileri(2,"Pop","v4Artist5,Artist6,Artist7\nArtist8","gorsel")
        val v4_3 = Anasayfa4CardViewVerileri(3,"Pop","v4Artist9,Artist10,Artist11\nArtist12","gorsel")
        val v4_4 = Anasayfa4CardViewVerileri(4,"Pop","v4Artist13,Artist14,Artist15\nArtist16","gorsel")
        val v4_5 = Anasayfa4CardViewVerileri(5,"Pop","v4Artist7,Artist18,Artist19\nArtist20","gorsel")
        veri2Liste = ArrayList<Anasayfa2CardviewVerileri>()
        veri3Liste = ArrayList<Anasayfa3CardViewVerileri>()
        veri4Liste = ArrayList<Anasayfa4CardViewVerileri>()

        veri2Liste.add(v2_1)
        veri2Liste.add(v2_2)
        veri2Liste.add(v2_3)
        veri2Liste.add(v2_4)
        veri2Liste.add(v2_5)

        veri3Liste.add(v3_1)
        veri3Liste.add(v3_2)
        veri3Liste.add(v3_3)
        veri3Liste.add(v3_4)
        veri3Liste.add(v3_5)

        veri4Liste.add(v4_1)
        veri4Liste.add(v4_2)
        veri4Liste.add(v4_3)
        veri4Liste.add(v4_4)
        veri4Liste.add(v4_5)


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
        adapter3 = AnasayfaVeri3Adapter(requireContext(),veri3Liste)
        adapter4 = Anasayfa4Adapter(requireContext(),veri4Liste)



        tasarim.rv.adapter = adapter1
        tasarim.rv2.adapter = adapter2
        tasarim.rv3.adapter = adapter3
        tasarim.rv4.adapter = adapter4

        return tasarim.root


    }




}