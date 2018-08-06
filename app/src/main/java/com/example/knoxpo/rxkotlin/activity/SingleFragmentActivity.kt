package com.example.knoxpo.rxkotlin.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import com.example.knoxpo.rxkotlin.R

abstract class SingleFragmentActivity : AppCompatActivity() {

    abstract fun getFragment() : Fragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_single_fragment)

        var fm = supportFragmentManager

        var ext : Fragment? = fm.findFragmentById(R.id.frame_container)

        if(ext==null)
        {
            fm.beginTransaction()
                    .replace(R.id.frame_container,getFragment())
                    .commit()
        }
    }
}

