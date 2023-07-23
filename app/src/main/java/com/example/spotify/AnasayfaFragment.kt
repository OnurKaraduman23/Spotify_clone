package com.example.spotify

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentActivity
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.spotify.databinding.FragmentAnasayfaBinding
import kotlin.math.log

private lateinit var tasarim:FragmentAnasayfaBinding
class AnasayfaFragment : Fragment(AppCompatActivity.MODE_PRIVATE) {


    private lateinit var cardViewVerileri : ArrayList<AnasayfaCardviewVeriler>
    private lateinit var adapter: AdapterAnasayfa
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        tasarim = FragmentAnasayfaBinding.inflate(layoutInflater)


        tasarim.toolbar.setTitle("İyi Akşamlar")

        tasarim.rv.setHasFixedSize(true)
//        tasarim.rv.layoutManager = LinearLayoutManager(requireContext())
        tasarim.rv.layoutManager = StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.HORIZONTAL)


        val c1 = AnasayfaCardviewVeriler(1,"Beğenilen\nŞarkılar","music.png")
        val c2 = AnasayfaCardviewVeriler(2,"Beğenilen\nŞarkılar","music.png")
        val c3 = AnasayfaCardviewVeriler(3,"Beğenilen\nŞarkılar","music.png")
        val c4 = AnasayfaCardviewVeriler(4,"Beğenilen\nŞarkılar","music.png")

        cardViewVerileri = ArrayList<AnasayfaCardviewVeriler>()
        cardViewVerileri.add(c1)
        cardViewVerileri.add(c2)
        cardViewVerileri.add(c3)
        cardViewVerileri.add(c4)



        adapter = AdapterAnasayfa(requireContext(),cardViewVerileri)




        tasarim.rv.adapter = adapter

        return tasarim.root


    }


}