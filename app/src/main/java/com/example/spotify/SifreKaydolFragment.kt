package com.example.spotify

import android.os.Bundle
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


        tasarim.buttonOturumAc.setOnClickListener {


        }


        return tasarim.root



    }


}