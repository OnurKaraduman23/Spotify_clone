package com.example.spotify

import android.content.Context
import android.os.Bundle
import android.text.TextUtils
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.spotify.databinding.FragmentSifreKaydolBinding
import com.google.android.material.snackbar.Snackbar

private lateinit var tasarim:FragmentSifreKaydolBinding
class SifreKaydolFragment : Fragment() {
    private lateinit var kullaniciListe:ArrayList<Kullanicilar>
    private lateinit var vt : DatabaseHelper
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        tasarim = FragmentSifreKaydolBinding.inflate(layoutInflater)

        val SharedPreferences = activity?.getSharedPreferences("kullaniciBilgi", Context.MODE_PRIVATE)
        val editor = SharedPreferences?.edit()

        val kullaniciAdi = SharedPreferences?.getString("email","Email bilgisi gelmedi").toString() // gelen email


        tasarim.editTextEmail.setText(kullaniciAdi)


        vt = DatabaseHelper(requireContext())
        tasarim.buttonOturumAc.setOnClickListener {
            val sifre = tasarim.editTextSifre.text.toString()
            if (TextUtils.isEmpty(kullaniciAdi)){
                Snackbar.make(tasarim.buttonOturumAc,"Kullanıcı adı boş olamaz", Snackbar.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            if (TextUtils.isEmpty(sifre)){
                Snackbar.make(tasarim.buttonOturumAc,"Şifre Boş Olamaz", Snackbar.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            Kullanicilardao().kullanicEkle(vt,kullaniciAdi, sifre)
            Navigation.findNavController(it).navigate(R.id.frag_sifre_kaydol_to_page_holer_after_login)
        }






//        tasarim.buttonOturumAc.setOnClickListener {
//
//            editor?.putString("sifre",sifre.toString())
//            editor?.commit()
//            Log.e("sifreyiyaz",sifre.toString())
//
//
//
//
//        }

        return tasarim.root





    }


}