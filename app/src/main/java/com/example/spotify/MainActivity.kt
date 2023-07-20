package com.example.spotify

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import com.example.spotify.databinding.ActivityMainBinding

private lateinit var binding:ActivityMainBinding
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        // toolbar ve back arrow
        //app theme dark yapıldı. Beyaz back arrow için
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.fragmentContainerView2) as NavHostFragment
        navHostFragment.findNavController().run {

                binding.toolbar3.setupWithNavController(this, AppBarConfiguration(graph))
        }


    }

}


