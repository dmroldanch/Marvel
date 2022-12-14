package com.aptivist.marvel.data.remote

import com.aptivist.marvel.data.remote.models.DataDTO
import retrofit2.Response
import retrofit2.http.GET

interface IApiMarvel {
    @GET("characters")
    suspend fun getCharacters(): Response<DataDTO>
}