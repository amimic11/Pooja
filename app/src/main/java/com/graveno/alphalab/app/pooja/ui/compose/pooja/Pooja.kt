package com.graveno.alphalab.app.pooja.ui.compose.pooja

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.google.accompanist.navigation.material.ExperimentalMaterialNavigationApi
import com.graveno.alphalab.app.pooja.ui.compose.main.MainViewModel
import com.graveno.alphalab.app.pooja.ui.graph.NavGraphs
import com.graveno.alphalab.app.pooja.ui.graph.destinations.Destination
import com.ramcosta.composedestinations.DestinationsNavHost
import com.ramcosta.composedestinations.animations.rememberAnimatedNavHostEngine
import com.ramcosta.composedestinations.navigation.dependency

@OptIn(ExperimentalMaterialNavigationApi::class, ExperimentalAnimationApi::class)
@Composable
fun PoojaApp(viewModel: () -> MainViewModel) {
    val engine = rememberAnimatedNavHostEngine()
    val navContrller = engine.rememberNavController()
    DestinationsNavHost(
        navGraph = NavGraphs.root,
        modifier = Modifier.fillMaxSize(),
        navController = navContrller,
        engine = engine,
        dependenciesContainerBuilder = {
            NavGraphs.root.destinations.forEach { typedDestination: Destination ->
                dependency(
                    typedDestination
                ) {
                    viewModel.invoke()
                }
            }
        }
    )
}
