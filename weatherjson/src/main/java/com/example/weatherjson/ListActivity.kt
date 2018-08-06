package com.example.weatherjson

import android.support.v4.app.Fragment

class ListActivity : singleFragmant() {


    override fun getFragment(): Fragment {
        return ListFragment()
    }
}