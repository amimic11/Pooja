package com.graveno.alphalab.app.pooja.ui.compose.home

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.collectAsState
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.graveno.alphalab.app.pooja.data.model.BottomBarModel
import com.graveno.alphalab.app.pooja.data.repository.RepositoryImpl
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(val repositoryImpl : RepositoryImpl) : ViewModel() {

    val bottomBarList = repositoryImpl.bottomNavigationList

    fun prepareBottomBarList() {
        viewModelScope.launch {
            repositoryImpl.prepBottomBarList()
        }
    }
}