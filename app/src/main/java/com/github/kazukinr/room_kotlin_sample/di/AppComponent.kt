package com.github.kazukinr.room_kotlin_sample.di

import android.app.Application
import com.github.kazukinr.room_kotlin_sample.App
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton

/**
 * Created by kazuki on 2018/01/13.
 */
@Singleton
@Component(modules = arrayOf(AndroidInjectionModule::class, AndroidModule::class))
interface AppComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }

    fun inject(app: App)
}