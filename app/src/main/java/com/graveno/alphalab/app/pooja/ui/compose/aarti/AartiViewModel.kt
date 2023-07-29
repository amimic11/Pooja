package com.graveno.alphalab.app.pooja.ui.compose.aarti

import androidx.lifecycle.ViewModel
import com.graveno.alphalab.app.pooja.data.repository.RepositoryImpl
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class AartiViewModel @Inject constructor(
    repository : RepositoryImpl
) : ViewModel() {
    val TAG : String = "AartiViewModel"

}