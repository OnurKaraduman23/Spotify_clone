package com.example.spotify

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.view.Display.Mode
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.transition.Visibility
import com.example.spotify.databinding.FragmentKaydolBinding


private lateinit var tasarim: FragmentKaydolBinding
class KaydolFragment : Fragment()  {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        tasarim = FragmentKaydolBinding.inflate(layoutInflater)


        //veri kaydetme işlemi



        val SharedPreferences = activity?.getSharedPreferences("kullaniciBilgi",Context.MODE_PRIVATE)

        val editor = SharedPreferences?.edit()




        tasarim.buttonSonraki.setOnClickListener {

            val emailInput = tasarim.editTextText.text.toString()

            editor?.putString("email",emailInput)
            editor?.commit()

            Navigation.findNavController(it).navigate(R.id.frag_kaydol_to_sifre_gecis)


        }



        return tasarim.root


    }





}