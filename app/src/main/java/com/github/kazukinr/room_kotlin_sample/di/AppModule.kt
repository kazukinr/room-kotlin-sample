package com.github.kazukinr.room_kotlin_sample.di

import android.app.Application
import android.arch.persistence.room.Room
import android.content.Context
import com.github.kazukinr.room_kotlin_sample.App
import com.github.kazukinr.room_kotlin_sample.data.MyDatabase
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by kazuki on 2018/01/13.
 */
@Module
class AppModule {

    @Provides
    fun provideApplicationContext(application: Application): Context = application.applicationContext

    @Provides
    @Singleton
    fun provideMyDatabase(context: Context): MyDatabase {
        return Room.databaseBuilder(context, MyDatabase::class.java, "sample.db")
                .build()
    }
}