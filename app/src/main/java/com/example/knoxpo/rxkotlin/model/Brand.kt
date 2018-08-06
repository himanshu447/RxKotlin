package com.example.knoxpo.rxkotlin.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.util.*

class Brand {

    val mBrandId: UUID

    constructor() {
        this.mBrandId = UUID.randomUUID()
    }

    @SerializedName("brandName")
    @Expose
     var mBrandName: String? = null
}