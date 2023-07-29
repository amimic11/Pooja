package com.graveno.alphalab.app.pooja.ui.graph

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavController
import com.graveno.alphalab.app.pooja.ui.compose.home.HomeScreenHandle
import com.graveno.alphalab.app.pooja.ui.compose.home.HomeViewModel
import com.graveno.alphalab.app.pooja.ui.graph.destinations.AartiScreenDestination
import com.graveno.alphalab.app.pooja.ui.graph.destinations.HomeScreenDestination
import com.graveno.alphalab.app.pooja.ui.graph.destinations.NaamsScreenDestination
import com.graveno.alphalab.app.pooja.util.Common.HOME_SCREEN
import com.ramcosta.composedestinations.DestinationsNavHost
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.annotation.NavGraph
import com.ramcosta.composedestinations.navigation.DestinationsNavigator

private const val TAG : String = "MAIN"

@NavGraph
annotation class HomeNavGraph(val start : Boolean = false)

@HomeNavGraph(start = true)
@Composable
@Destination(route = HOME_SCREEN)
fun HomeScreen(
    navController: NavController,
    navBackStackEntry: NavBackStackEntry,
    destinationsNavigator: DestinationsNavigator
) {
    val entry = remember(navBackStackEntry) { navController.getBackStackEntry(HomeScreenDestination.route) }
    val homeViewModel = hiltViewModel<HomeViewModel>(entry)
    HomeScreenHandle(
        onNavigate = { direction -> destinationsNavigator.navigate(direction = direction) },
        homeViewModel = { homeViewModel }
    )
}

@HomeNavGraph
@Destination(route = "home_aarti_screen")
@Composable
fun AartiHomeScreen(navigator: DestinationsNavigator, rootNavigator: RootNavigator) {
    DestinationsNavHost(
        navGraph = NavGraphs.aarti,
        startRoute = AartiScreenDestination
    )
}

@HomeNavGraph
@Destination(route = "home_naam_screen")
@Composable
fun NaamHomeScreen(navigator: DestinationsNavigator, rootNavigator: RootNavigator) {
    DestinationsNavHost(
        navGraph = NavGraphs.naam,
        startRoute = NaamsScreenDestination
    )
}

@HomeNavGraph
@Destination(route = "home_chalisa_screen")
@Composable
fun RootChalisaScreen(navigator: DestinationsNavigator) {
    DestinationsNavHost(
        navGraph = NavGraphs.chalisa
    )
}

