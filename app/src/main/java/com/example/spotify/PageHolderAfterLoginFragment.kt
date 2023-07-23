package com.example.spotify

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.example.spotify.databinding.FragmentPageHolderAfterLoginBinding

private lateinit var tasarim:FragmentPageHolderAfterLoginBinding
class PageHolderAfterLoginFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        tasarim = FragmentPageHolderAfterLoginBinding.inflate(layoutInflater)

        // fragment iç fragemnt
        val navHostFragment = childFragmentManager
            .findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        NavigationUI.setupWithNavController(tasarim.bottomNav, navHostFragment.navController)

        return tasarim.root
    }

}