package com.graveno.alphalab.app.pooja.ui.compose.splash

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.graveno.alphalab.app.pooja.ui.graph.destinations.RootHomeScreenDestination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator

private const val TAG : String = "Splash"

@Composable
fun SplashScreenHandle(destinationsNavigator: DestinationsNavigator) {
    Box(
        modifier = Modifier.fillMaxSize(),
        content = {
            Button(
                onClick = {
                    destinationsNavigator.navigate(RootHomeScreenDestination)
                }) {
                Text(text = "start App")
            }
        }
    )
}