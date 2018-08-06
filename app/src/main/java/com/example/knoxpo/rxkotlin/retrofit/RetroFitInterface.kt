package com.example.knoxpo.rxkotlin.retrofit

import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface RetroFitInterface  {

 // http://globalcity-20.appspot.com/api/v1/brand?category=ag9ifmdsb2JhbGNpdHktMjByFQsSCENhdGVnb3J5GICAgID62YMKDA

    @GET("brand")

     fun getBrandJSON(@Query("areaId") areaId: String): Single<BrandResponse>


}
