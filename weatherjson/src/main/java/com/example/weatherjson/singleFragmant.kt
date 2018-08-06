package com.example.weatherjson

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager

abstract class singleFragmant : AppCompatActivity() {

    abstract fun getFragment(): Fragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_single_fragmant)

        var fm: FragmentManager = supportFragmentManager

        var ext: Fragment? = fm.findFragmentById(R.id.Frame_cintainer)

        if (ext == null) {
            fm.beginTransaction()
                    .replace(R.id.Frame_cintainer, getFragment())
                    .commit()
        }
    }
}
