package com.example.spotify

import android.os.Bundle
import android.util.Log
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
    private lateinit var kullaniciBilgieriListe:ArrayList<Kullanicilar>
    private lateinit var vtKullaniciAd:String
    private lateinit var vtKullaniciSifre:String
    private lateinit var editTextKullaniciAdi :String
    private lateinit var editTextSifre :String

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        tasarim = FragmentKayitliKullaniciGirisBinding.inflate(layoutInflater)
        val bundle : KayitliKullaniciGirisFragmentArgs by navArgs()
        val gelenKullaniciAdi = bundle.kullaniciAdi
        val gelenSifre = bundle.kullaniciSifre


        vt = DatabaseHelper(requireContext())

        kullaniciBilgieriListe = Kullanicilardao().KullaniciGetir(vt)

        for (i in kullaniciBilgieriListe){

            vtKullaniciAd = i.kullanici_ad
            vtKullaniciSifre = i.kullanici_sifre
        }

        tasarim.editTextEmail2.setText(gelenKullaniciAdi).toString()
        tasarim.editTextSifre.setText(gelenSifre).toString()

        tasarim.buttonOturumAc2.setOnClickListener {


            editTextKullaniciAdi = tasarim.editTextEmail2.text.toString().trim()
            editTextSifre = tasarim.editTextSifre.text.toString().trim()


            if (vtKullaniciAd == editTextKullaniciAdi && vtKullaniciSifre == editTextSifre){
                Toast.makeText(requireContext(),"Gelen kullanıcı adı ${vtKullaniciAd} - $vtKullaniciSifre \n Giriş Başarılı ",Toast.LENGTH_LONG).show()
                Navigation.findNavController(it).navigate(R.id.frag_kayitli_kullanici_to_anasayfa)
            }else{
                Toast.makeText(requireContext(),"Kullanıcı adı veya şifre yanlış",Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }
        }

        return tasarim.root
    }


}