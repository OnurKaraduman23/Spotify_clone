package com.example.spotify

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import com.example.spotify.databinding.FragmentGirisBinding
import com.google.android.material.snackbar.Snackbar

private lateinit var tasarim:FragmentGirisBinding
class GirisFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        tasarim = FragmentGirisBinding.inflate(layoutInflater)


        tasarim.buttonKaydol.setOnClickListener {

            Navigation.findNavController(it).navigate(R.id.frag_giris_to_kaydol_gecis)

        }
        tasarim.textViewOturumAc.setOnClickListener{
            Snackbar.make(tasarim.imageView4,"Kullanıcı adı: deneme@gmail.com\n Sifre:1234 Oturum açmak istiyor musunuz?",Snackbar.LENGTH_SHORT)
                .setAction("EVET"){

                }.show()
        }

        return tasarim.root
    }


}