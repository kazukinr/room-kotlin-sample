package com.github.kazukinr.room_kotlin_sample.data.dao

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Query
import com.github.kazukinr.room_kotlin_sample.data.entity.User

/**
 * Created by nara_kazuki on 2018/01/12.
 */
@Dao
interface UserDao {

    @Query("SELECT * FROM user")
    fun getAll(): List<User>
}