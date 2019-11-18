package com.dablaze.wikiapp

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.dablaze.wikiapp.ui.dashboard.FavoritesFragment
import com.dablaze.wikiapp.ui.home.ExploreFragment
import com.dablaze.wikiapp.ui.notifications.HistoryFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val exploreFragment: ExploreFragment
    private val historyFragment: HistoryFragment
    private val favoritesFragment: FavoritesFragment

    init {
        exploreFragment = ExploreFragment()
        historyFragment = HistoryFragment()
        favoritesFragment = FavoritesFragment()
    }

    private val onNavigationItemSelected =
        BottomNavigationView.OnNavigationItemSelectedListener { item ->
            val transaction = supportFragmentManager.beginTransaction()
            transaction.setCustomAnimations(android.R.anim.fade_in, android.R.anim.fade_out)
            when (item.itemId) {
                R.id.navigation_explore -> transaction.replace(
                    R.id.fragment_holder,
                    exploreFragment
                )
                R.id.navigation_favorites -> transaction.replace(
                    R.id.fragment_holder,
                    favoritesFragment
                )
                R.id.navigation_history -> transaction.replace(
                    R.id.fragment_holder,
                    historyFragment
                )
            }
            transaction.commit()
            true
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nav_view.setOnNavigationItemSelectedListener(onNavigationItemSelected)

        val transaction = supportFragmentManager.beginTransaction()
        transaction.add(R.id.fragment_holder, exploreFragment)
        transaction.commit()


    }
}
