package com.example.spotify

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import com.example.spotify.databinding.FragmentKayitliKullaniciGirisBinding

private lateinit var tasarim:FragmentKayitliKullaniciGirisBinding
class KayitliKullaniciGirisFragment : Fragment() {

    private lateinit var vt:DatabaseHelper
    private lateinit var kullaniciBilgieri:ArrayList<Kullanicilar>
    private lateinit var vtKullaniciAd:String
    private lateinit var vtKullaniciSifre:String


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        tasarim = FragmentKayitliKullaniciGirisBinding.inflate(layoutInflater)
        val bundle : KayitliKullaniciGirisFragmentArgs by navArgs()
        val gelenKullaniciAdi = bundle.kullaniciAdi
        val gelenSifre = bundle.kullaniciSifre


        tasarim.editTextEmail2.setText(gelenKullaniciAdi)
        tasarim.editTextSifre.setText(gelenSifre)

        tasarim.buttonOturumAc2.setOnClickListener {
            Toast.makeText(requireContext(),"deneme",Toast.LENGTH_LONG).show()
        }

        return tasarim.root
    }


}