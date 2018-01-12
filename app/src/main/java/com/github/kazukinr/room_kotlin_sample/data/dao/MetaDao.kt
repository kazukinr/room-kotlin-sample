package com.github.kazukinr.room_kotlin_sample.data.dao

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Query
import com.github.kazukinr.room_kotlin_sample.data.dto.Meta

/**
 * Created by nara_kazuki on 2018/01/12.
 */
@Dao
interface MetaDao {

    @Query("SELECT type, name, tbl_name, sql FROM sqlite_master")
    fun getAll(): List<Meta>
}
