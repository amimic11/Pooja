package com.graveno.alphalab.app.pooja.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.graveno.alphalab.app.pooja.data.db.dao.GodModelDao
import com.graveno.alphalab.app.pooja.data.db.typeconverter.AppTypeConverter
import com.graveno.alphalab.app.pooja.data.model.God

@Database(
    entities = [God::class],
    version = 1
)
@TypeConverters(AppTypeConverter::class)
abstract class AppDatabase : RoomDatabase() {
    abstract fun godModelDao() : GodModelDao
}