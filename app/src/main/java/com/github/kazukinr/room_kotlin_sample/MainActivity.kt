package com.github.kazukinr.room_kotlin_sample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.github.kazukinr.room_kotlin_sample.data.MyDatabase
import com.github.kazukinr.room_kotlin_sample.repository.MetaRepository
import dagger.android.AndroidInjection
import io.reactivex.android.schedulers.AndroidSchedulers
import timber.log.Timber
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var metaRepository: MetaRepository

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AndroidInjection.inject(this)
        setContentView(R.layout.activity_main)

        showMetaData()
    }

    private fun showMetaData() {
        metaRepository.getAll()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({
                    Timber.i("count : ${it.size}")

                }, { Timber.e(it) })
    }
}
