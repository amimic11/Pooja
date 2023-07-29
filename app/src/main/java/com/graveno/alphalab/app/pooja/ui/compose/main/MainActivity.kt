package com.graveno.alphalab.app.pooja.ui.compose.main

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.lifecycle.ViewModelProvider
import com.graveno.alphalab.app.pooja.ui.compose.pooja.PoojaApp
import com.graveno.alphalab.app.pooja.ui.theme.PoojaTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PoojaTheme {
                PoojaApp { ViewModelProvider(this)[MainViewModel::class.java] }
            }
        }
    }
}