package com.example.myapplication2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView


class RecyclerView<T> : AppCompatActivity() {
    private var content :FrameLayout?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)
        val navigation : BottomNavigationView=findViewById(R.id.bottom_navigation)
      //  navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)

        navigation.setOnNavigationItemSelectedListener(BottomNavigationView.OnNavigationItemSelectedListener { item ->
            when(item.itemId)
            {
                R.id.marvel ->
                {
                    val fragment = MarvelFragment()
                    addFragment(fragment)
                    return@OnNavigationItemSelectedListener true
                }
                R.id.dc ->
                {
                    val fragment = DcFragment1()
                    addFragment(fragment)
                    return@OnNavigationItemSelectedListener true
                }
                 else -> false
            }
        })
        val fragment = MarvelFragment()
        addFragment(fragment)

    }
    /*private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when(item.itemId)
        {
            R.id.marvel ->
            {
                val fragment = MarvelFragment()
                addFragment(fragment)
                return@OnNavigationItemSelectedListener true
            }
            R.id.dc ->
            {
                val fragment = DcFragment()
                addFragment(fragment)
                return@OnNavigationItemSelectedListener true
            }
            else -> false
        }
    }*/

    private fun addFragment(fragment : Fragment) {
    supportFragmentManager.beginTransaction().replace(R.id.content,fragment,fragment.javaClass.simpleName).commit()
    }
}