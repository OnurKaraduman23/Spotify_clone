package com.example.spotify

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import com.example.spotify.databinding.FragmentGirisBinding
import com.google.android.material.snackbar.Snackbar

private lateinit var tasarim:FragmentGirisBinding
class GirisFragment : Fragment() {

    private lateinit var kullaniciList:ArrayList<Kullanicilar>
    private lateinit var vt : DatabaseHelper
    private lateinit var kullaniciAdi : String
    private lateinit var kullaniciSifre : String

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        tasarim = FragmentGirisBinding.inflate(layoutInflater)

        vt = DatabaseHelper(requireContext())

        kullaniciList = Kullanicilardao().KullaniciGetir(vt)
       for (k in kullaniciList){
           kullaniciAdi = k.kullanici_ad
           kullaniciSifre = k.kullanici_sifre
       }




        tasarim.buttonKaydol.setOnClickListener {

            Navigation.findNavController(it).navigate(R.id.frag_giris_to_kaydol_gecis)

        }
        tasarim.textViewOturumAc.setOnClickListener{
            val gecis = GirisFragmentDirections.fragGirisToKayitliKullaniciGiris(kullaniciAdi,kullaniciSifre)
            Navigation.findNavController(it).navigate(gecis)


        }

        return tasarim.root
    }


}