package com.example.tuk2020

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.example.tuk2020.activity.LoginActivity
import com.example.tuk2020.activity.MasukActivity
import com.example.tuk2020.fragment.AkunFragment
import com.example.tuk2020.fragment.HomeFragment
import com.example.tuk2020.fragment.InfoFragment
import com.example.tuk2020.helper.SharedPref
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private val fragmentHome : Fragment = HomeFragment()
    private val fragmentAkun : Fragment = AkunFragment()
    private val fragmentInfo : Fragment = InfoFragment()
    private val fm : FragmentManager = supportFragmentManager
    private var active : Fragment = fragmentHome

    private lateinit var menu : Menu
    private lateinit var menuItem : MenuItem
    private lateinit var bottomNavigationView: BottomNavigationView

    private val statusLogin = false

    private lateinit var s : SharedPref

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        s= SharedPref(this)
        setUpBottonNav()
    }

    fun setUpBottonNav(){
        fm.beginTransaction().add(R.id.container,fragmentHome) .show(fragmentHome) .commit()
        fm.beginTransaction().add(R.id.container,fragmentAkun) .hide(fragmentAkun) .commit()
        fm.beginTransaction().add(R.id.container,fragmentInfo) .hide(fragmentInfo) .commit()

        bottomNavigationView = findViewById(R.id.nav_view)
        menu = bottomNavigationView.menu
        menuItem = menu.getItem(0)
        menuItem.isChecked = true

        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId){
                R.id.navigation_home -> {
                    callFragment(0,fragmentHome)
                }
                R.id.navigation_keranjang -> {
                    callFragment(1,fragmentInfo)
                }
                R.id.navigation_akun -> {
                    if (s.getStatusLogin()){
                        callFragment(2,fragmentAkun)
                    } else {
                        startActivity(Intent(this, MasukActivity::class.java))
                    }

                }
            }
            false
        }
    }

    fun callFragment(int: Int, fragment: Fragment){
        menuItem = menu.getItem(int)
        menuItem.isChecked = true
        fm.beginTransaction().hide(active).show(fragment).commit()
        active = fragment
    }

}
