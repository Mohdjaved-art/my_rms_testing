package com.eapro.myapplication
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.NavController
import com.google.android.material.navigation.NavigationView
import android.widget.Toast
import androidx.navigation.fragment.NavHostFragment
import com.eapro.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var navController: NavController
    private lateinit var drawerLayout: DrawerLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Using ViewBinding to easily access views
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val menuIcon: ImageView = findViewById(R.id.menu_icon)
        menuIcon.setOnClickListener {
            drawerLayout.openDrawer(GravityCompat.START)
        }


        // Set up NavController and DrawerLayout
        navController = (supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment).navController
        drawerLayout = binding.drawerLayout

        // Set up the NavigationView
        val navigationView: NavigationView = binding.navigationView
        navigationView.setNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.nav_dashboard -> {
                    navController.navigate(R.id.nav_dashboard)
                }
                R.id.nav_alert -> {
                    navController.navigate(R.id.alertFragment)
                }
                R.id.nav_data -> {
                    navController.navigate(R.id.nav_data)
                }
                R.id.nav_inverter_setting -> {
                    navController.navigate(R.id.inverterSettingFragment)
                }
                R.id.nav_download -> {
                    navController.navigate(R.id.downloadFragment)
                }
                R.id.nav_video_tutorial -> {
                    navController.navigate(R.id.nav_video_tutorial)
                }
                R.id.nav_add_new_system -> {
                    navController.navigate(R.id.nav_add_new_system)
                }
                R.id.nav_my_solar_status -> {
                    navController.navigate(R.id.nav_my_solar_status)
                }
                R.id.nav_logout -> {
                    // Implement logout functionality
                    Toast.makeText(this, "Logging out", Toast.LENGTH_SHORT).show()
                    // Add your logout code here
                }
                else -> {
                    false
                }
            }
            drawerLayout.closeDrawer(GravityCompat.START)
            true
        }
    }
}





