package com.github.kazukinr.room_kotlin_sample

import android.app.Activity
import android.app.Application
import com.github.kazukinr.room_kotlin_sample.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import timber.log.Timber
import javax.inject.Inject

/**
 * Created by kazuki on 2018/01/13.
 */
class App : Application(), HasActivityInjector {

    @Inject
    lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Activity>

    override fun activityInjector(): AndroidInjector<Activity> = dispatchingAndroidInjector

    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())

        val objectGraph = DaggerAppComponent
                .builder()
                .application(this)
                .build()
        objectGraph.inject(this)
    }
}
