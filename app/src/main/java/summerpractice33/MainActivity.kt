package ru.itis.summerpractice24

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val controller = (supportFragmentManager.findFragmentById(R.id.nav_host_fragment_container) as NavHostFragment)
            .navController
        findViewById<BottomNavigationView>(R.id.bottomNavigationView).apply {
            setupWithNavController(controller)
        }
    }
}
