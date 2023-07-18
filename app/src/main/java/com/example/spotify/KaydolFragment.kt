package com.example.spotify

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.spotify.databinding.FragmentKaydolBinding


private lateinit var tasarim: FragmentKaydolBinding
class KaydolFragment : Fragment()  {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        tasarim = FragmentKaydolBinding.inflate(layoutInflater)



        tasarim.buttonSonraki.setOnClickListener {
//            Navigation.findNavController(it).navigate(R.id)
            Navigation.findNavController(it).navigate(R.id.frag_kaydol_to_sifre_gecis)


        }



        return tasarim.root


    }





}