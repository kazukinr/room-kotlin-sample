package com.github.kazukinr.room_kotlin_sample.di

import com.github.kazukinr.room_kotlin_sample.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by kazuki on 2018/01/13.
 */
@Module(includes = arrayOf(
        AppModule::class
))
abstract class AndroidModule {

    @ContributesAndroidInjector
    abstract fun contributeMainActivity(): MainActivity
}