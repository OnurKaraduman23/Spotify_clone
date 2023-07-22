package com.example.spotify

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.spotify.databinding.FragmentAraBinding

private lateinit var tasarim:FragmentAraBinding
class AraFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        tasarim = FragmentAraBinding.inflate(layoutInflater)
        return tasarim.root
    }


}