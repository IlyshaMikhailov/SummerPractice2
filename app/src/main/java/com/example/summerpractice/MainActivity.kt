package com.example.summerpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.NavigationUI.findBottomSheetBehavior
import androidx.navigation.ui.NavigationUI.setupWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.summerpractice.databinding.ActivityContainerBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    private var binding :ActivityContainerBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
         val _binding = ActivityContainerBinding.inflate(layoutInflater)
        binding = _binding
        setContentView(_binding.root)
        val controller = (supportFragmentManager.findFragmentById(R.id.container) as NavHostFragment)
            .navController
        binding?.bnvMain?.apply {
            setupWithNavController(controller)
        }
        binding?.bnvMain?.setOnItemSelectedListener { item ->
            NavigationUI.onNavDestinationSelected(item, controller)
            return@setOnItemSelectedListener true
        }
    }
}