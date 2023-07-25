package com.example.spotify

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import com.example.spotify.databinding.ActivityMainBinding

private lateinit var tasarim:ActivityMainBinding
class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tasarim = ActivityMainBinding.inflate(layoutInflater)
        setContentView(tasarim.root)



        // toolbar ve back arrow
        //app theme dark yapıldı. Beyaz back arrow için
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.fragmentContainerView2) as NavHostFragment
        navHostFragment.findNavController().run {

                tasarim.toolbar3.setupWithNavController(this, AppBarConfiguration(graph))
        }


    }

}


