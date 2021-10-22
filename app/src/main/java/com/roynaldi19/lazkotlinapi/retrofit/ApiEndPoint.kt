package com.roynaldi19.lazkotlinapi.retrofit

import com.roynaldi19.lazkotlinapi.MainModel
import retrofit2.Call
import retrofit2.http.GET

interface ApiEndPoint {
    @GET("photos")
    fun getPhotos(): Call<List<MainModel>>
}