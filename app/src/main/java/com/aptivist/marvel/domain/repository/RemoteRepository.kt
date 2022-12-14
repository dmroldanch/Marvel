package com.aptivist.marvel.domain.repository

import com.aptivist.marvel.core.utils.Resource
import com.aptivist.marvel.domain.models.Data
import com.aptivist.marvel.domain.models.DataX
import com.aptivist.marvel.domain.models.Result
import retrofit2.Response

interface RemoteRepository  {
    suspend fun getCharacters(): Resource<List<Result>>
}