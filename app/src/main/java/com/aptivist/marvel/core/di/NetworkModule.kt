package com.aptivist.marvel.core.di

import com.aptivist.challengeapis.BuildConfig.*
import com.aptivist.marvel.data.remote.ApiHelperImp
import com.aptivist.marvel.data.remote.HashInterceptor
import com.aptivist.marvel.data.remote.IApiMarvel
import com.aptivist.marvel.domain.repository.RemoteRepository
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.core.module.dsl.bind
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val networkModule = module {
    factory { providesOkHttpClient() }
    single { provideRetrofit(get()) }
    single { providesApiMarvel(get()) }
    singleOf(::ApiHelperImp){
        bind<RemoteRepository>()
    }
}

fun providesOkHttpClient(): OkHttpClient =
    OkHttpClient
        .Builder()
        .addInterceptor(HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))
        .addInterceptor(HashInterceptor())
        .build()

fun provideRetrofit(okHttpClient: OkHttpClient): Retrofit = Retrofit.Builder()
    .addConverterFactory(GsonConverterFactory.create())
    .baseUrl(BASE_URL)
    .client(okHttpClient)
    .build()

fun providesApiMarvel(retrofit: Retrofit) : IApiMarvel = retrofit.create(IApiMarvel::class.java)