package com.graveno.alphalab.app.pooja.ui.compose.chalisa

import androidx.lifecycle.ViewModel
import com.graveno.alphalab.app.pooja.data.repository.RepositoryImpl
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ChalisaViewModel @Inject constructor(val repository : RepositoryImpl) : ViewModel() {

}