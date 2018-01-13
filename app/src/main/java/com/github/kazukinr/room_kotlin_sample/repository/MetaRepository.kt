package com.github.kazukinr.room_kotlin_sample.repository

import com.github.kazukinr.room_kotlin_sample.data.MyDatabase
import com.github.kazukinr.room_kotlin_sample.data.dto.Meta
import io.reactivex.Single
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

/**
 * Created by kazuki on 2018/01/13.
 */
class MetaRepository @Inject constructor(private val database: MyDatabase) {

    fun getAll(): Single<List<Meta>> {
        return Single.fromCallable { database.metaDao().getAll() }
                .subscribeOn(Schedulers.io())
    }
}
