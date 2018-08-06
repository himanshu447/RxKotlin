package com.example.knoxpo.rxkotlin.activity

import android.support.v4.app.Fragment
import com.example.knoxpo.rxkotlin.retrofit.Fragment_Brand

class ListActivity : SingleFragmentActivity() {


    override fun getFragment(): Fragment {

        return Fragment_Brand()
    }
}