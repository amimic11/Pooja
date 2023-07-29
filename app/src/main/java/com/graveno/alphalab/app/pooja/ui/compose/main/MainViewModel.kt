package com.graveno.alphalab.app.pooja.ui.compose.main

import androidx.lifecycle.ViewModel
import com.graveno.alphalab.app.pooja.data.repository.AppRepository
import com.graveno.alphalab.app.pooja.data.repository.RepositoryImpl
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

private const val TAG : String = "MainVM"
@HiltViewModel
class MainViewModel @Inject constructor(
    private val repositoryImpl: AppRepository
) : ViewModel() {
    private val TAG : String = "MainViewModel"
}