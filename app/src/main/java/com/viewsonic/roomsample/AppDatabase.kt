package com.viewsonic.roomsample

import androidx.room.RoomDatabase

abstract class AppDatabase : RoomDatabase() {
    abstract fun userDao() : WordDao


    val db = Room.databaseBuilder(
        applicationContext,
        AppDatabase::class.java, "database-name"
    ).build()
}