package com.example.fetchingdatafromnetwork.api

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface TheCatApiService {
    @GET("images/search")
    fun searchImages(
        @Query("linit") limit: Int,
        @Query("size") format: String
    ): Call<String>

}