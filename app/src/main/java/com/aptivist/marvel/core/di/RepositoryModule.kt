package com.aptivist.marvel.core.di

import com.aptivist.marvel.data.remote.ApiHelperImp
import com.aptivist.marvel.domain.repository.RemoteRepository
import org.koin.core.module.dsl.bind
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

val repositoryModule = module {
    singleOf(::ApiHelperImp){
        bind<RemoteRepository>()
    }
}