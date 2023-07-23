package com.example.spotify

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import com.example.spotify.databinding.FragmentAnasayfaBinding

private lateinit var tasarim:FragmentAnasayfaBinding
class AnasayfaFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        tasarim = FragmentAnasayfaBinding.inflate(layoutInflater)
        return tasarim.root

        tasarim.toolbar.setTitle("İyi Akşamlar")




    }


}