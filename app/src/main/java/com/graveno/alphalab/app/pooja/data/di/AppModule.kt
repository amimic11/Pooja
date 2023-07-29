package com.graveno.alphalab.app.pooja.data.di

import android.content.Context
import androidx.room.Room
import com.graveno.alphalab.app.pooja.data.db.AppDatabase
import com.graveno.alphalab.app.pooja.data.db.dao.GodModelDao
import com.graveno.alphalab.app.pooja.data.repository.AppRepository
import com.graveno.alphalab.app.pooja.data.repository.RepositoryImpl
import com.graveno.alphalab.app.pooja.util.Common
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object AppModule {

    @Provides
    @Singleton
    fun provideRoomDatabase(@ApplicationContext context: Context) : AppDatabase =
        Room.databaseBuilder(
        context,
        AppDatabase::class.java,
        Common.AppDatabase
    ).build()

    @Provides
    @Singleton
    fun provideAartiDao(database : AppDatabase) : GodModelDao{
        return database.godModelDao()
    }

    @Provides
    @Singleton
    fun provideAppRepository(
        @ApplicationContext context: Context,
        godModelDao: GodModelDao
    ) : AppRepository = RepositoryImpl(
        context = context,
        godModelDao = godModelDao
    )
 }