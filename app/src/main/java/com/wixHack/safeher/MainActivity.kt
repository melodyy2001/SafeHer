package com.wixHack.safeher

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import com.wixHack.safeher.adapters.ViewPagerAdapter
import com.wixHack.safeher.fragments.HomeFragment
import com.wixHack.safeher.fragments.MapFragment
import com.wixHack.safeher.fragments.NewsFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setUpTabs()
    }

    private fun setUpTabs() {
       val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(HomeFragment(), "Home")
        adapter.addFragment(MapFragment(), "Map")
        adapter.addFragment(NewsFragment(), "News")
        val viewPager = findViewById<ViewPager>(R.id.viewpager)
        viewPager.adapter = adapter
        val tabs = findViewById<TabLayout>(R.id.tabs)
        tabs.setupWithViewPager(viewPager)

        tabs.getTabAt(0)!!.setIcon(R.drawable.ic_baseline_home_24)
        tabs.getTabAt(1)!!.setIcon(R.drawable.ic_baseline_map_24)
        tabs.getTabAt(2)!!.setIcon(R.drawable.ic_baseline_notifications_24)



    }
}