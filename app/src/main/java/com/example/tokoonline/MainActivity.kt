  package com.example.tokoonline

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.example.tokoonline.activity.LoginActivity
import com.example.tokoonline.fargment.AkunFragment
import com.example.tokoonline.fargment.HomeFragment
import com.example.tokoonline.fargment.KeranjangFragment
import com.example.tokoonline.helper.SharedPref
import com.google.android.material.bottomnavigation.BottomNavigationView

  class MainActivity : AppCompatActivity() {

      val  fargmentHome : Fragment = HomeFragment()
      val  fargmentAkun : Fragment = AkunFragment()
      val  fargmentKeranjang : Fragment = KeranjangFragment()
      val fm : FragmentManager = supportFragmentManager
      var active : Fragment = fargmentHome

      private lateinit var menu: Menu
      private lateinit var menuItem: MenuItem
      private lateinit var bottomNavigationView : BottomNavigationView

      private var statusLogin = false

      private lateinit var s: SharedPref

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        s = SharedPref(this)
        setUpBottomNav()
    }
      fun setUpBottomNav(){

          fm.beginTransaction().add(R.id.container, fargmentHome).show(fargmentHome).commit()
          fm.beginTransaction().add(R.id.container, fargmentAkun).hide(fargmentAkun).commit()
          fm.beginTransaction().add(R.id.container, fargmentKeranjang).hide(fargmentKeranjang).commit()

          bottomNavigationView = findViewById(R.id.nav_view)
          menu        = bottomNavigationView.menu
          menuItem    = menu.getItem(0)
          menuItem.isChecked = true

          bottomNavigationView.setOnNavigationItemSelectedListener {
                  item ->
              when(item.itemId){
                  R.id.navigation_home->{
                      callFragment(0, fargmentHome)
                  }
                  R.id.navigation_keranjang->{
                      callFragment(1, fargmentKeranjang)
                  }
                  R.id.navigation_akun->{
                      if (s.getStatusLogin()){
                          callFragment(2, fargmentAkun)
                      }
                      else{
                       startActivity(Intent(this,LoginActivity::class.java))
                      }

                  }
              }
              false
          }
      }
      fun callFragment(int: Int, fragment: Fragment){
          menuItem    = menu.getItem(int)
          menuItem.isChecked = true
          fm.beginTransaction().hide(active).show(fragment).commit()
          active = fragment
      }
}
