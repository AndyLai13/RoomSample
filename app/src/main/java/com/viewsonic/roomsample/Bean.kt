package com.viewsonic.roomsample

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

data class Location(
    val name: String,
    val lat: Double,
    val lngL: Double
)

enum class PostType {
    TEXT, PHOTO, VIDEO, LINK
}

@Entity(tableName = "word_table")
class Word(@PrimaryKey @ColumnInfo(name = "word") val word: String)