package com.github.kazukinr.room_kotlin_sample.data

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import com.github.kazukinr.room_kotlin_sample.data.dao.MetaDao
import com.github.kazukinr.room_kotlin_sample.data.dao.UserDao
import com.github.kazukinr.room_kotlin_sample.data.entity.User

/**
 * Created by nara_kazuki on 2018/01/12.
 */
@Database(
        version = 1,
        entities = arrayOf(
                User::class
        ),
        exportSchema = false
)
abstract class MyDatabase : RoomDatabase() {

    abstract fun metaDao(): MetaDao

    abstract fun userDao(): UserDao
}
