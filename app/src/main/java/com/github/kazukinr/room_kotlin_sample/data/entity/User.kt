package com.github.kazukinr.room_kotlin_sample.data.entity

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

/**
 * Created by nara_kazuki on 2018/01/12.
 */
@Entity
data class User(@PrimaryKey var id: Long,
                var name: String?)
