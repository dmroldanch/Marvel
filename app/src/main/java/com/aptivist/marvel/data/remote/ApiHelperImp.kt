package com.aptivist.marvel.data.remote

import com.aptivist.marvel.core.utils.Resource
import com.aptivist.marvel.domain.repository.RemoteRepository
import com.aptivist.marvel.domain.models.Result
import com.aptivist.marvel.domain.toDomain

class ApiHelperImp(private val apiService: IApiMarvel) : RemoteRepository {
    override suspend fun getCharacters(): Resource<List<Result>> {
        try {
            val reponse = apiService.getCharacters()

            val data = reponse.body()?.data?.results?.map { item ->
                item.toDomain()
            }
            return Resource.Success(data ?: emptyList())
        }catch (e:Exception){
            return Resource.Failure(e.message)
        }
    }

}