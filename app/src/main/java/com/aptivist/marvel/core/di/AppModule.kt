package com.aptivist.marvel.core.di

import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.dsl.module
import com.aptivist.marvel.presentation.MainViewModel

val appModule = module {
    viewModelOf(::MainViewModel)
}