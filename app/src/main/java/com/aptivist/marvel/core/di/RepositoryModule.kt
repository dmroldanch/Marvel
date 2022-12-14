package com.aptivist.marvel.core.di

import com.aptivist.marvel.data.remote.ApiHelperImp
import com.aptivist.marvel.domain.repository.RemoteRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    abstract  fun bindRepositoryMarvel(apiHelperImp: ApiHelperImp) : RemoteRepository
}