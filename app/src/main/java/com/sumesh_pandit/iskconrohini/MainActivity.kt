package com.sumesh_pandit.iskconrohini

import android.os.Bundle
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val bottomNavigationView=findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        val navController= findNavController(R.id.fragment)
        bottomNavigationView.setupWithNavController(navController)
        val appBarConfiguration= AppBarConfiguration(
            setOf(
                R.id.home2,
                R.id.firstFragment,
                R.id.secondFragment,
                R.id.thirdFragment
            )
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        bottomNavigationView.setupWithNavController(navController)
          supportActionBar?.title = "ISKCON Rohini"

    }
}