package com.github.kazukinr.room_kotlin_sample.data.dto

import android.arch.persistence.room.ColumnInfo

/**
 * Created by nara_kazuki on 2018/01/12.
 */
data class Meta(var type: String,
                var name: String,
                @ColumnInfo(name = "tbl_name") var tableName: String?,
                var sql: String?)