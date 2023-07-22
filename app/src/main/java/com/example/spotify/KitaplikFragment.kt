package com.example.spotify

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.spotify.databinding.FragmentAraBinding
import com.example.spotify.databinding.FragmentKitaplikBinding

private lateinit var tasarim:FragmentKitaplikBinding
class KitaplikFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        tasarim = FragmentKitaplikBinding.inflate(layoutInflater)
        return tasarim.root
    }


}