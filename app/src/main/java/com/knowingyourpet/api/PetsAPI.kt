package com.knowingyourpet.api

import com.knowingyourpet.PetsResponse
import com.knowingyourpet.util.Constants.Companion.API_KEY
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface PetsAPI {

    @GET("v1/breeds")
    suspend fun getBreeds(
        @Query("name")
        countryCode: String = "us",
        @Query("page")
        pageNumber: Int = 1,
        @Query("apiKey")
        apiKey: String = API_KEY
    ): Response<PetsResponse>

    @GET("v1/breeds")
    suspend fun search(
        @Query("name")
        searchQuery: String,
        @Query("page")
        pageNumber: Int = 1,
        @Query("apiKey")
        apiKey: String = API_KEY
    ): Response<PetsResponse>
}