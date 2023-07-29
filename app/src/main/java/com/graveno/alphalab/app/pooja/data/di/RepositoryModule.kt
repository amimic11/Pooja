package com.graveno.alphalab.app.pooja.data.di

import android.content.Context
import com.graveno.alphalab.app.pooja.data.db.dao.GodModelDao
import com.graveno.alphalab.app.pooja.data.repository.RepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.qualifiers.ApplicationContext

private const val TAG : String = "Repository"

@Module
@InstallIn(ViewModelComponent::class)
object RepositoryModule {

    @Provides
    fun provideAppRepository(
        godModelDao: GodModelDao,
        @ApplicationContext context: Context
    ) : RepositoryImpl = RepositoryImpl(context = context, godModelDao = godModelDao)

}