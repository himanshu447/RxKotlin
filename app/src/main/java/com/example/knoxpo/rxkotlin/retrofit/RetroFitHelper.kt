package com.example.knoxpo.rxkotlin.retrofit

import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class RetroFitHelper  {

    companion object {

        fun getRetrofit() : Retrofit {

            return  Retrofit.Builder()
                    .baseUrl("http://globalcity-20.appspot.com/api/v1/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .build()
        }
    }
}