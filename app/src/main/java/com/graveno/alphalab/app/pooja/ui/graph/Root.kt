package com.graveno.alphalab.app.pooja.ui.graph

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.graveno.alphalab.app.pooja.ui.compose.splash.SplashScreenHandle
import com.graveno.alphalab.app.pooja.ui.theme.RootTransition
import com.ramcosta.composedestinations.DestinationsNavHost
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.annotation.RootNavGraph
import com.ramcosta.composedestinations.navigation.DestinationsNavigator
import com.ramcosta.composedestinations.navigation.dependency
import com.ramcosta.composedestinations.spec.DestinationStyle

class RootNavigator(navigator: DestinationsNavigator)

@RootNavGraph(start = true)
@Destination(
    route = "root_splash_screen",
    style = RootTransition::class
    )
@Composable
fun RootSplashScreen(navigator : DestinationsNavigator) {
    SplashScreenHandle(destinationsNavigator = navigator)
}

@RootNavGraph
@Destination(
    route = "root_home_screen",
    style = RootTransition::class
    )
@Composable
fun RootHomeScreen(navigator : DestinationsNavigator) {
    Box(modifier = Modifier.fillMaxSize()) {
        DestinationsNavHost(
            navGraph = NavGraphs.home,
            dependenciesContainerBuilder = {
                NavGraphs.home.destinations.forEach { typedDestination ->
                    dependency(typedDestination) {
                        RootNavigator(navigator = navigator)
                    }
                }
            }
        )
    }
}

