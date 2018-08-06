package com.example.knoxpo.rxkotlin.retrofit

import com.example.knoxpo.rxkotlin.model.Brand
import com.google.gson.annotations.SerializedName

class BrandResponse {

    @SerializedName("brands")

     var mBrands: List<Brand>? = null
}