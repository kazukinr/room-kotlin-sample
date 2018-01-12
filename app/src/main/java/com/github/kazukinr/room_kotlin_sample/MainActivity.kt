package com.github.kazukinr.room_kotlin_sample

import android.arch.persistence.room.Room
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.github.kazukinr.room_kotlin_sample.data.MyDatabase

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val database = Room.databaseBuilder(applicationContext, MyDatabase::class.java, "sample.db")
                .build()

        
    }
}
