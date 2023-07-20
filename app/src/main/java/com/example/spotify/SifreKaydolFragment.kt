package com.example.spotify

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.spotify.databinding.FragmentSifreKaydolBinding

private lateinit var tasarim:FragmentSifreKaydolBinding
class SifreKaydolFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        tasarim = FragmentSifreKaydolBinding.inflate(layoutInflater)

        val SharedPreferences = activity?.getSharedPreferences("kullaniciBilgi", Context.MODE_PRIVATE)

        val editor = SharedPreferences?.edit()

        val gelenEmail = SharedPreferences?.getString("email","Email bilgisi gelmedi")
        Log.e("email",gelenEmail.toString())
        tasarim.buttonOturumAc.setOnClickListener {


        }


        return tasarim.root



    }


}