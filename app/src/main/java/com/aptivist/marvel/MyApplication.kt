package com.aptivist.marvel

import android.app.Application
import com.aptivist.marvel.core.di.appModule
import com.aptivist.marvel.core.di.networkModule
import com.aptivist.marvel.core.di.repositoryModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin{
            androidLogger(Level.DEBUG)
            androidContext(this@MyApplication)
            modules(
                appModule,repositoryModule, networkModule
            )
        }
    }
}