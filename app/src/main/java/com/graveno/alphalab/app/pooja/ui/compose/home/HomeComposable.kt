package com.graveno.alphalab.app.pooja.ui.compose.home

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.LayoutDirection
import androidx.hilt.navigation.compose.hiltViewModel
import com.ramcosta.composedestinations.spec.Direction

private val TAG : String = "HomeHandle"

@Composable
fun HomeScreenHandle(
    onNavigate : (direction : Direction) -> Unit,
    homeViewModel: () -> HomeViewModel
) {
    val viewModel = homeViewModel.invoke()
    val bottomBarList by viewModel.bottomBarList.collectAsState()

    Scaffold(
        modifier = Modifier.fillMaxSize().background(Color.Blue),
        content = { innerPadding ->
            Box(modifier = Modifier.fillMaxSize().padding(PaddingValues(innerPadding.calculateTopPadding(),innerPadding.calculateLeftPadding(LayoutDirection.Ltr)))) {
                Column(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(text = "Hello")
                    Text(text = "World")
                }
            }
        },
        bottomBar = {
            viewModel.bottomBarList.collectAsState().value.let { bottomList ->
                when {
                    bottomList.isNotEmpty() -> {
                        Row(
                            modifier = Modifier.fillMaxSize(),
                            horizontalArrangement = Arrangement.SpaceEvenly,
                            verticalAlignment = Alignment.CenterVertically
                        ) {

                        }
                    }
                }
            }
        }
    )
}

